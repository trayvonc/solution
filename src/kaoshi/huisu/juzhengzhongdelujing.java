package kaoshi.huisu;

public class juzhengzhongdelujing {
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(back(board,word,i,j,0,visited)){
                    return true;
                }
            }
        }
        return false;

    }
    static boolean flag=false;
    public static boolean back(char[][]board,String word,int i,int j,int startIndex,boolean[][]visited){
        if(!isIn(i,j,board)) return false;
        if(board[i][j]!=word.charAt(startIndex)) return false;

        if(startIndex==word.length()-1){
                flag=true;
            System.out.println(i+","+j);
                return true;

        }
        if(visited[i][j]) {
            visited[i][j] = true;
            boolean res = back(board, word, i - 1, j, startIndex + 1, visited) ||
                    back(board, word, i + 1, j, startIndex + 1, visited) ||
                    back(board, word, i, j - 1, startIndex + 1, visited) ||
                    back(board, word, i, j + 1, startIndex + 1, visited);
            if(res&&flag) System.out.println(i+","+j);
            visited[i][j] = false;
            return res;
        }
        return false;
    }
    public static boolean isIn(int i,int j,char[][] board){
        if(i<0||i>=board.length||j<0||j>=board[0].length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,"ABCB"));
    }
}
