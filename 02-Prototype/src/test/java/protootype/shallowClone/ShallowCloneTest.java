package protootype.shallowClone;

import org.junit.jupiter.api.Test;
import prototype.Temp;
import prototype.shallowClone.ShallowClone;

/**
 * @author Pope
 */
public class ShallowCloneTest {

    @Test
    public void shallowCloneTest() throws CloneNotSupportedException {
        ShallowClone shallowClone01 = new ShallowClone(1,"Pope",new Temp());
        ShallowClone shallowClone02 = shallowClone01.clone();
        System.out.println("shallowClone01 == shallowClone02 结果：" + (shallowClone01 == shallowClone02));
        System.out.println("shallowClone01.id == shallowClone02.id 结果：" + (shallowClone01.getId() == shallowClone02.getId()));
        System.out.println("shallowClone01.name == shallowClone02.name 结果：" + (shallowClone01.getName() == shallowClone02.getName()));
        System.out.println("shallowClone01.temp == shallowClone02.temp 结果：" + (shallowClone01.getTemp() == shallowClone02.getTemp()));
    }

}
