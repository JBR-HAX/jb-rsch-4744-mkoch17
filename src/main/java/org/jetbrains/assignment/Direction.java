package org.jetbrains.assignment;

import java.util.List;
public class Direction {
    public CardinalDirection direction;
    public Integer steps;

    Direction(CardinalDirection cardinalDirection, Integer numberOfSteps) {
        direction = cardinalDirection;
        steps = numberOfSteps;
    }

    public static Direction getDirection(Coordinate startingPoint, Coordinate endpointPoint) {
        Direction direction = new Direction(null, null);
        if (startingPoint.x > endpointPoint.x) {
            direction.direction = CardinalDirection.WEST;
            direction.steps = Math.abs(startingPoint.x - endpointPoint.x);
        }
        else if (startingPoint.x < endpointPoint.x) {
            direction.direction = CardinalDirection.EAST;
            direction.steps = Math.abs(endpointPoint.x - startingPoint.x);
        }
        else if (startingPoint.y > endpointPoint.y) {
            direction.direction = CardinalDirection.SOUTH;
            direction.steps = Math.abs(startingPoint.y - endpointPoint.y);
        }
        else { // endingPoint.y > startingPoint.y
            direction.direction = CardinalDirection.NORTH;
            direction.steps = Math.abs(endpointPoint.y - startingPoint.y);
        }

        return direction;
    }

}
