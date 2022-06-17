package com.example.slm_maintenancemonitorv10.controller;


import org.springframework.web.bind.annotation.*;
import javax.ws.rs.core.Response;

@CrossOrigin
@RestController
@RequestMapping("/api/monitoring")
public class MonitorController {
    private static String status = "-";

    /*@GetMapping()
    public Response getStatus(){
        Response.ResponseBuilder rb = Response.ok(status);
        return rb.header("Access-Control-Allow-Origin", "*").build();
    }*/
    @GetMapping()
    public String getStatus(){
        return status;
    }

    @GetMapping("{status}")
    public String setStatus(@PathVariable("status") String s){
        if (s == null || s.isEmpty()){
            return status;

        } else{
            status = s;
            return status;
        }
    }
}
