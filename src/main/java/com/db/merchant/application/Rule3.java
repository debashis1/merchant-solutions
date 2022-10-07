package com.db.merchant.application;

import com.db.external.algo.Algo;
import com.db.merchant.application.ruleengine.Expression;
import com.db.merchant.application.ruleengine.Rule;

public class Rule3 implements Rule {
    @Override
    public boolean evaluate(Expression expression) {
        boolean evalRule = false;
        if(expression.getValue() == 3){
            evalRule = true;
        }
        return evalRule;
    }

    @Override
    public void execute(){
        Algo algo = new Algo();
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}
