//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.15 a las 03:59:54 PM ART 
//


package ar.com.unla.api.soap.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuarioExamenFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="recordatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idUsuarioExamenFinal",
    "recordatorio"
})
@XmlRootElement(name = "updateRemainderUsuarioExamenFinalControllerRequest")
public class UpdateRemainderUsuarioExamenFinalControllerRequest {

    protected int idUsuarioExamenFinal;
    protected boolean recordatorio;

    /**
     * Obtiene el valor de la propiedad idUsuarioExamenFinal.
     * 
     */
    public int getIdUsuarioExamenFinal() {
        return idUsuarioExamenFinal;
    }

    /**
     * Define el valor de la propiedad idUsuarioExamenFinal.
     * 
     */
    public void setIdUsuarioExamenFinal(int value) {
        this.idUsuarioExamenFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad recordatorio.
     * 
     */
    public boolean isRecordatorio() {
        return recordatorio;
    }

    /**
     * Define el valor de la propiedad recordatorio.
     * 
     */
    public void setRecordatorio(boolean value) {
        this.recordatorio = value;
    }

}
