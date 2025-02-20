package PROGRAMS;
import java.util.*;

public class swapoftono {
    public static void main(String[] args) {
        int arr[]={4,5,86,4,23};
    swap(arr,3,4);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}
static void swap(int arr[],int boshda, int index4){
    int temp = arr[boshda];
    arr[boshda]=arr[index4];
    arr[index4]=temp;
    }
}
