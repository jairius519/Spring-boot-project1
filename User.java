package com.jairius.users;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.*;

@Entity //An Entity is a Java class that maps to a database table
@Table(name = "users") //the name of the database table
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long userID; //a unique id designed for users 
   private String name; //the name of the user 
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

public void setName(String name) {
    this.name = name;
}
public void setEmail(String email) {
    this.email = email;
}

public void setPassword(String password) {
    this.password = password;
}

public void setAge(int age) {
    this.age = age;
}

public Long getUserID() {
    return userID;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public String getPassword() {
    return password;
}

public int getAge() {
    return age;
}
    

}