package com.hakurei.springboot.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult() {

        Map<String,Object> mapResult = new HashMap<>();

        mapResult.put("errorCode","500");
        mapResult.put("errorMsg","AOP系统错误");
        return mapResult;
    }
}
