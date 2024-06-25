public class StackBuku {
    Buku[] stack;
    int top;
    int maxSize;

    public StackBuku(int size) {
        maxSize = size;
        stack = new Buku[maxSize];
        top = -1;
    }

    public void push(Buku buku) {
        if (top < maxSize - 1) {
            stack[++top] = buku;
        } else {
            System.out.println("Stack penuh, tidak bisa menambah buku.");
        }
    }

    public Buku pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada buku untuk dihapus.");
            return null;
        }
    }

    public Buku peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada buku untuk dilihat.");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void cetakSemuaBuku() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }
}
