package Mountain8848.molecular;

import Mountain8848.molecular.model.Element;
import Mountain8848.molecular.model.actinoide.Pl;
import Mountain8848.molecular.model.actinoide.Th;
import Mountain8848.molecular.model.actinoide.U;
import Mountain8848.molecular.model.nometals.C;
import Mountain8848.molecular.model.transitionmetals.Au;
import Mountain8848.molecular.model.transitionmetals.Fe;

public class Main {

	public static void main(String[] args) {

		Element[] elements = new Element [] {new C(), new Fe(), new C(), new Au(), new Th(), new U(), new Pl()};
		
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i].elementToString());
		}
	}

}
