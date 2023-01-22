package CookingStaff;

import Share.Bill;
import Share.Person;
import Share.Order;

public class Bar extends Person implements Bill {
    private boolean coctailmaster;


    public Bar(boolean coctailmaster) {
        this.coctailmaster = coctailmaster;
    }

    public Bar(String name, int age, int salary, boolean coctailmaster) {
        super(name, age, salary);
        this.coctailmaster = coctailmaster;
    }

    public boolean isCoctailmaster() {
        return coctailmaster;
    }

    public void setCoctailmaster(boolean coctailmaster) {
        this.coctailmaster = coctailmaster;
    }

   Order barOrder = new Order();

    @Override
    public void takeOrder() {
        if (coctailmaster = true) {
            System.out.println("предложить коктейли");
        } else {
            System.out.println("предложить напитки");
        }
    }


    @Override
    public void giveOrder() {
        System.out.println("Заказ Готов");
    }

    @Override
    public void takeMoney(int money) {
        if (money > barOrder.getPrice()){
            System.out.println("Дать сдачи официанту и закрыть счет");
            if (money ==barOrder.getPrice() ) {
                System.out.println("закрыть счет");
                if (money < barOrder.getPrice()) {
                    System.out.println("Не хватает суммы для закрытия счета");}
            }
        }
    }
}




