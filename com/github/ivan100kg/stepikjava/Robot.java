package com.github.ivan100kg.stepikjava;

public class Robot {
    private int X;
    private int Y;
    private Direction direction;

    Robot() {
        X = 0;
        Y = 0;
        direction = Direction.UP;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return X;
    }

    public int getY() {
        // текущая координата Y
        return Y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        if (getDirection() == Direction.UP) direction = Direction.LEFT;
        else if (getDirection() == Direction.DOWN) direction = Direction.RIGHT;
        else if (getDirection() == Direction.RIGHT) direction = Direction.UP;
        else direction = Direction.DOWN;
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        if (getDirection() == Direction.UP) direction = Direction.RIGHT;
        else if (getDirection() == Direction.DOWN) direction = Direction.LEFT;
        else if (getDirection() == Direction.RIGHT) direction = Direction.DOWN;
        else direction = Direction.UP;
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        if (getDirection() == Direction.UP) Y++;
        if (getDirection() == Direction.DOWN) Y--;
        if (getDirection() == Direction.RIGHT) X++;
        if (getDirection() == Direction.LEFT) X--;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // вращаем и двигаем робота к переданным координатам
        while (robot.getX() != toX || robot.getY() != toY) {
            while (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    if (robot.getDirection() == Direction.UP) robot.turnRight();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
            while (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    if (robot.getDirection() == Direction.UP) robot.turnLeft();
                    else robot.turnRight();

                }
                robot.stepForward();
            }
            while (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    if (robot.getDirection() == Direction.RIGHT)
                        robot.turnRight();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
            while (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    if (robot.getDirection() == Direction.RIGHT)
                        robot.turnLeft();
                    else robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getX() + " " + robot.getY());
        moveRobot(robot, 3, 0);
        System.out.println(robot.getX() + " " + robot.getY());


    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

