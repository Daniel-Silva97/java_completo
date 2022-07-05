package secaoHerancaPolimorfismo.metodosAbstratos.models.entities;

import secaoHerancaPolimorfismo.metodosAbstratos.models.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //Método abstrato exige classe abstrata
    public abstract Double area();
}
