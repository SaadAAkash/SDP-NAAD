import java.util.*;
import java.io.*;

public class Main {

	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
//	public static int index = 0;
//
	// processor - B
	// 
	
//	public static FileReader finstream;
//	public static BufferedReader brin  = null;
//	public static String str;
//	public static String str2;
	
	
		//TimerTask t1 = new MyTimer(2000, teacherArr, stuArr); //2 sec thakbe thread, student, teacher create hbe
		static class ExecuteTask extends TimerTask 
	    {
	        public void run() 
	        {
	            try 
	            {
	                Random rand = new Random();
	                
	                int randomInt = rand.nextInt(teacherArr.length-1);
	                int randomStudent = rand.nextInt(stuArr.length-1);
	                
	                Students st1  = new Students (stuArr);
	                TeachersA ta1  = new TeachersA();
	                ta1.getstuid();
	                
	                ta1.giveB ( randomStudent );
	                //apps.askForPassword((Student) students.get(randomStudent));
	                Thread.sleep(1000);
	            } catch (InterruptedException ex) {
	                //Logger.getLogger(SDP_NAAD.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            System.out.println("Creation Time:" + new Date() + " " );
	            Timer timer = new Timer();
	            timer.schedule(new ExecuteTask(), 1000);
	        }
	    }
	
	
	public static void main(String args[]) throws IOException
	{
		
		int flag = 0;
		int index = 0, index2 = 0;

		FileReader finstream;
		 BufferedReader brin  = null;
		 String str, str2;
		
		try {
			finstream = new FileReader("input.txt");
			brin = new BufferedReader(finstream);
			
			while ( (str = brin.readLine()) != null)
			{
				
				if (str.contentEquals("student") == true)
				{
					flag = 1;
					//break;
				}
				if (flag == 1)
				{
					stuArr[index2++] = str;
				}
				else
				teacherArr[index++] = str;
			}
		       
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try{
				if(brin == null)
					brin.close();
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
		//System.out.println( teacherArr.toString()  );
		//index = 0;
		for (int i =0 ; i<8; i++)
		{
			System.out.println( teacherArr[i] + " ");
		
		}
		System.out.println( "Teacher List Ends");
		for (int i =1 ; i<20; i++)
		{
			System.out.println( stuArr[i] + " ");
			/////REMEMBER: STUARR[1] THKE STU NAMES
		}
		
		
		//TimerTask t1 = new MyTimer(2000, teacherArr, stuArr); //2 sec thakbe thread, student, teacher create hbe
		
	    //Timer timer = new Timer(true);  // timer.run() calling from here
	    
	    //timer.scheduleAtFixedRate( t1, 0, 10*1000);  // 10 s porpor times.run() calling
	    
	    //System.out.println("TimerTask started");
	    
	    ExecuteTask ex = new ExecuteTask();
	    ex.run();
	    
	    //cancel after fixed time
	    try {
	        Thread.sleep(120000); // after 120 sec -> 2 min
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	   
	    //timer.cancel();
	    //System.out.println("Timer cancelled after 2 mins");
	    
	    try {
	        Thread.sleep(30000);   // ?
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}


