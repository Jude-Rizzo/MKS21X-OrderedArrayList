import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);

  }

  public T set(int index, T mystery){
    if (mystery == null)
      throw new IllegalArgumentException("No");
    return super.set(index, mystery);

  }

  public boolean add(T mystery){
    if (mystery == null)
      throw new IllegalArgumentException("No");
     return super.add(mystery);

}
public void add(int index, T mystery){
  if (mystery == null)
    throw new IllegalArgumentException("No");
  super.add(index, mystery);

}
}
