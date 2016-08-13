import java.util.*;
import java.io.*;


public class Students {
	
	public static String teacherArr[] = new String[8] ;
	public static String stuArr[] = new String[20] ;
	public int id =0001;
	
	public Students()
	{
		
	}
	public Students (String [] stuArr)
	{
		this.stuArr = stuArr;
	}
	public String[] giveId()
	{
		return stuArr;
	}
//	
//	public int takeId( String[] stuArr )
//	{
//		this.stuArr = stuArr;
//	}
}
