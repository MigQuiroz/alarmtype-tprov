
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
 *         &lt;element name="BPELGetPersonalAlarmResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "bpelGetPersonalAlarmResult"
})
@XmlRootElement(name = "BPELGetPersonalAlarmResponse")
public class BPELGetPersonalAlarmResponse {

    @XmlElement(name = "BPELGetPersonalAlarmResult")
    protected int bpelGetPersonalAlarmResult;

    /**
     * Obtiene el valor de la propiedad bpelGetPersonalAlarmResult.
     * 
     */
    public int getBPELGetPersonalAlarmResult() {
        return bpelGetPersonalAlarmResult;
    }

    /**
     * Define el valor de la propiedad bpelGetPersonalAlarmResult.
     * 
     */
    public void setBPELGetPersonalAlarmResult(int value) {
        this.bpelGetPersonalAlarmResult = value;
    }

}
