package com.practice.vvr;

public class Student {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;
    double psp;
    int coins;

    private Student(Builder builder) {

    }

    static class Builder {
        String name;
        int id;
        int age;
        int gradYear;
        String batch;
        double psp;
        int coins;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setCoins(int coins) {
            this.coins = coins;
            return this;
        }

        public Student build() {
            // validations
            if(this.age > 25){
                throw new IllegalArgumentException();
            }
            if(this.gradYear < 2020){
                throw new IllegalArgumentException();
            }

            return new Student(this);
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
