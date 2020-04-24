package com.ryeong.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryeong.test.service.TestService;
import com.ryeong.test.vo.TestVo;

@Controller
public class TestController
{
    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public String test(Model model) {
        List<TestVo> list = testService.selectTest();

        model.addAttribute("list",list);

        return "test";
    }

    //커밋을 위한 주석
}
