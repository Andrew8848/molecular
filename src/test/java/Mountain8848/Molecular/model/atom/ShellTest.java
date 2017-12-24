package Mountain8848.Molecular.model.atom;

import java.util.List;

import Mountain8848.molecular.model.atom.Shell;
import Mountain8848.molecular.model.atom.Subshell;
import junit.framework.TestCase;

public class ShellTest extends TestCase
{
   public void testCalculateSubshells()
   {
      int index = 1;
      
      Shell shell = new Shell(index);
      List<Subshell> subshells = shell.getSubshells();
      assertEquals(index, subshells.size());
      
      index = 3;
      shell = new Shell(index);
      subshells = shell.getSubshells();
      assertEquals(index, subshells.size());
      
      index = 5;
      shell = new Shell(index);
      subshells = shell.getSubshells();
      assertEquals(Shell.MAX_SUBSHELLS, subshells.size());
   }
}
