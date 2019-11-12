package com.skyhung.javaSE.enumTest;

/**
 * @author zth
 * @date 2019/10/22 22:51
 */
public enum Operation {
    plus{
        @Override
        public double eval(double x, double y) {
            return x+y;
        }
    },
    minus{
        @Override
        public double eval(double x, double y) {
            return x-y;
        }
    },
    times{
        @Override
        public double eval(double x, double y) {
            return x*y;
        }
    },
    divide{
        @Override
        public double eval(double x, double y) {
            return x/y;
        }
    };
    public abstract double eval(double x,double y);

    public static void main(String[] args) {
        System.out.println(Operation.plus.eval(3,4));
        System.out.println(Operation.minus.eval(4,3));
        System.out.println(Operation.times.eval(3,4));
        System.out.println(Operation.divide.eval(4,4));
    }
}
