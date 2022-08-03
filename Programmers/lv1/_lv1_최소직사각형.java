public class _lv1_최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);
    }
    static public int solution(int[][] sizes) {
        int width =0;
        int height=0;

        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            width = Math.max(width, w);
            height = Math.max(height, h);
        }

        int answer = width*height;
        System.out.println(answer);
        return answer;
    }
}
