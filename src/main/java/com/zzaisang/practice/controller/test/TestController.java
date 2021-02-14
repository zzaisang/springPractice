package com.zzaisang.practice.controller.test;

import com.zzaisang.practice.domain.YesNo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-15
 */
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity test(@RequestParam(name = "yn", required = false, defaultValue = "NO")YesNo yesNo) {
        System.out.println(yesNo);

        return ResponseEntity.of(Optional.empty());
    }
}
