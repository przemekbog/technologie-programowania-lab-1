package org.example;


//@dataclass
//class Vector3D:
//        x: float
//        y: float
//        z: float
//
//        def get_scaled(self, factor: float) -> 'Vector3D':
//        return Vector3D(
//        self.x * factor,
//        self.y * factor,
//        self.z * factor,
//        )
//
//        # def get_rotated(self, rotation: Rotation3D) -> 'Vector3D':
//        #     rotation_matrix = rotation.get_rotation_matrix()
//        #     return np.array([self.x, self.y, self.z]) * rotation_matrix.T
//
//        def get_magnitude(self) -> float:
//        return math.sqrt(self.x**2 + self.y**2 + self.z**2)
//
//@classmethod
//    def zero(cls) -> 'Vector3D':
//            return Vector3D(0, 0, 0)
//
//@classmethod
//    def up(cls) -> 'Vector3D':
//            return Vector3D(0, 0, 1)
//
//@classmethod
//    def add(cls, vec1: 'Vector3D', vec2: 'Vector3D') -> 'Vector3D':
//            return Vector3D(
//            vec1.x + vec2.x,
//            vec1.y + vec2.y,
//            vec1.z + vec2.z,
//            )
//
//@classmethod
//    def multiply(cls, vec1: 'Vector3D', vec2: 'Vector3D') -> 'Vector3D':
//            return Vector3D(
//            vec1.x * vec2.x,
//            vec1.y * vec2.y,
//            vec1.z * vec2.z,
//            )
//
//@classmethod
//    def dot(cls, vec1: 'Vector3D', vec2: 'Vector3D') -> float:
//            return vec1.x*vec2.x + vec1.y*vec2.y + vec1.z*vec2.z

import java.util.Objects;

public class Vector3D {
    private float x, y, z;

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getMagnitude() {
        return (float) Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }

    public Vector3D getScaled(float factor) {
        return new Vector3D(x * factor, y * factor, z * factor);
    }

    public static float dot(Vector3D vec1, Vector3D vec2) {
        return vec1.getX()*vec2.getX() + vec1.getY()*vec2.getY() + vec1.getZ()*vec2.getZ();
    }

    public static Vector3D add(Vector3D vec1, Vector3D vec2) {
        return new Vector3D(vec1.getX() + vec2.getX(), vec1.getY() + vec2.getY(), vec1.getZ() + vec2.getZ());
    }

    public static Vector3D subtract(Vector3D vec1, Vector3D vec2) {
        return new Vector3D(vec1.getX() - vec2.getX(), vec1.getY() - vec2.getY(), vec1.getZ() - vec2.getZ());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Float.compare(vector3D.x, x) == 0 && Float.compare(vector3D.y, y) == 0 && Float.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
