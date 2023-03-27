package com.CALCULATORProject;

public class Add implements Operate{//Add cls implementing Operate interface
    @Override
    public Double getResult(Double... numbers) {//if we supply 4 numbers it add up and return sum
        Double sum=0.0;
        for(Double num:numbers)
        {
            sum+=num;
        }
        return sum;
    }



}
