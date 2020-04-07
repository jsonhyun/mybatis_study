package mybatis_study.mappers;

import java.util.List;
import java.util.Map;

import mybatis_study.dto.Course;

public interface CourseMapper {
	List<Course> selectCoursesByCondition(Map<String, Object> map);
	List<Course> selectCaseCourses(Map<String, Object> map);
	List<Course> selectWhereCourses(Map<String, Object> map);
	List<Course> selectTrimCourses(Map<String, Object> map);
	List<Course> selectCoursesForeachByTutors(Map<String, Object> map);
	
	int insertCourses(Map<String, Object> map);
	int deleteCourses(Map<String, Object> map);
	
	int insertCourse(Course course);
	int deleteCourse(Course course);
}
