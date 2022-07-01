public class Screen {
    private int width;
    private int height;

    // ESC[8;H;Wt] -- H = height, W = width
    // this ansi code only works on xterm terminal...
    // Windows machines are a whole other headache :'(

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, height, width);
    }

    public Screen() {
        this.width = 100;
        this.height = 30;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, height, width);
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, height, width);
    }

    // like setWidth(), just a different name
    public void resizeWidth(int width) {
        this.width = width;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, getHeight(), width);
    }

    // like setHeight(), just a different name
    public void resizeHeight(int height) {
        this.height = height;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, getHeight(), width);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    // like resizeWidth(), just a different name
    public void setWidth(int width) {
        this.width = width;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, getHeight(), width);
    }

    // like resizeHeight(), just a different name
    public void setHeight(int height) {
        this.height = height;
        System.out.printf("%c8;%d;%dt", AnsiCodes.csi, getHeight(), width);
    }

    // clears all but remains on same line after clear
    public void clearAll() {
        System.out.printf("%c2J", AnsiCodes.csi);
    }
}
