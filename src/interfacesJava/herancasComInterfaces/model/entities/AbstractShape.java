package interfacesJava.herancasComInterfaces.model.entities;

import interfacesJava.herancasComInterfaces.model.enums.Color;
import interfacesJava.herancasComInterfaces.model.services.Shape;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
