public class DoubleLinkedList19 {

    Node19 head;
    int size;

    public DoubleLinkedList19() {
        head = null;
        size = 0;
    }

        public boolean isEmpty() {
            return head == null;
        }

            public void addFirst (int item, int jarak) {
            if (isEmpty()) {
                head = new Node19(null, item, jarak, null);
            }else {
                Node19 newNode19 = new Node19(null, item, jarak, head);
                head.prev = newNode19;
                head = newNode19;
            }
            size++;
            }
            public int getJarak(int index) throws Exception {
                if (isEmpty() || index >= size ) {
                    throw new Exception("Nilai indeks di luar batas");
                }
                Node19 tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                return tmp.jarak;
            }
            public void addLast (int item) {
                if (isEmpty()) {
                    addFirst(item, item);
                }else {
                    Node19 current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    Node19 newNode04 = new Node19(current, item, item, null);
                    current.next = newNode04;
                    size++;
                }
            }
            public void add (int item, int index) throws Exception {
                if (isEmpty()) {
                    addFirst(item, index);
                }else if (index < 0 || index > size) {
                    throw new Exception ("Nilai indeks di luar batas");
                }else {
                    Node19 current = head;
                    int i = 0;
                    while (i < index) {
                        current = current.next;
                        i++;
                    }
                    if (current.prev == null) {
                        Node19 newNode19 = new Node19(null, item, i, current);
                        current.prev = newNode19;
                        head = newNode19;
                    }else {
                        Node19 newNode19 = new Node19(current.prev, item, i, current);
                        newNode19.prev = current.prev;
                        newNode19.next = current;
                        current.prev.next = newNode19;
                        current.prev = newNode19;
                    }
                }
                size++;
            }
            public int size() {
                return size;
            }
            public void clear() {
                head = null;
                size = 0;
            }
            public void print() {
                if (!isEmpty()) {
                    Node19 tmp = head;
                    while (tmp != null) {
                        System.out.print(tmp.data + "\t");
                        tmp = tmp.next;
                    }
                    System.out.println("\nBerhasil diisi");
                } else {
                    System.out.println("Linked Lists Kosong");
                }
            }
            public void removeFirst() throws Exception {
                if (isEmpty()) {
                    throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
                } else if (size == 1) {
                    removeLast();
                }else {
                    head = head.next;
                    head.prev = null;
                    size--;
                }
            }
            
            public void removeLast() throws Exception {
                if (isEmpty()) {
                    throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
                } else if (head.next == null) {
                    head = null;
                    size--;
                    return;
                }
                Node19 current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
                size--;
            }
            
            public void remove(int index) {
                Node19 current = head;
                    while (current != null) {
                        if (current.data == index) {
                            if (current.prev != null) {
                                current.prev.next = current.next;
                            } else {
                                head = current.next;
                            }
                            if (current.next != null) {
                                current.next.prev = current.prev;
                            }
                            break;
                        }
                        current = current.next;
                    }
                }
                public int getFirst() throws Exception {
                    if (isEmpty()) {
                        throw new Exception("Linked List Kosong");
                    }
                    return head.data;
                }
                public int getLast() throws Exception {
                    if (isEmpty()) {
                        throw new Exception("Linked List kosong");
                    }
                    Node19 tmp = head;
                    while (tmp.next != null) {
                        tmp = tmp.next;
                    }
                    return tmp.data;
                }
                public int get(int index) throws Exception {
                    if (isEmpty() || index >= size) {
                        throw new Exception("Nilai indeks di luar batas.");
                    }
                    Node19 tmp = head;
                    for (int i = 0; i < index; i++) {
                        tmp = tmp.next;
                    }
                    return tmp.data;
                    }
}
        