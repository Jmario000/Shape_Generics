package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {
	public static void main(String args[]) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new LinkedList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		double formatedTotalArea = Double.parseDouble(String.format("%.3f", totalArea(myCircles)));
		JOptionPane.showMessageDialog(null, "Total area = " + formatedTotalArea);
	}

	// bounded wildcard
	public static double totalArea(List<? extends Shape> shapes) {
		double sum = 0.0;
		for (Shape s : shapes) {
			sum += s.area();
		}
		return sum;
	}
}
