package epam.cdp.byta2015.module3.lecture1;

public class MathUtils {

	private int value;
	
	public MathUtils(int value) {
		this.value = value;
	}
	
	public int summ(){
		int result = 0;
		for(int i=0; i<=this.value; i++){
			result += i;
		}
		return result;
	}
	
	public int factorial() {
		int result = 1;
		for(int i=1; i<=value; i++){
			result *= i;
		}
		return result;
	}
	
}
