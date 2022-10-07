package com.db.merchant.application;

import com.db.merchant.application.ruleengine.Expression;

public class MyExpression implements Expression {
    private int signal;
    @Override
    public int getValue() {
        return this.signal;
    }
    public void setSignal(int signal){
        this.signal = signal;
    }
}
