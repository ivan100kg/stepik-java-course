package com.github.ivan100kg.stepikjava;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}

interface RobotConnectionManager {
    RobotConnection getConnection();
}

class RobotConnectionException extends RuntimeException {

    public RobotConnectionException(String message) {
        super(message);

    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }


}

class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                i = 3;
                //break;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException(e.getMessage(), e);
                }
            } catch (Exception t) {
                throw t;
            }
        }//for close
    }
}