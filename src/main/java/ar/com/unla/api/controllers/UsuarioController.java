package ar.com.unla.api.controllers;

import ar.com.unla.api.dtos.response.AnaliticoDTO;
import ar.com.unla.api.models.response.ErrorResponse;
import ar.com.unla.api.services.AnaliticoService;
import ar.com.unla.api.services.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Usuario controller", description = "CRUD usuario")
@Validated
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private AnaliticoService analiticoService;

    @GetMapping("/analitico-pdf")
    @ApiOperation(value = "Se encarga de generar un pdf con el anaítico academico de un usuario "
            + "particular )")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Analítico descargado"),
                    @ApiResponse(code = 400, message =
                            "Request incorrecta al intentar descargar el analítico",
                            response = ErrorResponse.class),
                    @ApiResponse(code = 500, message =
                            "Error interno al intentar descargar el analítico",
                            response = ErrorResponse.class)
            }
    )
    public void exportToPDF(
            @RequestParam(name = "idUsuario")
            @NotNull(message = "El parámetro idUsuario no esta informado.")
            @ApiParam(required = true) Long id
            , HttpServletResponse response) throws IOException {
        analiticoService.exportToPDF(response, id);
    }

    @GetMapping("/analitico")
    @ApiOperation(value = "Se encarga de genera un anaítico academico de un usuario "
            + "particular para mostrar)")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Analítico generado"),
                    @ApiResponse(code = 400, message =
                            "Request incorrecta al intentar generar el analítico",
                            response = ErrorResponse.class),
                    @ApiResponse(code = 500, message =
                            "Error interno al intentar generar el analítico",
                            response = ErrorResponse.class)
            }
    )
    public AnaliticoDTO getAnalitico(
            @RequestParam(name = "idUsuario")
            @NotNull(message = "El parámetro idUsuario no esta informado.")
            @ApiParam(required = true) Long id) throws IOException {
        return analiticoService.getAnalitico(id);
    }
}
