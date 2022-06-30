package june30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> s = new ArrayList<>();
		s.add(new Students(1,"ashiwn","versova",60));
		s.add(new Students(2,"Vaibhav","puna",40));
		s.add(new Students(3,"Hiren","ghar",35));
		s.add(new Students(4,"ashish","parle",45));
		s.add(new Students(5,"vishal","ghar",75));
		
		List<String> list = s.stream().filter(p->p.marks>50).map(p->p.name).collect(Collectors.toList());
		System.out.println("students scored 50+ :"+list);
		
	}

}
