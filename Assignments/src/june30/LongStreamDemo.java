package june30;

import java.util.Arrays;

public class LongStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] num = {99,35,69,96,39};
		Long[] result = Arrays.stream(num).boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
	}

}
