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
		    	else {
		    		System.out.println("---------------------");
		    		System.out.print("Student ID: ");
		    		System.out.println(iStudentID);
		    		System.out.print("Student Name: ");
		    		System.out.println(sStudentName);
		    		System.out.print("Marks: ");
		    		System.out.println(iMarks);
		    		System.out.println("---------------------");
		    	}
		    }catch (MyException e) {
		    	System.out.println (e);
		    }

		}
	}

}
