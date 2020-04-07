package mybatis_study.service;

import java.util.Date;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import mybatis_study.dto.Course;
import mybatis_study.dto.Tutor;

public class CourseUiServiceTest {
	private static CourseUiService service;
	protected static final Log log = LogFactory.getLog(CourseUiServiceTest.class);
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CourseUiService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test(expected = RuntimeException.class)
	public void test01JoinNewTutorAndCourseFailTutor() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Tutor tutor = new Tutor();
		tutor.setTutorId(4);
		tutor.setName("kim");
		tutor.setEmail("test@test.co.kr");
		
		Course course = new Course(8, "Python", "programing", new Date(), new Date(), 4);
		service.joinNewTutorAndCourse(tutor, course);
	}

	@Test(expected = RuntimeException.class)
	public void test02JoinNewTutorAndCourseFailCourse() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Tutor tutor = new Tutor();
		tutor.setTutorId(6);
		tutor.setName("kim");
		tutor.setEmail("test@test.co.kr");
		
		Course course = new Course(2, "Python", "programing", new Date(), new Date(), 6);
		service.joinNewTutorAndCourse(tutor, course);
	}
	
	@Test
	public void test03JoinNewTutorAndCourseSuccess() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Tutor tutor = new Tutor();
		tutor.setTutorId(6);
		tutor.setName("kim");
		tutor.setEmail("test@test.co.kr");
		
		Course course = new Course(8, "Python", "programing", new Date(), new Date(), 6);
		service.joinNewTutorAndCourse(tutor, course);
	}
	
	@Test(expected = RuntimeException.class)
	public void test04RemoveTutorAndCourseFailTutor() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		service.removeTutorAndCourse(10, 8);
	}
	
	@Test(expected = RuntimeException.class)
	public void test05RemoveTutorAndCourseFailCourse() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		service.removeTutorAndCourse(6, 10);
	}
	
	@Test
	public void test06RemoveTutorAndCourseSuccess() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		service.removeTutorAndCourse(6, 8);
	}

}
