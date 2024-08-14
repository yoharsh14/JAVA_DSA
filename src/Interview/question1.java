package Interview;

import java.util.PriorityQueue;

public class question1 {
    public static void main(String[] args) {
        String[] str = {".##..",".#.#.",".....","##..#"};
        int n = str[0].length();
        int m = str.length;
        char[][] graph = new char[str[0].length()][str.length];
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                graph[i][j] = str[i].charAt(j);
            }
        }
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(graph[i][j]!='#'){

                }
            }
        }
    }
}
