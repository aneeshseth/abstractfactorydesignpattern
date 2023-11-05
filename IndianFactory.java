package designpatterns.abstractfactory2;

public class IndianFactory implements IWI {

    @Override
    public IApetizer createApetizer() {
        return new IndianAp();
    }

    @Override
    public IMainCourse createMainCourse() {
       return new IndianMp();
    }

    @Override
    public IDessert createDessert() {
        return new IndianDessert();
    }
    
}
