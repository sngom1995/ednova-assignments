package ia.ednova.backend.assignement2.controllers;


import ia.ednova.backend.assignement2.constants.EndpointsRegistry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping(EndpointsRegistry.HEALTH_CHECk)
    public ResponseEntity<?> healthCheck() {
        Map<String, String> health = new HashMap<>();
        health.put("message", "OK");
        return ResponseEntity.ok(health);
    }
}
