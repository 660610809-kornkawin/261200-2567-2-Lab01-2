import java.awt.*;

public class hw1 {
    public static void main(String[] args) {

        Turtle bob = new Turtle();
        //set up
        bob.speed(0.05);
        bob.width(5);

        //main order
        //Draw Krathong
        //straight order
        bob.forward(300);
        bob.left(90);
        bob.forward(100);
        bob.left(90);
        bob.forward(600);
        bob.left(90);
        bob.forward(100);
        bob.home();
        bob.up();
        bob.setPosition(300,100);
        bob.left(90);
        bob.down();
        //for-loop in for-loop
        for(int j = 0; j < 10; j++) {
            for (int i = 0; i < 180; i++) {
                bob.left(1);
                bob.forward(0.523);
            }
            bob.left(180);
        }
        bob.up();
        bob.setPosition(300,0);
        bob.down();

        //for-loop in for-loop
        for(int i = 0; i < 5; i++) {
            for (int k = 0; k < 45; k++) {
                bob.left(1);
                bob.forward(3.58);
            }
            bob.left(90);
            for (int k = 0; k < 45; k++) {
                bob.left(1);
                bob.forward(3.58);
            }
            bob.right(180);
        }
        bob.up();
        bob.setPosition(0,100);
        bob.right(90);
        bob.down();

        //if-elif in for-loop
        for(int i = 0; i < 5; i++){
            if(i == 0){
                bob.forward(5);
            } else if (i == 1) {
                bob.left(90);
                bob.forward(250);
            } else if (i == 2) {
                bob.left(90);
                bob.forward(10);
            } else if (i == 3) {
                bob.left(90);
                bob.forward(250);
            } else {
                bob.left(90);
                bob.forward(5);
            }
        }
        bob.up();
        bob.setPosition(20,100);
        bob.down();

        //if-elif in for-loop
        for(int i = 0; i < 5; i++){
            if(i == 0){
                bob.forward(10);
            } else if (i == 1) {
                bob.left(90);
                bob.forward(150);
            } else if (i == 2) {
                bob.left(90);
                bob.forward(20);
            } else if (i == 3) {
                bob.left(90);
                bob.forward(150);
            } else {
                bob.left(90);
                bob.forward(10);
            }
        }
        bob.up();
        bob.setPosition(30,250);
        bob.left(90);
        bob.down();

        for (int k = 0; k < 45; k++) {
            bob.left(1);
            bob.forward(0.58);
        }
        bob.left(90);
        for (int k = 0; k < 45; k++) {
            bob.left(1);
            bob.forward(0.58);
        }
        bob.up();
        bob.home();
    }
}
