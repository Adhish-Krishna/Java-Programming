class BinarySearch{
    public static void main(String[] args) {
        int array[] = {1,2,4,6,8,12};
        int target = 6;
        BinarySearchAlgo(array, target);
    }
    static void BinarySearchAlgo(int array[],int target){
        int low = 0;
        int high = array.length-1;
        int index = 0;
        while(low<=high){
            int mid = low + Math.floorDiv((high - low), 2);
            if(array[mid] == target){
                index = mid;
                break;
            }else if(array[mid] > target){
                high = mid -1;
            }else if(array[mid] < target){
                low = mid + 1;
            }
        }
        System.out.println("The element is found at index "+ index);
    }
}