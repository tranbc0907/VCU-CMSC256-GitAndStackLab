import java.util.Arrays;
import java.util.Stack;  

public class ArrayBasedStack<T> implements StackInterface<T> {
   
   private T[] data;  // array 
   private int topOfStack; 
   private int INITIAL_CAPACITY = 5; 
   private boolean initialized; 
   
   public ArrayBasedStack(int length) { 
      data = (T[]) new Object[length];
      topOfStack = -1; 
      if (topOfStack  > 0) { 
         throw new IllegalArgumentException ("This can't be 0"); 
   }
   initialized = true; 
   }
   
   public ArrayBasedStack() { 
    INITIAL_CAPACITY = 5; 
   }
   
   private int expandArray() {
      T[] newArray = Arrays.copyOf(data, (data.length *2)); 
      return 1;  
   
   }
   
   public void push(T newEntry) {
      StackInterface<String> stack = new ArrayBasedStack(3); 
      stack.push("b");
      stack.push("e");
      stack.peek();
      stack.pop();
      stack.peek();
      stack.pop();
      stack.push("o");
      stack.pop();
      System.out.println(stack.isEmpty());
      stack.pop();
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){ 
   return null; 
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek()
   { 
   return null; 
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){ return false; } 
  
   /** Removes all entries from this stack. */
   public void clear(){}
 
}

