package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}
	
	public void Negative(int x, int y) throws IllegalRectangle{
		
		if(x < 0 || y < 0){
			throw new IllegalRectangle();
		}
		
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
