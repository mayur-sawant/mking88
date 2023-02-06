import java.awt.*;

public class Calculator extends Frame{
    TextField screen;
    Button one, two, three, four, five, six, seven , eight, nine, zero, back, equal, clear, div, mul, add, sub, dot, mod;

    public Calculator(){
        screen = new TextField(13);
        clear = new Button(" C ");
        div = new Button(" / ");
        mul = new Button(" * ");
        back = new Button(" <- ");
        one = new Button(" 1 ");
        two = new Button(" 2 ");
        three = new Button(" 3 ");
        sub = new Button(" - ");
        four = new Button(" 4 ");
        five = new Button(" 5 ");
        six = new Button(" 6 ");
        add = new Button(" + ");
        seven = new Button(" 7 ");
        eight = new Button(" 8 ");
        nine = new Button(" 9 ");
        equal = new Button(" = ");
        mod = new Button(" % ");
        zero = new Button(" 0 ");
        dot = new Button(" . ");





        add(screen);
        add(clear);
        add(div);
        add(mul);
        add(back);
        add(one);
        add(two);
        add(three);
        add(sub);
        add(four);
        add(five);
        add(six);
        add(add);
        add(seven);
        add(eight);
        add(nine);
        add(equal);
        add(mod);
        add(zero);
        add(dot);


        setSize(150,250);
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
class Main{
    public static void main(String[] args) {
        Calculator ob = new Calculator();
    }
}
