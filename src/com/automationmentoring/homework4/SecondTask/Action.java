package com.automationmentoring.homework4.SecondTask;

public enum Action {
    ADD("added"),
    WITHDRAW("withdrawn"),
    CALCULATE("calculated payment fee");

    String action;

    Action(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
