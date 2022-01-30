package com.fiap.cerveja.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fiap.cerveja.dto.CervejaDTO;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("debug")
@ConditionalOnProperty(value = "fiap.debug", havingValue = "true")
public class DebugController {

    private Environment env;

    public DebugController(Environment env){
        this.env = env;
    }

    @GetMapping
    public String getProperty(@RequestParam String propriedade){
        return env.getProperty(propriedade);
    }

}