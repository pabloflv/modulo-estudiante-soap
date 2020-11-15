package ar.com.unla.api.models.response;

import javax.xml.bind.annotation.XmlSeeAlso;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonPropertyOrder({"data", "errors"})
@Data
@NoArgsConstructor
@XmlSeeAlso({ar.com.unla.api.dtos.response.AnaliticoDTO.class,ar.com.unla.api.models.database.UsuarioExamenFinal.class,
			ar.com.unla.api.models.database.UsuarioMateria.class})
public class ApplicationResponse<T> {

    private T data;

    @JsonProperty("errors")
    private ErrorResponse errorResponse;

    public ApplicationResponse(T data, ErrorResponse errorResponse) {
        this.data = data;
        this.errorResponse = errorResponse;
    }

}
