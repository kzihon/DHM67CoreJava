import java.util.ArrayList;
import java.util.List;

public class TestForGit {
    public static void main(String[] args) {
        String[][] mat={{"c","a","t"},{"i","d","o"},{"n","o","m"}};
        words(mat);
    }
    public static void words(String[][] mat){
        int row=mat.length;
        int col=mat[0].length;
        List<String> str=new ArrayList<>();
        for(int i=0;i<row;i++){
            String word="";
            for(int j=0;j<col;j++){
                word=word + mat[i][j];
            }
            str.add(word);

        }
        for(int j=0;j<col;j++){
            String word="";
            for(int i=0;i<row;i++){
                word=word + mat[i][j];
            }
            str.add(word);

        }
        System.out.println(str);
        System.out.println(str.contains("mom"));
        System.out.println(str.contains("cin"));
    }
}
