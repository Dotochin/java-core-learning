package HW_1;

public class Robot implements Actions {
    private String name;
    private int run;
    private int jump;

    public Robot(String name, int distance, int jump) {
        this.name = name;
        this.run = distance;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " runs " + this.getRun());
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " jumps " + this.getJump());
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