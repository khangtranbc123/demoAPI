package com.example.demoapi.controller;
import com.example.demoapi.model.Request;
import com.example.demoapi.model.ResultTotal;
import com.example.demoapi.model.resultODH.ResultAr;
import com.example.demoapi.model.resultODH.ResultCts;
import com.example.demoapi.model.resultODH.ResultODHar;
import com.example.demoapi.model.resultODH.ResultODHcts;
import com.example.demoapi.model.results;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.HashMap;

@RestController
@RequestMapping("/wisd-rest2/DataService")
public class ODHApiController {
    @PostMapping("/ODH_SERVICES/cst_industry")
    public ResponseEntity<?> getVui(@RequestBody Request request){
        String id =
                "01791798";

        String ok;
        if((id.equals(request.getP_cifinfo()) || request.getP_cifinfo() == null) && (id.equals(request.getP_unq_id()) || request.getP_unq_id() == null) && (id.equals(request.getP_udf5()) || request.getP_udf5() == null) ) {
            results result = new results();
            result.setCif("01275299");
            result.setDkkd("01275299");
            result.setIndustry("179900");
            result.setIndustry_code("CAC H.DONG VA DICH VU KHAC");
            ResultTotal results = new ResultTotal();
            results.setResults(result);
            return new ResponseEntity<>(results, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

    @PostMapping("/ODH_SERVICES/cst_ar_info_001")
    public ResponseEntity<?> getArInfo(@RequestBody Request request){
        String id =
                "02501168";
        String ok;
        if((id.equals(request.getP_cifinfo()) || request.getP_cifinfo() == null) && (id.equals(request.getP_unq_id()) || request.getP_unq_id() == null) && (id.equals(request.getP_udf5()) || request.getP_udf5() == null) ){
            ResultODHar result = new ResultODHar("02501168", "02501168", null, "02501168", "021",959540.00000);
            ResultAr results = new ResultAr();
            results.setResults(result);
            return new ResponseEntity<>(results, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

    @PostMapping("/DMT_SERVICES/cst_info_001")
    public ResponseEntity<?> getCtsInfo(@RequestBody Request request){
        String id = "01791798";

        String ok;
        if((id.equals(request.getP_cifinfo()) || request.getP_cifinfo() == null) && (id.equals(request.getP_unq_id()) || request.getP_unq_id() == null) && (id.equals(request.getP_udf5()) || request.getP_udf5() == null) ){
            ResultODHcts result = new ResultODHcts("01791798", "******158", null, null, null, 999999999.0000000000);
            ResultCts results = new ResultCts();
            results.setResults(result);
            return new ResponseEntity<>(results, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

}