package fr.arsenelapostolet;

public class BasicColoredTurtle extends  BasicTurtle implements ColoredTurtle{
    private Color color = Color.BLACK;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    protected void draw(int oldX, int oldY, int newX, int newY) {
        System.out.printf("%d %d %d %d %s\n", oldX, oldY, newX, newY, this.color.toString());
    }
}
