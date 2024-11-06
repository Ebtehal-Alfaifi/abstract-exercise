public  class MovabelPoint implements Movable{
    private int x;
    private int y;
    private int xsped;
    private int yspeed;


    public MovabelPoint(int x, int y, int xsped, int yspeed) {
        this.x = x;
        this.y = y;
        this.xsped = xsped;
        this.yspeed = yspeed;


    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXsped(int xsped) {
        this.xsped = xsped;
    }

    public void setYspeed(int yspeed) {
        this.yspeed = yspeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXsped() {
        return xsped;
    }

    public int getYspeed() {
        return yspeed;
    }


    @Override
    public void moveUp() {
        System.out.print(y+=yspeed);
        System.out.println(" move up" );
    }

    @Override
    public void moveDown() {
        System.out.print(y-=xsped);

        System.out.println(" move down");
    }

    @Override
    public void moveLeft() {
        System.out.print(x-=xsped);

        System.out.println(" move left");
    }

    @Override
    public void moveRight() {
        System.out.print(x+=xsped);
        System.out.println(" move right");
    }
}

