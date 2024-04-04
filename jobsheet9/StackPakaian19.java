public class StackPakaian19 {
    int size;
    int top;
    Pakaian19 data[];

    public StackPakaian19 (int size) {
        this.size = size;
        data = new Pakaian19[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian19 pkn19) {
        if (!isFull()) {
            top++;
            data[top] = pkn19;
        } else {
            System.out.println("Isi Stack penuh!!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Pakaian19 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " "  + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + 
         data[top].ukuran + " " +data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMax() {
        if (!IsEmpty()) {
            Pakaian19 maxPakaian = data[0]; 
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPakaian.harga) {
                    maxPakaian = data[i]; 
                }
            }
            System.out.println("Data pakaian dengan harga tertinggi:" + maxPakaian.jenis + " " + maxPakaian.warna + " " + maxPakaian.merk + " " + 
                    maxPakaian.ukuran + " " + maxPakaian.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
