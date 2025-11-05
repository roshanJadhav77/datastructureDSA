package com.datastructure.datastructureDSA.interviewCoding;

import java.util.HashSet;
import java.util.Objects;

public class PersonCheck {
    String name ;


    public PersonCheck(String name){
        this.name =name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonCheck that = (PersonCheck) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public static void main(String[] args) {
        PersonCheck person1 = new PersonCheck("Roshan");
        PersonCheck person2 = new PersonCheck("Roshan");

        HashSet<Object> objects = new HashSet<>();
        objects.add(person1);
        objects.add(person2);

        System.out.println(objects.size());
    }
}
