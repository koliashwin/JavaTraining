package june30;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindDemo {

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
		
		Optional<Integer> any = s.stream().map(p->p.marks).filter(x -> x<50).findAny();
		Optional<Integer> first = s.stream().map(p->p.marks).filter(x -> x<50).findFirst();
		
		for(int i=0; i<10; i++) {
			if(any.isPresent()) {
				Integer result = any.get();
				Integer first1 = first.get();
				System.out.println("any : "+result+" first :"+first1);
			}
		}
		

	}

}
