package activities;

public class CustomException extends Exception{
	private String message;
	CustomException(String error)
	{
		message=error;	
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
