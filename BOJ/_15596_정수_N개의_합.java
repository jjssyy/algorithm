public class _15596_정수_N개의_합 {

    long sum(int[] a){
        long sum =0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }

        return sum;
    }
}
