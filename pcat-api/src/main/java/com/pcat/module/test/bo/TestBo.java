package com.pcat.module.test.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhaoy
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestBo {
    private String id;
    private String name;
}
