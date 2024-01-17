package kr.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.model.MyCalc;


@WebServlet("/calc.do")
public class CalcController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//서블릿이하는 작업
		//1. 클라이언트에서 넘어오는 폼 파라미터를 받기(파라미터 수집,su1,su2)
		//request에 들어간 정보의 su1,su2값을 getparameter로 빼놓은 다음에 (1)
		int su1=Integer.parseInt(request.getParameter("su1"));
		int su2=Integer.parseInt(request.getParameter("su2"));
		//String로 받아야하지만 이것을 정수 int타입으로 변경하기위해서는 
		//String su1=request.getParameter("su1")의 형태를
		//Integer,parseInt로 변경하고 추가하여 해야한다.
		
		//su1~su2=?
		//비즈니스로직을 model로 분리하기!
		/*
		 * int sum=0; for(int i=su1;i<=su2;i++) { sum+=i; }
		 */
		
		//객체생성 (model로 만든것)
		MyCalc my=new MyCalc();
		int sum=my.hap(su1, su2);
		
		//여기로 응답 하여 실행 결과가 나옵니다.(2)(view=jsp)
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>TOTAL</td>");
		out.println("<td>");
		out.println(sum);
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
