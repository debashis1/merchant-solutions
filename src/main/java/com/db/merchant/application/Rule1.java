package com.db.merchant.application;

import com.db.external.algo.Algo;
import com.db.merchant.application.ruleengine.Expression;
import com.db.merchant.application.ruleengine.Rule;


public class Rule1 implements Rule {
    @Override
    public boolean evaluate(Expression expression) {
        boolean evalRule = false;
        if(expression.getValue() == 1){
            evalRule = true;
        }
        return evalRule;
    }

    @Override
    public void execute(){
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

}
