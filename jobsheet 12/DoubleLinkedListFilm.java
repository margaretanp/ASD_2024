public class DoubleLinkedListFilm {
    NodeFilm head;
    int size;

    public DoubleLinkedListFilm(){
        head = null;
        size = 0;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int id, String judulFilm, double rating){
        if (isEmpty()){
            head  = new NodeFilm(null, id, judulFilm, rating, null);
        
        }else{
            NodeFilm newNodeFilm = new NodeFilm(null, id, judulFilm, rating, head);
            head.prev = newNodeFilm;
            head = newNodeFilm;
        }
        size++;
    }
    public void addLast(int id, String judulFilm, double rating){
        if (isEmpty()){
            addFirst(id, judulFilm, rating);
        }else{
            NodeFilm current = head;
            while (current.next != null){
                current = current.next;
            }
            NodeFilm newNodeFilm = new NodeFilm(current, id, judulFilm, rating, null);
            current.next = newNodeFilm;
            size++;
        }
    }
    public void add(int id, String judulFilm, double rating, int index) throws Exception {
        if (isEmpty()){
            addFirst(id, judulFilm, rating);
        }else if (index <0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeFilm current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                NodeFilm newNodeFilm = new NodeFilm(null, id, judulFilm, rating, current);
                current.prev = newNodeFilm;
                head = newNodeFilm;
            }else{
                NodeFilm newNodeFilm = new NodeFilm(current.prev, id, judulFilm, rating, current);
                newNodeFilm.prev = current.prev;
                newNodeFilm.next = current;
                current.prev.next = newNodeFilm;
                current.prev = newNodeFilm;
            }
        }
        size++;
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            NodeFilm current = head;
            int i=0;
            while (i<index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public void print(){
        System.out.println("----------------------");
        System.out.println("Data Saat Ini Menjadi"); 
        if(!isEmpty()){
            NodeFilm tmp = head;
            while (tmp != null){
                System.out.println("ID \t\t: "+tmp.id);
                System.out.println("Judul Film \t: "+tmp.judulFilm);
                System.out.println("Rating \t\t: "+tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public int findSeqSearch(int cari){
        NodeFilm tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null){
            if(tmp.id == cari){
                posisi = index;
                break;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }
    public void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("ID\t\t: "+ x +" ditemukan pada indeks "+pos);
        }else {
            System.out.println("ID\t\t"+ x +" tidak ditemukan");
        }
    }
    public void sort(){
        NodeFilm current = null, index = null;
        int tempID;
        String tempJD;
        Double tempRT;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.rating < index.rating) {
                        tempRT = current.rating;
                        current.rating = index.rating;
                        index.rating = tempRT;
                        tempID = current.id;
                        current.id = index.id;
                        index.id = tempID;
                        tempJD = current.judulFilm;
                        current.judulFilm = index.judulFilm;
                        index.judulFilm = tempJD;
                    }
                }
            }
            print();
        }
    }
}
