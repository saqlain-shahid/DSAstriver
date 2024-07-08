    package Recursion;

    import java.util.Stack;

    public class ReverseAStack {
        public static void main(String[] args) {
            Stack <Integer> st = new Stack<>();
            st.add(1);
            st.add(2);
            st.add(3);
            st.add(4);
            rev(st);
            System.out.println(st);

        }
        static void rev(Stack<Integer> st){
            if (st.isEmpty()) return;

            int top = st.pop();
            rev(st);

            Stack <Integer> temp = new Stack<>();
            while (!st.empty()){
                temp.push(st.peek());
                st.pop();
            }
            st.push(top);
            while (!temp.empty()){
                st.push(temp.peek());
                temp.pop();
            }
        }
    }
