/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.alarmtype.dto;

import lombok.Data;

/**
 *
 * @author APerez
 */
@Data
public class RequestAlarmTypeDto {
   public int getFrame() {
		return frame;
	}
	public void setFrame(int frame) {
		this.frame = frame;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getOlt() {
		return Olt;
	}
	public void setOlt(String olt) {
		Olt = olt;
	}
	public int getOntID() {
		return ontID;
	}
	public void setOntID(int ontID) {
		this.ontID = ontID;
	}
	public String getIpOlt() {
		return ipOlt;
	}
	public void setIpOlt(String ipOlt) {
		this.ipOlt = ipOlt;
	}
	public String getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getTypeCut() {
		return typeCut;
	}
	public void setTypeCut(int typeCut) {
		this.typeCut = typeCut;
	}
	public String getNameProcess() {
		return nameProcess;
	}
	public void setNameProcess(String nameProcess) {
		this.nameProcess = nameProcess;
	}
private int frame;           
   private int slot;            
   private int port;            
   private String Olt;          
   private int ontID;           
   private String ipOlt;           
   private String etiqueta;     
   private String serialNumber;
   
   private int typeCut; 
   private String nameProcess;     

   
}

