package codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Address{
    private String street;
    private String city;
    private String pinCode;
    private String state;
    private String country;

    public Address(){

    }

    public Address(String street, String city, String pinCode, String state, String country) {
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

public class FindPinCodeFromCSVFile {

    static boolean containsOnlyDigits(String str){
        char[] ch = str.toCharArray();
        for (char c : ch){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Address> addressList = new ArrayList<>();
        Address add1 = new Address("10th Cross, MG Road","Bangalore","560019","KA","India");
        Address add2 = new Address("10th Cross, Jalahalli","Bangalore","560057","KA","India");
        addressList.add(add1);
        addressList.add(add2);

        Map<String, List<Address>> listMap = addressList.stream().filter(a -> a.getPinCode().length() == 6).collect(Collectors.groupingBy(x -> x.getPinCode()));
        System.out.println(listMap);

        String address = "10th Cross,Jalahalli,Bangalore,560057,KA,India";
        String[] split = address.split(",");

        for (String word : split){
            word = word.trim();
            if (word.length() == 6 && containsOnlyDigits(word)){
                System.out.println(word);
            }
        }

    }
}
