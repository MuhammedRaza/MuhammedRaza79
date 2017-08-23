package biosapp.app.findmyadventure;

/**
 * Created by Muhammed Reza on 23-Aug-17.
 */

public class DataModel {
    private String[] rest = {"Rest 1","Rest 2","Rest 3","Rest 4","Rest 5","Rest 6","Rest 7","Rest 8"};
    private String[] rest_des = {"Description 1","Description 2","Description 3","Description 4","Description 5","Description 6","Description 7","Description 8"};
    private String[] rest_rat = {"(100)","(60)","(50)","(75)","(63)","(92)","(10)","(38)"};
    private int[] rest_img = {R.drawable.rest1,R.drawable.rest2,R.drawable.rest3,R.drawable.rest4,R.drawable.rest1,R.drawable.rest2,R.drawable.rest3,R.drawable.rest4};

    private String[] deal = {"Deal 1","Deal 2","Deal 3","Deal 4","Deal 5","Deal 6","Deal 7","Deal 8"};
    private String[] deal_des = {"Description 1","Description 2","Description 3","Description 4","Description 5","Description 6","Description 7","Description 8"};
    private String[] deal_price = {"Rs.1000","Rs.600","Rs.500","Rs.750","Rs.630","Rs.920","Rs.100","Rs.380"};
    private int[] deal_img = {R.drawable.food1,R.drawable.food2,R.drawable.food1,R.drawable.food2,R.drawable.food1,R.drawable.food2,R.drawable.food1,R.drawable.food2};


    public String get_rest(int i){
        return rest[i];
    }

    public String get_rest_des(int i){
        return rest_des[i];
    }

    public String get_rest_rat(int i){
        return rest_rat[i];
    }

    public int get_rest_img(int i){
        return rest_img[i];
    }



    public String get_deal(int i){
        return deal[i];
    }

    public String get_deal_des(int i){
        return deal_des[i];
    }

    public String get_deal_price(int i){
        return deal_price[i];
    }

    public int get_deal_img(int i){
        return deal_img[i];
    }



    public int get_length(){
        int length = rest.length;
        return length;
    }

}
