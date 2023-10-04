<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>

<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null && cookies.length > 0) {
        for (int i = 0 ; i < cookies.length ; i++) {

            if (cookies[i].getName().equals("name")) {
                Cookie cookie = new Cookie("name", "");
                cookie.setMaxAge(0);	// 시간을 0으로 해버리면 바로 지워짐
                response.addCookie(cookie);
            }//if end

        }//for end
    }
%>

<html>
	<head><title>쿠키 삭제</title></head>
	<body>
		name 쿠키를 삭제합니다.
	</body>
</html>