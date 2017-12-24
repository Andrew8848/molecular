package Mountain8848.molecular;

import java.util.List;

import Mountain8848.molecular.model.atom.Atom;
import Mountain8848.molecular.model.atom.Shell;

public class Main {

	public static void main(String[] args) {
	   Atom myAtom = new Atom(5);
	   List<Shell> shells = myAtom.getShells();
	   printShells(shells);
	}

   private static void printShells(List<Shell> shells)
   {
      // TODO Auto-generated method stub
      
   }

}
