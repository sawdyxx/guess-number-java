import java.util.Scanner;


public class TurtleGame {

    private static char[][] board = new char[5][5];

    private static final int UP = 0;
    private static final int RIGHT = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;

    private static int direction = UP;

    private static final char UP_DIR = '^';
    private static final char DOWN_DIR = 'v';
    private static final char LEFT_DIR = '<';
    private static final char RIGHT_DIR = '>';

    private static int xCoord = 0;
    private static int yCoord = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        initialize();

        while (inp.hasNext()) {
            String command = inp.nextLine();

            switch (command) {
                case "print":
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "move":
                    move();
                    break;
                case "turn left":
                    turnLeft();
                    break;
                case "turn right":
                    turnRight();
                    break;
                case "quit":
                    System.exit(0);
                    break;
            }

        }

    }

    private static void turnRight() {
        if (direction == RIGHT) {
            direction = DOWN;
        } else if (direction == LEFT) {
            direction = UP;
        } else if (direction == DOWN) {
            direction = LEFT;
        } else if (direction == UP) {
            direction = RIGHT;
        }
    }

    private static void turnLeft() {
        if (direction == RIGHT) {
            direction = UP;
        } else if (direction == LEFT) {
            direction = DOWN;
        } else if (direction == DOWN) {
            direction = RIGHT;
        } else if (direction == UP) {
            direction = LEFT;
        }
    }

    private static void move() {
        board[yCoord][xCoord] = '.';
        if (direction == UP) {
            yCoord -= 1;
            board[yCoord][xCoord] = UP_DIR;
        } else if (direction == DOWN) {
            yCoord += 1;
            board[yCoord][xCoord] = DOWN_DIR;
        } else if (direction == LEFT) {
            xCoord -= 1;
            board[yCoord][xCoord] = LEFT_DIR;
        } else if (direction == RIGHT) {
            xCoord += 1;
            board[yCoord][xCoord] = RIGHT_DIR;
        }
    }

    private static void initialize() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '.';
            }
        }

        int xRandom = (int) (Math.random() * 5);
        int yRandom = (int) (Math.random() * 5);

        // > < ^ v
        xCoord = xRandom;
        yCoord = yRandom;

        direction = UP;
        board[yRandom][xRandom] = UP_DIR;
    }
}