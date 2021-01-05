package product.part;

import java.util.Date;

/**
 * @author Pope
 * 产品的C部分，根据输入的参数来制作不同种类
 */
public class PartC {
    private final long createTime;

    public PartC() {
        this.createTime = System.currentTimeMillis();
    }

    public long getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "PartC{" +
                "createTime=" + new Date(createTime).toString() +
                '}';
    }
}
