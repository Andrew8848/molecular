package Mountain8848.molecular.model.element.metalloids;

import Mountain8848.molecular.model.Element;

public interface Metalloids extends Element{

   @Override
   default String getGroupName() {
      return Metalloids.class.getSimpleName();
   }
}
