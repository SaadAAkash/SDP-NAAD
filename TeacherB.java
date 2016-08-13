import java.util.*;
import java.io.*;

//check ID
//give D IDs & their generated passwords
public class TeacherB extends Teachers {

	public int pass = 10101;
	public int ArrA[] = new int[60] ;
	public int ArrE[] = new int[60] ;
	public int ArrC[] = new int[60] ;
    
	public int totId[] = new int[100];
	
	public int passArr[] = new int[60] ;
	

	public static String tempArr[] = new String[30] ;
	//Queue<Integer> queue = new LinkedList<Integer>();
	
	int i, foundFlag ;
	
	Queue q = new Queue();
	
	public TeacherB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		
		
		
		/*for	(i=0 ; i<60 ; i++ )
	    {
	    	passArr[i] = pass++;
	    }
	    */
	/*
		TeachersA ta = new TeachersA();
	   // ArrA = ta.getid();

	    TeachersE te = new TeachersE(name);
	    ArrE = te.getid();
	    
	    TeachersC tc = new TeachersC(name);
	    ArrC = tc.getid();
	*/
	}
		
	

	int index1 = 0;
	public void createQueue( String str )
    {
		tempArr [index1++] = str;
		
		for (int i=0; i< index1-2; i++  )
		{
			
			if ( tempArr[i].matches( str ) )
				foundFlag = 1;
//			if (q.equals(str) == true )
//				foundFlag = 1;
		}
		if ( foundFlag == 1 )
		{
			System.out.println( "Duplicate found! Not queued." );
			foundFlag = 0;
		}
		else
		{
			q.enqueue ( str );
			System.out.println( "queued successfully." );
	    }
    }
    
}
