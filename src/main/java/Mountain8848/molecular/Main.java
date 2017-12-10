package Mountain8848.molecular;

import Mountain8848.molecular.model.Element;
import Mountain8848.molecular.model.element.actinoide.*;
import Mountain8848.molecular.model.element.alkalimetals.*;
import Mountain8848.molecular.model.element.nometals.*;
import Mountain8848.molecular.model.element.transitionmetals.*;

public class Main {

	public static void main(String[] args) {

		Element[] elements = new Element [] {new H(), new C(), new Fe(), new Au(), new Th(), new U(), new Pl(), new Li()};
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i].elementToString());
		}
	}

}
