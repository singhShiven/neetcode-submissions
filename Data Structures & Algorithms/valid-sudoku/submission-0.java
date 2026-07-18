class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (char[] boards:board){
HashSet<Character> rows=new HashSet<>();

for (char cells:boards){
    if(cells=='.')
     continue;
if(rows.contains(cells)){
            return false;
        }
        rows.add(cells);




        }
   

    }
       
for(int i=0;i<9;i++){
    HashSet<Character> cols=new HashSet<>();
    for(int j=0;j<9;j++){
      char cells=board[j][i];
      if (cells=='.')
       continue;
      if(cols.contains(cells)){
            return false;
        }
        cols.add(cells);




        }
   

    }
    for (int k=0;k<9;k+=3){
        for (int l=0;l<9;l+=3){
            HashSet<Character> box = new HashSet<>();
         for(int r=0;r<3;r++){
            for (int c=0;c<3;c++){
             char cells=board[k+r][l+c];
             if (cells=='.')
               continue;
             if(box.contains(cells)){
               return false;
        }
        box.add(cells);

            }
         }   
    }
    }
         return true; 
      


    }
}




