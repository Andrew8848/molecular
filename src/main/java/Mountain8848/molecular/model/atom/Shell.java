package Mountain8848.molecular.model.atom;

import java.util.ArrayList;
import java.util.List;

public class Shell
{
   private int index;
   private List<Subshell> subshells = new ArrayList<Subshell>();
   
   public Shell(int index)
   {
      this.index = index;
   }
   
   public int getIndex()
   {
      return index;
   }

   public List<Subshell> getSubshells()
   {
      return subshells;
   }
}
