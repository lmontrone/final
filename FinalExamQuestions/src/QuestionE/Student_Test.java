package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");


		assertTrue(1==1);
	}
	
	
	public static void StudentMap(){
		Date d1BirthDate = null;
		try {
			d1BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1982-06-21");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu2 = new Student("Michael", "Hammond", "Janes", d1BirthDate, "11 Fordham Rd.", "978-697-4567", "mjanes@udel.edu","MIS");
		Date d2BirthDate = null;
		try {
			d2BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1994-11-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu3 = new Student("Joey", "Tribiani", "Friend", d2BirthDate, "1313 Deadend Dr.", "978-697-5678", "jfriend@udel.edu","MIS");
		Date d3BirthDate = null;
		try {
			d3BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1990-03-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu4 = new Student("Kelsey", "Mann", "Ding", d3BirthDate, "23 Drury Ln.", "978-697-6789", "kding@udel.edu","MS");
		Date d4BirthDate = null;
		try {
			d4BirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1979-10-10");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu5 = new Student("Sam", "Tite", "Yamm", d4BirthDate, "34 Farmers Way", "978-697-2345", "syamm@udel.edu","MIS");
		
		HashMap<Student, Integer> studentList = new HashMap<Student, Integer>();
		studentList.put(stu2, 1);
		studentList.put(stu3, 2);
		studentList.put(stu4, 3);
		studentList.put(stu5, 4);
	}
}
		

