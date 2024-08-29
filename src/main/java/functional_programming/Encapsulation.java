package functional_programming;

class encapsulate {
    private int speed;

    public encapsulate(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch) {
        this.speed += howMuch;
    }

    public void decreaseSpeed(int howMuch) {
        //this.speed -= howMuch;
        setSpeed(this.speed - howMuch);
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        encapsulate bike = new encapsulate(10);
        System.out.println(bike.getSpeed());

        bike.increaseSpeed(10);
        System.out.println(bike.getSpeed());
        bike.decreaseSpeed(100);
        System.out.println(bike.getSpeed());
    }

}

//Data Hiding
//Increased Flexibility
//Reusability
