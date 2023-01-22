package Hallstaff;

import Share.Bill;
import Share.Person;
import Share.ServiceRate;
import Share.Order;

public class Waiter extends Person implements Bill,ServiceRate {
    private int tablleQuatity;
    private int experiance;

    public Waiter(int tablleQuatity, int experiance) {
        this.tablleQuatity = tablleQuatity;
        this.experiance = experiance;
    }

    public Waiter(String name, int age, int salary, int tablleQuatity, int experiance) {
        super(name, age, salary);
        this.tablleQuatity = tablleQuatity;
        this.experiance = experiance;
    }

    public int getTablleQuatity() {
        return tablleQuatity;
    }

    public void setTablleQuatity(int tablleQuatity) {
        this.tablleQuatity = tablleQuatity;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    Order waiterOrder = new Order();

    @Override
    public void takeOrder() {
        if (experiance > 3 ) {
        System.out.println("Готов взять заказ");}
            if  (experiance <=3) {
                if (tablleQuatity>=2 ){
                System.out.println("Позвать более опытного официанта");
            }
                if (tablleQuatity < 2 ){
                    System.out.println("Готов взять заказ под наблюдением");}
            }
    }

    @Override
    public void giveOrder() {
        System.out.println("Вынести заказ к столику");
    }

    @Override
    public boolean ifServiceIsGood(boolean rate) {

        return rate;
    };




    public void takeMoney(int money) {
        if (money > waiterOrder.getPrice()) {
            if (ifServiceIsGood(true)){
                System.out.println(" оставить на чай");
            }
            if (ifServiceIsGood(false)){
                System.out.println("Вернуть сдачи");
            }}
        if (money ==waiterOrder.getPrice()) {
            System.out.println("закрыть счет");}
        if (money < waiterOrder.getPrice()) {
            System.out.println("Не хватает суммы для закрытия счета");}
    }



}






