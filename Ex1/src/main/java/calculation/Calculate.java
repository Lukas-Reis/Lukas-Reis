package calculation;

public class Calculate {
    public double Width, Height;

    public double Area() {
        return (Width * Height);
    }

    public double Perimeter() {
        return (Width + Width) + (Height + Height);
    }

    public double Diagonal() {
        return Math.sqrt((Math.pow(Width, 2) + Math.pow(Height, 2)));

    }
}