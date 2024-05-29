package oop.exam;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		rect.setWidthHeight(w, h);
		System.out.println("넓이: " + rect.calculateArea());
		System.out.println("둘레: " + rect.calculatePerimeter());
		System.out.println("정사각형? " + rect.isSquare());
	}
}
