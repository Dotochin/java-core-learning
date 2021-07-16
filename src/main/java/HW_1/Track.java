package HW_1;

public class Track extends Barrier {
    private int length;

    public Track(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Track " + super.getName() + " length: " + this.length);

        actions.run();
        if (getLength() <= actions.getRun()) {
            System.out.println("Successfully");
            return true;
        } else {
            System.out.println("Not successful");
            return false;
        }
    }
}