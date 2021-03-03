package com.lizza.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-03-03
 */
public class Distinct_1 {

    public static void main(String[] args){
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < 20; i+=2) {
            list.add(new Student(i, "S-" + i));
        }
        list.add(new Student(8, "S-8"));
        list.add(new Student(6, "S-6"));
        list.add(new Student(12, "S-12"));
        System.out.println(list);
        list.stream().distinct().sorted(Comparator.comparingInt(o -> o.id)).forEach(System.out::println);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}