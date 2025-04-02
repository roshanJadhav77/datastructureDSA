package com.datastructure.datastructureDSA.interviewToday;

import java.util.Objects;

public class EmployeeWissen {

    int id;
    String name;
    double salary;
    String  dept;

    @Override
    public  int hashCode(){
        return Objects.hash(id,name,salary,dept);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(getClass() != obj.getClass()) return false;

        EmployeeWissen obj1 = (EmployeeWissen) obj;
        return id == ((EmployeeWissen) obj).id &&
            Double.compare(obj1.salary, salary) == 0 &&
            Objects.equals(obj1.name, name) &&
            Objects.equals(obj1.dept, dept);
    }

}
