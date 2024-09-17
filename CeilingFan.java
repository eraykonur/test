package test;

public class CeilingFan {
    private int speed;
    private boolean isCWDirection;

    public CeilingFan() {
        this.speed = 0; // Fan starts in the "off" position
        this.isCWDirection = true; // Fan starts in the rotating clockwise
    }

    // pull the speed cord
    public void pullSpeedCord() {
        speed = (speed + 1) % 4; // Cycle through speeds: 0, 1, 2, 3
    }

    // pull the direction cord
    public void pullDirectionCord() {
        isCWDirection = !isCWDirection; // Reverse the direction
    }

    public int getSpeed() {
        return speed;
    }

    public String getDirection() {
        return isCWDirection ? "Clockwise" : "Counterclockwise";
    }

    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        System.out.println("Initial State: Speed = " + fan.getSpeed() + ", Direction = " + fan.getDirection());
    }
}
