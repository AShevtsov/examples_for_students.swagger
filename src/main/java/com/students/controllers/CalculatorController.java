package com.students.controllers;

import com.students.controllers.dto.ResultDto;
import com.students.services.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private static final Logger LOG = LoggerFactory.getLogger(CalculatorController.class);

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "/sum", produces = "application/json")
    public ResultDto sum(@RequestParam(value="a") Integer a,
                         @RequestParam(value="b") Integer b) {
        LOG.info("[ sum(a={}, b = {})", a, b);

        int sum = calculatorService.sum(a, b);
        ResultDto result = new ResultDto("MyMessage", sum);

        LOG.info("] (return = {})", result);
        return result;
    }

}