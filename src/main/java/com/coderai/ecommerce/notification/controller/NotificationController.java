package com.coderai.ecommerce.notification.controller;

import com.coderai.ecommerce.common.dto.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @GetMapping("/ping")
    public BaseResponse<String> ping() {
        return BaseResponse.ok("pong from notification");
    }
}
