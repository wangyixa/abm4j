package com.yanm.model;

public interface SimulationRule {
    CellState getNextState(int x, int y, Board board);
}
