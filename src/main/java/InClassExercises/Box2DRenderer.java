package InClassExercises;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.physics.box2d.Shape;
import java.awt.*;
import java.util.Iterator;

public class Box2DRenderer
{
    private World world;

    public Box2DRenderer(World world)
    {
        this.world = world;
    }
    private void render(Graphics2D graphics)
    {
        Array<Body> bodies = new Array<Body>();
        world.getBodies(bodies); // world populates body array
        for(Body body : bodies)
        {
            Vector2 position = body.getPosition();
            Shape shape = body.getFixtureList().get(0).getShape();
            Shape.Type  type = shape.getType();
            float angle = body.getAngle();
            float radius = shape.getRadius();

            switch (type)
            {
                case Circle: {
                    graphics.fillOval((int)(position.x - radius),
                            (int)(position.y - radius),
                            (int)(radius * 2),
                            (int)(radius * 2));
                    break;
                }
                case Polygon: {
//                    graphics.
                    break;
                }
            }
        }
    }
}
