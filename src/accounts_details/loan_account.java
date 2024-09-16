package accounts_details;

public class loan_account extends account{
    double principalAmount;
    double interestRate;
    int loanDuration;
    public loan_account(double principalAmount,double interestRate,int loanDuration){
        this.principalAmount=principalAmount;
        this.interestRate=interestRate;
        this.loanDuration=loanDuration;
    }
    public void calculateInterest(){
        balance+=principalAmount*interestRate*loanDuration;
    }
    public void setPrincipalAmount(double principalAmount){
        this.principalAmount=principalAmount;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public void setLoanDuration(int loanDuration){
        this.loanDuration=loanDuration;
    }
    public double getPrincipalAmount(){
        return principalAmount;
    }
    public double getInterestRate(){
        return interestRate;
    }
public int getLoanDuration(){
        return loanDuration;
    }

}
