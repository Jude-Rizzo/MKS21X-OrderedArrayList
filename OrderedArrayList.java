public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  };
  public OrderedArrayList(int capacity){
    super(capacity);
  }
  public boolean add(T element){
    if(element == null) throw new IllegalArgumentException();
    if (super.size() == 0){
      super.add(element);
      return true;
    }
    int z = super.size();
    for (int i = 0; i < z; i++){
      if(super.get(i).compareTo(element) >= 0){
        super.add(i, element);
        z--;
        return true;
      }
    }
    super.add(element);
    return true;
  }
  public void add(int index, T element){
    if(element == null) throw new IllegalArgumentException();
    add(element);
  }
  public T set(int index, T element){
    if(element == null) throw new IllegalArgumentException();
    T old = super.get(index);
    super.remove(index);
    add(element);
    return old;
  }
}
