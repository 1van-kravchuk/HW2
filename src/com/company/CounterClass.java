package com.company;

public class CounterClass {
private static int count = 0;

    CounterClass() {
        count++;
    }

        public static int getCount () {
          return  count;
        }
    }

