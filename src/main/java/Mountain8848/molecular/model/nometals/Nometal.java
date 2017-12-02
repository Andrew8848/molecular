package Mountain8848.molecular.model.nometals;

import Mountain8848.molecular.model.Element;

public interface Nometal extends Element {
	
   @Override
   default String getGroupName() {
      return Nometal.class.getSimpleName();
   }
}
