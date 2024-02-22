public class Sale {

    private Customer customer;
    String date;
    double ServiceExpense;
    double productExpense;


    Sale (Customer customer, String date){
        this.customer=customer;
        this.date=date;

    }
    String getDate(){
        return date;

    }
    double getServiceExpense(){
        return ServiceExpense;
    }
    void setServiceExpense(double se)
    {

    this.ServiceExpense=se;

    }

    double getProductExpense(){
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    double getTotalExpense(){
        double totalP, totalS;

        double disAmountP =(customer.getProductMemberDiscount()*productExpense)/100;
        totalP = productExpense-disAmountP;
        double disAmountS=(customer.getServiceMemberDiscount()*ServiceExpense)/100;
        totalS=ServiceExpense-disAmountS;

        return totalP+totalS;



    }
    void display(){
        System.out.println("======================Display======================");
        System.out.print("Customer Name:"+customer.getCustomerName());
        System.out.print("Customer Type:"+customer.getCustomerType());
        System.out.print("Customer Date:"+date);
        System.out.print("Expense on service :"+ServiceExpense);
        System.out.print("Discount:"+customer.getServiceMemberDiscount());
        System.out.print("Expense on Product :"+productExpense);
        System.out.print("Discount:"+customer.getProductMemberDiscount());
    }
}

