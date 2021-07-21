package com.pcat.module.test.service;

import com.pcat.module.test.bo.TestBo;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * test
 *
 * @author zhaoy
 **/
@DubboService
public class TestServiceImpl implements TestService{

    @Override
    public String test(TestBo testBo) {
        return testBo.getId() + testBo.getName();
    }

}
