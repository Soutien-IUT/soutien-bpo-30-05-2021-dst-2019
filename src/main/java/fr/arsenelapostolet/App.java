package fr.arsenelapostolet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Turtle t = new BasicTurtle();
//        t.move(10);
//        t.turn(45);
//        t.move(20);
//        t.up();
//        t.move(30);
//        t.down();
//        t.move(10);

//        ColoredTurtle t = new BasicColoredTurtle();
//        t.move(10);
//        t.turn(45);
//        t.move(20);
//        t.setColor(Color.GREEN);
//        t.up();
//        t.move(30);
//        t.down();
//        t.move(10);

        BoundContext context = new BoundContext();
        Turtle t = new ContextTurtle(context);

        t.move(10);
        t.turn(45);
        t.move(20);
        t.up();
        t.move(30);
        t.down();
        t.move(10);

        System.out.println(context.getMaxX());
        System.out.println(context.getMaxY());
        System.out.println(context.getMinX());
        System.out.println(context.getMinY());
    }
}
