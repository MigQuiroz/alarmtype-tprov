/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalplay.alarmtype.service;

import com.totalplay.alarmtype.dto.RequestAlarmTypeDto;
import org.springframework.stereotype.Service;

/**
 *
 * @author APerez
 */
@Service
public class AlarmTypeService implements IAlarmTypeService{
    static final String NAME_PROCESS = "AlarmQuery";
    static final int UNCUT=0; //'Sin corte de fibra'
    static final int INDIVIDUAL_CUT =1; //'Corte de fibra individual'
    static final int MASS_CUTTING =2; //'Corte de fibra masivo'
    static final int FALLED =3; //'Sin información de corte de fibra'
        
        
    @Override
    public int validateAlarm(int alarm, RequestAlarmTypeDto requestAlarmDto) {
        int typeCut;
        switch (alarm) {
            case 0:
                typeCut = UNCUT;
                break;
            case 1:
                typeCut = INDIVIDUAL_CUT;
                break;
            case 2:
            case 3:
                typeCut = MASS_CUTTING;
                break;
            default:
                typeCut = FALLED;
                break;
        }
        
        return typeCut;
    }

    @Override
    public String nameProces() {
        return NAME_PROCESS;
    }
    
    
    
    
}
