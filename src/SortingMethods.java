import java.util.*;

class SortingMethods {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void selec(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[smallest]) smallest = j;
            }
            swap(arr, i, smallest);
        }
    }
    
    public static void bubble(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
            }
        }
    }
    
    public static void insertion(int[] arr, int n){
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arrSelec = {4,1,5,2,3};
        int[] arrBub = {4,1,7,2,6,3};
        int[] arrIns = {7,3,6,2,1,9,5};
        selec(arrSelec, arrSelec.length);
        bubble(arrBub, arrBub.length);
        insertion(arrIns, arrIns.length);
        
        System.out.println(Arrays.toString(arrSelec));
        System.out.println(Arrays.toString(arrBub));
        System.out.println(Arrays.toString(arrIns));
    }
}