package com.db.merchant.application.ruleengine;


public interface Rule {
    boolean evaluate(Expression expression);
    void execute();
}
