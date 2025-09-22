//Inverted & Rotated half pyramid 
public class RotatedHalfPyramid{
    public static void inverted_halfPyramid(int n){
        //outre
        for(int i=1;i<=n;i++){
          //spaces
             for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        
            //stars
             for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
 public static void main(String [] args){
    inverted_halfPyramid(4);
 }
}
