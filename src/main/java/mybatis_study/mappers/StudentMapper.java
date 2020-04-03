package mybatis_study.mappers;

import java.util.List;
import java.util.Map;

import mybatis_study.dto.Student;

public interface StudentMapper {
	//typeHandler 사용
	Student selectStudentByNO(Student student);
	//typeHandler를 사용하지 않음
	Student selectStudentByNOWithResultMap(Student student);
	
	Student selectStudentByNOAssociation(Student student);
	
	List<Student> selectStudentByAll();
	//ResultMap
	List<Student> selectStudentByAllForResultMap();
	//hashMap
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	int insertStudent(Student student);
	int deleteStudent(int id);
	int updateStudent(Student student);
	int insertEnumStudent(Student student);
}
