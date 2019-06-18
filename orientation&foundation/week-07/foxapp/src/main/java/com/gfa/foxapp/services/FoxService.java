package com.gfa.foxapp.services;

import com.gfa.foxapp.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxService {
    List<String> names = new ArrayList<>();
    List<Fox> foxes = new ArrayList<>();

    public boolean checkNames(String name) {
        return names.contains(name);
    }

    public void addFox(String name) {
        foxes.add(new Fox(name));
    }

    public Fox findFox(String name) {
        return foxes.stream().filter(fox -> fox.name.equals(name)).collect(Collectors.toList()).get(0);

    }

}
