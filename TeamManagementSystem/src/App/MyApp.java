package App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.team.manage.User;
import com.team.manage.UserDao;

public class MyApp {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		System.out.println("** Team Management System **");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 :- Add User");
			System.out.println("Press 2 :- Delete User");
			System.out.println("Press 3 :- Display User");
			System.out.println("Press 4 :- Exit");
			
			int choice = Integer.parseInt(br.readLine());
			
			if(choice == 1)
			{
				//user add
				
				System.out.println("Please Enter User Name :");
			    String name = br.readLine();
			    
			    System.out.println("Please Enter Phone Number :");
			    String phone = br.readLine();
			    
			    System.out.println("Please Enter User Address :");
			    String address = br.readLine();
				
			    User u = new User(name,phone,address);
			    boolean result=UserDao.insertUserToDB(u);
			    if(result)
			    {
			    	System.out.println("User is added successfully....");
			    }
			    else
			    {
			    	System.out.println("Something wrong please try again...");
			    }
			    System.out.println(u);
			    
			}
			else if(choice==2)
			{
				//delete user
				System.out.println("Enter user id to delete");
				int userId	=Integer.parseInt(br.readLine());
				boolean result=UserDao.deleteUsers(userId);
				if(result)
				{
					System.out.println("User is delete successfully");
				}
				else
				{
					System.out.println("Something wents to wrong ... pls try again");
				}
				
			}
			else if(choice==3)
			{
				//view user
				UserDao.showAllUsers();
				
			}
			else if(choice == 4)
			{
				//Exit app
				break;
			}
			else
			{
				
			}
		}
		System.out.println("Application is exit....");
	}

}
