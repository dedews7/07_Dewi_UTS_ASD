public class ScavengerHunt07 {
    Point07 head;

    public ScavengerHunt07() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        Point07 newPoint = new Point07(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Point07 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void displayPoints() {
        Point07 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equals(userAnswer)) {
                head = head.next;
                return true;
            }
        }
        return false;
    }
}


