package com.toucan.stream.names;

public record Employee(String firstName, String lastName, String department) {
    public String getFullName(){
        return firstName+" "+lastName;
    }
}
