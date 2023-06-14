package com.congenial.octo.lamp.leetcode;

import com.congenial.octo.lamp.util.Utility;

public class Lc1419_MinNumberOfFrogs {

    static String croakOfFrogs = "crcoakroak";

    public static void main(String[] args) {
        Utility.out(minNumberOfFrogs1("aoocrrackk"));
        Utility.out(minNumberOfFrogs1("crakkoocaaoarkcrcrorccaooakrakoocccooarokkrraokrkkcakororcrookaaoarckrckkaarkacorrakckaroocacccaaoaakkkkorkarcoaoaaccckcaocookkckkcrkcckkracocoarkorarookccarrocraaocacarorcoorkcracaarorarroarrccrcrcaccooackcaakckokkkkoaorcckakacccorkaarrkakcakcrorkccrrrkoacorcacrkakocorroakokkrrkkakrrckokacarorckracrrrocrrcccooorcararocrcocaaoccaakorcrcckokkkcokcacrkcckakkkkcaorooaorroccrrakcrcaacaokocaokkaorocorckrkokrrcaaarokaoaaroookorrorkoarorckacoaoakkokracaokaaokarooraraaacokrkkkaakoacookcrroakrkoacockkkkoccooarcaraarckcoaaaocakrororkrkorkckokrarkacokokrroacoccaookccrakkkrkoacarr"));
        Utility.out(minNumberOfFrogs1("ccrrooaakk"));
        Utility.out(minNumberOfFrogs1("croakroak"));
    }


    public static int minNumberOfFrogs(String croakOfFrogs) {
        int c=0,r=0,o=0,a=0,k=0;
        int activeFrogs = 0;
        int ans = -1;
        for(char ch: croakOfFrogs.toCharArray()){
            switch(ch){
                case 'c':
                    c++;
                    activeFrogs++;
                    break;
                case 'r':
                    r++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'a': 
                    a++;
                    break;
                case 'k': 
                    k++;
                    activeFrogs--;
                    break;
            }
            ans = Math.max(ans,activeFrogs);
            if(c<r || r<o || o < a || a < k)
                return -1;
            
        }
        return activeFrogs == 0 ? ans : -1;
    }

    
    public static int minNumberOfFrogs1(String croakOfFrogs) {

        int ans = -1, activefrog = 0;
        int c = 0, r = 0, o = 0, a = 0, k = 0;

        char[] arr = croakOfFrogs.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {

                case 'c':
                    activefrog++;
                    c++;
                    break;
                case 'r':
                    if (r < c)
                        r++;
                    else
                        return -1;
                    break;
                case 'o':
                    if (o < r)
                        o++;
                    else
                        return -1;
                    break;
                case 'a':
                    if (a < o)
                        a++;
                    else
                        return -1;
                    break;
                case 'k':
                    if (k < a) {
                        k++;
                        activefrog--;
                    } else
                        return -1;
                    break;
                default:
                    return -1;
            }
            ans = Math.max(ans,activefrog);
        }
        return activefrog == 0 ? ans : -1;
    }
}
