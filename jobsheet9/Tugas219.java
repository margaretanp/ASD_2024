import java.util.Date;
import java.text.SimpleDateFormat;

public class Tugas219 {
    int top, size, jmlBrg, totalHrg;
    String noTrans, waktu;
    Tugas219[] stack;

    Tugas219(String noTrans, int jmlhBrg, int totalHrg, String waktu){
        this.noTrans = noTrans;
        this.jmlBrg = jmlhBrg;
        this.totalHrg = totalHrg;
        this.waktu = waktu;
    }

    Tugas219(int size){
        this.size = size;
        this.top =-1;
        stack = new Tugas219[this.size];
    }

    boolean IsEmpty(){
        if(top <= -1){
            return true;
        }else{
            return false;
        }
    }

    boolean IsFull(){
        if(top >= size-1){
            return true;
        }else{
            return false;
        }
    }

    void push(Tugas219 stk){
        if(!IsFull()){
            top++;
            stack[top] = stk;
        }else{
            System.out.println("Data sudah full!");
        }
    }

    void pop(){
        if(!IsEmpty()){
            Tugas219 st = stack[top];
            top--;
            System.out.printf("Nomor Transaksi\t: %-10s\n", st.noTrans);
            System.out.printf("Tanggal\t\t: %-20s\n", st.waktu);
            System.out.printf("Jumlah Barang\t: %-6d\n", st.jmlBrg);
            System.out.printf("Total\t\t: Rp. %d\n", st.totalHrg);
        }
    }
    
    void line (int pjg){
        for(int i=0; i<pjg; i++){
            System.out.print("=");
        }
        System.out.println();
    }
    
    void print(){
        System.out.println("");
        System.out.println("\t\t   ISI STACK                   ");
        line(50);
        for(int i=top; i>=0; i--){
            System.out.printf("Nomor Transaksi\t: %-10s\n", stack[i].noTrans);
            System.out.printf("Tanggal\t\t: %-20s\n", stack[i].waktu);
            System.out.printf("Jumlah Barang\t: %-6d\n", stack[i].jmlBrg);
            System.out.printf("Total\t\t: Rp. %d\n", stack[i].totalHrg);
        }
        System.out.println();
    }
}
