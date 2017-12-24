package Mountain8848.Molecular.model.atom;

import java.util.List;

import Mountain8848.molecular.model.atom.Atom;
import Mountain8848.molecular.model.atom.Shell;
import junit.framework.TestCase;

public class AtomTest extends TestCase
{
   public void testCalculateShells()
   {
      Atom ca = new Atom(20);
      List<Shell> caShells = ca.getShells();
      assertEquals(4, caShells.size());   
   }
}
