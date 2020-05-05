package maowcraft.stuffmodport.util;

public enum DyedStoneColor {
    WHITE("white"),
    LIGHT_GRAY("light_gray"),
    GRAY("gray"),
    BLACK("black"),
    BROWN("brown"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    LIME("lime"),
    GREEN("green"),
    CYAN("cyan"),
    LIGHT_BLUE("light_blue"),
    BLUE("blue"),
    PURPLE("purple"),
    MAGENTA("magenta"),
    PINK("pink");

    public String prefix;
    public String name;

    DyedStoneColor(String prefix) {
        this.prefix = prefix;
        this.name = prefix + "_dyed_stone";
    }
}
