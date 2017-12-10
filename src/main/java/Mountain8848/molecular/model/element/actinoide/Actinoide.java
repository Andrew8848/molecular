package Mountain8848.molecular.model.element.actinoide;

import Mountain8848.molecular.model.Element;

public interface Actinoide extends Element {

   @Override
   default String getGroupName() {
      return Actinoide.class.getSimpleName();
   }
}
