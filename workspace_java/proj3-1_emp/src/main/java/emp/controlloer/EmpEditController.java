package emp.controlloer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.DTO.EmpDTO;
import emp.Service.EmpService;

@WebServlet("/edit")
public class EmpEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");

		// 파라메터 empno 를 int로 형변환
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if (sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);

		// DB 다녀와서 출력 하기
		try {

			EmpService empService = new EmpService();
			EmpDTO empDTO2 = empService.getOneEmp(empDTO);

			PrintWriter out = response.getWriter();

			out.println("<form method='post' action='edit'>");
			out.println("<table border=1>");
			out.println("<tr><td>empno</td><td><input type='text' name='empno' value='" + empDTO2.getEmpno() + "'</td><tr>");
			out.println("<tr><td>ename</td><td><input type='text' name='ename' value='" + empDTO2.getEname() + "'</td><tr>");
			out.println("<tr><td>Job</td><td><input type='text' name='job' value='" + empDTO2.getJob() + "'</td><tr>");
			out.println("<tr><td>Mgr</td><td><input type='text' name='mgr' value='" + empDTO2.getMgr() + "'</td><tr>");
			out.println("<tr><td>Hiredate</td><td><input type='date' name='hiredate' value='" + empDTO2.getHiredate() + "'</td><tr>");
			out.println("<tr><td>Sal</td><td><input type='text' name='sal' value='" + empDTO2.getSal() + "'</td><tr>");
			out.println("<tr><td>Comm</td><td><input type='text' name='comm' value='" + empDTO2.getComm() + "'</td><tr>");
			out.println("<tr><td>Deptno</td><td><input type='text' name='deptno' value='" + empDTO2.getDeptno() + "'</td><tr>");
			out.println("</table>");

			out.println("<form method='post' action='remove'>");
			out.println("<input type='hidden' name='empno' value='" + empDTO2.getEmpno() + "' >");
			out.println("<input type='submit' value='삭제' >");
			out.println("<input type='submit' value='수정완료'>");
			out.println("</form>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 요청 할 때 한글 깨짐
		request.setCharacterEncoding("utf-8");
		// 응답 할 때 한글 깨짐
		response.setContentType("text/html;charset=utf-8");
		  EmpDTO empDTO1 = new EmpDTO();
		  EmpService empService =new EmpService();
		  
		  empService.editEmp(empDTO1);
		  
		// 파라메터 empno 를 int로 형변환
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if (sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
			 
			

		// DB 다녀와서 출력 하기
		
			PrintWriter out = response.getWriter();
			
			 empno = Integer.parseInt(sEmpno); 
//			dto.setEmpno(empno);
			
			String ename = request.getParameter("ename");
			
			String job = request.getParameter("job");
			
			String sMgr = request.getParameter("mgr");
			int mgr = Integer.parseInt(sMgr);
			
			String sHiredate = request.getParameter("hiredate");
			Date hiredate = Date.valueOf(sHiredate);
			
			String sSal = request.getParameter("sal");
			int sal = Integer.parseInt(sSal);
			
			String sComm = request.getParameter("comm");
			int comm = Integer.parseInt(sComm);
			
			String sDeptno = request.getParameter("deptno");
			int deptno = Integer.parseInt(sDeptno);
			
			    
			  
			    empDTO1.setEmpno(empno);
			    empDTO1.setEname(ename);
			    empDTO1.setJob(job);
			    empDTO1.setMgr(mgr);
			    empDTO1.setHiredate(hiredate);
			    empDTO1.setSal(sal);
			    empDTO1.setComm(comm);
			    empDTO1.setDeptno(deptno);
			    
			    
			 response.sendRedirect("list");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


