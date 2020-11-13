package ar.com.unla.api.services;

import ar.com.unla.api.dtos.response.AnaliticoDTO;
import ar.com.unla.api.dtos.response.CursadaDTO;
import ar.com.unla.api.models.database.Usuario;
import ar.com.unla.api.models.database.UsuarioExamenFinal;
import ar.com.unla.api.models.database.UsuarioMateria;
import ar.com.unla.api.utils.AnaliticoPDFExporter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnaliticoService {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioMateriaService usuarioMateriaService;

    @Autowired
    private UsuarioExamenFinalService usuarioExamenFinalService;

    public void exportToPDF(HttpServletResponse response, long idUsuario) throws IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=AnaliticoUNLa.pdf";

        response.setHeader(headerKey, headerValue);

        Usuario usuario = usuarioService.findById(idUsuario);

        List<UsuarioMateria> materias = usuarioMateriaService.findSubjectsByUser(idUsuario);

        List<UsuarioExamenFinal> finales =
                usuarioExamenFinalService.findFinalExamsByUser(idUsuario);

        new AnaliticoPDFExporter(materias, finales, usuario).export(response);
    }

    public AnaliticoDTO getAnalitico(long idUsuario) {

        List<UsuarioMateria> materias = usuarioMateriaService.findSubjectsByUser(idUsuario);

        List<UsuarioExamenFinal> finales =
                usuarioExamenFinalService.findFinalExamsByUser(idUsuario);

        List<CursadaDTO> analitico = new ArrayList<>();

        String condicion;
        float promedioMateria = 0;

        if ((finales != null && !finales.isEmpty())) {

            for (UsuarioExamenFinal usuarioExamenFinal : Collections.unmodifiableList(finales)) {
                boolean libre = false;
                boolean materiaEcontrada = false;
                CursadaDTO cursada = new CursadaDTO();

                long idMateria =
                        usuarioExamenFinal.getExamenFinal().getMateria().getId();
                String nombreMateria =
                        usuarioExamenFinal.getExamenFinal().getMateria().getNombre();

                cursada.setNombreMateria(nombreMateria);

                if (materias != null && !materias.isEmpty()) {
                    for (UsuarioMateria usuarioMateria : Collections.unmodifiableList(materias)) {
                        if (usuarioMateria.getMateria().getId().equals(idMateria)) {
                            materiaEcontrada = true;
                            promedioMateria =
                                    (usuarioMateria.getCalificacionTps() + usuarioMateria
                                            .getCalificacionExamen()) / 2;

                            if (promedioMateria >= 4) {

                                cursada.setNotaTP(usuarioMateria.getCalificacionTps());
                                cursada.setNotaParcial(usuarioMateria.getCalificacionExamen());
                                cursada.setPromedioMateria(promedioMateria);
                                libre = false;
                                break;
                            } else {
                                libre = true;
                                break;
                            }
                        }
                    }
                    if (!materiaEcontrada) {
                        libre = true;
                    }

                } else {
                    libre = true;
                }

                float promediofinal;

                if (libre) {
                    condicion = "Libre";
                    promediofinal = usuarioExamenFinal.getCalificacion();
                } else {
                    condicion = "Regular";
                    promediofinal =
                            (promedioMateria + usuarioExamenFinal.getCalificacion()) / 2;
                }
                cursada.setNotaFinal(usuarioExamenFinal.getCalificacion());
                cursada.setCondicion(condicion);
                cursada.setPromedioGeneral(promediofinal);

                analitico.add(cursada);
            }
        }
        return new AnaliticoDTO(analitico);
    }

}
