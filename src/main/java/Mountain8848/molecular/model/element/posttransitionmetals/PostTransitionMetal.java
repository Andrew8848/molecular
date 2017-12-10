package Mountain8848.molecular.model.element.posttransitionmetals;

import Mountain8848.molecular.model.Element;

public interface PostTransitionMetal extends Element {

   @Override
   default String getGroupName() {
      return PostTransitionMetal.class.getSimpleName();
   }
}
