package ru.sbt.test.refactoring;


import static java.lang.Math.abs;

public class Coordinates {
    private int X,Y;
    public Coordinates(int x, int y) {
        if(x >= 0 && y >= 0) {
            X = x;
            Y = y;
        }else throw new IllegalArgumentException("Negative coordinates are not allowed.");
    }

    void changeX(int value){
        X += value;
    }
    void changeY(int value){
        Y += value;
    }

    /**
     * Returns true if coordinates exceed the limits.
     * if coordinates have no limits use -1 for limits
     * @param xLimit - OX limit
     * @param yLimit - OY limit
     * @return
     */
    boolean outOfBounds(int xLimit, int yLimit){
        return !(checkCoordBounds(X, xLimit) && checkCoordBounds(Y, yLimit));
    }

    private boolean checkCoordBounds(int coord, int limit){
        if (limit == -1){
            return true;
        }else return abs(coord) <= limit;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
