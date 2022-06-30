package june30;

import java.util.ArrayList;
import java.util.List;

public class DistinctDemo {

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
		
		long count =s.stream().count();
		System.out.println("all students : "+count);
		s.forEach(student -> System.out.println("roll no.- "+student.getId()+", name : "+student.getName()));
		
		long distcount = s.stream().map(p->p.name).distinct().count();
		System.out.println("distinct names :" + distcount);
		s.stream().map(p->p.name).distinct().forEach(System.out::println);
	}

}
