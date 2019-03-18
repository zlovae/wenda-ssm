package com.ssm.wenda.service;

import org.springframework.stereotype.Service;

/**
 * Created by zlovae on 2019/3/17.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
