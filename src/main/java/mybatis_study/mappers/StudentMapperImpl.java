package mybatis_study.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis_study.dto.Student;

public class StudentMapperImpl implements StudentMapper {
	private static final StudentMapperImpl instance = new StudentMapperImpl();
	
	private final String namespace = "mybatis_study.mappers.StudentMapper";
	private SqlSession sqlSession;
	
	private StudentMapperImpl() {}
	
	public static StudentMapperImpl getInstance() {
		return instance;
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNO(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentByNO", student);
	}

	@Override
	public Student selectStudentByNOWithResultMap(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentByNOWithResultMap", student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		return sqlSession.selectList(namespace+".selectStudentByAll");
	}

	@Override
	public int insertStudent(Student student) {
			return sqlSession.insert(namespace + ".insertStudent", student);
	}

	@Override
	public int deleteStudent(int id) {
		return sqlSession.delete(namespace + ".deleteStudent", id);
	}

	@Override
	public int updateStudent(Student student) {
		return sqlSession.update(namespace + ".updateStudent", student);
	}

	@Override
	public List<Student> selectStudentByAllForResultMap() {
		return sqlSession.selectList(namespace + ".selectStudentByAllForResultMap");
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		return sqlSession.selectList(namespace + ".selectStudentByAllForHashMap");
	}

	@Override
	public Student selectStudentByNOAssociation(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentByNOAssociation", student);
	}

}
