/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.alarmtype.dto;

import java.util.List;
import lombok.Data;

/**
 *
 * @author APerez
 */
@Data
public class ResponseAlarmTypeDto {
    public RequestAlarmTypeDto getAlarm() {
		return alarm;
	}
	public void setAlarm(RequestAlarmTypeDto alarm) {
		this.alarm = alarm;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionLog() {
		return transactionLog;
	}
	public void setTransactionLog(String transactionLog) {
		this.transactionLog = transactionLog;
	}
	private RequestAlarmTypeDto alarm;
    private Boolean error=false;
    private String message="";
    private String transactionLog =null;
}
