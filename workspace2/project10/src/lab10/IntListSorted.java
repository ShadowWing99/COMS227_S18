package lab10;

/**
 * Subclass of IntList that guarantees that the elements are always
 * in ascending order.
 */
public class IntListSorted extends IntList
{
  /**
   * Constructs an empty list.
   */
  public IntListSorted()
  {
    super();
  }
  
  /**
   * Adds a new item to this list, inserting it so that
   * the list remains sorted.
   */
  @Override
  public void add(int newItem)
  {
    if (size() == 0 || get(size() - 1) <= newItem)
    {
      super.add(newItem);
    }
    else
    {
      int i = size();
      while (i > 0 && newItem < get(i - 1))
      {
        i -= 1;
      }
      
      // now i is 0, or newItem >= list[i - 1], so put the new
      // element at position i
      super.insert(i, newItem);
    }
  }
  
  /**
   * Inserts a new item in this list, inserting it so that
   * the list remains sorted.  (The given index is ignored.)
   */
  @Override
  public void insert(int index, int newItem)
  {
    this.add(newItem);
  }
  public int getMedian() {
	  int med = 0;
	  if(size() % 2 == 0) {
		  med = this.get((size()/2) -1);
	  }
	  else {
		  med = this.get(size()/2);
	  }
	  return med;
  }
  @Override
  public int getMaximum(){
	  return this.get(size()-1);
  }
  
  @Override
  public int getMinimum(){
	  return this.get(0);
  }
}