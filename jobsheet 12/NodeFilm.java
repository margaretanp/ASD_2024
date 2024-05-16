public class NodeFilm {
    int id;
    String judulFilm;
    double rating;

    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, int id, String judulFilm, double rating, NodeFilm next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}
