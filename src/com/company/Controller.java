package com.company;

public class Controller {
    static int sum(){
        return Model.x+Model.y;
    }
    static int min(){
        return Model.x-Model.y;
    }
    static int ymn(){
        return Model.x*Model.y;
    }
    static double del(){
        return (double)Model.x/Model.y;
    }
}
