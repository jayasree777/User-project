import java.util.*;
import java.io.*;
class User{

	String firstName;
	String lastName;
	int age;

	String ssn;
    int id;
	String email;

	User(String firstName, String lastName, int age, String ssn, int id, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.id = id;
		this.email = email;

    }	
    
    public String toString(){
		return this.firstName+" "+this.lastName+" "+this.age+" "+this.ssn+" "+this.id+" "+this.email;
    }
	


}

