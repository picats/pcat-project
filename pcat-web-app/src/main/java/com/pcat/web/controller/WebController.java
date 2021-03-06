package com.pcat.web.controller;

import cn.hutool.core.bean.BeanUtil;
import com.pcat.module.test.bo.TestBo;
import com.pcat.module.test.service.TestService;
import com.pcat.web.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoy
 **/

@Slf4j
@RestController
@RequestMapping(value = "/api/p/test")
public class WebController {

    @Autowired
    private TestService testService;

    @PostMapping(value = "/test.json")
    public String testController(@RequestBody TestDto dto) {
        TestBo testBo = new TestBo();
        BeanUtil.copyProperties(dto, testBo);
        return testService.test(testBo);
    }
}


