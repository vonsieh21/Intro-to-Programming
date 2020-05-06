
public class Exercise09_01 {
	public static void main(String[] args) {
		// Create a Rectangle with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		// Create a Rectangle with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// Display the width, height, area, and perimeter of rectangle1
		System.out.println("The area of a rectangle with width "+ rectangle1.width +" and height " + rectangle1.height + " is " + rectangle1.getArea());
		System.out.println("The perimeter of a rectangle: " + rectangle1.getPerimeter());

		// Display the width, height, area, and perimeter of rectangle2
		System.out.println("The area of a rectangle with width "+ rectangle2.width +" and height " + rectangle2.height + " is " + rectangle2.getArea());
		System.out.println("The perimeter of a rectangle: " + rectangle2.getPerimeter());
	}

}

class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	/** A no-arg constructor that creates a default rectangle */
	Rectangle() {
		width = 1;
		height = 1;
	} 

	/** A constructor that creates a rectangle 
	    with the specified width and height    */
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	/** Return the area of this rectangle */
	double getArea() {
		return width * height; 
	}

	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + height);
	}

}
