package accounts_details;

public class saving_account extends account{
    double interestRate;
    public saving_account(double interestRate){
        this.interestRate=interestRate;
    }
    public void addInterest(){
        balance+=balance*interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
