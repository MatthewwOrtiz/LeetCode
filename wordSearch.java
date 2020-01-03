/*Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.

*/



public class wordSearch{
	public static void main(String args[]){
		  char[][] board ={ 
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'} };
		  
		  System.out.println("ABCCED \t" + find(board,"ABCCED"));
		  System.out.println("SEE \t" + find(board,"SEE"));
		  System.out.println("ABCB \t" + find(board,"ABCB"));
	}
	
	static boolean ans = false;
	static boolean find(char[][] board, String word){
		ans = false;
        for(int i =0; i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		check(i,j,0,board,word,0);
        	}
        }
        return ans;
    }
	//vert: Keeps track of vertical position
	//horz: Keeps track of horizontal position
	//wordpos: Keeps track of current position of the word
	//previous: makes sure that we do not check the previous position
	static void check (int vert, int horz, int wordpos,char[][] board, String word,int previous){

		//if we reached the end of the word return true
		if (wordpos == word.length()-1){ans = true;return;}
		
		if(wordpos+1>word.length()-1){return;}
		
		//Checks bottom character 1
		if (!(vert + 1 >= board.length) && previous != 1 && board[vert +1][horz] == word.charAt(wordpos+1)){
			check(vert+1,horz,wordpos+1,board,word, 3);}
		//Checks right character 2
		if (!(horz + 1 >= board[0].length) && previous != 2  && board[vert][horz+1] == word.charAt(wordpos+1)){
			check(vert,horz+1,wordpos+1,board,word, 4);}	
		//Checks the above letter 3
		if (!(vert-1 < 0) && previous != 3 && board[vert-1][horz] == word.charAt(wordpos+1)){
			check(vert-1,horz,wordpos+1,board,word, 1);}
		//Checks Left Character 4
		if (!(horz-1 < 0) && previous != 4 && board[vert][horz-1] == word.charAt(wordpos +1)){
			check(vert,horz-1,wordpos+1,board,word, 2);}			
	}
	
}
