import java.util.ArrayList;
    // Stack 
    class Stack{
        private ArrayList<Integer> values = new ArrayList<>();
        public void push(int value){
            values.add(value);
        }

        public Integer pop(){
            if(isEmpty()){
                return null;
            }
            return values.remove(values.size() - 1);
        }
        public Integer peekStack(){
            if (isEmpty()){
                return null;
            }
            return values.get(values.size() - 1);
        }
        public boolean isEmpty(){
            return values.isEmpty();
        }
        public int size(){
            return values.size();
        }
    }
    //Queue 
    class Queue{

        private ArrayList<Integer> values = new ArrayList<>();

        public void enqueue(int value){
            values.add(value);
        }
        public Integer dequeue(){
            if (isEmpty()){
                return null;
            }
            return values.remove(0);
        }
        public Integer peekQueue(){
            if (isEmpty()){
                return null;
            }
            return values.get(0);
        }
        public boolean isEmpty(){
            return values.isEmpty();
        }
        public int size(){
            return values.size();
        }
    
    }
    
public class Homework3{
    public static void main(String[] args){
        int[] values = {15, 25, 35, 45, 55};
        Stack stack = new Stack();
        System.out.println("Stack Demonstration: ");

        System.out.println("Adding values: ");
        for (int value : values){
            stack.push(value);
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Top value: ");
        Integer topValue = stack.peekStack();
        System.out.println(topValue);

        System.out.println("Removing: ");
        System.out.println(stack.pop());
        System.out.println("New top:");
        System.out.println(stack.peekStack());
 
        System.out.println("Is Stack empty?");
        System.out.println(stack.isEmpty());
 
        System.out.println();

        Queue queue = new Queue();
 
        System.out.println("Queue Demonstration: ");
        System.out.println("Adding values in queue:");
        for (int value : values) {
            queue.enqueue(value);
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Front item:");
        Integer frontItem = queue.peekQueue();
        System.out.println(frontItem);
 
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
 
        System.out.println("Removing:");
        System.out.println(queue.dequeue());
 
        System.out.println("New front:");
        System.out.println(queue.peekQueue());
 
        System.out.println("Is Queue empty?");
        System.out.println(queue.isEmpty());
    }
}
