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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.GetFactoriall(5);
        System.out.println("5! = 120; actual : " +result );
        result=MathUtil.GetFactoriall(6);
        System.out.println("6! = 720; actual : " + result);
        result=MathUtil.GetFactoriall(1);
        System.out.println("1! = 1; actual : " + result);
        System.out.println("hello :#");
        /// thôi không sửa đâu :< đừng up nửa
    }
    
}
