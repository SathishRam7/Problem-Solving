/*
Here given an rotated sorted array you have to find the minimum element in the array
//hint = you can simply traverse and find the min element or do like below

 */
public class Find_Minimum_ELement {
    public static void main(String[] args) {
        int arr[]={7,8,2,3,4,5,6};

        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int m=(s+e)/2;
            if(s<m && arr[m-1]>arr[m]){
                System.out.println(arr[m]);
                break;
            }else if(e>m && arr[m]>arr[m+1]){
                System.out.println(arr[m+1]);
               break;
            }else if(arr[e]>arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }


        }

    }
}
