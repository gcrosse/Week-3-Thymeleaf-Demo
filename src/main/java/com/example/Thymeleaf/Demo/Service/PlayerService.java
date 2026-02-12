
package com.example.Thymeleaf.Demo.service;

import com.example.Thymeleaf.Demo.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private final List<Player> players = new ArrayList<>();

    // Initialize with 5 sample players
    public PlayerService() {
        players.add(new Player(1, "Alice", "Smith", "alice@example.com"));
        players.add(new Player(2, "Bob", "Johnson", "bob@example.com"));
        players.add(new Player(3, "Charlie", "Brown", "charlie@example.com"));
        players.add(new Player(4, "Diana", "White", "diana@example.com"));
        players.add(new Player(5, "Ethan", "Davis", "ethan@example.com"));
    }

    // Get all players
    public List<Player> getAllPlayers() {
        return players;
    }

    // Add a new player
    public void addPlayer(Player player) {
        // Assign next id automatically
        int nextId = players.size() + 1;
        player.setId(nextId);
        players.add(player);
    }
}
