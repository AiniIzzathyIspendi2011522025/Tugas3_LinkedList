import java.util.LinkedList;
import java.util.Scanner;

public class LL {
    public static void main(String[] args) throws Exception 
    {
        
        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> nobp = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        Scanner input = new Scanner(System.in);
    
        System.out.println("---------------");
        System.out.println("  Linked List  ");
        System.out.println("---------------");

        System.out.println("\n\nApakah List Kosong??\n ->" +nama.isEmpty());

        System.out.println("\n\nInput Nama      : ");
        String x = input.next();
        System.out.println("Input No.Bp     : ");
        String y = input.next();
        System.out.println("Input Alamat    : ");
        String z = input.next();
        
        nama.add(x);
        nobp.add(y);
        alamat.add(z);
        
        System.out.println("Nama        : "+nama);
        System.out.println("No.Bp       : "+nobp);
        System.out.println("Alamat      : "+alamat);

        System.out.println("\n\nApakah List Kosong??\n ->" +nama.isEmpty());

        nama.addFirst("r");   
        nama.addLast("z");
        nama.add("g");
        nama.add("u");
        nama.add("d");
        nama.add("h");
        nobp.addFirst("i");   
        nobp.addLast("a");
        nobp.add("l");
        nobp.add("a");
        nobp.add("r");
        nobp.add("n");
        alamat.addFirst("IV");   
        alamat.addLast("VI");
        alamat.add("j");
        alamat.add("l");
        alamat.add("h");
        alamat.add("k");
        System.out.println("\n\nDATA TERBARU (Add)");
        System.out.println("Nama\t\t: "+nama+"\nJumlah ->"+nama.size());
        System.out.println("No.Bp\t\t: "+nobp+"\nJumlah ->"+nobp.size());
        System.out.println("Alamat\t\t: "+alamat+"\nJumlah ->"+alamat.size());
        

        nama.set(4, "g");
        nobp.set(5, "n");
        alamat.set(3, "d");
        
        System.out.println("\n\nDATA TERBARU (Sisip)");
        System.out.println("Nama\t\t: "+nama+"\nJumlah ->"+nama.size());
        System.out.println("No.Bp\t\t: "+nobp+"\nJumlah ->"+nobp.size());
        System.out.println("Alamat\t\t: "+alamat+"\nJumlah ->"+alamat.size());

        nama.removeFirst();
        nama.removeLast();
        
        nobp.removeFirst();
        nobp.removeLast();
        
        alamat.removeFirst();
        alamat.removeLast();
        
        System.out.println("\n\nDATA TERBARU (Delete)");
        System.out.println("Nama\t\t: "+nama+"\nJumlah ->"+nama.size());
        System.out.println("No.Bp\t\t: "+nobp+"\nJumlah ->"+nobp.size());
        System.out.println("Alamat\t\t: "+alamat+"\nJumlah ->"+alamat.size());

        nama.push("e");
        nama.push("l");
        nobp.push("f");
        nobp.push("r");
        alamat.push("g");
        alamat.push("n");
        System.out.println("\n\nDATA TERBARU (PUSH)");
        System.out.println("Nama\t\t: "+nama+"\nJumlah ->"+nama.size());
        System.out.println("No.Bp\t\t: "+nobp+"\nJumlah ->"+nobp.size());
        System.out.println("Alamat\t\t: "+alamat+"\nJumlah ->"+alamat.size());


        nama.pop();
        nobp.pop();
        alamat.pop();
        System.out.println("\n\nDATA TERBARU (POP)");
        System.out.println("Nama\t\t: "+nama+"\nJumlah ->"+nama.size());
        System.out.println("No.Bp\t\t: "+nobp+"\nJumlah ->"+nobp.size());
        System.out.println("Alamat\t\t: "+alamat+"\nJumlah ->"+alamat.size());
    }
}
