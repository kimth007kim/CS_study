package 기사단원의_무기;

class Solution {
    int calc(int N){
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (i * i == N) count++;
            else if (N % i == 0) count += 2;
        }
        return count;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<number+1;i++){
            int tmp = calc(i);
            if (tmp>limit){
                answer+=power;
            }else{
                answer+=tmp;
            }
            // System.out.println(calc(i));
        }
        return answer;
    }
}