package protootype.deepClone;

import org.junit.jupiter.api.Test;
import prototype.Temp;
import prototype.deepClone.DeepClone;

/**
 * @author Pope
 */
public class DeepCloneTest {

    @Test
    public void deepCloneTest() throws CloneNotSupportedException {
        DeepClone deepClone01 = new DeepClone(1, "Pope", new Temp());
        DeepClone deepClone02 = deepClone01.clone();
        System.out.println("deepClone01 == deepClone02 结果：" + (deepClone01 == deepClone02));
        System.out.println("deepClone01.id == deepClone02.id 结果：" + (deepClone01.getId() == deepClone02.getId()));
        System.out.println("deepClone01.name == deepClone02.name 结果：" + (deepClone01.getName() == deepClone02.getName()));
        System.out.println("deepClone01.temp == deepClone02.temp 结果：" + (deepClone01.getTemp() == deepClone02.getTemp()));
    }

}
