class MergeSortString{
	public static void main(String[] args){
         String[] array = { "ab", "su", "tn", 
                "pn", "pl", "dc", "qr", "kj" };

            String[] sortedArry = mergeSort(array);
            for (int i = 0; i < sortedArry.length; i++) {
            System.out.println(sortedArry[i] + " ");
            }

	}
	public static String[] mergeSort(String[] ary) {
        String [] sorted = new String[ary.length];
        if (ary.length == 1) {
            sorted = ary;
        } else {
            int mid = ary.length/2;
            String[] left = null; 
            String[] right = null;
            if ((ary.length % 2) == 0) {
                left = new String[ary.length/2];
                right = new String[ary.length/2];
            } else { 
                left = new String[ary.length/2];
                right = new String[(ary.length/2)+1];
            }
            int x=0,y=0;
            for ( ; x < mid; x++) {
                left[x] = ary[x];
            }
            for ( ; x < ary.length; x++) {
                right[y++] = ary[x];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            sorted = mergeArray(left,right);
        }

        return sorted;
    }
    private static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length+right.length];
        int l = 0,r = 0, m = 0,comp = 0;
        while (l < left.length || r < right.length) {
            if (l == left.length) {
                merged[m++] = right[r++];
            } else if (r == right.length) {
                merged[m++] = left[l++];
            } else {  
                comp = left[l].compareTo(right[r]);
                if (comp > 0) {
                    merged[m++] = right[r++];
                } else if (comp < 0) {
                    merged[m++] = left[l++];
                } else { 
                    merged[m++] = left[l++];
                }
            }   
        }
        return merged;
    }


}