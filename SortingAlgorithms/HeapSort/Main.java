class Heapsort{
  public int GetParent(int index){
    if(index%2 == 0){
      return (index/2)-1;
    }
    return index/2;
  }

  public int GetLeftChild(int index){
    return 2*index+1;
  }

  public int GetRightChild(int index){
    return 2*index+2;
  }

  public int GetMax(int a , int ind1 , int b , int ind2){
    if(a>b){
      return ind1;
    }
    return ind2;
  }

  public void HeapifyDown(int[] arr , int index , int size){
    if(index >= size){
      return;
    }
    int left_ind = GetLeftChild(index);
    int right_ind = GetRightChild(index);
    int left_val;
    int right_val;
    if(left_ind>=size){
      left_val = Integer.MIN_VALUE;
    }
    else{
      left_val = arr[left_ind];
    }
    if(right_ind >= size){
      right_val = Integer.MIN_VALUE;
    }
    else{
      right_val = arr[right_ind];
    }
    int max_ind = GetMax(left_val, left_ind ,  right_val , right_ind);
    int max;
    if(max_ind < size){
      max = arr[max_ind];
    }else{
      max = Integer.MIN_VALUE;
    }
    if(arr[index]<max){
      int temp = arr[index];
      arr[index] = arr[max_ind];
      arr[max_ind] = temp;
    }
    HeapifyDown(arr, max_ind , size);
  }

  public int DeleteRoot(int[] arr , int size){
    if(size <=0){
      return -1;
    }
    int temp = arr[0];
    arr[0] = arr[size-1];
    arr[size-1] = temp;
    size--;
    HeapifyDown(arr, 0, size);
    return size;
  }

  public void BuildMaxHeap(int[] arr , int size){
    int non_leafnode = size/2-1;
    if(non_leafnode <=0){
      return;
    }
    while(non_leafnode >=0){
      HeapifyDown(arr, non_leafnode, size);
      non_leafnode--;
    }
  }

  public int[] Sort(int[] arr , int size){
    int[] heap = new int[size];
    BuildMaxHeap(arr, size);
    while(size>0){
      heap[size-1] = arr[0];
      size = DeleteRoot(arr, size);
    }
    return heap;
  }
}


public class Main{
  public static void main(String[] args) {
    int arr[] = {9,0,8,1,7,2,6,3,5,4};
    Heapsort hs = new Heapsort();
    int[] heap = hs.Sort(arr, arr.length);
    for(int i: heap){
      System.out.print(i+" ");
    }
  }
}