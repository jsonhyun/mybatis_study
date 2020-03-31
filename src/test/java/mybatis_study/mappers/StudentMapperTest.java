package mybatis_study.mappers;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import mybatis_study.dto.Student;
import mybatis_study.jdbc.AbstractTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentMapperTest extends AbstractTest {
	private static StudentMapper dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = StudentMapperImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}

	@Test
	public void testSelectStudentByNO() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+"()");
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = dao.selectStudentByNO(student);
		log.debug(selectStudent.toString());
		Assert.assertEquals(student.getStudId(), selectStudent.getStudId());
	}

}
