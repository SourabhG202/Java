class Solution {
    public int kthSmallest(int[] arr, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}