package Starbucks.Coffee;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        this.description="하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
