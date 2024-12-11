//Класс для хранения информации о количестве товара, его скидке и цене
class Product {
    int count_product; //количество товара
    double price; //цена товара
    double discount; //скидка товара
    //Метод для вычисление и вывода цены со скидкой и без нее
    void calculate(Product product)
    {
        double no_discont_price=count_product*price;
        double discont_price=no_discont_price*(1-discount);
        discont_price=Math.round(discont_price*100.0)/100.0;
        no_discont_price=Math.round(no_discont_price*100.0)/100.0;
        System.out.println("Сумма товара до скидки: "+ no_discont_price);
        System.out.println("Сумма товара со скидкой: "+ discont_price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты товаров с различными параметрами
        Product product1 = new Product();
        product1.count_product = 10;
        product1.price = 5.5;
        product1.discount = 0.0075;

        Product product2 = new Product();
        product2.count_product = 20;
        product2.price = 7.4;
        product2.discount = 0.42575;

        Product product3 = new Product();
        product3.count_product = 15;
        product3.price = 12.9;
        product3.discount = 0.591;

        // Вызываем метод calculate для каждого объекта
        product1.calculate(product1);
        product2.calculate(product2);
        product3.calculate(product3);
    }
}