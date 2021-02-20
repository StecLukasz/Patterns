package edu.grcy.patterns.behavioral.state;

public interface FlightState {
    public void updateState(Flight flight);

    void performAction(Flight flight);
}
