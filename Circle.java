package GUI;

public class Circle 
{
	public double radius, diameter, circumference, area;
	
	public Circle(double r)
	{
		radius = r;
		diameter = 2*r;
		circumference = Math.PI * diameter;
		area = Math.PI * Math.pow(r, 2);
	}
}