package com.example.apileo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/test")
public class TesteResource {

    private final Logger logger = LoggerFactory.getLogger(TesteResource.class);

    @Autowired
    MongoTemplate mongoTemplate;

    @CrossOrigin
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hellooo");
    }

    @CrossOrigin
    @PostMapping(value = "/helloPost", produces="application/json", consumes="application/json")
    public ResponseEntity<Player> helloPost(
            @RequestBody @Valid Player testeEntity) {
        logger.info("m=testeEntity, request={}", testeEntity);
        mongoTemplate.save(testeEntity);
        return ResponseEntity.ok(testeEntity);
    }
}
