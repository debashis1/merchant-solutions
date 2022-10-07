package com.db.merchant.application;

import com.db.tradingsystem.SignalHandler;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ApplicationTest {
    @ParameterizedTest
    @MethodSource("getInputs")
    public void testHandleSignal(Integer input){
        SignalHandler signalHandler = new Application();
        signalHandler.handleSignal(input);
    }

    static Stream<Integer> getInputs() {
        return Stream.of(1, 2, 3, 4);
    }
}
