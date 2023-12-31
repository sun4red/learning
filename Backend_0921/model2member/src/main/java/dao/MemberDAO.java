package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.MemberDTO;

public class MemberDAO {

	// 싱글톤 : 객체 생성을 한번만 수행 하는 것
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private Connection getConnection() throws Exception {

		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();

	}

	// 회원가입

	public int insert(MemberDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			String sql = "insert into model2member values(" 
			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
					+ "sysdate)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getMailid());
			pstmt.setString(7, member.getDomain());
			pstmt.setString(8, member.getTel1());
			pstmt.setString(9, member.getTel2());
			pstmt.setString(10, member.getTel3());
			pstmt.setString(11, member.getPhone1());
			pstmt.setString(12, member.getPhone2());
			pstmt.setString(13, member.getPhone3());
			pstmt.setString(14, member.getPost());
			pstmt.setString(15, member.getAddress());
			pstmt.setString(16, member.getGender());
			pstmt.setString(17, member.getHobby());
			pstmt.setString(18, member.getIntro());

			result = pstmt.executeUpdate(); // insert SQL문 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	
	// ID중복 검사(ajax)
	public int idcheck(String id) {
		int result = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			
			
			String sql = "select * from model2member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {		// 이미 가입된 ID가 있음 (조건식을 만족하는 데이터가 1개 있음)
				result = 1;
			}else {				// 중복 ID 없음
				result = -1;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		if(rs!=null)try {rs.close();}catch(Exception e) {e.printStackTrace();}	
		if(con!=null)try {con.close();}catch(Exception e) {e.printStackTrace();}	
		if(pstmt!=null)try {pstmt.close();}catch(Exception e) {e.printStackTrace();}	
		}
		return result;
		
	}
	
	// 로그인(회원 인증)
	public int memberAuth(String id, String passwd){
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			String sql = "select * from model2member where id = ? and passwd = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			
			rs = pstmt.executeQuery();
					
			if(rs.next()) {
				result = 1;
			}else {
				result = -1;
			}
			
		}catch (Exception e) {
		e.printStackTrace();	
		}finally{
			if(rs!=null)try {rs.close();}catch(Exception e) {e.printStackTrace();}	
			if(con!=null)try {con.close();}catch(Exception e) {e.printStackTrace();}	
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {e.printStackTrace();}	
		}
		return result;
	}

	// 회원 1명 상세정보 구하기 : 수정폼, 수정, 삭제
	public MemberDTO getMember(String id) {
		// TODO Auto-generated method stub
		
		MemberDTO member = new MemberDTO();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = getConnection();
			String sql = "select * from model2member where id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setMailid(rs.getString("mailid"));
				member.setDomain(rs.getString("domain"));
				member.setTel1(rs.getString("tel1"));
				member.setTel2(rs.getString("tel2"));
				member.setTel3(rs.getString("tel3"));
				member.setPhone1(rs.getString("phone1"));
				member.setPhone2(rs.getString("phone2"));
				member.setPhone3(rs.getString("phone3"));
				member.setPost(rs.getString("post"));
				member.setAddress(rs.getString("address"));
				member.setGender(rs.getString("gender"));
				member.setHobby(rs.getString("hobby"));
				member.setIntro(rs.getString("intro"));
				member.setRegister(rs.getTimestamp("register"));
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null)try {rs.close();}catch(Exception e) {e.printStackTrace();}	
			if(con!=null)try {con.close();}catch(Exception e) {e.printStackTrace();}	
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		
		
		return member;
	}
	// 회원정보 수정
	public int update(MemberDTO member) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = getConnection();
			String sql = "update model2member set name = ?, jumin1 = ?, jumin2 = ?, "
					+ "mailid = ?, domain  = ?, tel1 = ?, tel2 = ?, tel3 = ?, "
					+ "phone1 = ?, phone2 = ?, phone3 = ?, post = ?, address = ?, "
					+ "gender = ?, hobby = ?, intro = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,member.getName() );
			pstmt.setString(2,member.getJumin1() );
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getMailid());
			pstmt.setString(5, member.getDomain());
			pstmt.setString(6, member.getTel1());
			pstmt.setString(7, member.getTel2());
			pstmt.setString(8, member.getTel3());
			pstmt.setString(9, member.getPhone1());
			pstmt.setString(10, member.getPhone2());
			pstmt.setString(11, member.getPhone3());
			pstmt.setString(12, member.getPost());
			pstmt.setString(13, member.getAddress());
			pstmt.setString(14, member.getAddress());
			pstmt.setString(15, member.getHobby());
			pstmt.setString(16, member.getIntro());
			pstmt.setString(17, member.getId());
			
			result = pstmt.executeUpdate();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null)try {con.close();}catch(Exception e) {e.printStackTrace();}	
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		
		}
		
		return result;
	}
	// 회원 탈퇴
	public int delete(String id) {
		int result = 0;
		// TODO Auto-generated method stub
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = getConnection();
			String sql = "delete from model2member where id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null)try {con.close();}catch(Exception e) {e.printStackTrace();}	
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		
		}
		
		
		
		return result;
	}
}
