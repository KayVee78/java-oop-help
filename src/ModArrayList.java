import java.util.ArrayList;

//ModArrayList is inherited from ArrayList
//<D> says that ModArrayList can store any kind of Data as same as the ArrayList
public class ModArrayList<D> extends ArrayList<D> {

    //method of return type 'D' which returns any type of data
    public D getUsingMod(int index) {

        //To make the index positive Math.abs(index)
        int validIndex = Math.abs(index) % this.size();

        //get method is an instance method
        return this.get(validIndex);
    }
}