import junit.framework.TestCase;
import org.example.IntersectionCalculator;
import org.example.Plane;
import org.example.Ray;
import org.example.Vector3D;

import java.util.Optional;

public class IntersectionCalculatorTests extends TestCase {

    public void testRayProperlyIntersectsPlane() {
        Plane plane = new Plane(
                new Vector3D(0,0,0),
                new Vector3D(0,0,1)
        );

        Ray ray = new Ray(
                new Vector3D(0,0,5),
                new Vector3D(0,1,-1)
        );

        var intersectionCalculator = new IntersectionCalculator();

        Optional<Vector3D> rayCastResult = intersectionCalculator.calculateIntersectionBetweenRayAndPlane(ray, plane);

        assertEquals(
                Optional.of(new Vector3D(0,5,0)),
                rayCastResult
        );
    }

    public void testRayNotIntersecting() {
        Plane plane = new Plane(
                new Vector3D(0,0,0),
                new Vector3D(0,0,1)
        );

        Ray ray = new Ray(
                new Vector3D(0,0,5),
                new Vector3D(0,1,1)
        );

        var intersectionCalculator = new IntersectionCalculator();

        Optional<Vector3D> rayCastResult = intersectionCalculator.calculateIntersectionBetweenRayAndPlane(ray, plane);

        assertEquals(
                Optional.empty(),
                rayCastResult
        );
    }

}
