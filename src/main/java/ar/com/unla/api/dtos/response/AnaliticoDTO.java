package ar.com.unla.api.dtos.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnaliticoDTO {

    List<CursadaDTO> analitico;
}
