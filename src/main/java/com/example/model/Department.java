package com.example.model;

import java.util.HashMap;
import java.util.Map;

public enum Department {
    personal(1),
    verkauf(2),
    entwicklung(3);


    private static final Map<Integer, Department> map;

    static {
        map = new HashMap<>();
        for (Department v : Department.values()) {
            map.put(v.number, v);
        }
    }

    private final int number;

    Department(int number) {
        this.number = number;
    }

    public static Department findByKey(int i) {
        return map.get(i);
    }
}
