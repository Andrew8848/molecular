package Mountain8848.molecular.model.element.alkalineearthmetals;

import Mountain8848.molecular.model.Element;

public interface AlkalineEarthMetals extends Element{

   @Override
   default String getGroupName() {
      return AlkalineEarthMetals.class.getSimpleName();
   }
}
