package lesson1;

public class Treadmill extends Barrier {
    private int length;

    public Treadmill(String name, int length){
        super(name);
        this.length = length;
    }

    public int getLenght() {
        return length;
    }

    @Override
    protected boolean moving(SuperJumpable superJumpable) {
        System.out.println("The treadmill " + super.getName() + " length: " + this.length);
        superJumpable.run();
        if (getLenght() <= superJumpable.getRunDistance()) {
            System.out.println("run success!");
            return true;
        }else {
            System.out.println("run unsuccessfully!");
            return false;
        }
    }
}
