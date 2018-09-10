package com.company.Data;

import com.company.Entities.Underviser;

import java.util.ArrayList;
import java.util.List;

public class UndervisereListe {

    private static final UndervisereListe UndervisereInstance = new UndervisereListe();

    private List <Underviser> UnderviserListeSingleton = new ArrayList<>();

    public static UndervisereListe getInstance(){
        return UndervisereInstance;

    }

    public List<Underviser> getUnderviserListeSingleton(){
        return UnderviserListeSingleton;
    }
}
