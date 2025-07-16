package assignment;

public class Pangram {
    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(input));
    }

    static boolean isPangram(String str)
    {
        int [] mark=new int [26];
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {   
            char ch=str.charAt(i);
            if('a'<=ch && ch<='z')
            {   
                int index=ch-'a';
                mark[index]=1;
            }
        }
        for(int i=0; i<mark.length; i++)
        {
            System.out.println(mark[i]);
        }
        for(int i=0; i<26; i++)
        {
            if(mark[i]==0)
                return false;
        }

        return true;
    }
}
