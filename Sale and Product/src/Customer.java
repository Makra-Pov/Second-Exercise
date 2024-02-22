public class Customer implements DiscountRate{

    private String CustomerName;
    private String CustomerType;


    Customer(String cn, String ct){
        this.CustomerName=cn;
        this.CustomerType=ct;
    }

    String getCustomerName(){
        return getCustomerName();
    }
    void setCustomerName(String cn){
        this.CustomerName=cn;
    }

    String getCustomerType(){
        return getCustomerType();
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        double dis;
        if (getCustomerType() == "Primium") {

            dis= 20;
        }
        else if(getCustomerType()=="Gold"){
            dis=15;
        }
        else if(getCustomerType()=="Silver"){
            dis= 10;
        }
        else if(getCustomerType()=="Normal "){
            dis= 0;
        }
        else {
            dis=0;
        }
        double dis1;
       return dis1=dis;
    }

    @Override
    public double getProductMemberDiscount() {
        double dis;
        if (getCustomerType() == "Primium") {

            dis= 10;
        }
        else if(getCustomerType()=="Gold"){
            dis=10;
        }
        else if(getCustomerType()=="Silver"){
            dis= 10;
        }
        else if(getCustomerType()=="Normal "){
            dis= 0;
        }
        else {
            dis=0;
        }
        double dis1;
        return dis1=dis;

    }
}
