package card;

public class card {
    private String cardNum;
    public void setCardNum(String cardNum){//换一个号码
        this.cardNum = cardNum;
    }
    public boolean lengthVerify(){
        if (this.cardNum.length() != 18){
            return false;
        }
        return true;
    }
    public boolean charVerify(){
        return false;
    }
    public boolean checkcodeVerify(){
        return false;
    }
    public void output(){}
}
