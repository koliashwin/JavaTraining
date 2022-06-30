package june30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Students> s = new ArrayList<>();
		s.add(new Students(1,"ashiwn","versova",60));
		s.add(new Students(2,"Vaibhav","puna",40));
		s.add(new Students(3,"Hiran","ghar",35));
		s.add(new Students(4,"ashish","parle",45));
		s.add(new Students(5,"vishal","ghar",75));
		s.add(new Students(6,"asta","versova",30));
		s.add(new Students(7,"akun","versova",20));
		
		Predicate<Students> p1 = p -> p.name.startsWith("a") && p.name.endsWith("n");
		Predicate<Students> p2 = p -> p.name.contains("a");
		Predicate<Students> p3 = p -> p.name.contains("z");
		
		boolean check1 = s.stream().anyMatch(p1);
		System.out.println("there exist atleast 1 match : "+check1);
		
		boolean check2 = s.stream().allMatch(p2);
		System.out.println("there exist all matchs : "+check2);
		
		boolean check3 = s.stream().noneMatch(p3);
		System.out.println("no matches : "+check3);
		
		s.forEach(entry ->{
			if(check1) {
				System.out.println(entry.name);
			}
		});
		

	}

}
