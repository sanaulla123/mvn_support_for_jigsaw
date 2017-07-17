package com.packt;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
public class SimpleModuleUsingMaven{
    
    public static void main(String[] args) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data = new HashMap<>();
        data.put("msg", "Hello World in JSON");
        System.out.println(objectMapper.writeValueAsString(data));
    }
}