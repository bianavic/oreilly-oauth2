package com.example.oauth2;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MessageController {

    @GetMapping("/user")
    Map<String, Object> user(OAuth2AuthenticationToken auth) {
        return auth.getPrincipal().getAttributes();
    }
}
