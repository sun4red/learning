package p2023_08_08;

import java.sql.*;

class  JDBC_Select{
  public static void main(String[] args)  {

	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";

    Connection con  = null;
    Statement  stmt = null;
    //---JDBC_Select 추가된 내용 -------
    ResultSet  rs   = null;
	int no = 0; 
    String name, email, tel;  //데이터베이스에서 얻어온 필드값 저장할 변수 선언
    String sql;               //SQL문을 저장할 변수 선언

    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );
      // DB연동에 여기까지는 공통코드... 이거부터 조회!
      // DB연동은 형식이 정해져있다.
      
      stmt= con.createStatement();
      //---JDBC_Select 추가된 내용 -------
      sql = "SELECT * FROM customer";
      System.out.printf("번호 \t 이름 \t 이메일 \t\t 전화번호 \n");
      System.out.printf("-----------------------------------------------------------------\n");
      
      
      // resultset 객체, 가져온 자료를 관리하는 역할
      rs = stmt.executeQuery(sql);  //얻어진 레코드를 가져옴

      // boolean next() : 검색한 데이터를 한개씩 가져오는 역할
      while( rs.next() ){
    	  // 가져오는 자료형에 따라서 메소드가 정해짐, 컬럼별로
		 no = rs.getInt("no"); 
         name = rs.getString("name");  
         email = rs.getString("email");     
         tel   = rs.getString("tel"); 
        System.out.printf(" %d \t %s \t %s \t\t %s\n", no, name,email,tel);
      } 
    }
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{//rs, stmt, con 객체를 close() 메서드를 호출해 해제
        if( rs != null )      rs.close();        
        if( stmt != null )    stmt.close();
        if( con != null )     con.close();
        // 안전하게 닫아준다.
      }
      catch(Exception e){
        System.out.println( e.getMessage( ));  
      }
    }
  }
}  

