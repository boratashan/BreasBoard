package com.bora;

import io.micronaut.http.annotation.*;

@Controller("/restdemo")
public class RestdemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}