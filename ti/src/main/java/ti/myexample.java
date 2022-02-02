package ti;
import java.util.*;

public class myexample{

	public static void main(String[] args)  {
		student aa =new student();
		boolean isRunning=true;
		
		
		while (isRunning) {
		    //User input
			Scanner myObj = new Scanner(System.in);  
		    
		    System.out.println("Enter Student ID: ");
		    int iStudentID = Integer.parseInt(myObj.nextLine());
		    
		    
		    System.out.println("Enter Student Name: ");
		    String sStudentName =myObj.nextLine();
		    
		    System.out.println("Enter Marks: ");
		    int iMarks = Integer.parseInt(myObj.nextLine());

		    //Check if 0<marks<100
		    try {
		    	if ((iMarks>100) || (iMarks<0)) throw new MyException();
		    }catch (MyException e) {
		    	System.out.println (e);
		    }

		}
	}

}
