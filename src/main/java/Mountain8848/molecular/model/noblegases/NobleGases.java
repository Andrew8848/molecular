package Mountain8848.molecular.model.noblegases;

import Mountain8848.molecular.model.Element;

public interface NobleGases extends Element{

   @Override
   default String getGroupName() {
      return NobleGases.class.getSimpleName();
   }
}
