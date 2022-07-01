public class Cursor {
    private int row;
    private int column;
    private String code = "";

    public Cursor(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Cursor() {
        String position = String.format("%c6n", AnsiCodes.csi);
        String nums = position.replaceAll("^[0-9]", "");
        System.out.printf(nums);
        this.row = 0;
        this.column = 0;
    }

    // moves cursor to home posiion (0,0)
    public String moveHome() {
        this.row = 0;
        this.column = 0;
        this.code = AnsiCodes.csi + "H";
        return this.code;
    }

    // moves cursor to user defined location
    public String moveTo(int row, int column) {
        this.row = row;
        this.column = column;
        this.code = String.format("%c%d;%dH", AnsiCodes.csi, row, column);
        // this.code = 0x9B + row + ";" + column + "f";
        return this.code;
    }

    // doesn't work unless you moveDown(), print(), moveUp(), print().... wtf?!
    //
    // I think this happens because even though you technically update the position,
    // the cursor isn't printed to screen so therefore it's like the move didn't
    // even happen if that makes sense
    public String moveUp(int numberOfLines) {
        this.row = numberOfLines;
        this.code = String.format("%c%dA", AnsiCodes.csi, numberOfLines);
        return this.code;
    }

    public String moveDown(int numberOfLines) {
        this.column = numberOfLines;
        this.code = String.format("%c%dB", AnsiCodes.csi, numberOfLines);
        return this.code;
    }

    public String moveRight(int numberOfLines) {
        this.row = numberOfLines;
        this.code = String.format("%c%dC", AnsiCodes.csi, numberOfLines);
        return this.code;
    }

    public String moveLeft(int numberOfLines) {
        this.row = numberOfLines;
        this.code = String.format("%c%dD", AnsiCodes.csi, numberOfLines);
        return this.code;
    }

    // public String moveToNextLine(int numberOfLines) {

    // }

    // public void getCurrentPosition() {
    // String position = String.format("%c6n", AnsiiCodes.csi);
    // this.setRow(Integer.parseInt(position));
    // System.out.printf(position);
    // System.out.printf(position);
    // }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public String getCode() {
        return this.code;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void print() {
        System.out.printf("%s", this.getCode());
    }

    @Override
    public String toString() {
        return "Row: " + this.getRow() + "\nColumn: " + this.getColumn();
        // return this.code;
    }

    // System.out.printf("%c[%d;%df", esc, row, col);

    // public static void moveHome() {
    // System.out.printf("%cH", AnsiiCodes.csi);
    // }

    // public static void moveToLine(int x, int y) {
    // System.out.printf("%c%d;%dH", AnsiiCodes.csi, x, y);
    // }
}
