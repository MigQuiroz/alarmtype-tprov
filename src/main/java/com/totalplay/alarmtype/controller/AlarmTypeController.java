/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.alarmtype.controller;

import com.totalplay.alarmtype.dto.RequestAlarmTypeDto;
import com.totalplay.alarmtype.dto.ResponseAlarmTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.totalplay.alarmtype.tprovisioningux.BPEL;
import com.totalplay.alarmtype.tprovisioningux.BPELSoap;
import com.totalplay.alarmtype.service.IAlarmTypeService;

/**
 *
 * @author APerez
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/alarm")
public class AlarmTypeController {
    
    @Autowired
    private IAlarmTypeService iAlarmService;
    
    @RequestMapping(value="/TypeAlarm",method= RequestMethod.POST)
    public ResponseAlarmTypeDto TypeAlarm(@RequestBody RequestAlarmTypeDto requestAlarm){
        System.out.println("Recurso: ...:8084/alarm/TypeAlarm");
        
        ResponseAlarmTypeDto responseAlarmDto = new ResponseAlarmTypeDto();
                 
        try {
            BPEL bpel = new BPEL();
            
            responseAlarmDto.setTransactionLog("1");
            BPELSoap bpelSoap = bpel.getBPELSoap();
            
            responseAlarmDto.setTransactionLog("2");
            int typeAlarm =  bpelSoap.bpelGetPersonalAlarm(
                requestAlarm.getFrame(),
                requestAlarm.getSlot(), 
                requestAlarm.getPort(), 
                requestAlarm.getOlt(), 
                requestAlarm.getOntID(),
                requestAlarm.getEtiqueta()
            );
      
             
            responseAlarmDto.setTransactionLog("3");
                   
            requestAlarm.setTypeCut(iAlarmService.validateAlarm(typeAlarm, requestAlarm));
            requestAlarm.setNameProcess(iAlarmService.nameProces());

            responseAlarmDto.setTransactionLog("4");
            responseAlarmDto.setAlarm(requestAlarm);
        } catch (Exception e) {
            responseAlarmDto.setError(true);
            responseAlarmDto.setMessage(e.getMessage());
            responseAlarmDto.setTransactionLog("error");
            System.out.println("Error: "+e);
        }

        return responseAlarmDto;
    }
}
