package mybatis_study.mappers;

import mybatis_study.dto.Student;

public interface StudentMapper {
	Student selectStudentByNO(Student student);
}
