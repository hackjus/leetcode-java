package leetcode;

public class WordSearch {

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : WordSearch
 * Description : 79. Word Search
 *    /**
     * For example,
     Given board =

     [
     ['A','B','C','E'],
     ['S','F','C','S'],
     ['A','D','E','E']
     ]
     word = "ABCCED", -> returns true,
     word = "SEE", -> returns true,
     word = "ABCB", -> returns false.


     time : 涓嶇煡閬�
     space : 涓嶇煡閬�

     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exist(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean exist(char[][] board, int i, int j, String word, int start) {
        if (start >= word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] == word.charAt(start++)) {
            char c = board[i][j];
            board[i][j] = '#';
            boolean res = exist(board, i + 1, j, word, start) ||
                    exist(board, i - 1, j, word, start) ||
                    exist(board, i, j + 1, word, start) ||
                    exist(board, i, j - 1, word, start);
            board[i][j] = c;
            return res;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][]board =
			{
					{'A','B','C','E'},
					{'S','F','C','S'},
					{'A','D','E','E'}
			};
		String wordString="ABCCED";
		new WordSearch().exist(board, wordString);
	}

}
