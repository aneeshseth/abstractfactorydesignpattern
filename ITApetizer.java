package designpatterns.abstractfactory2;

public class ITApetizer implements IApetizer {
    @Override
    public void isApetizer() {
        System.out.println("true, is Apetizer Italian.");
    }
}
