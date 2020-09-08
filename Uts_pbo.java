package uts_pbo;

/**
 * Asala Melani
 * XII RPL B
 */
public class Uts_pbo {
    public static void main(String[] args) {
        String abjad="ABCDEFGHIJKLMNOPQRSTUVWXYZ#-";
        char a= abjad.charAt(0);
        String s= abjad.substring(18,19);
        String l= abjad.substring(11,12);
        String min= abjad.substring(27,28);
        String m= abjad.substring(12,13);
        String e= abjad.substring(4,5);
        String n= abjad.substring(13,14);
        String i= abjad.substring(8,9);
        String nama=a+s+a+l+a+min+m+e+l+a+n+i;
        System.out.println(nama);
        String acil=nama.replace('A', 'a');
        System.out.println(acil);
        String nama1 =nama.toLowerCase();
        System.out.println(nama1);
        
        
        
}
}