package fr.arsenelapostolet;

public class ContextTurtle extends BasicColoredTurtle implements ColoredTurtle{

    private Context context;

    public ContextTurtle(Context context) {
        this.context = context;
    }

    @Override
    protected void draw(int oldX, int oldY, int newX, int newY) {
        this.context.drawLine(oldX, oldY, newX, newY, this.getColor());
    }
}
