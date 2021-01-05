package prototype.shallowClone;

import prototype.Temp;
import prototype.deepClone.DeepClone;

/**
 * @author Pope
 */
public class ShallowClone implements Cloneable{
    /**
     * 基本类型，不用做深拷贝处理
     */
    private int id;
    /**
     * 引用类型
     */
    private String name;
    private Temp temp;

    public ShallowClone() {
    }

    public ShallowClone(int id, String name, Temp temp) {
        this.id = id;
        this.name = name;
        this.temp = temp;
    }

    @Override
    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }
}
