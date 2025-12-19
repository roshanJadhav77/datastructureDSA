/*
package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Comparator;
import java.util.Objects;

public class UserComparisionDemo {

    static class User implements Comparable<User>, com.datastructure.datastructureDSA.interviewCoding.User {

        int id;
        String name;
        int age;

        User(int id, String name, int age){
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o){
            if( this == o) return true;
            if(!(o instanceof  User)) return  false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode(){
            return Objects.hash(id);
        }

        @Override
        public int compareTo(User o) {
            if(this.age < o.age){
                return -1;
            } else if(this.age > o.age){
                return 1;
            } else{
                return o;
            }

           // return Integer.compare(this.age, o.age);
        }


        Comparator <User> byAge = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(this.age < o.age){

                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        }


    }
}
*/
