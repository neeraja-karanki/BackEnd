import java.sql.*;
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
			Statement sct=con.createStatement();
			
			//String str="create table emp(id int,ename varchar(20))";
			
			
			//String sql="delete from emp where ename='qje'";
			//sct.executeUpdate(sql);
			//System.out.println("values deleted");
			ResultSet rs=sct.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}