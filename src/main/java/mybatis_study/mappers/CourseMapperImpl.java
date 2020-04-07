package mybatis_study.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis_study.dto.Course;

public class CourseMapperImpl implements CourseMapper {
private static final CourseMapperImpl instance = new CourseMapperImpl();
	
	private final String namespace = "mybatis_study.mappers.CourseMapper";
	private SqlSession sqlSession;
	
	private CourseMapperImpl() {}
	
	public static CourseMapperImpl getInstance() {
		return instance;
	}
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Course> selectCoursesByCondition(Map<String, Object> map) {
		return sqlSession.selectList(namespace+".selectCoursesByCondition", map);
	}

	@Override
	public List<Course> selectCaseCourses(Map<String, Object> map) {
		return sqlSession.selectList(namespace+".selectCaseCourses", map);
	}

	@Override
	public List<Course> selectWhereCourses(Map<String, Object> map) {
		return sqlSession.selectList(namespace+".selectWhereCourses", map);
	}

	@Override
	public List<Course> selectTrimCourses(Map<String, Object> map) {
		return sqlSession.selectList(namespace+".selectTrimCourses", map);
	}

	@Override
	public List<Course> selectCoursesForeachByTutors(Map<String, Object> map) {
		return sqlSession.selectList(namespace+".selectCoursesForeachByTutors", map);
	}

	@Override
	public int insertCourses(Map<String, Object> map) {
		return sqlSession.insert(namespace+".insertCourses", map);
	}

	@Override
	public int deleteCourses(Map<String, Object> map) {
		return sqlSession.delete(namespace+".deleteCourses", map);
	}

	@Override
	public int insertCourse(Course course) {
		return sqlSession.insert(namespace+".insertCourse", course);
	}

	@Override
	public int deleteCourse(Course course) {
		return sqlSession.delete(namespace+".deleteCourse", course);
	}

}
