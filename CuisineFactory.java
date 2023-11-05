package designpatterns.abstractfactory2;

public class CuisineFactory {
    public static IWI createFactory(String cuisine) {
        if (cuisine == "In") {
            return new IndianFactory();
        } else {
            return new ItalianFactory();
        }
    }
}


interface Item {
    IWI createFactory();
}