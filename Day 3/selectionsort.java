public class selectionsort {
    public static void main(String args[]){
        int[] arr={30,3,2,23,999};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[min]>arr[j]){
                     min=j;
                 }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       } 
    }
}


// it is a implace and stable

// time complexity for all:O(n^2)
// space complexity:0(1)


