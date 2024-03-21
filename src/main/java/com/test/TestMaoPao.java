package com.test;

import java.util.Arrays;

public class TestMaoPao {
    public static void main(String[] args) {
        int [] a = {2,9,1,6,4,8};
          for(int i=0;i<a.length;i++){
              for(int j=0;j<a.length-1-i;j++){
                  if (a[j]>a[j+1]) {
                      int t = a[j];
                      a[j] = a[j+1];
                      a[j+1] = t;
                  }
              }
          }
        System.out.println(Arrays.toString(a));
        System.out.println("push test!");
        System.out.println("pull test!");
        System.out.println("hot-fix");
    }
}
