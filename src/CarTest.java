class Car{
    String color;
    String gearType;
    int door;
    Car (){
        this("white","auto",4);
    }
    Car(Car c){
        color=c.color;
        gearType=c.gearType;
        door=c.door;
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car(c1);

        System.out.println("c2 = " + c2.door);
        c1.door=100;
        System.out.println("c1 = " + c1.door);
        System.out.println("c2 = " + c2.door);

    }
}
