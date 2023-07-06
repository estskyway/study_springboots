package com.yojulab.study_springboots.restapis;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yojulab.study_springboots.service.CarCompanyService;


@RestController
public class CarCompanyController {
    @Autowired
    CarCompanyService carCompanyService;

    // all
    @GetMapping("/carCompanyAll/{COMPANY_ID}")
    public ResponseEntity selectAll(@PathVariable String COMPANY_ID){
        Object result = carCompanyService.selectAll(COMPANY_ID);
        return ResponseEntity.ok().body(result);
    }

    // search
    @GetMapping("/carCompanySearch/{search}/{words}")
    public ResponseEntity selectSearch(@PathVariable String search, @PathVariable String words){
        Object result = carCompanyService.selectSearch(search, words);
        return ResponseEntity.ok().body(result);
    }

    // create
    @PostMapping("/carCompanyinsert")
    public ResponseEntity insert(@RequestBody Map paramMap){
        Object result = carCompanyService.insert(paramMap);
        return ResponseEntity.ok().body(result);
    }

    // update
    @PutMapping("/carCompanyupdate")
    public ResponseEntity update(@RequestBody Map paramMap){
        Object result = carCompanyService.update(paramMap);
        return ResponseEntity.ok().body(result);
    }

    // delete
    @DeleteMapping("/carCompanydelete/{COMPANY_ID}")
    public ResponseEntity delete(@PathVariable String COMPANY_ID){
        Object result = carCompanyService.delete(COMPANY_ID);
        return ResponseEntity.ok().body(result);
    }

}
