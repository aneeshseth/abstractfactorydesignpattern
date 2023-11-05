package designpatterns.abstractfactory2;

interface IWI {
    IApetizer createApetizer();
    IMainCourse createMainCourse();
    IDessert createDessert();
}
