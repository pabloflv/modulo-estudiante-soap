package ar.com.unla.api.controllers;

/*import ar.com.unla.api.dtos.request.UsuarioExamenFinalDTO;
import ar.com.unla.api.models.database.UsuarioExamenFinal;
import ar.com.unla.api.models.response.ApplicationResponse;
import ar.com.unla.api.models.response.ErrorResponse;
import ar.com.unla.api.models.swagger.usuarioexamenfinal.SwaggerUsuarioFinalOk;
import ar.com.unla.api.services.UsuarioExamenFinalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Usuario-ExamenFinal controller", description = "CRUD UsuarioExamenFinal")
@Validated
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios-examenes-finales")
public class UsuarioExamenFinalController {

    @Autowired
    private UsuarioExamenFinalService usuarioExamenFinalService;

    @PostMapping
    @ApiOperation(value = "Se encarga de crear y persistir una relacion de usuario y examen final")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 201, message = "UsuarioExamenFinal creado", response =
                            SwaggerUsuarioFinalOk.class),
                    @ApiResponse(code = 400, message = "Request incorrecta al crear un "
                            + "UsuarioExamenFinal", response = ErrorResponse.class),
                    @ApiResponse(code = 500, message = "Error interno al crear un "
                            + "UsuarioExamenFinal", response = ErrorResponse.class)
            }
    )
    @ResponseStatus(HttpStatus.CREATED)
    public ApplicationResponse<UsuarioExamenFinal> create(
            @Valid @RequestBody UsuarioExamenFinalDTO usuarioExamenFinalDTO) {
        return new ApplicationResponse<>(usuarioExamenFinalService.create(usuarioExamenFinalDTO),
                null);
    }

    @PutMapping(path = "/recordatorio")
    @ApiOperation(value = "Se encarga de actualizar el recordatorio de un examen final")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Recordatorio actualizado", response =
                            SwaggerUsuarioFinalOk.class),
                    @ApiResponse(code = 400, message =
                            "Request incorrecta al actualizar el recordatorio",
                            response = ErrorResponse.class),
                    @ApiResponse(code = 500, message =
                            "Error interno al actualizar el recordatorio",
                            response = ErrorResponse.class)
            }
    )
    @ResponseStatus(HttpStatus.OK)
    public ApplicationResponse<UsuarioExamenFinal> updateRemainder(
            @RequestParam(name = "idUsuarioExamenFinal")
            @NotNull(message = "El parámetro idUsuarioExamenFinal no esta informado.")
            @ApiParam(required = true) Long id,
            @RequestParam(name = "recordatorio")
            @NotNull(message = "El parámetro recordatorio no esta informado.")
            @ApiParam(required = true) Boolean recordatorio) {
        return new ApplicationResponse<>(
                usuarioExamenFinalService.updateRemainder(id, recordatorio), null);
    }

}
*/