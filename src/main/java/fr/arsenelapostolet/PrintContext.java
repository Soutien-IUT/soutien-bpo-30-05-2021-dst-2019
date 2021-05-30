package fr.arsenelapostolet;

public class PrintContext implements Context {
    @Override
    public void drawLine(int x1, int y1, int x2, int y2, Color color) {
        System.out.printf("%d %d %d %d %s\n", x1, y1, x2, y2, color.toString());
    }
}
