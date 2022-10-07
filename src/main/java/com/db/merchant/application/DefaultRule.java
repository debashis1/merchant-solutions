package com.db.merchant.application;

import com.db.external.algo.Algo;
import com.db.merchant.application.ruleengine.Expression;
import com.db.merchant.application.ruleengine.Rule;

public class DefaultRule implements Rule {
    @Override
    public boolean evaluate(Expression expression) {
        return false;
    }

    @Override
    public void execute(){
        Algo algo = new Algo();
        algo.cancelTrades();
        algo.doAlgo();
    }
}
