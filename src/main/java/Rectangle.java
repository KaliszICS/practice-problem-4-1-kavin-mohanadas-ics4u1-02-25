public class Rectangle{

	private double length; 
	private double width;
	
	public Rectangle(double length, double width)
	{
		this.width = width;
		this.length = length;
	}

	public double getLength()
	{
		return this.length;
	}

	public double getWidth()
	{
		return this.width;
	}

	public double perimeter()
	{
		if (this.length * this.width != 0)
		{
			return (2 * this.length) + (2 * this.width);
		}
		return 0;
	}

	public double area()
	{
		return this.length * this.width;
	}
	
}