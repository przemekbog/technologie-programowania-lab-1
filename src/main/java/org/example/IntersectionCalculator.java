package org.example;

import java.util.Optional;

public class IntersectionCalculator extends Ray {
    private static final float EPSILON = 1e-6f;

    public Optional<Vector3D> calculateIntersectionBetweenRayAndPlane(Ray ray, Plane plane) {
        // Algorithm modified from https://www.scratchapixel.com/lessons/3d-basic-rendering/minimal-ray-tracer-rendering-simple-shapes/ray-plane-and-ray-disk-intersection.html

        float denominator = Vector3D.dot(ray.getDirection(), plane.getPlaneNormal());
        if(Math.abs(denominator) < EPSILON) {
            return Optional.empty();
        }

        Vector3D RayOriginToplanePointVector = Vector3D.subtract(plane.getPointOnPlane(), ray.getOrigin());
        float t = Vector3D.dot(RayOriginToplanePointVector, plane.getPlaneNormal()) / denominator;

        if(t < 0) {
            return Optional.empty();
        }

        return Optional.of(Vector3D.add(ray.getOrigin(), ray.getDirection().getScaled(t)));
    }
}
