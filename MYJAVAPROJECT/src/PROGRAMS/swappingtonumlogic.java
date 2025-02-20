//23.	WAP TO FIND LOGIC FOR SWAPPING OF TWO NUMBER.->IN CLASS

package PROGRAMS;
import java.util.*;

public class  swappingtonumlogic {
public static void main(String[] args) {
    int arr[]={3,6,2,97,56,78};
    swap(arr,3, 5);
    /*for(int i=0; i<arr.length;i++){
        System.out.print(arr[i] + "  ");
    }*/
    System.out.println(Arrays.toString(arr));
}    
static void  swap(int arr[],int index1,int index2) {
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
    /*int arr[]={4,7,8,3,9,10};
    swap(arr,2,3);
    System.out.println(Arrays.toString(arr)); */
}

}
