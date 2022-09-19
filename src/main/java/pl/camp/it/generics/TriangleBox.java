package pl.camp.it.generics;

public class TriangleBox {

    private Triangle triangle;

    public TriangleBox(Triangle triangle) {
        this.triangle = triangle;
    }

    public TriangleBox() {
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
