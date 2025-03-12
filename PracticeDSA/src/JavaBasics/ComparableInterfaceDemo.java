package JavaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student = new Student("Gaurab",27);
        Student student3 = new Student("Ayush",10);
        Student student1 = new Student("Saurab",24);
        Student student2 = new Student("Ashish",16);

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list);
    }
}
