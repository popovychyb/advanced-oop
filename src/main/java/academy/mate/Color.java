package academy.mate;

public enum Color {
    GREEN("Green"),
    RED("Red"),
    BLACK("Black"),
    YELLOW("Yellow"),
    WHITE("White");

    public final String label;

    Color(String label) {
        this.label = label;
    }
}
