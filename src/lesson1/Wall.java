package lesson1;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth){
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(SuperJumpable superJumpable) {
        System.out.println("The wall " + super.getName() + "heigth: " + this.heigth);
        superJumpable.jump();
        if (getHeigth() <= superJumpable.getRunDistance()) {
            System.out.println("jump success!");
            return true;
        }else {
            System.out.println("jump unsuccessfully!");
            return false;
        }
    }
}

