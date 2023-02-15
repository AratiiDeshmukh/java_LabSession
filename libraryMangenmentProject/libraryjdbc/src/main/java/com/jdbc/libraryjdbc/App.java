package com.jdbc.studentjdbc;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void insert() {
		
	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Arati@200");
	
	String q= "insert into books (bid, bookname, writername) values (?,?,?)";
	PreparedStatement pstmt=con.prepareStatement(q);
	Scanner sc =new Scanner(System.in);
	int bid;
	System.out.println("Enter bid:"); 
	String n = sc.nextLine();
	bid=sc.nextInt();
	String bname;;
	System.out.println("Enter bname:");  // taking input from user
	String n = sc.nextLine();
	bname=sc.next();
	String name;
	System.out.println("Enter writername:");
	name=sc.next();
	
	
	
	pstmt.setInt(1, bid);    // set the input data to the place of values

	pstmt.setString(2, bname);

	pstmt.setString(3, name);


	pstmt.executeUpdate();  // executing query
	System.out.println("Data entered sucessfully");
	} catch (SQLException e) {    // handling exception
		
		e.printStackTrace();   //throwing exception 
	}
}
	 public static void update() { // method to update in database
		 Connection con;
		 try { //establish connection with mysql data base
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Arati@200");
		
		 
			String b= "UPDATE books SET bookname = ?, writername = ? WHERE bid = ?";
			PreparedStatement pstmt=con.prepareStatement(b); 
			Scanner sc =new Scanner(System.in);
			int id;
			System.out.println("Enter bid you want to update:");
			id=sc.nextInt();
			System.out.println("Enter bname:");
			String bname;
			bname=sc.next();
			System.out.println("Enter writername ");
			String name=sc.next();
			pstmt.setString(1,bname);
			pstmt.setString(2,name);
			pstmt.setInt(3,id);
			pstmt.execute();} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 
	 }public static void delete() { // method to delete in database
		 Connection con;
		 try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Arati@200");
		
		 String a= "delete from books where bid=?";
			PreparedStatement pstmt=con.prepareStatement(a); 
			Scanner sc =new Scanner(System.in);
			int id;
			System.out.println("Enter bid you want to delete:");
			id=sc.nextInt();
			pstmt.setInt(1,id);
			pstmt.execute();
		 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	 } public static void show() { // method to print database
		 Connection con;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Arati@200");
			
			
		      String c = "SELECT *FROM books where bid= ?  ";
			PreparedStatement pstmt=con.prepareStatement(c); 
			Scanner sc =new Scanner(System.in);
			int bid;
			System.out.println("Enter a bid you want to view:");
			bid=sc.nextInt();
			pstmt.setInt(1,bid);
			pstmt.execute(c);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			}

	 
		
    public static void main( String[] args )
    { int oid;
    do {
    	
    	 Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter a no of operation you want to perform 1 for insert,2 for update,3 for delete,4 for show");
    	 oid=sc.nextInt();
    	 switch (oid) {
    	 case 1:
    		 insert();
    		 break;
    	 case 2:
    		 update();
    		 break;
    	 case 3 :
    		 delete();
    		 break;
    	 case 4:
    		 show();
    		 break;
    }
    
    }while(oid<4);
System.out.println("Successfully Exited");
}
    
}
