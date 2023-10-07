import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("input number: ");
    byte n = sc.nextByte();
    sc.close();
    int s = 0;
    for(int i=0; i<8; i++){ // norādu 8 jo bitā nav vairāk par 8 baitiem
      if((n&1)==1){ // ja n un 1 ir vienads ar 1, tad integers tiek pieskaits ieprieksejam
        s++;
        }
      n = (byte)(n>>1); // n piešķirts byte datu tips, seko bitu operācija
    }
    System.out.println("result:");
    System.out.println(s);
  }
}
