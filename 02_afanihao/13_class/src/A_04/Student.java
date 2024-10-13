package A_04;

public class Student {
    private String name;
    private String id;
    // score[0] 语文
    // score[1] 数学
    // score[2] 英语
    private int[] scores = new int[3];

    public Student(String name, String id, int[] scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public String get_name() {
        return this.name;
    }

    public String get_id() {
        return this.id;
    }

    public int[] get_scores() {
        return this.scores;
    }
}
