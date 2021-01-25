public class ElectricCar implements CarInterface{

private String name;

public ElectricCar(String name){
    this.name = name;
}

public String getName(){
    return this.name;
}

public void setname(String name){
    this.name = name;
}

 @Override
 public void start(){
    System.out.println(this);

    System.out.println("Electricity Flow running...");
 }   

 @Override
 public void move(int speed) {
    System.out.println(this.getName() + " is moving at " + speed + " mph");
 }

 @Override
 public void printName(String name) {
     // TODO Auto-generated method stub

 }

}