package com.pcat.web.controller;

import com.pcat.web.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoy
 **/
@RequestMapping(value = "/api/p/test")
@RestController
@Slf4j
public class WebController {

    @PostMapping(value = "/test.json")
    public void testController(@RequestBody TestDto dto) {
        log.info("测试-id:[{}],name:[{}]：", dto.getId(), dto.getName());
    }
}
