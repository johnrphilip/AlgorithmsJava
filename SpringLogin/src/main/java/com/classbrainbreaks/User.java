package com.classbrainbreaks;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//User entity
@Entity
@Table(name = "users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String username;

 private String password;

 // getters and setters
}



/*
@Entity: This annotation is used to mark the User class as a JPA entity. 
JPA is a Java standard for mapping Java objects to database tables, and 
@Entity tells JPA that this class should be persisted to a database.

@Table(name = "users"): This annotation is used to specify the name of the 
database table that the User entity should be mapped to. In this case, the table is named "users

@Id and @GeneratedValue(strategy = GenerationType.IDENTITY): 
These annotations are used to specify that the id field in the User entity should be used as the primary key for the database table, 
and that its value should be generated automatically by the database using the IDENTITY strategy. 
This means that when a new User entity is persisted to the database, the database will generate a unique ID value for it.
*/