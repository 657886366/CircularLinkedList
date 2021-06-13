public class LeakyStack<AnyType> implements Stack<AnyType>
{
	  public static final int DEFAULT_CAPACITY = 16;
	  AnyType[] data;
	  int topOfStack;
	  int size=0;                     //used to record how many value inside the Stack
	  int Capacity;                  //used to record how big the Stack is.
	  public LeakyStack() { this(DEFAULT_CAPACITY); }
	  public LeakyStack(int capacity)
	  {
	    topOfStack=-1;                       // Start from -1
	    data=(AnyType[]) new Object[capacity];
	    Capacity=capacity;
	  }

	  public int size()
	  {
		  
	      return size;            //return the size of the Stack
	  }


	  public boolean isEmpty()
	  {
	      if (size==0)             //To check if the Stack is empty
	       return true;
	   return false;
	  }


	  public void push(AnyType newValue)
	  {
	     if(topOfStack==Capacity-1) {                  //if the Stack reach the full capacity replace the oldest one in the Stack
	       topOfStack=0;                                //set the topOfStack back to 0;
	       data[topOfStack]=newValue;                   //replace the oldest one;
	       
	     }
	     else {
	     topOfStack++;                                //increase the topOfStack
	     if(size<Capacity && size>=0)                 //make sure the size won't go out of the range
	    	 size++;                                  //increase the size
	     data[topOfStack]=newValue;                    //add the new value to the top of the stack
	     }
	  }


	  public AnyType top()
	  {
	      if(size==0)                          //if the size is 0, return null
	       return null;
	     return data[topOfStack];                  //return the data on the top of the stack
	  }


	  public AnyType pop()
	  {
		  if(size==0)                       //if the size is 0, return null
		     return null;
		  AnyType s=data[topOfStack];         //create a new valuable to store the data
		  data[topOfStack]=null;               //remove the data from the Stack
		  if(size!=0 && topOfStack==0)         //if topOfStack equals to 0 but size not, set topOfStack to capacity-1
			  topOfStack=Capacity-1;
		  else
			  topOfStack--;                   //decrease the topOfStack
		  size--;                           //decrease the size
		  return s;                  //return the value
	  }
	}
