/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author zidane
 */
public class la6_strukturkontrol3 {
    public static void main( String[] args )
    {
        String names[] = {"Beah", "Bianca", "Lance", "Belle",
        "Nico", "Yza", "Gem", "Ethan"};
        String searchName = "Yza";
        boolean foundName = false;
        for( int i=0; i< names.length; i++ ){
            if( names[i].equals( searchName )){
            foundName = true;
            break;
            }
        }
        if( foundName ){
            System.out.println( searchName + " found!" );
        }
        else{
            System.out.println( searchName + " not found." );
        }
    }
}
