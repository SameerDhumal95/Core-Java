package study.errors.custom;

/* Creating custom Exceptions Under19Exception */

	public class Under18Exception extends Exception {
		
		public Under18Exception() //default constructure  
		{
			super("The employee cannot be younger than 18 years");
			//super class constructure call
		}

	}

