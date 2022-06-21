public class _4673_셀프_넘버 {
    public static void main(String[] args) {
        
        boolean[] check  = new boolean[10001];

        for(int i=1; i<10001; i++){
            int num =i;
            int sum=num;
            while(num>0){
                sum += num%10;
                num = num/10;
            }
            if(sum>10000){
                continue;
            }
            check[sum] = true;
        }


        for(int i=1; i<10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }
}
