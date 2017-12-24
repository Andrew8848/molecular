package Mountain8848.molecular.model.atom;

import java.util.ArrayList;
import java.util.List;

public class Atom
{
   private List<Shell> shells;
   private final int nuclearCharge;
   
   public Atom(int nuclearCharge)
   {
      this.nuclearCharge = nuclearCharge;
      shells = calculateShells();
   }
   
   public List<Shell> getShells()
   {
      return new ArrayList<Shell>(shells);
   }
   
   private List<Shell> calculateShells()
   {
      shells = new ArrayList<>();
      int shellIndex = 1;
      Shell currentShell = new Shell(shellIndex);
      shells.add(currentShell);
      do
      {
         currentShell = new Shell(shellIndex);
         shells.add(currentShell);
      }
      while (countShellElectrons(++shellIndex) < nuclearCharge);
      return shells;
   }
   
   private int countShellElectrons(int shellIndex)
   {
      return 2 * (int) Math.pow(shellIndex, 2);
   }
}
