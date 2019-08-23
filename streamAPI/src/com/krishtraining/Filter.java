package com.krishtraining;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        printStudentsWithShortnames();
        filterWithStream();
        process();
	minList();
	maxList();
	countObjects();
    }

    static void process(){
        Student.getStudents().stream().map(s->new Student("Dr "+s.getName(), s.getId())).collect(Collectors.toList()).forEach(s-> {
            System.out.println(s.getName()+" "+s.getId());
        });
    }
  
    static void filterWithStream(){
        List<Student> students = Student.getStudents().stream().filter(s->s.getName().length()<=6).collect(Collectors.toList());
        System.out.println(students);
    }

    static void printStudentsWithShortnames(){
        List<Student> students = Student.getStudents();
        for(Student student:students){
            if(student.getName().length()<=6){
                System.out.println(student.getName());
            }
        }
    }

    static void minList(){
        List<Student> students = Student.getStudents();
        Comparator<Student> comparator = Comparator.comparing( Student::getId );
        Student minStudent = students.stream().min(comparator).get();
        System.out.println(minStudent);
    }

    static void maxList(){
        List<Student> students = Student.getStudents();
        Comparator<Student> comparator = Comparator.comparing( Student::getId );
        Student maxStudent = students.stream().max(comparator).get();
        System.out.println(maxStudent);
    }

    static void countObjects(){
        List<Student> students = Student.getStudents();
        long count = students.stream().count();
        System.out.println(count);
    }

}
