package com.futurecollars.lesson9.task5;

public class Vehicle {
    private boolean engineStarted;

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
    public boolean isEngineStarted() {
        return engineStarted;
    }
    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }
    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }
}
