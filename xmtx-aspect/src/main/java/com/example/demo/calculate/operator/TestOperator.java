package com.example.demo.calculate.operator;

import com.example.demo.annotation.Util;
import com.example.demo.calculate.Enum.Operation;
import com.example.demo.calculate.factory.OperateFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestOperator {

    public static void main(String[] args) throws Exception {

        Integer year = Integer.valueOf(30);
        double totalmoney = 106 * 10000;
        double totalgjjmoney = 50 * 10000;
        OperatorAverageCapicalAndInterest operator = (OperatorAverageCapicalAndInterest) OperateFactory.getOperatoreInstance(Operation.AVERAGECAPICALINTERREST);

        System.out.println("等额本息商业贷款每月还款:" + (operator.execute(totalmoney, year) ));
        System.out.println("等额本息公积金贷款每月还款:" + (operator.executegjj(totalgjjmoney, year) ));

//        + operator.executegjj(totalgjjmoney, year)

//        Operator operator1 = new Operator();
//        operator1.setYear(Integer.valueOf(2019));
//        operator1.setTotalmoney(2019);
//        Operator operator2 = new Operator();
//        operator2.setYear(Integer.valueOf(2020));
//        operator2.setTotalmoney(2020);
//
//        Operator operator3 = new Operator();
//        operator3.setYear(Integer.valueOf(2020));
//        operator3.setTotalmoney(2020);
//        List<Operator> operators = new ArrayList<>();
//        operators.add(operator1);
//        operators.add(operator2);
//        operators.add(operator3);
//
//
//      Map<Integer,Long> map = operators.parallelStream().collect(
//                Collectors.groupingBy(o -> o.getYear(), Collectors.counting()));

//
//        for (Map.Entry<Integer,Long> entry : map.entrySet()){
//            if (entry.getValue()>=2){
//                System.out.println("有分组后大于2的organId.");
//            }
//        }
//        System.out.println(map);


        System.out.println("timestamp: " + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));

        System.out.println(Util.decryptByPrivateKey("l1Gn4PGt0odjxgM9cYoqbKJn9XymayRXYK5h7lCmX6FSH5lp5SP+YoOVFWF74aO9d94NkeW22RlDkq0OzxVGKC1fmdRKx/ppG3IZ0v36LyH7ftPR0PAlAYvLP8+3YIrkqCKSZBxUIjgVHMD6obIf/qMISVNVWeicB288p5bn2QTH13t49dblmDaojkubgPkC7QhZoziX5uyTSUBc7Su6gGcnTx0uxFYL0RQy8dGhPSoQnJ2Kxj34em2IeIfrMI5SzkRgRGJGLQ4vL856rq8RKeCU7YDjuSOIwfk5L6pL6Doi/PDUXeP66ydzueXsmBYc5r1uXcefjVI8rkNLdxjaIg==",
                Util.privateKey));



    }
}
