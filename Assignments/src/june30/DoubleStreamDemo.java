package june30;

import java.util.Arrays;

public class DoubleStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {10.2,68.2,69.3,44.2,5};
		Double[] result = Arrays.stream(num).boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(result));
	}

}
