
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
 *         &lt;element name="IPOLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ipolt"
})
@XmlRootElement(name = "BPELGetAllPortAlarmByIp")
public class BPELGetAllPortAlarmByIp {

    @XmlElement(name = "Frame")
    protected int frame;
    @XmlElement(name = "Slot")
    protected int slot;
    @XmlElement(name = "Port")
    protected int port;
    @XmlElement(name = "IPOLT")
    protected String ipolt;

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
     * Obtiene el valor de la propiedad ipolt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOLT() {
        return ipolt;
    }

    /**
     * Define el valor de la propiedad ipolt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOLT(String value) {
        this.ipolt = value;
    }

}
