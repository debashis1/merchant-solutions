package com.db.merchant.application.ruleengine;

import java.util.*;

public class RuleEngine {
    private static Map<String, Rule> registeredRules = new HashMap<>();
    public void registerRule(String ruleName, Rule rule){
        registeredRules.put(ruleName, rule);
    }
    public void unRegisterRule(String ruleName){
        registeredRules.remove(ruleName);
    }
    public Rule getEvaluatedRule(Expression expression){
        Rule ruleEvaluated = registeredRules.get("defaultRule");
        Optional<Map.Entry<String, Rule>> ruleEntryEvaluated = registeredRules.entrySet().stream()
                .filter(ruleEntry -> ruleEntry.getValue().evaluate(expression))
                .findFirst();
        if(ruleEntryEvaluated.isPresent()){
            ruleEvaluated = ruleEntryEvaluated.get().getValue();
        }
        return ruleEvaluated;
    }
}
