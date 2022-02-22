
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
 *         &lt;element name="BPELGetAllPortAlarmByIpResult" type="{http://tempuri.org/}ArrayOfONTAlarm" minOccurs="0"/&gt;
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
    "bpelGetAllPortAlarmByIpResult"
})
@XmlRootElement(name = "BPELGetAllPortAlarmByIpResponse")
public class BPELGetAllPortAlarmByIpResponse {

    @XmlElement(name = "BPELGetAllPortAlarmByIpResult")
    protected ArrayOfONTAlarm bpelGetAllPortAlarmByIpResult;

    /**
     * Obtiene el valor de la propiedad bpelGetAllPortAlarmByIpResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfONTAlarm }
     *     
     */
    public ArrayOfONTAlarm getBPELGetAllPortAlarmByIpResult() {
        return bpelGetAllPortAlarmByIpResult;
    }

    /**
     * Define el valor de la propiedad bpelGetAllPortAlarmByIpResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfONTAlarm }
     *     
     */
    public void setBPELGetAllPortAlarmByIpResult(ArrayOfONTAlarm value) {
        this.bpelGetAllPortAlarmByIpResult = value;
    }

}
