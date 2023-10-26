import java.util.ArrayList;
import java.util.Scanner;
/**
 * Продукт(Сувенир)
 */
class Product{
    /**
     * Наименование товара (сувенира)
     */
    String name;
    /**
     * Страна производитель товара (сувенира)
     */
    String country;
    /**
     * Цена товара (сувенира)
     */
    double price;
    /**
     * Количество товара (сувениров) на складе
     */
    int countProductToWarehouse;
    public void setProduct(String name,String country,double price,int countProductToWarehouse){
        this.name = name;
        this.country = country;
        this.price = price;
        this.countProductToWarehouse = countProductToWarehouse;

    }

}
/**
 * Корзина покупателя
 */
class Cart extends Product{
    /**
     * Формирование корзина покупателя
     */
    ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Добавление нового товара в корзину
     */
    public void addProductToCart(Product product){
        products.add(product);
    }

    /**
     * Удаление товара из корзины
     */
    public void delProductOfCart(Product product){
        if (products.contains(product)){
            products.remove(product);
        }
    }

    /**
     * Подсчет общей стоимости товаров в корзине
     */
    public double countProductInCart(){
        double total = 0;
        if (products.size()!=0){
            for (int i = 0; i < products.size(); ++i){
                total+=(products.get(i).price*products.get(i).countProductToWarehouse);
            }
        }
        return total;
    }

    /**
     * Показ товаров в корзине
     */
    public void showProductInCart(){
        if (products.size()!=0){
            for (int i = 0; i < products.size(); ++i){
                System.out.println(products.get(i).name);
                System.out.println(products.get(i).country);
                System.out.println(products.get(i).price);
                System.out.println(products.get(i).countProductToWarehouse);
            }
        }

    }
}
/**
 * Магазин
 */
class Store extends Cart{
    /**
     * Формирование магазинного склада
     */
    ArrayList<Product> warehouse = new ArrayList<Product>();
    /**
     * Проданные товары
     */
    ArrayList<Cart> sold = new ArrayList<Cart>();

    /**
     * Фиксируем продажу товара
     */
    public void solidFact(Cart cart){
        sold.add(cart);
    }
    /**
     * Добавление нового товара на склад
     */
    public void addProductToWarehouse(Product product){
        warehouse.add(product);
    }
    /**
     * Обновление информации о товаре(цена, количество)
     */
    public void updateInfoProduct(Product product,double price,int countProductToWarehouse){

        if (warehouse.contains(product)){
            warehouse.remove(product);
            product.price = price;
            product.countProductToWarehouse =countProductToWarehouse;
            warehouse.add(product);
        }
    }
    /**
     * Просмотр статистики продаж
     */
    public void getCountSale(){
        System.out.println("Проданные товары");
        if (sold.size()!=0){
            for (int i = 0; i < sold.size(); ++i){
                System.out.println(sold.get(i).name);
                System.out.println(sold.get(i).country);
                System.out.println(sold.get(i).price);
                System.out.println(sold.get(i).countProductToWarehouse);

            }
        }
    }
    /**
     * Удаление товара из склада
     */
    public void delProductOfWarehouse(Product product){
        if (warehouse.contains(product)){
            warehouse.remove(product);
        }
    }
}
/**
 * Главный, реализованы возможности
 * Просмотр товаров,
 * Добавление в корзину,
 * Оформление заказа
 * Просмотр статистики продаж
 */
class Main extends Store {
    /**
     * Просмотр товаров
     */
    public void showProducts(){
        System.out.println("Товары нашего магазина");
        System.out.println(warehouse.size());
        if (warehouse.size()!=0){
            for (int i = 0; i < warehouse.size(); ++i){
                System.out.println(warehouse.get(i).name);
                System.out.println(warehouse.get(i).country);
                System.out.println(warehouse.get(i).price);
                System.out.println(warehouse.get(i).countProductToWarehouse);

            }
        }
    }

}

public class Exam {
    public static void main(String[] args) {
        boolean marker = true;
        Main obj = new Main();
        Product product = new Product();
        Cart cr = new Cart();

        // Добавить товар на склвд ()магазин
        product.setProduct("Сувенир","Россия",1500,1);
        obj.addProductToWarehouse(product);


        System.out.println("Добро пожаловать в наш интернет-магазин сувениров");
        while (marker){
            System.out.println("1 - показать все товары ");
            System.out.println("2 - соверишть покупку ");
            System.out.println("3 - показать корзину покупок ");
            System.out.println("0 - покинуть магазин ");
            Scanner in = new Scanner(System.in);
            System.out.print("Ваш выбор =  ");
            int num = in.nextInt();
            switch (num) {
                case  1:
                    System.out.println("1 - показать все товары ");
                    // Просмотр товаров
                    obj.showProducts();
                    marker = true;
                    break;
                case 2:
                    System.out.println("2 - соверишть покупку ");
                    // В данном месте предполагается выбор товара
                    //в виду того что в задние этого нет, поэтому не реализовано

                    // Добавление товара в корзину
                    obj.addProductToCart(product);
                    marker = true;
                    break;
                case 3:
                    System.out.println("3 - показать корзину покупок ");
                    // Показ товаров в корзине
                    obj.showProductInCart();
                    marker = true;
                    break;
               case 0:
                   System.out.println("0 - покинуть магазин ");
                    marker = false;
                    break;
                default:
                    System.out.println("Вы ошиблись, поторите код");
                    marker = true;
                    break;
            }

        }

    }
}
