package product.part;

import java.util.Date;

/**
 * @author Pope
 * 产品的B部分，根据输入的参数来制作不同种类
 */
public class PartB {
    private final long createTime;

    public PartB() {
        this.createTime = System.currentTimeMillis();
    }

    public long getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "PartB{" +
                "createTime=" + new Date(createTime).toString() +
                '}';
    }
}
