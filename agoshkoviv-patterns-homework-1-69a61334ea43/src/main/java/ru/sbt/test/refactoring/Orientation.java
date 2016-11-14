package ru.sbt.test.refactoring;

public enum Orientation {

    NORTH {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeY(speed);
        }

        @Override
        Orientation turnClockWise() {
            return SOUTH;
        }
    }, WEST {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeX(-speed);
        }

        @Override
        Orientation turnClockWise() {
            return EAST;
        }
    }, SOUTH {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeY(-speed);
        }

        @Override
        Orientation turnClockWise() {
            return NORTH;
        }
    }, EAST {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeX(speed);
        }

        @Override
        Orientation turnClockWise() {
            return WEST;
        }
    };

    abstract void forward(Coordinates coordinates, int speed);

    abstract Orientation turnClockWise();
}
