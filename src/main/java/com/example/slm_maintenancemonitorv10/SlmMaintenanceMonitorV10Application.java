package com.example.slm_maintenancemonitorv10;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;


@SpringBootApplication
public class SlmMaintenanceMonitorV10Application {
    public static void main(String[] args){SpringApplication.run(SlmMaintenanceMonitorV10Application.class, args);}

}
