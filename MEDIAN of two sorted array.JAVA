class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int [n1+n2];
        int k = 0 , i = 0, j = 0;
		
		
        while(i < n1 && j < n2){ 
            if(nums1[i] <= nums2[j])
                arr[k++] = nums1[i++];
            else
                arr[k++] = nums2[j++];
        }
		 
        while(i < n1)
            arr[k++] = nums1[i++];
			
		
        while(j < n2){
            arr[k++] = nums2[j++];
        }
	
        if(k % 2 == 0){
            double mid1 = arr[k/2];
            double mid2 = arr[k/2 -1];
            return (double)(mid1+mid2)/2;
        }
		
        else
            return (double)arr[k/2];
        
    }
}
