package com.gfa.foxapp.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fox {
    ArrayList<String> names;

    public Fox() {
        names = new ArrayList<>();
    }

    public int count() {
        int count = 0;
        for (String name : names) {
            count = count + 1;
        }
        return count;
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

}
