package prototype.deepClone;

import prototype.Temp;

/**
 * @author Pope
 */
public class DeepClone implements Cloneable{
    /**
     * 基本类型，不用做深拷贝处理
     */
    private int id;
    /**
     * 引用类型 String类没有继承Cloneable接口
     */
    private String name;
    /**
     * 引用类型，实现类Cloneable接口
     */
    private Temp temp;

    public DeepClone() {
    }

    public DeepClone(int id, String name, Temp temp) {
        this.id = id;
        this.name = name;
        this.temp = temp;
    }

    @Override
    public DeepClone clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();
        deepClone.temp = deepClone.temp.clone();
        return deepClone;
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
