public interface Stack<AnyType>            //Stack interface
{
	  int size();
	      
	  boolean isEmpty();

	  void push(AnyType newValue);

	  AnyType top();

	  AnyType pop();
	}
