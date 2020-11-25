package com.findbestdeal.frontend.games.client;

import com.findbestdeal.frontend.games.config.Config;
import com.findbestdeal.frontend.games.domian.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class GameClient {
    private final RestTemplate restTemplate;

    public Game getGame() {
        Game game = restTemplate.getForObject(
                "http://localhost:8080/v1/game/game?id=211",
                Game.class);
        return game;
    }
}
