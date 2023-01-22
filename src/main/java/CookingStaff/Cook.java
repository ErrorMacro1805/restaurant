package CookingStaff;
import Share.Person;
import Share.Order;

public class Cook extends Person  {
    private boolean shift;


    public Cook(boolean shift) {
        this.shift = shift;

    }

    public Cook(String name, int age, int salary, boolean shift) {
        super(name, age, salary);
        this.shift = shift;

    }

    public boolean isShift() {
        return shift;
    }

    public void setShift(boolean shift) {
        this.shift = shift;
    }

    Order kitchenOrder = new Order();




    @Override
    public void takeOrder() {
        if (shift=true){
            System.out.println("Заказ принят");}
        else{
                System.out.println("Заказ нужно передать другому");
        }
        }


    @Override
    public void giveOrder() {
        if (kitchenOrder.getCooktime()>=20){
            System.out.println("Заказ надо подождать, предложить напитки и закуски");
            if(kitchenOrder.getCooktime()<20){
                System.out.println("Заказ скоро будет на столе");
                if (kitchenOrder.getCooktime()<=0){
                    System.out.println("Неверное время готовки");
                }
            }
        }
    }
}








