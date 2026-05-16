import java.util.Comparator;

// Comparable<Turtle> defines the "natural order" of Turtle objects.
// Here: alphabetical by name. Used by Collections.sort() / Arrays.sort() with no extra argument.
public class Turtle implements Comparable<Turtle> {

    private String name;
    private int eyes;
    private int foot;

    public Turtle(String name, int eyes, int foot) {
        this.name = name;
        this.eyes = eyes;
        this.foot = foot;
    }

    // Natural order: alphabetical by name
    @Override
    public int compareTo(Turtle other) {
        return this.name.compareTo(other.name);
    }

    // Comparator — separate ordering strategy, defined outside the class.
    // Can have as many Comparators as you need without touching Turtle itself.
    public static Comparator<Turtle> BY_EYES = new Comparator<Turtle>() {
        @Override
        public int compare(Turtle a, Turtle b) {
            return Integer.compare(a.eyes, b.eyes);
        }
    };

    public static Comparator<Turtle> BY_FOOT = (a, b) -> Integer.compare(a.foot, b.foot); // lambda style

    @Override
    public String toString() {
        return String.format("Turtle{name='%s', eyes=%d, foot=%d}", name, eyes, foot);
    }

    public String getName() { return name; }
    public int getEyes()    { return eyes; }
    public int getFoot()    { return foot; }
}