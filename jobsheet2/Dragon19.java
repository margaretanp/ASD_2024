public class Dragon19 {
    int x;
    int y;
    int width;
    int height;

    public void moveLeft() {
        x -= 1;
        System.out.println("x: " + x);

        if (x < 0) {
            detectCollision();
        }
    }

    public void moveRight() {
        x += 1;
        System.out.println("x: " + x);

        if (x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y += 1;
        System.out.println("y: " + y);

        if (y > width) {
            detectCollision();
        }
    }
    
    public void moveDown() {
        y -= 1;
        System.out.println("y: " + y);

        if (y < 0) {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}
