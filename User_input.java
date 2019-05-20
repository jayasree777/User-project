import java.util.*;
import java.io.*;
import java.util.ArrayList;
class User_input implements Operations{

    ArrayList<User> users= new ArrayList<User>();
    
	
    
    // insert a user
    public void insert(){
        Scanner myObj = new Scanner(System.in);

		System.out.println("Enter firstName");
		String firstName = myObj.nextLine();
		
		System.out.println("Enter lastName");
		String lastName = myObj.nextLine();
		
		System.out.println("Enter age");
		int age = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println("Enter ssn");
		String ssn = myObj.nextLine();
		
		System.out.println("Enter id");
		int id = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println("Enter Email");
        String email = myObj.nextLine();
        
    
        User user = new User(firstName, lastName, age, ssn, id, email);
        users.add(user);
        showUsers();
    }
 
    // show the users information
    public void showUsers(){
        System.out.println("SHOWING USERS:\n");
        for(User u: users){
            System.out.println(u.toString());
        }
    }

    // updating the user information

    //1. show the information of the user that needs to be updated
    
    public void showUser(){

        System.out.println("PLEASE ENTER ID TO ACCESS INFO");
        Scanner read=new Scanner(System.in);
        int id = read.nextInt();
        showUsers();
        User user=getUserById(id);
        System.out.println(user.toString());
        
    }

    public User getUserById(int id){
		return users.stream()
					.filter(user -> user.id == id)
					.findAny()
					.orElse(null);
	}

    //2. update the information

    public void update(){

        int id;
        System.out.println("UPDATE USER");
        showUsers();

        System.out.println("PLEASE ENTER ID TO ACCESS INFO");
        Scanner myObj = new Scanner(System.in);

        id = myObj.nextInt();
        myObj.nextLine();

	    System.out.println("Enter firstName");
		String newfirstName = myObj.nextLine();
		
		System.out.println("Enter lastName");
		String newlastName = myObj.nextLine();
		
		System.out.println("Enter age");
		int newage = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println("Enter ssn");
		String newssn = myObj.nextLine();
		
		
		System.out.println("Enter Email");
        String newemail = myObj.nextLine();

        for (User user : users ) {
            if(user.id == id) {
                user.firstName=newfirstName;
                user.lastName=newlastName;
                user.age=newage;
                user.ssn=newssn;
                user.email=newemail;
                System.out.println("");									
            }
        }
    }



    // delete the user

    public void delete(){

        Scanner myObj1 = new Scanner(System.in);

		System.out.println("Enter id to be removed");
        int rid = myObj1.nextInt();
        myObj1.nextLine();

        System.out.println("DELETE USER");
        
			for (int i=0;i<users.size();i++) {
				if(users.get(i).id == rid) {
                    users.remove(i);								
                }
    
                else {
                System.out.println("NO USERS AVAILABLE");
                }
            }
            
    }

}

