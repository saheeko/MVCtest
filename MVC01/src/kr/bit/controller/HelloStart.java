package kr.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloStart
 */
@WebServlet("/h.do")
public class HelloStart extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. 클라이언트의 요청을 받는 작업 (controller의 역할)(parameterType수집)
		//2. 처리하는 작업(비즈니스로직)-Model(java class)
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		//3.처리가 끝나면 요청한 클라이언트에게 응답하는 작업  (프리젠테이션 로직)-View(JSP)
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(sum);
		out.println("</body>");
		out.println("</html>");
		//Servlet과 Model로 회원관리 만들기
		
	}

}
