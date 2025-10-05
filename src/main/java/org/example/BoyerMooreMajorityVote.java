package org.example;

public class BoyerMooreMajorityVote {

    private int comparisons;
    private int arrayAccesses;

    public BoyerMooreMajorityVote() {
        this.comparisons = 0;
        this.arrayAccesses = 0;
    }

    public Integer findMajority(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        resetMetrics();

        int candidate = findCandidate(array);

        if (verifyCandidate(array, candidate)) {
            return candidate;
        }

        return null;
    }

    private int findCandidate(int[] array) {
        int candidate = array[0];
        arrayAccesses++;
        int count = 1;

        for (int index = 1; index < array.length; index++) {
            int current = array[index];
            arrayAccesses++;

            if (count == 0) {
                candidate = current;
                count = 1;
            } else if (candidate == current) {
                comparisons++;
                count++;
            } else {
                comparisons++;
                count--;
            }
        }

        return candidate;
    }

    private boolean verifyCandidate(int[] array, int candidate) {
        int count = 0;

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            arrayAccesses++;

            if (element == candidate) {
                comparisons++;
                count++;
            } else {
                comparisons++;
            }
        }

        return count > array.length / 2;
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getArrayAccesses() {
        return arrayAccesses;
    }

    private void resetMetrics() {
        comparisons = 0;
        arrayAccesses = 0;
    }
}