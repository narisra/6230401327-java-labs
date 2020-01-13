package sirimul.chattipoom.lab5;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    // Constructor without parameters.
    public Shape() {
        this.color = "White";
        this.filled = false;
    }

    // Constructor with 2 parameters: color, filled.
    public Shape(String _color, boolean _filled) {
        this.color = _color;
        this.filled = _filled;
    }

    // Getter for color.
    public String getColor() {
        return this.color;
    }

    // Setter for color.
    public void setColor(String _color) {
        this.color = _color;
    }

    // Getter for filled.
    public boolean isFilled() {
        return this.filled;
    }

    // Setter for filled.
    public void setFilled(Boolean _filled) {
        this.filled = _filled;
    }

    // Abstract method getArea().
    public abstract double getArea();

    // Abstract method getPerimeter().
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Color:%s, Filled:%b", this.color, this.filled);
    }
}