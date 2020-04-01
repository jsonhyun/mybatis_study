package mybatis_study.mappers;

import java.util.List;

import mybatis_study.dto.Student;

public interface StudentMapper {
	//typeHandler 사용
	Student selectStudentByNO(Student student);
	//typeHandler를 사용하지 않음
	Student selectStudentByNOWithResultMap(Student student);
	
	List<Student> selectStudentByAll();
	
	int insertStudent(Student student);
	int deleteStudent(int id);
	int updateStudent(Student student);
}
