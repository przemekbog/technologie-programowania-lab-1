package org.example;

import java.util.Optional;

public class Main extends Plane {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Plane plane = new Plane(
                new Vector3D(0,0,0),
                new Vector3D(0,0,1)
        );

        Ray ray = new Ray(
                new Vector3D(0,0,5),
                new Vector3D(0,0,-1)
        );

        var intersectionCalculator = new IntersectionCalculator();

        Optional<Vector3D> rayCastResult = intersectionCalculator.calculateIntersectionBetweenRayAndPlane(ray, plane);

        if(rayCastResult.isEmpty()) {
            System.out.println("No intersection occurred");
            return;
        }

        System.out.println("Intersection occurred");
        System.out.printf("Intersection point: %s", rayCastResult.get());

    }
}