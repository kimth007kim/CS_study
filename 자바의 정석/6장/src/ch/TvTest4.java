package ch;

public class TvTest4 {
    public static void main(String[] args) {
    Tv[] tvArr = new Tv[3];

        for (int i=0; i<tvArr.length;i++){
            tvArr[i]= new Tv();
            tvArr[i].channel=i+10;
        }
        int cnt=0;
        for (Tv tv: tvArr){
            tv.channelUp();
            System.out.printf("tvArr[%d].channel=%d\n",cnt,tv.channel);
            cnt++;
        }

    }
}
