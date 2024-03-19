package org.jetbrains.assignment;

public class Coordinate {
    public int x;
    public int y;

    Coordinate(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    public Coordinate moveDirection(Direction direction) {
        if (direction.direction == CardinalDirection.NORTH) {
            return new Coordinate(x, y + direction.steps);
        }
        else if (direction.direction == CardinalDirection.SOUTH) {
            return new Coordinate(x, y - direction.steps);
        }
        else if (direction.direction == CardinalDirection.WEST) {
            return new Coordinate(x - direction.steps, y);
        }
        else { // CardinalDirection.EAST
            return new Coordinate(x + direction.steps, y);
        }
    }

}