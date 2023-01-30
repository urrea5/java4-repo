package com.java4.models.mappers;

import com.java4.models.Person;
import com.java4.models.daos.PersonDao;

public class PersonMapper {
    private PersonMapper(){}

    public static Person toPerson(PersonDao eventDao) {
        return new Person(
                eventDao.getUuid(),
                eventDao.getName()
        );
    }
    
}
