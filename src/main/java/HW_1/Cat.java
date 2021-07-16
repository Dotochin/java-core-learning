package HW_1;

public class Cat implements Actions {
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int distance, int jump) {
        this.name = name;
        this.run = distance;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " runs " + this.getRun());
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " jumps " + this.getJump());
    }

    @Override
    public int getRun() {
        return this.run;
    }

    @Override
    public int getJump() {
        return this.jump;
    }
}