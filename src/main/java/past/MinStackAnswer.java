package past;

public class MinStackAnswer {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }

    private static class MinStack {

        int val = Integer.MAX_VALUE;

        MinStack next;

        public MinStack() {

        }

        public void push(int val) {
            if (this.next == null) {
                this.next = new MinStack();
                this.next.val = val;
                return;
            }
            var tmp = new MinStack();
            tmp.val = val;
            tmp.next = this.next;
            this.next = tmp;
        }

        public void pop() {
            if (this.next == null) {
                return;
            }
            this.next = this.next.next;
        }

        public int top() {
            return this.next == null ? this.val : this.next.val;
        }

        public int getMin() {
            var n = this.next;
            var min = this.val;
            while (n != null) {
                min = Math.min(min, n.val);
                n = n.next;
            }

            return min;
        }
    }

}
