package pl.camp.it.generics;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        FigureBox<Triangle> figureBox = new FigureBox<>();
        FigureBox<Square> squareFigureBox = new FigureBox<>();

        figureBox.setFigure(new Triangle());
        Triangle triangle = figureBox.getFigure();

        squareFigureBox.setFigure(new Square());
        Square square = squareFigureBox.getFigure();

        Pair<Integer, Square> pair = new Pair<>();

        pair.setFirst(23);
        pair.setSecond(new Square());


        Triplet<Square, Triangle, String> triplet = new Triplet<>();
        triplet.setFirst(new Square());
        triplet.setSecond(new Triangle());
        triplet.setThird("ABC");

        Square square1 = triplet.getFirst();

        Triplet<Integer, Boolean, Object> triplet1 = new Triplet<>();

        LIFOQueue<Integer> lifoQueue = new LIFOQueue<>();
        lifoQueue.push(3);
        lifoQueue.push(5);
        lifoQueue.push(10);

        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());

        LIFOQueue<String> lifoQueue1 = new LIFOQueue<>();

        lifoQueue1.push("A");
        lifoQueue1.push("B");
        lifoQueue1.push("C");

        System.out.println(lifoQueue1.pop());
        System.out.println(lifoQueue1.pop());
        System.out.println(lifoQueue1.pop());
        System.out.println(lifoQueue1.pop());

        List<Optional<FigureBox<Square>>> list;

        Circle circle = new Circle();
        Figure figure = new Circle();

        FigureBox<Circle> circleFigureBox = new FigureBox<Circle>(new Circle());
        //FigureBox<Figure> figureFigureBox = new FigureBox<Circle>(new Circle());

        Optional<Figure> optional1 = Optional.of(new Figure());
        metoda1(optional1);

        Optional<Circle> optional2 = Optional.of(new Circle());
        metoda1(optional2);

        /*Optional<User> optional3 = Optional.of(new User());
        metoda1(optional3);*/

        /*Optional<Object> optional4 = Optional.of(new Object());
        metoda1(optional4);*/

        Optional<Figure> optional5 = Optional.of(new Figure());
        metoda2(optional5);

        Optional<Object> optional6 = Optional.of(new Object());
        metoda2(optional6);

        /*Optional<Circle> optional7 = Optional.of(new Circle());
        metoda2(optional7);*/

        FigureBox<Figure> figureBox2 = metoda3(2);

        System.out.println(figureBox2);
        Object figure1 = figureBox2.getFigure();
        System.out.println(figure1);

        FigureBox<? extends Figure> figureBox3 = metoda4();
        Figure figure2 = figureBox3.getFigure();
    }

    public static void metoda1(Optional<? extends Figure> pudelko) {

    }

    public static void metoda2(Optional<? super Figure> pudelko) {

    }

    public static FigureBox metoda3(int a) {
        switch (a) {
            case 1:
                return new FigureBox<Circle>(new Circle());
            case 2:
                return new FigureBox<Triangle>(new Triangle());
            case 3:
                return new FigureBox<Square>(new Square());
        }
        return null;
    }

    public static FigureBox<Triangle> metoda4() {
        return new FigureBox<>(new Triangle());
    }
}
