//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.15 a las 03:05:17 PM ART 
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
 *         &lt;element name="idExamenFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="recordatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="calificacion" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
    "idExamenFinal",
    "idUsuario",
    "recordatorio",
    "calificacion"
})
@XmlRootElement(name = "createUsuarioExamenFinalControllerRequest")
public class CreateUsuarioExamenFinalControllerRequest {

    protected int idExamenFinal;
    protected int idUsuario;
    protected boolean recordatorio;
    protected float calificacion;

    /**
     * Obtiene el valor de la propiedad idExamenFinal.
     * 
     */
    public int getIdExamenFinal() {
        return idExamenFinal;
    }

    /**
     * Define el valor de la propiedad idExamenFinal.
     * 
     */
    public void setIdExamenFinal(int value) {
        this.idExamenFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
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

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     */
    public void setCalificacion(float value) {
        this.calificacion = value;
    }

}