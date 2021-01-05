package product.part;

import java.util.Date;

/**
 * @author Pope
 * 产品的A部分，根据输入的参数来制作不同种类（如不同品牌的鼠标）
 */
public class PartA {
    private final long createTime;

    public PartA() {
        this.createTime = System.currentTimeMillis();
    }

    public long getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "PartA{" +
                "createTime=" + new Date(createTime).toString() +
                '}';
    }
}
