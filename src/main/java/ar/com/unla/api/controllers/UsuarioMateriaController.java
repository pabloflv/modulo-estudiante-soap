package ar.com.unla.api.controllers;

/*import ar.com.unla.api.dtos.request.UsuarioMateriaDTO;
import ar.com.unla.api.models.database.UsuarioMateria;
import ar.com.unla.api.models.response.ApplicationResponse;
import ar.com.unla.api.models.response.ErrorResponse;
import ar.com.unla.api.models.swagger.usuariomateria.SwaggerUsuarioMateriaOk;
import ar.com.unla.api.services.UsuarioMateriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Usuario-Materia controller", description = "CRUD UsuarioMateria")
@Validated
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios-materias")
public class UsuarioMateriaController {

    @Autowired
    private UsuarioMateriaService usuarioMateriaService;

    @PostMapping
    @ApiOperation(value = "Se encarga de crear y persistir una relacion de usuario y materia")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 201, message = "UsuarioMateria creado", response =
                            SwaggerUsuarioMateriaOk.class),
                    @ApiResponse(code = 400, message = "Request incorrecta al crear un "
                            + "UsuarioMateria", response = ErrorResponse.class),
                    @ApiResponse(code = 500, message = "Error interno al crear un "
                            + "UsuarioMateria", response = ErrorResponse.class)
            }
    )
    @ResponseStatus(HttpStatus.CREATED)
    public ApplicationResponse<UsuarioMateria> create(
            @Valid @RequestBody UsuarioMateriaDTO usuarioMateriaDTO) {
        return new ApplicationResponse<>(usuarioMateriaService.create(usuarioMateriaDTO),
                null);
    }
}
*/