package Mountain8848.molecular.model.atom;

import java.util.ArrayList;
import java.util.List;

public class Atom
{
   private List<Shell> shells = new ArrayList<Shell>();
   
   public List<Shell> getShells()
   {
      return new ArrayList<Shell>(shells);
   }
}
