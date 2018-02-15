public class ArrayBasedStack<T> implements StackInterface<T> {
   
   private T[] data;  // array 
   private int topOfStack; 
   private final int INITIAL_CAPACITY = 5; 
   private boolean initialized; 
   
   public ArrayBasedStack(int length) { 
      data = (T[]) new Object[length];
      topOfStack = -1; 
      if (topOfStack  > 0) { 
         throw new IllegalArgumentException ("This can't be 0"); 
   }
   }
   
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry) {}
  
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

