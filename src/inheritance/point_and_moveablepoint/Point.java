package src.inheritance.point_and_moveablepoint;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public float[] getXY(){
        float[] floats = new float[2];
        floats[0] =getX();
        floats[1] =getY();
        return floats;
    }

    @Override
    public String toString() {
        return "+ position: (" + this.x + "," + this.y + ")";
    }
}
