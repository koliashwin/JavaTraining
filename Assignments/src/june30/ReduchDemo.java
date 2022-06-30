package june30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;



public class ReduchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> s = new ArrayList<>();
		s.add(new Students(1,"ashiwn","versova",60));
		s.add(new Students(2,"Vaibhav","puna",40));
		s.add(new Students(3,"Hiren","ghar",35));
		s.add(new Students(4,"ashish","parle",45));
		s.add(new Students(5,"vishal","ghar",75));
		s.add(new Students(6,"ashiwn","versova",30));
		s.add(new Students(7,"ashiwn","versova",20));
		
		Integer totalmarks = s.stream().map(p->p.marks).reduce(0,(marks1,marks2) -> marks1+marks2);
		System.out.println("total marks : "+totalmarks);
		
		long studentCount = s.stream().count();
		System.out.println("total Students : "+studentCount);
		
		Integer maxMarks = s.stream().mapToInt(p->p.marks).max().orElseThrow(NoSuchElementException::new);
		System.out.println("higest marks : "+maxMarks);
		
		Integer minMarks = s.stream().mapToInt(p->p.marks).min().orElseThrow(NoSuchElementException::new);
		System.out.println("lowest marks : "+minMarks);
		
		List<String> list = s.stream().filter(p->p.marks>50).map(p->p.name).collect(Collectors.toList());
		System.out.println("students scored 50+ :"+list);
		
		System.out.println("distinct names :");
		s.stream().map(p->p.name).distinct().forEach(System.out::println);
		
		
//		for(Students student:s) {
//			System.out.println("roll no.- "+student.getId()+", name : "+student.getName());
//		}
		
		s.forEach(student -> {
			if(student.getMarks()<50)
				System.out.println("roll no.- "+student.getId()+", name : "+student.getName()+" has failed the test");
			else
				System.out.println("roll no.- "+student.getId()+", name : "+student.getName()+" has passed the test");

		});
		
	}

}
