package com.example.demoapi.controller;
import com.example.demoapi.model.Request;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/wisd-rest2/DataService")
public class ODHApiController {
    @PostMapping("/ODH_SERVICES/cst_industry")
    public ResponseEntity<String> getVui(@RequestBody Request request){
        String id =
                "01791798";

        String ok;
       String data = request.getP_cifinfo().replaceAll(" ", "");
        if(data.equals(id)){
            ok = "{"
                    + "\"results\":"
                    + "{"
                    + "\"cif\":\"01275299\""
                    + ",\"dkkd\":\"01275299\""
                    + ",\"mst\":null"
                    + ",\"industry\":\"179900\""
                    + ",\"industry_code\":\"CAC H.DONG VA DICH VU KHAC\""
                    + "}"
                    + "}";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

    @PostMapping("/ODH_SERVICES/cst_ar_info_001")
    public ResponseEntity<String> getArInfo(@RequestBody Request request){
        String id =
                "02501168";

        String ok;
        String data = request.getP_cifinfo().replaceAll(" ", "");
        if(data.equals(id)){
            ok = "{"
                    + "\"results\":"
                    + "{"
                    + "\"cif\":\"02501168\""
                    + ",\"dkkd\":\"02501168\""
                    + ",\"mst\": null"
                    + ",\"duno_sanpham\":\"02501168\""
                    + ",\"duno_branch\":\"021\""
                    + ",\"duno_osamount\": 959540.00000"
                    + "}"
                    + "}";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

    @PostMapping("/DMT_SERVICES/cst_info_001")
    public ResponseEntity<String> getCtsInfo(@RequestBody Request request){
        String id =
                "01791798";

        String ok;
        String data = request.getP_cifinfo().replaceAll(" ", "");
        if(data.equals(id)){
            ok = "{"
                    + "\"results\":"
                    + "{"
                    + "\"cif\":\"01791798\""
                    + ",\"dkkd\":\"******158\""
                    + ",\"mst\": null"
                    + ",\"cusdebtstatus\": null"
                    + ",\"maxdebtgroup\": null"
                    + ",\"non_fin5\": 999999999.0000000000"
                    + "}"
                    + "}";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
        else {
            ok = "[]";
            return new ResponseEntity<>(ok, HttpStatus.OK);
        }
    }

//    @PostMapping("/getODH")
//    public ResponseEntity<String> getVui(@RequestBody Request request, @RequestHeader(value = "authorize") String value){
//        HttpHeaders headers1 = new HttpHeaders();
//        HttpHeaders headers2 = new HttpHeaders();
//        headers1.set("authorize", "IM80gqkhsVRloftQcJvajg==");
//        headers2.set("authorize", value);
//        String id1 =
//                "01791798";
//
//        String ok;
//        String data = request.getP_cifinfo().replaceAll(" ", "");
//        if(data.equals(id1) && headers1.equals(headers2)){
//            ok = "{"
//                    + "\"results\":"
//                    + "{"
//                    + "\"cif\":\"01275299\""
//                    + ",\"dkkd\":\"01275299\""
//                    + ",\"mst\":\"null\""
//                    + ",\"industry\":\"179900\""
//                    + ",\"industry_code\":\"CAC H.DONG VA DICH VU KHAC\""
//                    + "}"
//                    + "}";
//            return new ResponseEntity<>(ok, HttpStatus.OK);
//        }
//        else {
//            ok = "[]";
//            return new ResponseEntity<>(ok, HttpStatus.OK);
//        }
//    }
}