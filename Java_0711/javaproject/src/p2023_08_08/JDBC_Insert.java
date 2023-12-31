package p2023_08_08;

import java.sql.*;
import java.io.*;  // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 

class  JDBC_Insert{
public static void main(String[] args) {

  String driver = "oracle.jdbc.driver.OracleDriver";
  String url = "jdbc:oracle:thin:@localhost:1521:xe";	

  Connection con = null;
  Statement stmt = null;

 // ResultSet  rs   = null;
  String sql;

   String name, email, tel, no ;
  
     try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );
      // 위 두줄은 공통문!
      
      stmt= con.createStatement();

      //---JDBC_Insert 추가된 내용-------
      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println(" customer 테이블에 값 입력하기 .....");
      System.out.print(" 번호 입력: ");
      no = br.readLine();
      System.out.print(" 이름 입력: ");
      name = br.readLine();            //테이블에 추가할 name 필드 값을 입력 받음
      System.out.print(" 이메일 입력: ");
      email = br.readLine();             //테이블에 추가할 email 필드 값을 입력 받음
      System.out.print(" 전화번호 입력: ");
      tel = br.readLine();               //테이블에 추가할 tel 필드 값을 입력 받음
      
      // INSERT 쿼리문을 작성
      sql = "INSERT into customer(no, name, email, tel) values " ; // 오류발생할수있어 한칸 띄움
      sql += "(" + no + ",'" + name +"','" + email +"','"+ tel +"')" ;
      // 좌우에 '' 없으면 숫자, '' 있으면 String '"내용"'
      
      //Statement 객체의 executeUpdate(sql) 메서드를 이용해 
      int res = stmt.executeUpdate(sql) ;  //데이터베이스 파일에 새로운 값을 추가시킴
	  if(res == 1){
		 System.out.println(" Data insert success!! ");
      }else{
		System.out.println(" Data insert failed ");
	  }
	}
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{
 //       if( rs != null )   rs.close();        
        if( stmt != null ) stmt.close();
        if( con != null )  con.close();
      }
      catch(Exception e){ 
        System.out.println( e.getMessage());
      }
      
    }
  }
} 
