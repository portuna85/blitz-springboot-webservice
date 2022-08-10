package com.blitz.shop.controller.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;

public class HelloDtoTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void 롬복_기능_테스트() throws Exception {
        // given
        String name = "TESTER";
        int amount = 100000000;

        // when
        HelloDto dto = new HelloDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}