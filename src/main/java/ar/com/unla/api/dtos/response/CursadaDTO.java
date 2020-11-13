package ar.com.unla.api.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursadaDTO {

    private String nombreMateria;

    private Float notaTP;

    private Float notaParcial;

    private Float promedioMateria;

    private String condicion;

    private Float notaFinal;

    private Float promedioGeneral;

}
