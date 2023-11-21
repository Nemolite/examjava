//Добро пожаловать в наш интернет-магазин сувениров
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  1
//        Выбрано 1 - показать все товары
//        Товары нашего магазина
//        Количество товаров в магазине - 3
//        ***************************************************
//        Сувенир
//        Россия
//        1500.0
//        3
//        ***************************************************
//        Новый Сувенир
//        Россия
//        2000.0
//        10
//        ***************************************************
//        Старинный Сувенир
//        Россия
//        1000.0
//        5
//        ***************************************************
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  2
//        Выбрано 2 - соверишть покупку
//        Выберите товар для покупки, ввыедите назавние  = Старинный Сувенир
//        Количество товара Старинный Сувенир в магазине 5
//        Ведите количество желаемого товара =
//        2
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  3
//        Выбрано 3 - показать корзину покупок
//        Товары в вашей корзине
//        Старинный Сувенир
//        Россия
//        2000.0
//        2
//        Количество товаров в корзине = 2.0
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  6
//        Выбрано 6 - купить (оформить заказ)
//        Покупка товара
//        Передано в статистику:2000.0
//        Передано в статистику количество:2
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  4
//        Выбрано 4 - показать статистику продаж
//        Проданные товары
//        Продано товаров:
//        Всего (количество товаров):
//        2
//        На сумму:
//        2000
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  1
//        Выбрано 1 - показать все товары
//        Товары нашего магазина
//        Количество товаров в магазине - 3
//        ***************************************************
//        Сувенир
//        Россия
//        1500.0
//        3
//        ***************************************************
//        Новый Сувенир
//        Россия
//        2000.0
//        10
//        ***************************************************
//        Старинный Сувенир
//        Россия
//        1000.0
//        3
//        ***************************************************
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =  3
//        Выбрано 3 - показать корзину покупок
//        Товары в вашей корзине
//        Количество товаров в корзине = 0.0
//        1 - показать все товары
//        2 - добавить в корзину
//        3 - показать корзину покупок
//        6 - купить (оформить заказ)
//        0 - покинуть магазин
//        ****************************
//        * Раздел для Администратора *
//        ***************************
//        4 - показать статистику продаж
//        5 - добавить товар в магазин (на склад)
//        Ваш выбор =



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

    /**
     * Формируем товар (сувенир)
     * @param name
     * @param country
     * @param price
     * @param countProductToWarehouse
     */
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
    double totalcart;
    int countproduct;
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
     * Удаление товаров из корзины
     */
    public void delProductOfCart(){
        if (products.size()!=0){
            for (int i = 0; i < products.size(); i++){
                products.remove(i);
            }
        }
        totalcart = 0.0;
    }

    /**
     * Подсчет общей стоимости товаров в корзине
     */
    public double countProductInCart(){
        double total = 0;
        if (products.size()!=0){
            for (int i = 0; i < products.size(); i++){
                total+=(products.get(i).price*products.get(i).countProductToWarehouse);
            }
        }
        this.totalcart = total;
        return total;
    }

    /**
     * Подсчет общего количества товаров в корзине
     */
    public double countInCart(){
        int count = 0;
        if (products.size()!=0){
            for (int i = 0; i < products.size(); i++){
                count+=products.get(i).countProductToWarehouse;
            }
        }
        this.countproduct = count;
        return count;
    }

    /**
     * Показ товаров в корзине
     */
    public void showProductInCart(){
        System.out.println("Товары в вашей корзине");
        if (products.size()!=0){
            for (int i = 0; i < products.size(); i++){
                System.out.println(products.get(i).name);
                System.out.println(products.get(i).country);
                System.out.println(products.get(i).price*products.get(i).countProductToWarehouse);
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
     * Корзины товаров пользователей
     */
    ArrayList<Cart> sold = new ArrayList<Cart>();

    /**
     * Проданные товара
     */
    ArrayList<Double> soldproducts = new ArrayList<Double>();
    /**
     * Количество проданных товаров
     */
    ArrayList<Integer> soldproductscount = new ArrayList<Integer>();

    /**
     * Фиксируем добавление товара в корзину
     */
    public void solidFact(Cart cart){

        sold.add(cart);
    }
    /**
     * Добавление нового товара в магазин (на склад)
     *
     */
    public void addProductToWarehouse(Product product){
        warehouse.add(product);
    }
    /**
     * Обновление информации о товаре(цена, количество)
     */
    public void updateInfoProduct(Product product,double price,int countProductToWarehouse){
        int tempcount;
        for (int i = 0; i < warehouse.size(); i++){
            if (product.name.equals(warehouse.get(i).name)) {
                tempcount = warehouse.get(i).countProductToWarehouse;
                warehouse.get(i).countProductToWarehouse =tempcount - countProductToWarehouse;
            }
        }
    }

    /**
     * Передача информации о проданном товаре в статистику продаж
     */
    public void tosoldproducts(){
        if (sold.size()!=0){

                System.out.print("Передано в статистику:");
                System.out.println(sold.get(0).totalcart);
                soldproducts.add(sold.get(0).totalcart);

                System.out.print("Передано в статистику количество:");
                System.out.println(sold.get(0).countproduct);
                soldproductscount.add(sold.get(0).countproduct);

        }
    }

    /**
     * Просмотр статистики продаж
     */
    public void getCountSale(){
        System.out.println("Продано товаров:");

        if (soldproducts.size()!=0){
            System.out.println("Всего (количество товаров):");
            int totalcountstat = 0;

            for (int i = 0; i < soldproductscount.size(); i++){
                totalcountstat+=soldproductscount.get(i);

            }
            System.out.println(totalcountstat);
            int totalsoldstat = 0;

            for (int i = 0; i < soldproducts.size(); i++){
                totalsoldstat+=soldproducts.get(i);

            }
            System.out.println("На сумму:");
            System.out.println(totalsoldstat);
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

    /**
     * Показ всех товаров в магазине (на складе)
     */
    public void showProducts(){
        System.out.println("Товары нашего магазина");
        System.out.printf("Количество товаров в магазине - %d",warehouse.size());
        System.out.println();
        System.out.println("***************************************************");
        if (warehouse.size()!=0){
            for (int i = 0; i < warehouse.size(); i++){
                System.out.println(warehouse.get(i).name);
                System.out.println(warehouse.get(i).country);
                System.out.println(warehouse.get(i).price);
                System.out.println(warehouse.get(i).countProductToWarehouse);
                System.out.println("***************************************************");

            }
        }
    }

    /**
     * Поиск товара в магазине (на складе)
     * @param name
     * @return boolean checker
     */
    public boolean findProductOfWarehouse(String name){
        boolean checker = false;
        for (int i = 0; i < warehouse.size(); i++){
            if (name.equals(warehouse.get(i).name)){
                checker = true;
                break;
            }
        }
        return checker;
    }

    /**
     * Получение товара по его наименовании со склада
     * @param name
     * @return
     */
    public Product getProductOfWarehouse(String name){
        Product product = new Product();
        for (int i = 0; i < warehouse.size(); i++){
            if (name.equals(warehouse.get(i).name)){
                product.setProduct(warehouse.get(i).name,warehouse.get(i).country,warehouse.get(i).price,warehouse.get(i).countProductToWarehouse);

                break;
            }
        }
        return product;
    }
}
/**
 * Главный, реализованы возможности
 * Просмотр товаров,
 * Добавление в корзину,
 * Оформление заказа
 * Просмотр статистики продаж
 */
public class Main {
    public static void main(String[] args) {
        boolean marker = true;
        Store obj = new Store();
        Cart cr = new Cart();

        // Добавить товар на склад магазина  (Начальная загрузка)
        // Первый товар
        Product product = new Product();
        product.setProduct("Сувенир","Россия",1500,3);
        obj.addProductToWarehouse(product);

        // Второй товар
        Product product1 = new Product();
        product1.setProduct("Новый Сувенир","Россия",2000,10);
        obj.addProductToWarehouse(product1);

        // Третий товар
        Product product2 = new Product();
        product2.setProduct("Старинный Сувенир","Россия",1000,5);
        obj.addProductToWarehouse(product2);


        System.out.println("Добро пожаловать в наш интернет-магазин сувениров");
        while (marker){
            System.out.println("1 - показать все товары ");
            System.out.println("2 - добавить в корзину");
            System.out.println("3 - показать корзину покупок ");
            System.out.println("6 - купить (оформить заказ) ");
            System.out.println("0 - покинуть магазин ");
            System.out.println("****************************");
            System.out.println("* Раздел для Администратора *");
            System.out.println("***************************");
            System.out.println("4 - показать статистику продаж ");
            System.out.println("5 - добавить товар в магазин (на склад) ");
            Scanner in = new Scanner(System.in);
            System.out.print("Ваш выбор =  ");
            int num = in.nextInt();
            switch (num) {
                case  1:
                    System.out.println("Выбрано 1 - показать все товары ");
                    // Просмотр товаров
                    obj.showProducts();
                    marker = true;
                    break;
                case 2:
                    System.out.println("Выбрано 2 - соверишть покупку ");
                    System.out.print("Выберите товар для покупки, ввыедите назавние  = ");
                    Scanner inproduct = new Scanner(System.in);
                    String nameproduct = inproduct.nextLine();

                    boolean checker = obj.findProductOfWarehouse(nameproduct);
                    if (checker){
                        int getcountincart;
                        Product productForCart = obj.getProductOfWarehouse(nameproduct);
                        System.out.printf("Количество товара %s в магазине %d",productForCart.name,productForCart.countProductToWarehouse);
                        System.out.println();
                        while (true){
                            System.out.print("Ведите количество желаемого товара = ");
                            Scanner getcount = new Scanner(System.in);
                            getcountincart = getcount.nextInt();
                            if(getcountincart>0&&getcountincart<=productForCart.countProductToWarehouse){
                                break;
                            } else {
                                System.out.println("Вы ввели неверное количество товаров, потворите ввод ");
                            }
                        }
                        // Формируем товар с учётом выбранного количества
                        Product newproduct = new Product();
                        newproduct.name = productForCart.name;
                        newproduct.price = productForCart.price;
                        newproduct.country = productForCart.country;
                        newproduct.countProductToWarehouse = getcountincart;

                        // Корректировка количества товара в магазине (на складе)
                        obj.updateInfoProduct(newproduct,newproduct.price,getcountincart);

                        // Добавление товара в корзину
                        cr.addProductToCart(newproduct);
                        // Фиксируем продажу товара
                        obj.solidFact(cr);


                    } else {
                        System.out.println("Товара нет в корзине, либо вы не правильно ввели назавние");
                    }
                    marker = true;
                    break;
                case 3:
                    System.out.println("Выбрано 3 - показать корзину покупок ");
                    // Показ товаров в корзине
                    cr.showProductInCart();
                    System.out.print("Количество товаров в корзине = ");
                    System.out.println(cr.countInCart());
//                    System.out.println(cr.countProductInCart());
                    marker = true;
                    break;
                case 4:
                    System.out.println("Выбрано 4 - показать статистику продаж ");
                    System.out.println("Проданные товары");
                    obj.getCountSale();
                    marker = true;
                    break;
                case 5:
                    System.out.println("Выбрано 5 - добавить товар в магазин (на склад) ");
                    System.out.println("Добававление товара в магазин");
                    while (true){
                        try{
                            Scanner admin = new Scanner(System.in);
                            System.out.print("Ведите наименование товара (Сувенира) = ");
                            String adminproductname = admin.nextLine();
                            System.out.print("Ведите страну производитель товара (сувенира) = ");
                            String adminproductcountry = admin.nextLine();
                            System.out.print("Ведите стоимость товара (сувенира) = ");
                            double adminprice = admin.nextDouble();
                            System.out.print("Ведите количество товара (сувенира) = ");
                            int admincount = admin.nextInt();
                            // Добавление товара в магазин (на склад)
                            Product adminproduct = new Product();
                            adminproduct.setProduct(adminproductname,adminproductcountry,adminprice,admincount);
                            obj.addProductToWarehouse(adminproduct);
                            break;
                        } catch (Exception e){
                            System.out.println("Вы неправильно ввели данные, повторите ввод ");
                        }
                    }

                    marker = true;
                    break;
                case 6:
                    System.out.println("Выбрано 6 - купить (оформить заказ) ");
                    System.out.println("Покупка товара");

                    cr.countProductInCart();
                    obj.tosoldproducts();
                    cr.delProductOfCart();
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

