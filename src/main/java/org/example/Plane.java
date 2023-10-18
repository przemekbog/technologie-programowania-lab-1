package org.example;

public class Plane {
    private Vector3D pointOnPlane;
    private Vector3D planeNormal;

    public Plane(Vector3D pointOnPlane, Vector3D planeNormal) {
        this.pointOnPlane = pointOnPlane;
        this.planeNormal = planeNormal;
    }

    public Vector3D getPointOnPlane() {
        return pointOnPlane;
    }

    public void setPointOnPlane(Vector3D pointOnPlane) {
        this.pointOnPlane = pointOnPlane;
    }

    public Vector3D getPlaneNormal() {
        return planeNormal;
    }

    public void setPlaneNormal(Vector3D planeNormal) {
        this.planeNormal = planeNormal;
    }
}
