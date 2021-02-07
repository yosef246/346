package com.company;

public class point {

        double x;
        double y;

        public point(double x, double y) {

            this.x = x;
            this.y = y;
        }

        public point middle(point p) {

            return new point((this.x + p.x) / 2, (this.y + p.y) / 2);
        }

        public double distance(point p) {

            double diffx = Math.pow(x - p.x, 2);
            double diffy = Math.pow(y - p.y, 2);

            return Math.sqrt(diffx + diffy);
        }

        public double areaSize(point p, point t) {

            double diff1 = x * (t.y - p.y);
            double diff2 = p.x * (y - t.y);
            double diff3 = t.x * (p.y - y);

            return Math.abs(diff1 + diff2 + diff3) / 2;
        }

        public double slope() {
            return y / x;
        }
    }


