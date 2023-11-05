package designpatterns.abstractfactory2;

public class ItalianFactory implements IWI {

    @Override
    public IApetizer createApetizer() {
        return new ItalianAp();
    }

    @Override
    public IMainCourse createMainCourse() {
       return new ItalianMp();
    }

    @Override
    public IDessert createDessert() {
       return new ItalianDessert();
    }
    
}
