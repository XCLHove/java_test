package xuexitong;

class Example{


    String str="hello";


    char[]ch={'a','b','c'};


    public static void main(String args[]){
        Example ex=new Example();
        ex.modify(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }


    public void modify(String str,char ch[]){
        str+="world";
        ch[1]='d';
    }


}