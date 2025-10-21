package com.coderai.ecommerce.subscription.controller;

import com.coderai.ecommerce.common.dto.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {

    @GetMapping("/ping")
    public BaseResponse<String> ping() {
        return BaseResponse.ok("pong from subscription");
    }
}
