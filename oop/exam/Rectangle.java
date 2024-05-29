package oop.exam;

public class Rectangle {
	int width;
	int height;
	
	public void setWidthHeight(int w, int h) {
		width = w;
		height = h;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public int calculatePerimeter() {
		return (width + height) *2;
	}
	
	public boolean isSquare() {
		return width == height;
	}
}
