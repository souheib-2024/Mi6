import java.util.Scanner;
public class Calculer{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int H=0;
int M=0;
int S=0;
System.out.println("Donnez l'heure "+H);
H= sc.nextInt();
System.out.println("Donnez les minutes "+M);
M= sc.nextInt();
System.out.println("Donnez les secondes "+S);
S= sc.nextInt();

int tot = H*3600+M*60+S;
System.out.println("le total est :" + tot);
        
    }
}