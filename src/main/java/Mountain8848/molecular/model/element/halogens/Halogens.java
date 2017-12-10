package Mountain8848.molecular.model.element.halogens;

import Mountain8848.molecular.model.Element;

public interface Halogens extends Element {

   @Override
   default String getGroupName() {
      return Halogens.class.getSimpleName();
   }
}
