package Mountain8848.molecular.model.element.transitionmetals;

import Mountain8848.molecular.model.Element;

public interface TransitionMetal extends Element {
   
   @Override
   default String getGroupName() {
      return TransitionMetal.class.getSimpleName();
   }
}
