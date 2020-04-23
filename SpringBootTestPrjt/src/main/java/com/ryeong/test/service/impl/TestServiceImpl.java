package com.ryeong.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryeong.test.mapper.TestMapper;
import com.ryeong.test.service.TestService;
import com.ryeong.test.vo.TestVo;

@Service
public class TestServiceImpl implements TestService
{
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestVo> selectTest()
    {
        return testMapper.selectTest();
    }
}
