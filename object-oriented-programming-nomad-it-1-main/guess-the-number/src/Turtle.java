public class Turtle extends Object{

    int eyes;
    private String color;
    private int foot;
    private int head;
    private String name;

    // overloading constructors
    public Turtle(int eyes, String color, int foot, int head, String name) {
        this.eyes = eyes;
        this.color = color;
        this.foot = foot;
        this.head = head;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d", name, eyes, foot, head);
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyes() {
        return eyes;
    }

    public String getColor() {
        return color;
    }

    public int getFoot() {
        return foot;
    }

    public int getHead() {
        return head;
    }

    public String getName() {
        return name;
    }
}
