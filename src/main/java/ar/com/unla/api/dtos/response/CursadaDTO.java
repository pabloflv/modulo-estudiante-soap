package ar.com.unla.api.dtos.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class CursadaDTO {

    private String nombreMateria;

    private Float notaTP;

    private Float notaParcial;

    private Float promedioMateria;

    private String condicion;

    private Float notaFinal;

    private Float promedioGeneral;

}
