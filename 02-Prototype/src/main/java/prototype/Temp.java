package prototype;

/**
 * @author Pope
 * 用于进行复杂属性的clone()方法测试
 */
public class Temp implements Cloneable{

    @Override
    public Temp clone() throws CloneNotSupportedException {
        return (Temp) super.clone();
    }
}
