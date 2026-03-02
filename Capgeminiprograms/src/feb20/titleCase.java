package feb20;
public class titleCase {
    public static void main(String[] args) {
        String s="This is java lang";
        String result="";
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++){
            result=result+Character.toUpperCase(w[i].charAt(0))+ w[i].substring(1) + " ";
        }
        System.out.println(result);
    }
}