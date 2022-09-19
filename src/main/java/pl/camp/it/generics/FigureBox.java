package pl.camp.it.generics;

public class FigureBox<T> {
    private T figure;
    private int cos;
    private String cos2;

    public FigureBox(T figure) {
        this.figure = figure;
    }

    public FigureBox() {
    }

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    public String cos() {
        return "cos";
    }
}
