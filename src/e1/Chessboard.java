package e1;

public interface Chessboard {

    int getSize();

    Pair<Integer, Integer> getPawn();


    Pair<Integer, Integer> getKnight();

    void setKnight(Pair<Integer, Integer> knight);


}
