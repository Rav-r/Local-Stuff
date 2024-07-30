package com.example.demo.dao;
import com.example.demo.model.person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao{

    private static List<person> DB = new ArrayList<>();

   @Override
    public int insertperson(UUID id , person p){
       DB.add(new person(id, p.getName()));
       return 1;
   }
}
