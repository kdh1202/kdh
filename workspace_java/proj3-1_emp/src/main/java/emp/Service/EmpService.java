package emp.Service;

import java.util.List;

import emp.DAO.EmpDAO;
import emp.DTO.EmpDTO;

public class EmpService {
	// EMP서비스에서 하는일 
	// 컨트롤러가 호출했을떄 DAO 에서 받아서 돌려주는것
	
	EmpDAO empDAO = new EmpDAO();
	
	public List<EmpDTO> getAllEmp(){
		List list  = empDAO.selectAllEmp();
		
		return list;
	}
	
	public EmpDTO getOneEmp(EmpDTO empDTO) {
		EmpDTO dto = empDAO.selectOneEmp(empDTO);
		return dto;
	}
	public int removeEmp(EmpDTO empDTO) {
		
		return empDAO.deleteEmp(empDTO);
	}
	
	public int addEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}
	public int editEmp (EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}
	
}
