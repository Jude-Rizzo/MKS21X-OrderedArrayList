import java.util.ArrayList;
public class OrderedArrayList<T> extends NoNullArrayList<T>{
  public OrderedArrayList(){

  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);

  }

  public boolean add(T mystery){
    if (this.size() == 0){
      return super.add(mystery)
    } else{
    for(int i = 0; i < this.size(); i++){
      if(mystery.compareTo(this.get(i)) > 0 &&
         mystery.compareTo(this.get(i+1) < 0)){
             return super.add(i+1, mystery)
           }
    }

    return super.add(mystery);
  }
  }

}
