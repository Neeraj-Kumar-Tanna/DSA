class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        boolean Sblack = false;
        if(source[0]%2 != source[1]%2) Sblack = true;
        boolean Tblack = false;
        if(target[0]%2 != target[1]%2) Tblack = true;

        if(Sblack != Tblack) return -1;

        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])) return 1;

        return 2;
    }
}