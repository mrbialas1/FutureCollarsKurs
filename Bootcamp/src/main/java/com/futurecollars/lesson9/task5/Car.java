package com.futurecollars.lesson9.task5;

public abstract class Car extends Vehicle implements Engine{
    private boolean engineStarted;

    public Car(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    @Override
    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }
    @Override
    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

}
