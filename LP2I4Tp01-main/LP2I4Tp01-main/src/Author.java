//Marcelo Marques Araujo CB3005631

import java.util.Scanner;

public class Author {
	private String name; 
	 private String email;
	 private char gender;

	 public Author(String name, String email, char gender) {
	 	this.name = name;
	 	this.email = email;
	 	this.gender = gender;
	 }
	 public String getName() {
	 	return this.name;
	 }
	 public String getEmail() {
	 	return this.email;
	 }
	 public void setEmail(String email) {
	 	this.email = email;
	 }
	 public char getGender() {
	 	return gender;
	 }
	 public String toString() {
	 	String info = "Author:" + this.name + "\n sexo:" + this.gender + "\nEmail:" +this.email;
	 	return info;
	 }
}