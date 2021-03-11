package com.github.gateway.testservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngestionGatewayController {
    Logger logger = LoggerFactory.getLogger(IngestionGatewayController.class);

    @RequestMapping("/prom_write")
    @ResponseStatus(value = HttpStatus.OK)
    public void promWrite(@RequestBody byte[] compressed) {
            logger.info("Payload :" + compressed.length);
    }

}
