package Hallstaff;

import CookingStaff.Cook;
import CookingStaff.Bar;
import Share.Bill;
import Share.Person;
import Share.ServiceRate;
import Share.Order;

public class Main {
    public static void main(String[] args) {
        Cook chiefcook = new Cook("Jonathan",29,2500,true);
        Bar barman = new Bar("Arnold",23,1500,true);
        Waiter waiter1 = new Waiter("Beckie",20,1200,3,3);
        Order kitchenOrder = new Order("Fish & chips",180,21);
        Order barOrder = new Order("White Wine",80,3);
        waiter1.takeOrder();
        barman.takeOrder();
        chiefcook.takeOrder();
        chiefcook.giveOrder();
        barman.giveOrder();
        waiter1.giveOrder();
        barman.takeMoney(100);
        waiter1.ifServiceIsGood(true);
        waiter1.takeMoney(200);
    }
}
