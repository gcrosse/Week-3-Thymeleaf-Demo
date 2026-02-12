package com.example.Thymeleaf.Demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Thymeleaf.Demo.model.Fighter;

@Service
public class FighterService {
    private final List<Fighter> fighterList = new ArrayList<>();

    public void addFighter(Fighter fighter) {
        fighterList.add(fighter);
    }

    public List<Fighter> getAllFighters() {
        return fighterList;
    }
}
