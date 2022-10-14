package Point_2D_and_3D;

public class Point2D {
    private float x;
    private float y;

    Point2D() {
    }

    Point2D(float x, float y){
        this.x = x;
        this.y =y;
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
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] floats = new float[2];
        floats[0] = x;
        floats[1] = y;
        return floats;
    }

    @Override
    public String toString() {
        return "Point2D has x=" + getX() +", and Y=" + getY() ;
    }
}
