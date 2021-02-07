package com.company;

public class Rational {

        int numerator;
        int denominator;


        public Rational(int num, int denom) {

            numerator = num;
            denominator = denom;
        }

        public  Rational add( Rational r) {

            int res = numerator * r.denominator + r.numerator * denominator;
            int com = denominator * r.denominator;

            Rational x = new Rational(res, com);
            x.reduce();

            return x;
        }

        public Rational mul(Rational r) {
            int res = numerator * r.numerator;
            int com = denominator * r.denominator;

            Rational x = new Rational(res, com);
            x.reduce();

            return x;
        }
        public void reduce() {

            int min = Math.min(numerator, denominator);
            for(int i = min; i > 1; i++) {
                if(numerator % i == 0 && denominator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }

        public Rational bigger(Rational r) {

            int x = numerator * r.denominator;
            int y = r.numerator * denominator;

            if(x > y) return this;
            return r;
        }
    }


