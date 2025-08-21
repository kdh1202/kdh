package emp.controlloer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.DTO.EmpDTO;
import emp.Service.EmpService;

@WebServlet("/list")
public class EmpListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/list do get 실행");
			// 요청 할 때 한글 깨짐
			request.setCharacterEncoding("utf-8");
			// 응답 할 때 한글 깨짐
			response.setContentType("text/html;charset=utf-8");
			
			
			// DB 조회
			//서비스에서 호출 해오는곳
			EmpService empService = new EmpService();
			List<EmpDTO> list = empService.getAllEmp();
			// 
			//////////////////////////////////////////////
			// 화면에 출력 (응답 정적 자원 만들기 )
			PrintWriter out = response.getWriter();
			
			out.println("<table border=1>");
			out.println("	<tr>");
			out.println("		<th>empno</th>");
			out.println("		<th>ename</th>");
			out.println("		<th>sal</th>");
			out.println("	</tr>");
			for(EmpDTO dto : list) {
				System.out.println(dto);
				out.println("<tr>");
				out.println("<td><a href='detail?empno="+dto.getEmpno()+"'>"+dto.getEmpno()+"</a></td>");
				out.println("<td>"+dto.getEname()+"</td>");
				out.println("<td>"+dto.getSal()+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
	}

}
