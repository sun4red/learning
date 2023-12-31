package p2023_08_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

class  JDBC_Select02{
  public static void main(String[] args)  {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsptest";	

    Connection con  = null;
    PreparedStatement pstmt =  null;
    //---JDBC_Select 추가된 내용 -------
    ResultSet  rs   = null;
	int no = 0; 
    String name="", email="", tel="", address=""/*, ts=""*/;  //데이터베이스에서 얻어온 필드값 저장할 변수 선언
    String sql;               //SQL문을 저장할 변수 선언

    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "jspid", "jsppass" );    
      
      // 
      
     
      //---JDBC_Select 추가된 내용 -------
      sql = "SELECT * FROM customer order by no desc limit 0, 5";
      
      // 최근가입 5명
      
      
      
      System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \t 주소\t 날짜\n");
      System.out.printf("-----------------------------------------------------------------\n");
	  pstmt = con.prepareStatement( sql );
      rs = pstmt.executeQuery();  //얻어진 레코드를 가져옴
      
      
      
      SimpleDateFormat sd = new SimpleDateFormat("yy년 MM월 dd일 hh시:mm분:ss초");
      	Timestamp ts = null;
      
      
      while( rs.next() ){	// 지정된 변수 사용
		 no = rs.getInt("no"); 
         name = rs.getString("name");  
         email = rs.getString("email");     
         tel   = rs.getString("tel"); 
         address = rs.getString("address");
         ts = rs.getTimestamp("reg_date");
         
         
     

         
         System.out.printf(" %d \t %s \t %s \t %s\t %s\t %s\t  \n", no, name,email,tel,address,sd.format(ts));
      } 
    }
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{//rs, stmt, con 객체를 close() 메서드를 호출해 해제
        if( rs != null )      rs.close();        
        if( pstmt != null )    pstmt.close();
        if( con != null )     con.close();
      }
      catch(Exception e){
        System.out.println( e.getMessage( ));  
      }
    }
  }
}  

