package model;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Address address;
    private List<String> favoriteSubject;

    public User(String firstName, String lastName, String userName,
                String password, String email, Address address,
                List<String> favoriteSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.favoriteSubject = favoriteSubject;
    }
}
