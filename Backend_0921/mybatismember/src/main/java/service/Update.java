package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import model.MemberDTO;

public class Update implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Update");
		
		response.setContentType("text/html; charset = utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		MemberDTO member = new MemberDTO();
		
		member.setId(request.getParameter("id"));
		member.setPasswd(request.getParameter("passwd"));
		member.setName(request.getParameter("name"));
		member.setJumin1(request.getParameter("jumin1"));
		member.setJumin2(request.getParameter("jumin2"));
		member.setMailid(request.getParameter("mailid"));
		member.setDomain(request.getParameter("domain"));
		member.setTel1(request.getParameter("tel1"));
		member.setTel2(request.getParameter("tel2"));
		member.setTel3(request.getParameter("tel3"));
		member.setPhone1(request.getParameter("phone1"));
		member.setPhone2(request.getParameter("phone2"));
		member.setPhone3(request.getParameter("phone3"));
		member.setPost(request.getParameter("post"));
		member.setAddress(request.getParameter("address"));
		member.setGender(request.getParameter("gender"));
		
		String[] hobby = request.getParameterValues("hobby");
		String h = "";
		for(String h1 : hobby) {
			h += h1 + "-";
		}
		member.setHobby(h);
		
		member.setIntro(request.getParameter("intro"));
		
		
		MemberDAO dao = MemberDAO.getInstance();
		
		// 1명의 상세 정보 구하기
		MemberDTO db = dao.getMember(member.getId());
		
		// 비번 비교
		if(db.getPasswd().equals(member.getPasswd())) {	// 비번 일치
			int result = dao.update(member);
			if(result == 1) System.out.println("회원 수정 성공");
		
			
			
			
		}else {		// 비번 불일치
		
			out.println("<script>");
			out.println("alert('비번이 일치하지 않습니다.')");
			out.println("history.go(-1)");
			out.println("</script>");
			out.close();
			
			return null;
		}
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./member/main.jsp");
		
		return forward;
	}

	
	
	
}
