package com.example.demoapi.controller;
import com.example.demoapi.model.Request;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ODHApiController {
    @PostMapping("/getODH")
    public ResponseEntity<String> getVui(@RequestBody Request request){
        String id1 =
                "01791798";

        String ok;
       String data = request.getP_cifinfo().replaceAll(" ", "");
        if(data.equals(id1)){
            ok = "{"
                    + "\"results\":"
                    + "{"
                    + "\"cif\":\"01275299\""
                    + ",\"dkkd\":\"01275299\""
                    + ",\"mst\":\"null\""
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