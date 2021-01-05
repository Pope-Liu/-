package product;

import product.part.PartA;
import product.part.PartB;
import product.part.PartC;

/**
 * @author Pope
 * 产品类，由A，B，C三个部分组成
 */
public class Product {
    private PartA partA;
    private PartB partB;
    private PartC partC;

    public Product() {
    }

    public Product(PartA partA, PartB partB, PartC partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public PartA getPartA() {
        return partA;
    }

    public void setPartA(PartA partA) {
        this.partA = partA;
    }

    public PartB getPartB() {
        return partB;
    }

    public void setPartB(PartB partB) {
        this.partB = partB;
    }

    public PartC getPartC() {
        return partC;
    }

    public void setPartC(PartC partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA=" + partA.toString() +
                ", partB=" + partB.toString() +
                ", partC=" + partC.toString() +
                '}';
    }
}
