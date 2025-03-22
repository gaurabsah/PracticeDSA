package JavaBasics.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Students implements Comparator<Students> {
    private String name;
    private int age;

    public Students(){

    }

    public Students(String name, int age){
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
    public int compare(Students o1, Students o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students student = (Students) o;
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

}

public class ComparatorInterfaceDemo {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        Students student = new Students("Gaurab",27);
        Students student3 = new Students("Ayush",10);
        Students student1 = new Students("Saurab",24);
        Students student2 = new Students("Ashish",16);

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list);
    }
}
