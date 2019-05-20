import java.util.*;

class User_Proj{

    public static void main(String[] args) {

        boolean isExit = true;
        User_input user1=new User_input();

        while(isExit){
            System.out.println("Please enter the type of account:\n 1. Create User \n 2.Update User \n3.Delete User \n4.Exit \n5.Show Users");
            Scanner read=new Scanner(System.in);
            int type= read.nextInt();
            


			switch (type) {
                case 1:
                System.out.println("create user");
                user1.insert();
                break;

                case 2:
                System.out.println("update user");
                //User_input user2=new User_input();
                user1.update();
                break;

                case 3:
                System.out.println("delete user");
                //User_input user3=new User_input();
                user1.delete();
                break;

                case 4:
                isExit = !isExit;
                break;

                case 5:
                System.out.println("Show information");
                //User_input user4=new User_input();
                user1.showUsers();
                break;

            }

        }




    }
}