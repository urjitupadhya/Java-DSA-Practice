package Searching;
public class peekelement{
    public static void main(String[]args){
int arr[]={1,2,3,4,5,6,7,8,10};
int target=9;
int result =BinarySearch(arr,target);
System.out.println(result);

    }
    static int BinarySearch(int arr[],int target ){
int start=0;
int end =arr.length-1;

while(start<=end ){
    int sum=(start+end)/2;
if (target==arr[sum]){
    return arr[sum] ;
}
else if(arr[sum]<target){
    start=sum+1;
}
else {
    end=sum-1;
}}
return  arr[start];
    
}}