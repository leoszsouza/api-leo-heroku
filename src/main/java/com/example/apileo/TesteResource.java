package com.example.apileo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping(value = "/v1/test")
public class TesteResource {

    private final Logger logger = LoggerFactory.getLogger(TesteResource.class);
    @Autowired
    PlayerRepository playerRepository;
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
        playerRepository.save(buildEntityfromREquest.apply(testeEntity));
        return ResponseEntity.ok(testeEntity);
    }

    @CrossOrigin
    @GetMapping(value = "/helloList")
    public ResponseEntity<List<PlayerEntity>> helloList() {
        return ResponseEntity.ok(playerRepository.findAll());
    }

    private Function<Player, PlayerEntity> buildEntityfromREquest = player ->
            new PlayerEntity(player.nome, player.idade, player.idSofifa);
}
