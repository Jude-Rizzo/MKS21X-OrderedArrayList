import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList<T>(){
  }

  public NoNullArrayList<T>(int startingCapacity){
    super(startingCapacity);

  }
}
