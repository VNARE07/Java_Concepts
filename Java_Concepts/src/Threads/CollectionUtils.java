package Threads;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public interface CollectionUtils {
	// add a static method to return populated map of students
	static HashMap<String, Student> populateMap() {
		HashMap<String, Student> map = new HashMap<>();
		map.put("dac-001", new Student("dac-001", "Riya", LocalDate.parse("1995-03-17"), Subject.JAVA, 7.59));
		map.put("dac-008", new Student("dac-008", "Anish", LocalDate.parse("1998-01-29"), Subject.ANGULAR, 7.9));
		map.put("dac-003", new Student("dac-003", "Rama", LocalDate.parse("1995-12-09"), Subject.DBT, 7.81));
		map.put("dac-004", new Student("dac-004", "Priya", LocalDate.parse("1997-01-01"), Subject.JAVA, 8.12));
		map.put("dac-002", new Student("dac-002", "Mihir", LocalDate.parse("1996-10-21"), Subject.JAVA, 7.47));
		map.put("dac-007", new Student("dac-007", "Rahul", LocalDate.parse("1997-07-22"), Subject.REACT, 8.51));
		map.put("dac-005", new Student("dac-005", "Shreya", LocalDate.parse("1999-08-13"), Subject.WT, 8.3));
		map.put("dac-009", new Student("dac-009", "Ritesh", LocalDate.parse("1995-03-12"), Subject.JAVA, 7.5));
		map.put("dac-011", new Student("dac-011", "Rutu", LocalDate.parse("1997-08-29"), Subject.ANGULAR, 8.33));
		map.put("dac-006", new Student("dac-006", "Sahil", LocalDate.parse("1999-12-09"), Subject.DBT, 8.56));
		map.put("dac-010", new Student("dac-010", "Meeta", LocalDate.parse("1998-01-01"), Subject.JAVA, 7.19));
		map.put("dac-020", new Student("dac-020", "Kirti", LocalDate.parse("1996-11-21"), Subject.JAVA, 9.08));
		map.put("dac-014", new Student("dac-014", "Raj", LocalDate.parse("1997-06-20"), Subject.REACT, 8.55));
		map.put("dac-015", new Student("dac-015", "Pallavi", LocalDate.parse("1999-08-23"), Subject.WT, 8.39));
		return map;
	}
	static List<Student> sortbydate(HashMap<String,Student> map){
		List<Student> students = new ArrayList<Student>(map.values());
		Comparator<Student> sortbydate = new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getDob().compareTo(o2.getDob());
			}
		};
		Collections.sort(students,sortbydate);
		return students;
	}
	static List<Student> sortbygpa(HashMap<String,Student> map){
		return map.values() // gets collection of values
		.stream() // converts the collextion to the stream
		.sorted(Comparator.comparing(Student::getGpa)) // sorts the stream based on the comparting crteria
		.collect(Collectors.toList()); // gets the stream into a list and returns the list
	}
}

