package Mountain8848.molecular.model.alkalineearthmetals;

import Mountain8848.molecular.model.Element;

public interface AlkalineEarthMetals extends Element{

   @Override
   default String getGroupName() {
      return AlkalineEarthMetals.class.getSimpleName();
   }
}
