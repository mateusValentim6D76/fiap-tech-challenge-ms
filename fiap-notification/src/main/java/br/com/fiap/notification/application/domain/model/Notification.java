package br.com.fiap.notification.application.domain.model;

import java.io.Serializable;

public class Notification implements Serializable {

    private Long id;
    private static String RECEIVED;
    private static String IN_PREPARATION;
    private static String READY;
    private static String FINISHED;

    public static String getRECEIVED() {
        return RECEIVED;
    }

    public static void setRECEIVED(String RECEIVED) {
        Notification.RECEIVED = RECEIVED;
    }

    public static String getInPreparation() {
        return IN_PREPARATION;
    }

    public static void setInPreparation(String inPreparation) {
        IN_PREPARATION = inPreparation;
    }

    public static String getREADY() {
        return READY;
    }

    public static void setREADY(String READY) {
        Notification.READY = READY;
    }

    public static String getFINISHED() {
        return FINISHED;
    }

    public static void setFINISHED(String FINISHED) {
        Notification.FINISHED = FINISHED;
    }

    public Long getId() {
        return id;
    }
}
