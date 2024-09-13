package DataStructures.Arrays;

class Arrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8,9,10};

        Arrays demo = new Arrays();

        //demo.RemoveEvenIntegers(arr);

        //demo.ReverseArray(arr);

        //demo.FindMinimumElement(arr);

        //demo.SecondMaximumElement(arr);

        //demo.MoveAllZerosToEnd(arr);

        //arr = demo.ResizeArray(arr, 10);

        demo.FindMissingNumber(arr);

        //boolean result = demo.isStringPalindrome("racecar");
     
    }

    public void printarray(int[] arr){

        int len = arr.length;

        for(int i=0; i<len; i++){

            System.out.print(arr[i] + " ");
        }
    }

    public int SearchElement(int[] arr, int target){

        int index =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == target){

                index = i;

                break;

            }
        }

        return index;
    }

    public void RemoveEvenIntegers(int[] arr){

        int len = arr.length;

        int odd = 0;

        for(int i=0; i<len; i++){

            if(arr[i]%2 == 1){

                odd = odd + 1;
            }
        }

        int [] res = new int[odd];

        int idx = 0;

        for(int j=0; j<len; j++){

            if(arr[j]%2==1){

                res[idx] = arr[j];

                idx++;
            }

        }
        printarray(res);

    }

    public void ReverseArray(int[] arr){

        int len = arr.length;
        
        int t;

        for(int i=0; i<arr.length/2; i++){

            t = arr[i];

            arr[i] = arr[len-1];

            arr[len -1] = t;

            len = len-1;

        }

        printarray(arr);

    }

    public void FindMinimumElement(int[] arr){

        int len = arr.length;

        int min = arr[0];

        for(int i=1; i<len; i++){

            if(arr[i]<min){

                min = arr[i];
            }

        }

        System.out.println("The minimum element is "+min);

        System.out.println("The element is found at index "+SearchElement(arr, min));

    }

    public void SecondMaximumElement(int[] arr){

        int max = Integer.MIN_VALUE;

        int second_max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){

                second_max = max;

                max = arr[i];

            }else if(arr[i] > second_max && arr[i]!=max){

                second_max = max;
            }
        }

        System.out.println("The second maximum element is "+second_max);

    }

    public void MoveAllZerosToEnd(int[] arr){

        int j=0;

        int t;

        for(int i=0; i<arr.length; i++){

            if(arr[i] !=0 && arr[j]==0){

                t = arr[i];

                arr[i] = arr[j];

                arr[j] = t;

            }

            if(arr[j]!=0){

                j++;
                
            }
        }

        printarray(arr);

    }

    public int[] ResizeArray(int[] arr, int capacity){

        int[] temp = new int[capacity];

        for(int i=0; i<arr.length; i++){

            temp[i] = arr[i];

        }

        return temp;

    }

    public void FindMissingNumber(int[] arr){

        int n = arr.length+1;

        int sum = n*(n+1)/2;

        for(int i=0; i<arr.length; i++){

            sum = sum - arr[i];

        }

        System.out.println(sum);

    }

    public boolean isStringPalindrome(String word){

        char[] wordarray = word.toCharArray();

        int start = 0;

        int end = wordarray.length -1;

        while(start < end){

            if(wordarray[start] != wordarray[end]){

                return false;
            }

            start++;

            end--;
        }

        return true;

    }
    
}