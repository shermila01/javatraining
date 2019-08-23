package com.krishtraining;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }    

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static List<Student> getStudents(){
        List <Student> students = new ArrayList<>();
        students.add(new Student("krish", 1));
        students.add(new Student("Hasini", 2));
        students.add(new Student("Bhagya", 11));
        students.add(new Student("Suranga", 12));
        students.add(new Student("Nuwan", 21));
        students.add(new Student("Praveen", 22));
        students.add(new Student("Shehanza", 31));
        return students;
    }
}
