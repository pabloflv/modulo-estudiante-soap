package ar.com.unla.api.models.swagger.usuarioexamenfinal;

import ar.com.unla.api.models.database.UsuarioExamenFinal;
import lombok.Data;

/**
 * Provides an OK structure response for Swagger (Avoiding to show the errors attribute)
 */
@Data
public final class SwaggerUsuarioFinalOk {

    private UsuarioExamenFinal data;

}
