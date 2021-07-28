package com.pcat.module.test.service;

import com.pcat.module.test.bo.TestBo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * test
 *
 * @author zhaoy
 **/
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String test(TestBo testBo) {
        return testBo.getId() + testBo.getName();
    }

}
