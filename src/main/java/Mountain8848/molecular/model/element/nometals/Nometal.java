package Mountain8848.molecular.model.element.nometals;

import Mountain8848.molecular.model.Element;

public interface Nometal extends Element {
	
   @Override
   default String getGroupName() {
      return Nometal.class.getSimpleName();
   }
}
