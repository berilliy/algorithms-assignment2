package org.example;

public class Main {
    public static void main(String[] args) {
        int[]numbers = {1,1,1,1,1,1,7,8,9,10};
        BoyerMooreMajorityVote boyerMoore = new BoyerMooreMajorityVote();
        System.out.println(boyerMoore.findMajority(numbers));
    }
}