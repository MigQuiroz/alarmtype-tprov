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
public interface IAlarmTypeService {
    public int validateAlarm(int alarm,RequestAlarmTypeDto requestAlarmDto);
    public String nameProces();
}
