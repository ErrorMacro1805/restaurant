package Share;

public abstract class Person {
   private String name;
   private int age;
   private int salary;

   public void setName(String name) {
      this.name = name;
   }

   public Person() {

   }

   public Person(String name, int age, int salary) {
      this.name = name;
      this.age = age;
      this.salary = salary;
   }


   public String getName() {
      return name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getSalary() {
      return salary;
   }

   public void takeOrder(){
   }

   public  void giveOrder(){

   };
}
