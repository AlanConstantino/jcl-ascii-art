// Ansi Github: https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797#general-ascii-codes
// VT100 escape codes: https://www.csie.ntu.edu.tw/~r92094/c++/VT100.html
// Bash HowTo: https://tldp.org/HOWTO/Bash-Prompt-HOWTO/

import java.util.ArrayList;

public class Main {
    public static void progressSpin() {
        char[] animationChars = new char[] { '|', '/', '-', '\\' };

        for (int i = 0; i <= 100; i++) {
            System.out.print("Processing: " + i + "% " + animationChars[i % 4] + "\r");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Processing: Done!");
    }

    public static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; // 10unit for 100%
        int remainPercent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = ' ';
        String icon = "#";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainPercent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainPercent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + remainPercent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        try {
            char esc = 0x1B; // escape sequence (hex)
            char csi = 0x9B; // control sequence introducer (hex)
            char dcs = 0x90; // device control string (hex)
            char osc = 0x9D; // operating system command (hex)

            // String moveTo = esc + "[";

            int row = 10;
            int col = 10;

            char c = '#';
            ArrayList<Character> chars = new ArrayList<Character>();
            // init ArrayList of chars
            final int MAX_SIZE = 30;
            for (int i = 0; i < MAX_SIZE; i++) {
                chars.add('s');
            }

            Main.progressPercentage(20, 100);
            final int TOTAL = 50;
            for (int i = 0; i <= TOTAL; i++) {
                Main.progressPercentage(i, TOTAL);
                Thread.sleep(100);
            }

            // String str = chars.toString().replaceAll("[, \\[\\]]", "");
            // // System.out.println(str);

            // for (int i = 0; i < chars.size(); i++) {
            // System.out.printf("[%c]\r", chars.get(i));
            // Thread.sleep(100);
            // }

            // chars.add(c);
            // chars.add(c);
            // chars.add(c);
            // System.out.println(chars);

            // for (int i = 0; i < 20; i++) {
            // String progress = chars.toString().replaceAll("[, \\[\\]]", "");
            // System.out.printf("[%s]\r", progress);
            // chars.add(c);
            // // String progress = chars.toString().replaceAll(" ", "").replaceAll(",",
            // "");
            // Thread.sleep(100);
            // }

            // System.out.println();

            // Screen screen = new Screen(100, 30);
            // screen.resizeHeight(20);
            // screen.resizeWidth(90);

            // Thread.sleep(500);
            // screen.setWidth(130);
            // Thread.sleep(500);
            // screen.setWidth(35);
            // screen.clearAll();
            // screen.resize(100, 20);
            // screen.monochrome();
            // System.out.println("dwaf\n\n\n\ndwafwasd");
            // screen.clearAll();

            // System.out.printf("%c[%d;%df", esc, row, col);
            // System.out.printf("%c%d;%df", csi, row, col);
            // System.out.printf("%cH", csi);

            // System.out.printf("%cH", AnsiiCodes.csi);
            // Cursor.moveToLine(row, col);
            // Cursor c = new Cursor(12, 23);

            // ProcessBuilder pb = new ProcessBuilder(
            // "echo -en \"\\E[6n\"; read -sdR CURPOS; CURPOS=${CURPOS#*[}; echo $CURPOS");

            // System.out.println(pb.toString());
            // System.out.flush();
            // Cursor c = new Cursor();

            // System.out.printf("%c=1h", AnsiiCodes.csi);

            // printf("\033[8;20;30t");
            // char escO = '\033';
            // System.out.printf("%c8;30;100t", csi);
            // Console c = System.console();

            // System.out.println(c.toString());

            // c.getCurrentPosition();
            // System.out.flush();
            // System.out.println(c);

            // c.print();
            // c.getCurrentPosition();
            // c.moveTo(12, 5);
            // System.out.printf("%c%dB", csi, 1);
            // c.moveRight(3);
            // c.print();
            // c.moveLeft(1);
            // c.print();
            // c.moveUp(1);
            // c.print();
            // c.moveHome();
            // System.out.printf(c.moveHome());
            // System.out.printf("%c", c.moveTo(12, 3));
            // System.out.printf(csi + "H");
            // System.out.printf(csi + "0F");
        } catch (

        Exception e) {
            System.out.println(e);
        }
    }
}

// javac Main.java && java Main