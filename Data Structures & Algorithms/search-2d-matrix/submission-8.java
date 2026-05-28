class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length * matrix[0].length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            int midele = matrix[mid / matrix[0].length][mid % matrix[0].length];

            if(midele == target) return true;
            else if(midele < target) l = mid + 1;
            else r = mid - 1;
        }

        return false;
    }
}
