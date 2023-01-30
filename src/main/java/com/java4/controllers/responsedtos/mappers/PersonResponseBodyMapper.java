package com.java4.controllers.responsedtos.mappers;

import com.java4.controllers.responsedtos.PersonResponseBody;
import com.java4.models.Person;

public class PersonResponseBodyMapper {
    private PersonResponseBodyMapper(){}
    
    public static PersonResponseBody fromPerson(Person person) {
        return new PersonResponseBody(
                person.getUuid().toString(),
                person.getName()
        );
    }
}
