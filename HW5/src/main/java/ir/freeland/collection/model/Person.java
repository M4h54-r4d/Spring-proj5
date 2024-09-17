package ir.freeland.collection.model;

import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person>{
    	
    private String name;
    private String fname;
    private int age;
    private Address address; 
    
    public Person(String name, String fname, int age, Address address ) {
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.address = address;
        
    }

    
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name) &&
                fname.equals(other.fname) &&
                Objects.equals(address, other.address) &&
                age == other.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", fname=" + fname + ", age=" + age + ", address=" + address + "]";
    }


}
