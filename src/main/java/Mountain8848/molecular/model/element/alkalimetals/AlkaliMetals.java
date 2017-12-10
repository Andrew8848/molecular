package Mountain8848.molecular.model.element.alkalimetals;

import Mountain8848.molecular.model.Element;

public interface AlkaliMetals extends Element{
  
   @Override
   default String getGroupName() {
      return AlkaliMetals.class.getSimpleName();
   }
}
