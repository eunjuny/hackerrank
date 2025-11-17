public static int diagonalDifference(List<List<Integer>> arr) {
    int n = arr.size();
    int diff = 0;

    for (int i = 0; i < n; i++) {
        diff += arr.get(i).get(i) - arr.get(i).get(n - 1 - i);
    }

    return Math.abs(diff);
}
