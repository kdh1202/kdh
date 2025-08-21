package emp.controlloer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.DTO.EmpDTO;
import emp.Service.EmpService;

@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/remove doPost 실행");
		// 0 . 삭제 버튼 누르면 :detail 에서 삭제버튼을 누르면 동작
		// 1 . empno 값 가져오기 사원번호 가져오기
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
		// 2 . DTO 에 담아주기 DTO에 넣기
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// 3 . DB에 다녀오기 DB 들리기
		EmpService empService = new EmpService();
		int result = empService.removeEmp(empDTO);
		System.out.println(result + " 삭제 되었습니다");
	
		// 4 . 전체 목록으로 페이지 표시 LIST에 표시 하기
		response.sendRedirect("list");
	}

}
