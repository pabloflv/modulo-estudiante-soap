//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.11.15 a las 04:20:21 PM ART 
//


package ar.com.unla.api.soap.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ar.com.unla.api.models.response.ApplicationResponse;


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
 *         &lt;element name="applicationResponse" type="{ar.com.unla.api.soap}ApplicationResponse"/&gt;
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
    "applicationResponse"
})
@XmlRootElement(name = "createUsuarioMateriaControllerResponse")
public class CreateUsuarioMateriaControllerResponse {

    @XmlElement(required = true)
    protected ApplicationResponse applicationResponse;

    /**
     * Obtiene el valor de la propiedad applicationResponse.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResponse }
     *     
     */
    public ApplicationResponse getApplicationResponse() {
        return applicationResponse;
    }

    /**
     * Define el valor de la propiedad applicationResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResponse }
     *     
     */
    public void setApplicationResponse(ApplicationResponse value) {
        this.applicationResponse = value;
    }

}
