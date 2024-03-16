package org.jetbrains.assignment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class RobotController {

    RobotController() {
        // Do nothing for now
    }

    @PostMapping("/locations")
    List<Coordinate> getLocations(@RequestBody List<Direction> directionList) {
        List<Coordinate> coordinateList = new ArrayList<Coordinate>();
        Coordinate lastCoordinate = new Coordinate(0,0);
        coordinateList.add(lastCoordinate);
        for (Direction direction : directionList) {
            lastCoordinate = lastCoordinate.moveDirection(direction);
            coordinateList.add(lastCoordinate);
        }
        return coordinateList;
    }

    @PostMapping("/moves")
    List<Direction> getMoves(@RequestBody List<Coordinate> coordinateList) {
        List<Direction> directionList = new ArrayList<Direction>();
        Coordinate lastCoordinate = coordinateList.get(0);
        for (int i = 1; i < coordinateList.size(); i++) {
            Coordinate nextCoordinate = coordinateList.get(i);
            directionList.addAll(Direction.getDirection(lastCoordinate, nextCoordinate));
            lastCoordinate = nextCoordinate;
        }

        return directionList;
    }

}