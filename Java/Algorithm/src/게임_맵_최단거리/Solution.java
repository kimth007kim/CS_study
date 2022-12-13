import java.util.*;


class Unit{
    int x;
    int y;
    int cnt;

    public Unit(int x, int y, int cnt){
        this.x= x;
        this.y= y;
        this.cnt= cnt;
    }
    public void show(){
        System.out.println(this.x + "  "+ this.y + "  "+ this.cnt);
    }
}

class Solution {

    static int n;
    static int m;
    static int[] dx= {1,0,-1,0};
    static int[] dy= {0,1,0,-1};
    public int solution(int[][] maps) {

        n = maps.length;
        m=  maps[0].length;
        int visited[][] = new int[n][m];



        final int INF= 100000000;


        for (int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                visited[i][j]=INF;
            }
        }
        // show(visited);

        // System.out.println(Arrays.toString(dx)+" "+Arrays.toString(dy));
        bfs(visited,maps);
        if (visited[n-1][m-1]==INF){
            return -1;
        }else{
            return visited[n-1][m-1];
        }
//         int answer = 0;
//         return answer;


    }

    void bfs(int[][] visited, int[][] maps){
        ArrayDeque<Unit> q= new ArrayDeque<>();
        visited[0][0]=0;
        Unit u = new Unit(0,0,1);
        q.add(u);

        while (q.size()>0){
            Unit now = q.pop();
            int x,y,cnt;
            x= now.x;
            y=now.y;
            cnt = now.cnt;
            for (int i=0; i<4;i++){
                int nx = dx[i]+x;
                int ny = dy[i]+y;
                if (0<=nx && nx<n && 0<=ny && ny<m){
                    if (visited[nx][ny]>cnt+1 &&  maps[nx][ny]==1){
                        visited[nx][ny]=cnt+1;
                        Unit next = new Unit(nx,ny,cnt+1);
                        q.add(next);
                    }
                }

            }
        }

        // show(visited);


    }


    void show(int[][] maps){
        for (int i=0;i<maps.length;i++)
            System.out.println(Arrays.toString(maps[i]));
    }
}