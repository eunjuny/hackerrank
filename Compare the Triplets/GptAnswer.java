public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int scoreA = 0, scoreB = 0;

    for (int i = 0; i < a.size(); i++) {
        int ai = a.get(i);
        int bi = b.get(i);
        if (ai > bi) scoreA++;
        else if (ai < bi) scoreB++;
    }

    return Arrays.asList(scoreA, scoreB);
}
