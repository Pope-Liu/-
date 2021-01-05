package director;

import builder.IBuilder;
import builder.Impl.BuilderA;
import builder.Impl.BuilderB;
import org.junit.jupiter.api.Test;
import product.Product;

/**
 * @author Pope
 */
public class DirectorTest {

    @Test
    public void builderTest(){
        System.out.println("==========使用建造者A来构造产品==========");
        IBuilder builder = new BuilderA();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);

        System.out.println();

        System.out.println("==========使用建造者B来构造产品==========");
        builder = new BuilderB();
        director.setBuilder(builder);
        product = director.construct();
        System.out.println(product);
    }

}
