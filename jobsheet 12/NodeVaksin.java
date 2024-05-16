public class NodeVaksin {
    int nomor;
    String nama;

    NodeVaksin prev, next;

    NodeVaksin(NodeVaksin prev, int nomor, String nama, NodeVaksin next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
