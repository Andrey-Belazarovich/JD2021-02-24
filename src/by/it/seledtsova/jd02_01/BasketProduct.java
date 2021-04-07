package by.it.seledtsova.jd02_01;

import java.util.*;

/*
У каждого покупателя с корзиной (Basket) собирается набор от 1..4 товаров (Good)
 из фиксированного списка с ценой (рекомендуется hashmap, где товар –key,цена –value).
Время на каждую операцию от 0,5до 2 секунд, итог операции –в консоль.
 */

public class BasketProduct extends Thread  {


   public static  Map<String, Double> basketProduct () {
        Map<String, Double> basketProduct = new HashMap<>();
        basketProduct.put("Milk", 2.15);
        basketProduct.put("Bread", 1.85);
        basketProduct.put("Cheese", 3.35);
        basketProduct.put("Chocolate", 4.10);
        return basketProduct;
    }

}

