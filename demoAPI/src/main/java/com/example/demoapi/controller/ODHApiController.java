package com.example.demoapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ODHApiController {
    @PostMapping("/getODH")
    public String getVui(@RequestBody String p_cifinfo){
        String id1 =
                "{"
                +"\"p_cifinfo\":\"01791798\""
                +"}";
        String ok;
//        String data = p_cifinfo.replaceAll(" ", "");
//        System.out.println(p_cifinfo);
//        System.out.println(data);
        if(p_cifinfo.equals(id1)){
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
            return ok;
        }
        else {
            ok = "[]";
            return ok;
        }
    }
}
