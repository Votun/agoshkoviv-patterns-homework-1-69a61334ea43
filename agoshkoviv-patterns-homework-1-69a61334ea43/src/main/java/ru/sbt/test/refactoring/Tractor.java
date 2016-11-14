package ru.sbt.test.refactoring;

public class Tractor {

	private Coordinates position = new Coordinates(0, 0);
	int[] field = new int[] { 5, 5 };
	private Orientation orientation = Orientation.NORTH;

	public void move(Command command) {
        if (command.equals(Command.FORWARD)) {
			moveForwards();
		} else {
			turnClockwise();
		}
	}

    public void moveForwards() {
		orientation.forward(position, 1);
		if (position.outOfBounds(field[0], field[1])) {
			throw new TractorInDitchException();
		}
	}

    public void turnClockwise() {
		orientation = orientation.turnClockWise();
	}

    /**
     * Конечно, если мы не собираемся убирать position в private, эти методы не нужны.  Оставил на всякий случай
     * @return
     */
	public int getPositionX() {
		return position.getX();
	}

	public int getPositionY() {
		return position.getY();
	}

	public Orientation getOrientation() {
		return orientation;
	}

}
