package Mountain8848.molecular.model.atom;

import java.util.ArrayList;
import java.util.List;

public class Shell
{
   public static final int MAX_SUBSHELLS = 4;
   
   private int index;
   private List<Subshell> subshells;
   
   public Shell(int index)
   {
      this.index = index;
      subshells = calculateSubshells();
   }

   private List<Subshell> calculateSubshells()
   {
      subshells = new ArrayList<>();
      for (int i = 0; i < index && i < MAX_SUBSHELLS; i++)
      {
         Subshell currentSubshell = new Subshell();
         subshells.add(currentSubshell);
      }
      return subshells;
   }

   public List<Subshell> getSubshells()
   {
      return new ArrayList<>(subshells);
   }
}
