class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
    //    Set<Integer> set = new TreeSet <> ();
    //     int n1 =  nums1.length;
    //     int n2 =  nums2.length;

    //     for(int i=0; i<n1; i++){
    //         set.add(nums1[i]);
    //     }

    //     for(int i =0; i<n2; i++){
    //         set.add(nums2[i]);
    //     }

    //     int index = 0; 
    //    int[] ans = new int[set.size()];
    //    for(Integer it: set){
    //     ans[ index ] = it;
    //     index++;
    //    }

    //    return ans; 
        // space C -  for set - O(n1 + n2)  + for array-  O(n1 + n2) -- which we used for 
       // returning ans


       // optimal approach -- Two pointer approach..
       int n1 = nums1.length;
       int n2 =  nums2.length;
       int[] ans =  new int[n1 + n2];
       int i = 0, j= 0, index=0;

        while(i<n1 && j<n2){
            if(nums1[i]<= nums2[j]){
                if(index == 0 || ans[index-1] != nums1[i]){
                    ans[index++] = nums1[i];
                    i++;
                }
                else( index == 0 || ans[index-1] != nums2[j]){
                    ans[index++] = nums2[j];
                    j++;
                }
            }
        }
            
        while(i<n1){
                if(index==0 || ans[index-1] != nums1[i]){
                    ans[index++] = nums1[i];
                    i++;
            }
        }
        while(j<n2){
            if( index == 0 || ans[index-1] != nums2[j]){
                    ans[index++] = nums2[j];
                    j++;
            }
        }

        int result[] = new int[index];
         for(int k=0; k<index; k++){
            result[k] = ans[k];
         }
         return result;
       
    }
}
