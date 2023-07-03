package com.yojulab.study_springboots.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yojulab.study_springboots.dao.SharedDao;

@Service
public class CarInforsService {
    @Autowired
    SharedDao sharedDao;
    public Object selectDetail(String CAR_INFOR_ID){
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarInfors.selectByUID";  //xml의 namespace와 각각 ID의 조합해서 유니크 아이디를 만듬
        HashMap dataMap = new HashMap<>();
        dataMap.put("CAR_INFOR_ID", CAR_INFOR_ID);

        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }
}
