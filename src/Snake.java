
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    // Условимся, что currentPosition[0] - это координата змейки по вертикали,
    // а currentPosition[1] - это координата змейки по горизонтали
    static int[] currentPosition = new int[]{5,5};
    static int[] target = new int[2];

    static String[][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in
        ));

        field = buildField(10, 10);
        rollTarget();
        printField(field);
        String direction;
        System.out.println("Введите 'start' для начала игры");
        while (!(direction = reader.readLine()).equalsIgnoreCase("exit")) {
            int cubeValue = rollCube();
            System.out.println("Введите направление");
            direction = reader.readLine();
            move(cubeValue, direction);
            printField(field);
            System.out.println("Введите 'roll' для продолжения");
        }
    }
    static void move(int cubeValue, String direction) {
        if (direction.equalsIgnoreCase("right")) {
            int oldVertical = currentPosition[0];
            int oldHorizontal = currentPosition[1];
            field[oldVertical][oldHorizontal] = " . ";
            if (currentPosition[1] + cubeValue > field.length - 1) {
                currentPosition[1] = cubeValue - (field.length - currentPosition[1]);
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
            else {
                currentPosition[1] = currentPosition[1] + cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
        }
        if (direction.equalsIgnoreCase("Up")) {
            int oldVertical = currentPosition[0];
            int oldHorizontal = currentPosition[1];
            field[oldVertical][oldHorizontal] = " . ";
            if (currentPosition[0] - cubeValue < 0){
                currentPosition[0] = (field.length + currentPosition[0]) - cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
            else {
                currentPosition[0] = currentPosition[0] - cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
        }
        if (direction.equalsIgnoreCase("left")) {
            int oldVertical = currentPosition[0];
            int oldHorizontal = currentPosition[1];
            field[oldVertical][oldHorizontal] = " . ";
            if (currentPosition[1] - cubeValue < 0){
                currentPosition[1] = (field.length + currentPosition[1]) - cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
            else {
                currentPosition[1] = currentPosition[1] - cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
        }
        if (direction.equalsIgnoreCase("down")) {
            int oldVertical = currentPosition[0];
            int oldHorizontal = currentPosition[1];
            field[oldVertical][oldHorizontal] = " . ";
            if (currentPosition[0] + cubeValue > field.length - 1){
                currentPosition[0] = cubeValue - (field.length - currentPosition[0]);
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
            else {
                currentPosition[0] = currentPosition[0] + cubeValue;
                field[currentPosition[0]][currentPosition[1]] = " o ";
            }
        }
        if (currentPosition[0] == target[0] && currentPosition[1] == target[1]){
            rollTarget();
        }
    }

    static int rollCube() {
        Random random = new Random();
        int cubeValue = random.nextInt(7);
        System.out.println(cubeValue);
        return cubeValue;
    }

    static void rollTarget(){
        Random random = new Random();
        for(int i = 0; i < 2; i++){
            target[i] = random.nextInt(10);
        }
        field[target[0]][target[1]] = " P ";
    }
    static String[][] buildField(int width, int height) {
        String[][] field = new String[height][width];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = " . ";
            }
        }
        field[5][5] = " o ";
        return field;
    }

    static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}