package q2;

public class Head extends Source{
    private String data;

    public void setData(String str){
        data = str;
        notifyObs();

    }

    public String getData(){
        return data;
    }
}
