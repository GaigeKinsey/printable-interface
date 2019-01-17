package edu.neumont.kinsey.printableinterface;

import java.util.ArrayList;
import java.util.List;

import edu.neumont.kinsey.printableinterface.model.ConsolePrintable;
import edu.neumont.kinsey.printableinterface.model.Park;
import edu.neumont.kinsey.printableinterface.model.Student;

public class InterfaceDriver {

	public static void main(String[] args) {
		List<ConsolePrintable> printables = new ArrayList<>();
		printables.add(new Student("Gaige", 4.0));
		printables.add(new Park("Boiling Springs", 80));
		
		for (ConsolePrintable printable : printables) {
			printable.print();
		}
	}
}
