//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.15 a las 04:20:21 PM ART 
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
 *         &lt;element name="idMateria" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calificacionExamen" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="calificacionTps" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
    "idMateria",
    "idUsuario",
    "calificacionExamen",
    "calificacionTps"
})
@XmlRootElement(name = "createUsuarioMateriaControllerRequest")
public class CreateUsuarioMateriaControllerRequest {

    protected int idMateria;
    protected int idUsuario;
    protected float calificacionExamen;
    protected float calificacionTps;

    /**
     * Obtiene el valor de la propiedad idMateria.
     * 
     */
    public int getIdMateria() {
        return idMateria;
    }

    /**
     * Define el valor de la propiedad idMateria.
     * 
     */
    public void setIdMateria(int value) {
        this.idMateria = value;
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
     * Obtiene el valor de la propiedad calificacionExamen.
     * 
     */
    public float getCalificacionExamen() {
        return calificacionExamen;
    }

    /**
     * Define el valor de la propiedad calificacionExamen.
     * 
     */
    public void setCalificacionExamen(float value) {
        this.calificacionExamen = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacionTps.
     * 
     */
    public float getCalificacionTps() {
        return calificacionTps;
    }

    /**
     * Define el valor de la propiedad calificacionTps.
     * 
     */
    public void setCalificacionTps(float value) {
        this.calificacionTps = value;
    }

}
