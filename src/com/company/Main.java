package com.company;

public class Main {

    public static void main(String[] args) {
        Model m = new Model();
        Controller c = new Controller();
        View v = new View();

        m.x = 25;
        m.y = 4;

        int resultInt;
        double resultDouble;
        resultInt = Controller.sum();
        View.display(resultInt);
        resultInt = Controller.min();
        View.display(resultInt);
        resultInt = Controller.ymn();
        View.display(resultInt);
        resultDouble = Controller.del();
        View.display(resultDouble);
    }
}
