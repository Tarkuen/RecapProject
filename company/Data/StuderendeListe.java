package com.company.Data;

import com.company.Entities.Studerende;

import java.util.ArrayList;
import java.util.List;

public class StuderendeListe {


    private static final StuderendeListe StudInstance = new StuderendeListe();

    private  List<Studerende> StudListSingleton = new ArrayList<>();

    public static StuderendeListe getInstance() {
        return StudInstance;
    }

    public List<Studerende> getStudListSingleton() {
        return StudListSingleton;
    }
}

