package com.jairius.users;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity //An Entity is a Java class that maps to a database table
//User is a reserved word in SQL, so we need to use the @table annotation and pass in "users"
@Table(name = "users") //specifies the name of the database table that this entity maps to
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long userID; //a unique id designed for users that cannot be changed 
   private String name;//the name of the user 
   private String email; //the email of the user
   private String password; //the password of the user
   private int age; // the age of the user

   public User() {
    }

    public User (String name, String email, String password, int age) {
    this.name = name;
     this.email = email; 
     this.password = password; 
     this.age = age;
     }
//sets the name of the user
public void setName(String name) {
    this.name = name;
}
public void setEmail(String email) {
    this.email = email;
}

//sets the password of the user
public void setPassword(String password) {
    this.password = password;
}

public void setAge(int age) {
    this.age = age;
}
//returns the user's identification
public Long getUserID() {
    return userID;
}
//returns the user's name 
public String getName() {
    return name;
}

//returns the user's email address
public String getEmail() {
    return email;
}

//returns the user's password
public String getPassword() {
    return password;
}

public int getAge() {
    return age;
}
    

}