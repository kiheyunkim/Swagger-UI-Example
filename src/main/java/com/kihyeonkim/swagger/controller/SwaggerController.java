package com.kihyeonkim.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * IDE : IntelliJ IDEA
 * Created by kiheyunkim@gmail.com on 2021-02-04
 * Github : http://github.com/kiheyunkim
 * Comment : 테스트용 Controller 첫 번쨰
 */
@RestController
@RequestMapping("/test")
@Api(tags = {"테스트용 Controller1"})
public class SwaggerController {
    @GetMapping("/getMapping")
    @ApiOperation(value = "이건 GetMapper", notes = "get method를 처리하기 위한 handler")
    public Map<String, String> handleGetMapping(String id, String password) {
        Map<String, String> response = new HashMap<>();
        response.put("id", id);
        response.put("password", password);
        response.put("randomName", Base64.getEncoder().encodeToString(String.valueOf(Math.random() * 13 * 13).getBytes(StandardCharsets.UTF_8)));

        return response;
    }

    @PostMapping("/postMapping")
    @ApiOperation(value = "이건 PostMapper", notes = "post method를 처리하기 위한 handler")
    public String handlePostMapping(String string1, String string2, String string3) {

        return string1 + "+" + string2 + "+" + string3;
    }

    @DeleteMapping("/deleteMapping")
    @ApiOperation(value = "이건 DeleteMapper", notes = "delete method를 처리하기 위한 handler")
    public Map<String, Object> handleDeleteMapping(String param1, String param2) {
        return Collections.singletonMap(param1, Collections.singletonMap("key", param2));
    }

    @PutMapping("/putMapping")
    @ApiOperation(value = "이건 PutMapper", notes = "put method를 처리하기 위한 handler")
    public void handlePutMapping(String name, String phone, int age) {
    }

    @PatchMapping("/patchMapping")
    @ApiOperation(value = "이건 PatchMapper", notes = "patch method를 처리하기 위한 handler")
    public int handlePatchMapping(String name) {

        return (int) (Math.random() * 1000000);
    }
}
