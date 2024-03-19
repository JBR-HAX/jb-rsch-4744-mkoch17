package org.jetbrains.assignment;

import java.util.ArrayList;
import java.util.List;
public class Direction {
    public CardinalDirection direction;
    public Integer steps;

    Direction(CardinalDirection cardinalDirection, Integer numberOfSteps) {
        direction = cardinalDirection;
        steps = numberOfSteps;
    }

    public static List<Direction> getDirection(Coordinate startingPoint, Coordinate endpointPoint) {
        List<Direction> directionList = new ArrayList<>();
        if (startingPoint.x > endpointPoint.x) {
            directionList.add(new Direction(CardinalDirection.WEST, Math.abs(startingPoint.x - endpointPoint.x)));
        }
        else if (startingPoint.x < endpointPoint.x) {
            directionList.add(new Direction(CardinalDirection.EAST, Math.abs(endpointPoint.x - startingPoint.x)));
        }
        if (startingPoint.y > endpointPoint.y) {
            directionList.add(new Direction(CardinalDirection.SOUTH, Math.abs(startingPoint.y - endpointPoint.y)));
        }
        else if (endpointPoint.y > startingPoint.y) {
            directionList.add(new Direction(CardinalDirection.NORTH, Math.abs(endpointPoint.y - startingPoint.y)));
        }

        return directionList;
    }

}
