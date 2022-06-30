package june30;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxMinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> s = new ArrayList<>();
		s.add(new Students(1,"ashiwn","versova",60));
		s.add(new Students(2,"Vaibhav","puna",40));
		s.add(new Students(3,"Hiren","ghar",35));
		s.add(new Students(4,"ashish","parle",45));
		
		Integer maxMarks = s.stream().mapToInt(p->p.marks).max().orElseThrow(NoSuchElementException::new);
		System.out.println("higest marks : "+maxMarks);
		
		Integer minMarks = s.stream().mapToInt(p->p.marks).min().orElseThrow(NoSuchElementException::new);
		System.out.println("lowest marks : "+minMarks);
	}

}
