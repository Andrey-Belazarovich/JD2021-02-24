package by.it._classwork_.jd02_03;

public interface ICustomer {

    void enterToMarket();    //вошел в магазин (мгновенно)

    void chooseGoods();      //выбрал товар (от 0,5 до 2 секунд)

    void goToQueue();

    void goOut();            //отправился на выход(мгновенно)

}
