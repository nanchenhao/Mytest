package org.apache.commons.lang3.compare.MYtest;

import org.apache.commons.lang3.compare.ComparableUtils;

public class mytest {
    public static void main(String[] args){
        int a  =1, b = 0,c = 2;
        boolean flag;

       flag = ComparableUtils.is(a).between(c,b);
       System.out.println(flag);
       flag = ComparableUtils.is(b).lessThan(-1);
       System.out.println(flag);
       flag = ComparableUtils.is(a).greaterThan(-1);
       System.out.println(flag);
    }

}
