package study.errors;

	public class Under18Exception extends Exception{
		public Under18Exception() {
			super("The empoyee cannot be younger than 18 years");
		}
	}

	class Above70Exception extends RuntimeException{
		public Above70Exception() {
			super("Employee is aged");
		}
	}

