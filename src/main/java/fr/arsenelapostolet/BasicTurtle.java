package fr.arsenelapostolet;

public class BasicTurtle implements Turtle {

    private int x,y;
    private int angle;
    private boolean isDown;

    public BasicTurtle() {
        this.x = 0;
        this.y = 0;
        this.angle = 0;
        this.isDown = true;
    }

    protected void draw(int oldX, int oldY, int newX, int newY){
        System.out.printf("%d %d %d %d\n", oldX, oldY, newX, newY);
    }

    @Override
    public void down() {
        this.isDown = true;
    }

    @Override
    public void move(int distance) {
        int newX = this.x + (int) (distance * Math.sin(angle * Math.PI / 180.));
        int newY = this.y + (int) (distance * Math.cos(angle * Math.PI / 180.));

        if(this.isDown){
            this.draw(this.x, this.y, newX, newY);
        }

        this.x = newX;
        this.y = newY;
    }

    @Override
    public void turn(int angle) {
        this.angle = angle;
    }

    @Override
    public void up() {
        this.isDown = false;
    }

}
