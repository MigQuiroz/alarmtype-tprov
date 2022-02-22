
package com.totalplay.alarmtype.tprovisioningux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NomOlt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OntID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "frame",
    "slot",
    "port",
    "nomOlt",
    "ontID",
    "alias"
})
@XmlRootElement(name = "BPELGetPersonalAlarm")
public class BPELGetPersonalAlarm {

    @XmlElement(name = "Frame")
    protected int frame;
    @XmlElement(name = "Slot")
    protected int slot;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "NomOlt")
    protected String nomOlt;
    @XmlElement(name = "OntID")
    protected int ontID;
    @XmlElement(name = "Alias")
    protected String alias;

    /**
     * Obtiene el valor de la propiedad frame.
     * 
     */
    public int getFrame() {
        return frame;
    }

    /**
     * Define el valor de la propiedad frame.
     * 
     */
    public void setFrame(int value) {
        this.frame = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     */
    public void setSlot(int value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad nomOlt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomOlt() {
        return nomOlt;
    }

    /**
     * Define el valor de la propiedad nomOlt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomOlt(String value) {
        this.nomOlt = value;
    }

    /**
     * Obtiene el valor de la propiedad ontID.
     * 
     */
    public int getOntID() {
        return ontID;
    }

    /**
     * Define el valor de la propiedad ontID.
     * 
     */
    public void setOntID(int value) {
        this.ontID = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define el valor de la propiedad alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

}
