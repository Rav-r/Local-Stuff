package com.example.demo.dao;
import com.example.demo.model.person;

import java.util.UUID;

public interface PersonDao {

    int insertperson (UUID id, person p);

    default int addperson(person p){
        UUID id = UUID.randomUUID();
        return insertperson(id, p);

    }
}
