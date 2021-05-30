package fr.arsenelapostolet;

public class BoundContext implements Context{
    private Integer minX, minY, maxX, maxY;

    public BoundContext() {
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2, Color color) {
        if(minX == null){
            minX = Math.min(x1, x2);
        }
        else {
            int tempMin1 = Math.min(x1, minX);
            int tempMin2 = Math.min(x2, minX);
            this.minX = Math.min(tempMin1, tempMin2);
        }

        if(minY == null){
            minY = Math.min(y1, y2);
        }
        else {
            int tempMin1 = Math.min(y1, minY);
            int tempMin2 = Math.min(y2, minY);
            this.minY = Math.min(tempMin1, tempMin2);
        }

        if(maxX == null){
            maxX = Math.max(x1, x2);
        }
        else {
            int tempMax1 = Math.max(x1, maxX);
            int tempMax2 = Math.max(x2, maxX);
            this.maxX = Math.max(tempMax1, tempMax2);
        }

        if(maxY == null){
            maxY = Math.max(y1, y2);
        }
        else {
            int tempMax1 = Math.max(y1, maxY);
            int tempMax2 = Math.max(y2, maxY);
            this.maxY = Math.max(tempMax1, tempMax2);
        }
    }

    public Integer getMinX() {
        return minX;
    }

    public Integer getMinY() {
        return minY;
    }

    public Integer getMaxX() {
        return maxX;
    }

    public Integer getMaxY() {
        return maxY;
    }
}
