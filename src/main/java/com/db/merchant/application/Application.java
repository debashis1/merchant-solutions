package com.db.merchant.application;

import com.db.merchant.application.ruleengine.Rule;
import com.db.merchant.application.ruleengine.RuleEngine;
import com.db.tradingsystem.SignalHandler;

public class Application implements SignalHandler {
    private RuleEngine ruleEngine; //TODO: Should be singleton
    public Application(){
        ruleEngine = new RuleEngine();
        Rule rule1 = new Rule1();
        Rule rule2 = new Rule2();
        Rule rule3 = new Rule3();
        Rule defaultRule = new DefaultRule();
        ruleEngine.registerRule("rule1", rule1);
        ruleEngine.registerRule("rule2", rule2);
        ruleEngine.registerRule("rule3", rule3);
        ruleEngine.registerRule("defaultRule", defaultRule);
    }
    @Override
    public void handleSignal(int signal) {
        System.out.println("Signal: "+signal);
        MyExpression myExpression = new MyExpression();
        myExpression.setSignal(signal);
        Rule ruleEvaluated = ruleEngine.getEvaluatedRule(myExpression);
        ruleEvaluated.execute();
    }
}
