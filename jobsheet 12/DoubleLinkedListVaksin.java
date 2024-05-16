public class DoubleLinkedListVaksin {
    NodeVaksin head;
    int size;

    public DoubleLinkedListVaksin(){
        head = null;
        size = 1;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addLast(int nomor, String nama){
        if (isEmpty()){
            head  = new NodeVaksin(null, nomor, nama, null);
        }else{
             NodeVaksin current = head;
            while (current.next != null){
                current = current.next;
            }
             NodeVaksin newNodeVaksin = new  NodeVaksin(current, nomor, nama,null);
            current.next = newNodeVaksin;
            size++;
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println(head.nama+"Sudah Di Vaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            System.out.println(head.nama+"Sudah DiNodeVaksin");
            head = null;
            size--;
            return;
        }
         NodeVaksin current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI NodeVaksin ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.println("| No\t| Nama"+"\t\t|");
        if(!isEmpty()){
             NodeVaksin tmp = head;
            while (tmp != null){
                System.out.print("| "+tmp.nomor+"\t| "+tmp.nama+" "+"\t|\n");
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian "+size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
