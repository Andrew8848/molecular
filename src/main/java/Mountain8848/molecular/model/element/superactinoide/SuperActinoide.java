package Mountain8848.molecular.model.element.superactinoide;

import Mountain8848.molecular.model.Element;

public interface SuperActinoide extends Element{

   @Override
   default String getGroupName() {
      return SuperActinoide.class.getSimpleName();
   }
}
