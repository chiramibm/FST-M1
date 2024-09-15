package activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exceptionTest("custome error message");
		exceptionTest(null);
	}

	public static void exceptionTest(String s) {
		if (s==null) {
			try {
				throw new CustomException("empty string");
			} catch (CustomException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println(s);
		}
	}
}
