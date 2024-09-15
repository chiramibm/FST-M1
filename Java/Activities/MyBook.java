package activities;

public class MyBook extends Book{

	@Override
	public void setTitle(String S) {
		// TODO Auto-generated method stub
		this.title=S;
	}
	
	public static void main(String[] args)
	{
		MyBook newNovel=new MyBook();
		newNovel.setTitle("test");
		System.out.println("The new book name is :"+newNovel.getTitle());
	}

}
