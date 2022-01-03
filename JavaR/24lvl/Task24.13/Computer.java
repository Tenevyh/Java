public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyBoard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyBoard;
        this.monitor = monitor;
        this.mouse = mouse;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
