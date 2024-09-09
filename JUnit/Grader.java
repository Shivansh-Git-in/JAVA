package junittest;

public class Grader {
	public char Lettergrade(int numbergrade) {
		if(numbergrade < 0) {
			 throw new IllegalArgumentException("Number canner be resolved");
		}
		else if(numbergrade < 60) {
			return 'F';
		}
		else if(numbergrade < 70) {
			return 'D';
		}
		else if(numbergrade < 80) {
			return 'C';
		}
		else if(numbergrade < 90) {
			return 'B';
		}
		else{
			return 'A';
		}
	}
}
