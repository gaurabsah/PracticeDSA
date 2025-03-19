package JavaBasics;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int age;

    public Employee(){

    }

    public Employee(String name, int age){
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
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamLambda {

    public static int sumOfEvenNum(List<Integer> nums){
        List<Integer> evenNum = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        int sum = 0;
        for (Integer n : evenNum){
            sum = sum + n;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,5,6,8,9,11,10);
        int sumOfEvenNum = sumOfEvenNum(numbers);
        System.out.println(sumOfEvenNum);

//        Sort numbers in ascending and descending order
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> sortedListDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListDesc);

//        Find the sum of all numbers
        int sumOfAllNumber = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sumOfAllNumber);

//        Find the maximum and minimum number
        int max = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);

        int min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println(min);

//        Count the number of even numbers
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);

//        Check if a list contains any even number
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);

//        Check if all numbers are positive
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println(allPositive);

//        Check if no number is negative
        boolean nonNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(nonNegative);

//        Convert a list to a set
        Set<Integer> integerSet = numbers.stream().collect(Collectors.toSet());
        System.out.println(integerSet);

//        Join names into a single string
        List<String> name = Arrays.asList("Gaurab", "Riya");
        String result = name.stream().collect(Collectors.joining(", "));
        System.out.println(result);

        List<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee("Gaurab",26);
        Employee emp2 = new Employee("Saurav",23);
        Employee emp3 = new Employee("Ashish",16);
        Employee emp4 = new Employee("Ayush",10);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        System.out.println(empList);

        List<String> names = empList.stream()
                .filter(a -> a.getAge() > 18)
                .map(n -> n.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);
        
//        Group employees by age
        Map<Integer, List<Employee>> groupByAge = empList.stream().collect(Collectors.groupingBy(n -> n.getAge()));
        System.out.println(groupByAge);

    }
}
