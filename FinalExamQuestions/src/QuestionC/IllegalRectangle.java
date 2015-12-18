package QuestionC;

public class IllegalRectangle extends Exception{

	private int x;
	private int y;
		
	public void IllegalRectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getLength(){
		
		return x;
	}
	
	public int getHeight(){
		
		return y;
	}
}
