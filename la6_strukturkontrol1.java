/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9_2;

/**
 *
 * @author zidane
 */
public class la6_strukturkontrol1 {
    public static void main( String[] args )
    {
        double grade = 92.0;
        if( grade >= 90 ){
            System.out.println( "Excellent!" );
        }
        else if( (grade < 90) && (grade >= 80)){
            System.out.println("Good job!" );
        }
        else if( (grade < 80) && (grade >= 60)){
            System.out.println("Study harder!" );
        }
        else{
            System.out.println("Sorry, you failed.");
        }
    }
}
