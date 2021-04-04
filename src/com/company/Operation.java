package com.company;

public class Operation {
    public double first_number;
    public double second_number;
    public double result;

    public Operation() {
    }

    public static class Sum {
        public double first_number;
        public double second_number;
        public double result;

        public Sum(double first_number, double second_number, double result) {
            this.first_number = first_number;
            this.second_number = second_number;
            this.result = result;
        }

        public double getResult() {
            return result;
        }

        public double getFirst_number() {
            return first_number;
        }

        public double getSecond_number() {
            return second_number;
        }

        public static double getSum(double first_number, double second_number) {
            double result = first_number + second_number;
            return result;
        }

    }

    public static class Subtract {
        public double first_number;
        public double second_number;
        public double result;

        public Subtract(double first_number, double second_number, double result) {
            this.first_number = first_number;
            this.second_number = second_number;
            this.result = result;
        }

        public double getFirst_number() {
            return first_number;
        }

        public double getSecond_number() {
            return second_number;
        }

        public double getResult() {
            return result;
        }

        public static double getSubtract(double first_number, double second_number) {
            double result = first_number - second_number;
            return result;

        }

        public static class Multiply {
            public double first_number;
            public double second_number;
            public double result;

            public Multiply(double first_number, double second_number, double result) {
                this.first_number = first_number;
                this.second_number = second_number;
                this.result = result;
            }

            public double getFirst_number() {
                return first_number;
            }

            public double getSecond_number() {
                return second_number;
            }

            public double getResult() {
                return result;
            }

            public static double getMultiply(double first_number, double second_number) {
                double result = first_number * second_number;
                return result;

            }
        }

        public static class Divide {
            public double first_number;
            public double second_number;
            public double result;

            public double getFirst_number() {
                return first_number;
            }

            public double getSecond_number() {
                return second_number;
            }

            public double getResult() {
                return result;
            }

            public static double getDivide(double first_number, double second_number) {
                double result = first_number * second_number;
                return result;
            }

            public Divide(double first_number, double second_number, double result) {
                this.first_number = first_number;
                this.second_number = second_number;
                this.result = result;


            }
        }

        public static class Power {
            public double first_number;
            public double second_number;
            public double result;

        }

        public static class Sqrt {
            public double first_number;
            public double second_number;
            public double result;

        }

        public static class Min {
            public double first_number;
            public double second_number;
            public double result;

        }

        public static class Max {
            public double first_number;
            public double second_number;
            public double result;

        }


    }

}
