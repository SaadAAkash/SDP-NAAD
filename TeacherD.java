import java.util.*;
import java.io.*;

public class TeacherD extends Teachers{

	public int ArrID[] = new int[60] ;
	public TeacherD(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//TeacherB tb =  new TeacherB();
	//ArrID = tb.getid();
	
	PassGen pg = new PassGen();
	String pass = pg.getPass();

}
