public class Square {
    private Point leftupPoint;
    private int length;
    private int getLength(){return length;}

    public void setLength(int length) {
        if(length<0)
        throw new IllegalArgumentException();
        this.length = length;
    }

    public Square(Point leftupPoint, int length) {
        if(length<0)
            throw new IllegalArgumentException();
        else {
            this.leftupPoint = leftupPoint;
            this.length = length;
        }
    }
    public Square (int x, int y, int length)
    {
        this(new Point(x,y),length);
    }

    @Override
    public String toString() {
        return "Square starts at "+ leftupPoint +
                " and it's length=" + length;
    }
}
