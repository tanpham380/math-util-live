/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author phamt
 */
//class nay cung cap tien ich cho noi khac xai
// khi ta cung cap tien ich noi khac do la luc ta khong can nho cho rieng ta
//Static se giup ta lam chuyen nay
public class MathUtil {
    public static long GetFactoriall(int n){
        if(n<0 || n> 20) throw new IllegalArgumentException("Invaild Argument. 0<n<20");
        if(n==0 || n==1) return 1;
        long product = 1;
        for(int i =2; i<=n; i++){
            product = product*i;
        }
        return product;
    }
    
}
