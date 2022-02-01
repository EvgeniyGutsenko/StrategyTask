package Sorting;

public class Sorter {

    SortingContext context;

    public void setContext(SortingContext context){
        this.context = context;
    }
    public void execute(int [] array){
        context.sort(array);
    }
}

