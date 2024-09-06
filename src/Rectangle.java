public class Rectangle {
    private float length = 1.0F;
    private float width = 1.0F;

    public Rectangle(){
    }

    public Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }

    public void setWidth(float width) {
        if ((width > 0.0 )&& (width < 20.0)){
            this.width =width;
        }else {
            this.width = 1.0F;
        }
    }

    public void setLength(float length) {
        if ((length > 0.0) && (length < 20.0)){
            this.length =length;
        }else {
            this.length = 1.0F;
        }
    }
    public float getWidth (){
        return width;
    }

    public float getLength() {
        return length;
    }
    public float calculatePerimeter(){
        return 2 * (getLength() + getWidth());
    }
    public  float calculateArea (){
        return  getLength() + getLength();
    }
}
