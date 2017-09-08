package s2b.tst.sum;

public class Sum {

	public static double sum(double d, double e) {
		if(d<0)
			throw new IllegalArgumentException("o primeiro numero não pode ser negativo");
		if(e<0)
			throw new IllegalArgumentException("o segundo numero não pode ser negativo");
		
		return d+e;
	}

}
