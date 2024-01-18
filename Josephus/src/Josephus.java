public class Josephus {

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode(int data) {
            this(data, null);
        }
        public ListNode() {
            this(0, null);
        }

        public String toString() {
            return data + "";
        }
    }
    //precondition: n >= 1
    public int simulate (int n) {
        ListNode joseph = makeList(n);
        ListNode ptr = joseph;
        while (ptr != ptr.next) {
            ptr.next = ptr.next.next;
            ptr = ptr.next;
        }
        return ptr.data;
    }

    public ListNode makeList(int n) {
        ListNode joseph = new ListNode(1);
        ListNode ptr = joseph;
        for (int i = 2; i <= n; i++) {
            ptr.next = new ListNode(i);
            ptr = ptr.next;
        }
        ptr.next = joseph;
        return joseph;
    }

    public static void main(String[] args) {
        Josephus j = new Josephus();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " --> " + j.simulate(i));
        }
    }
}