package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Action;
import service.ActionForward;
import service.BoardAddAction;
import service.BoardDelete;
import service.BoardDetailAction;
import service.BoardListAction;
import service.BoardModify;
import service.BoardModifyForm;
import service.BoardReply;
import service.BoardReplyForm;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.do") // do 확장자로 요청하는 모든 요청을 받는다는 의미
public class BoardController extends HttpServlet {

	// doGet(), doPost() 메소드의 공통적인 작업을 처리하는 메소드
	protected void doProcesss(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		System.out.println("requestURI : " + requestURI);
		System.out.println("contextPath : " + contextPath);
		System.out.println("command : " + command);

		Action action = null;
		ActionForward forward = null;

		if (command.equals("/BoardAddAction.do")) {
			try {
				action = new BoardAddAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();

			}

			// 글 목록
		} else if (command.equals("/BoardListAction.do")) {
			try {
				action = new BoardListAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// 글작성
		} else if (command.equals("/BoardForm.do")) {
			try {
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("./board/board_write.jsp");

			} catch (Exception e) {
				e.printStackTrace();

			}

			// 상세 페이지
		} else if (command.equals("/BoardDetailAction.do")) {
			try {
				action = new BoardDetailAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			// 댓글 폼
		} else if(command.equals("/BoardReplyForm.do")){
			try {
				action = new BoardReplyForm();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		// 댓글 작성
		}else if(command.equals("/BoardReply.do")) {
			try {
				action = new BoardReply();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		// 수정 폼
		}else if(command.equals("/BoardModifyForm.do")) {
			try {
				action = new BoardModifyForm();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		// 글 수정
		}else if(command.equals("/BoardModify.do")) {
			try {
				action = new BoardModify();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		// 글 삭제 폼
		}else if(command.equals("/BoardDeleteForm.do")) {
			forward = new ActionForward();
			forward.setRedirect(false);		// dispatcher 방식으로 포워딩
			forward.setPath("./board/board_delete.jsp");
			// 포워딩 처리 부분의 else 구문 하의 dispatcher 문장 실행
			
		// 글 삭제
		}else if(command.equals("/BoardDelete.do")) {
			try {
				action = new BoardDelete();
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		// 포워딩 처리
		if (forward != null) {
			if (forward.isRedirect()) { // redirect 방식
				response.sendRedirect(forward.getPath());

			} else { // dispatcher 방식
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}

		}

	} // doProcess() end

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		doProcesss(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		doProcesss(request, response);
	}

}
