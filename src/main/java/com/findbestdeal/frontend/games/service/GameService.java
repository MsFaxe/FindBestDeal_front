package com.findbestdeal.frontend.games.service;

import com.findbestdeal.frontend.games.client.GameClient;
import com.findbestdeal.frontend.games.domian.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameClient gameClient;

    public List<Game> getGames() {
        return games;
    }

    private List<Game> games;

    public List<Game> addGame() {
        games = new ArrayList<>();
        games.add(gameClient.getGame());
        return games;

    }
}
