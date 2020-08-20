package lesson1;

public class Human implements SuperJumpable {

    private String name;
    private int runDistance;
    private int jumpHeight;


    public Human (String name, int runDistance, int jumpHeight) {

        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {

        System.out.println("Cat " + name + "run" + this.getRunDistance());
    }

    @Override
    public void jump() {

        System.out.println("Cat " + name + "jump " + this.getJumpHeight());
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}