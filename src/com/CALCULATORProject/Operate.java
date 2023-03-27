package com.CALCULATORProject;

public interface Operate {
    //operate interface has single method accepting var arg arr
    Double getResult(Double... numbers);//method with var arg expression,
    // which means numbers can be arbitrary length, 1ele arr,2ele arr.. fixed length but depends on how many args
    //that we supply to the array
}
