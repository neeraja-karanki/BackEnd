import java.sql.*;
import java.util.*;
class Example
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC92","IPC92");
			System.out.println("established");
			//read input from user
			Scanner s=new Scanner(System.in);
			System.out.println("enter employee id");
			int empno=s.nextInt();
			Statement sct=con.createStatement();
			String sql="select * from ep where eid="+empno;
			ResultSet rs=sct.executeQuery(sql);
			boolean result=false;
			while(rs.next())
			{
				
					System.out.println("you are valid user");
					System.out.println("hello "+rs.getString(2));
					result=true;
					break;
			}
			if(result==false)
				{	
					System.out.println("invalid user");
				}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				