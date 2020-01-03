
public class wordSearch{
	public static void main(String args[]){
		  char[][] board ={ 
				  {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'} };
		  
		  System.out.println(find(board,"SFCSEEDA"));
	}
	
	static boolean ans = false;
	static boolean find(char[][] board, String word){
        for(int i =0; i<board.length;i++){
        	for(int j=0;j<board[0].length;j++){
        		check(i,j,0,board,word);
        	}
        }
        return ans;
    }
	static void check (int vert, int horz, int wordpos,char[][] board, String word){

		if (wordpos == word.length()-1){
			ans = true;
			return;}
		
		if(wordpos+1>word.length()-1){return;}
		
		//Checks bottom character
		if (!(vert + 1 >= board.length) && board[vert +1][horz] == word.charAt(wordpos+1)){
			check(vert+1,horz,wordpos+1,board,word);}
		//Checks right character
		if (!(horz + 1 >= board[0].length) && board[vert][horz+1] == word.charAt(wordpos+1)){
			check(vert,horz+1,wordpos+1,board,word);}	
		//Checks the above letter
		if (!(vert-1 < 0) && board[vert-1][horz] == word.charAt(wordpos+1)){
			check(vert-1,horz,wordpos+1,board,word);}
		//Checks Left Character
		if (!(horz-1 < 0) && board[vert][horz-1] == word.charAt(wordpos +1)){
			check(vert,horz-1,wordpos+1,board,word);}			
	}
	
}
