package com.yojulab.study_springboots.restapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yojulab.study_springboots.service.CarInforsService;


@RestController
public class CarInforsController {
    @Autowired
    CarInforsService carInforsService;

    //  /selectDetail/CI002
    @GetMapping("/selectDetail/{CAR_INFOR_ID}")
    public ResponseEntity selectDetail(@PathVariable String CAR_INFOR_ID){
        Object result = carInforsService.selectDetail(CAR_INFOR_ID);
        return ResponseEntity.ok().body(result);
    }
}
