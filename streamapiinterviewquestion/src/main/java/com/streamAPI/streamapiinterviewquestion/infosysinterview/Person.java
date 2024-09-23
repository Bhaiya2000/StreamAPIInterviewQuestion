package com.streamAPI.streamapiinterviewquestion.infosysinterview;

import java.util.List;

public class Person {

    private String name;
    private List<String> phoneNumber;

    public Person(String name, List<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
