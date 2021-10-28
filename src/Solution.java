import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

/*  Suposem que hem de programar un dron repartidor entre 4 punts diferents del nostre barri. És necessari saber les distàncies en línia recta entre els punts. L'entrada del nostre programa seran 4 punts correlatius. El dron comença desde la posició (0,0) i se'n va al primer punt, després anirà al segon, del segon al tercer, del tercer al quart i del quart retorna al punt d'inici (0,0).

Exemple:

image

Si el recorregut fos en aquests quatre punts, i anés de forma correlativa A, B, C i D ens interessa saber la distància del punt (0,0) al punt A, del A al B,... i així consecutivament entre els diferents punts. Pista (Teorema de Pitàgores).

Input Format

Seran 4 coordenades (x, y) que indiquin 4 punts en un mapa. Tots els nombres són enters.

Constraints

Els 8 enters d'entrada poden ser positius i negatius

Output Format

Retorna la distància total recorreguda pel dron, nombre enter (Math.round()).

Sample Input 0

4 3
-4 3
-4 -3
4 -3
Sample Output 0

32
Explanation 0

Del punt 0,0 al punt 4,3 hi ha una distància de 5 (per Pitàgores)

Del punt 4,3 al punt -4,3 hi ha una distància de 8

Del punt -4,3 al punt -4,-3 hi ha una distància de 6

Del punt -4,-3 al punt 4,-3 hi ha una distància de 8

Del punt 4,-3 hi ha una distància de 5

En total el dron haurà recorregut: 5 + 8 + 6 + 8 + 5 = 32.

Sample Input 1

1 1
0 1
-1 0
1 0
Sample Output 1

7
Explanation 1

En aquest cas la distància de 0,0 a 1,1 per Pitàgores és de 1,41.

Així que la suma serà: 1,41 + 1 + 1,41 + 2 + 1 = 6,82, arrodonim a 7. */







public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double cord1x = sc.nextDouble();
        double cord1y = sc.nextDouble();
        double cord2x = sc.nextDouble();
        double cord2y = sc.nextDouble();
        double cord3x = sc.nextDouble();
        double cord3y = sc.nextDouble();
        double cord4x = sc.nextDouble();
        double cord4y = sc.nextDouble();

        double distInicial = Math.sqrt(Math.pow(cord1x - 0 , 2)+ Math.pow(cord1y - 0 , 2));
        double dist1to2 = Math.sqrt(Math.pow(cord2x - cord1x , 2 )+ Math.pow(cord2y - cord1y , 2));
        double dist2to3 = Math.sqrt(Math.pow(cord3x - cord2x , 2 )+ Math.pow(cord3y - cord2y , 2));
        double dist3to4 = Math.sqrt(Math.pow(cord4x - cord3x , 2 )+ Math.pow(cord4y - cord3y , 2));
        double distReturn = Math.sqrt(Math.pow(0 - cord4x , 2 )+ Math.pow(0 - cord4y , 2));

        System.out.println(Math.round(distInicial+dist1to2+dist2to3+dist3to4+distReturn));

    }
}
