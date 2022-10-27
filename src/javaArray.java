import java.util.Scanner;

public class javaArray {
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
        System.out.println("enter the 1st person");
        String g=scan.nextLine();
        System.out.println("enter the 2nd person");
        String h=scan.nextLine();
        System.out.println("enter the 3rd person");
        String j=scan.nextLine();
        System.out.println("enter the 4th person");
        String k=scan.nextLine();
        System.out.println("enter the 5th person");
        String r=scan.nextLine();
        System.out.println("enter the 6th person");
        String t=scan.nextLine();
        System.out.println("enter the 7th person");
        String y=scan.nextLine();
        System.out.println("enter the 8th person");
        String u=scan.nextLine();
        System.out.println("enter the 9th person");
        String i=scan.nextLine();
        System.out.println("enter the 10th person");
        String o=scan.nextLine();


      String []a;
        a=new String[10];
        a[0]=g;
        a[1]=h;
        a[2]=j;
        a[3]=k;
        a[4]=r;
        a[5]=t;
        a[6]=y;
        a[7]=u;
        a[8]=i;
        a[9]=o;

        long randomNUmber=Math.round(Math.random()*10);
        System.out.println("the one who got the ekub is the " +randomNUmber );






      System.out.println(a[(int) randomNUmber]);

    }

}
