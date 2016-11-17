package ru.sbt.test.refactoring;

public enum Orientation {

    NORTH {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeY(speed);
        }

        @Override
        Orientation turnClockWise() {
            return EAST;
        }
    }, WEST {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeX(-speed);
        }

        @Override
        Orientation turnClockWise() {
            return NORTH;
        }
    }, SOUTH {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeY(-speed);
        }

        @Override
        Orientation turnClockWise() {
            return WEST;
        }
    }, EAST {
        @Override
        void forward(Coordinates coordinates, int speed) {
            coordinates.changeX(speed);
        }

        @Override
        Orientation turnClockWise() {
            return SOUTH;
        }
    };

    abstract void forward(Coordinates coordinates, int speed);

    abstract Orientation turnClockWise();
}
