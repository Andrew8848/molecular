package Mountain8848.molecular.model.element.lanthanide;

import Mountain8848.molecular.model.Element;

public interface Lanthanide extends Element {

   @Override
   default String getGroupName() {
      return Lanthanide.class.getSimpleName();
   }
}
