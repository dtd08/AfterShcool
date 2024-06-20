package lang.string.stringEx;

import java.util.Scanner;

public class Ex_SearchDocument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String wantWord = sc.nextLine();

        int cnt = 0;
        int index = 0;
        int findIdx;

        while(true) {
            findIdx = doc.indexOf(wantWord, index);
            
            if (findIdx == -1) break;
		        
		        index = findIdx + wantWord.length();
		        cnt++;
        }

        System.out.println(cnt);
    }
}
