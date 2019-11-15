import InClassExercises.Box2DComponent;

import javax.swing.*;
import java.awt.*;

public class Box2DFrame extends JFrame
{
    public Box2DFrame() {
        setSize(800, 600);
        setTitle("Box2DDemo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new Box2DComponent(), BorderLayout.CENTER);
    }
}
