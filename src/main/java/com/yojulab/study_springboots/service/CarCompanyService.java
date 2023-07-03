package com.yojulab.study_springboots.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yojulab.study_springboots.dao.SharedDao;

@Service
@Transactional
public class CarCompanyService {
    @Autowired
    SharedDao sharedDao;

    // 전체 검색
     public Object selectAll(String COMPANY_ID){
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarCompany.selectAll";  
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMPANY_ID", COMPANY_ID);

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
     }

    // 검색(조건-search : YEAR, CAR_NAME)
    public Object selectSearch(String search, String words){
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarCompany.selectSearch";  
        HashMap dataMap = new HashMap<>();
        dataMap.put("search", search);
        dataMap.put("words", words);

        Object result = sharedDao.getList(sqlMapId, dataMap);
        return result;
    }
    // 입력
     public Object insert(Map dataMap){
        String sqlMapId = "CarCompany.insert";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }

    // 수정
    public Object update(Map dataMap){
        String sqlMapId = "CarCompany.update";
        Object result = sharedDao.update(sqlMapId, dataMap);
        return result;
    }

    // 삭제
    public Object delete(String COMPANY_ID){
        String sqlMapId = "CarCompany.delete";
        HashMap dataMap = new HashMap<>();
        dataMap.put("COMPANY_ID", COMPANY_ID);

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }
}
