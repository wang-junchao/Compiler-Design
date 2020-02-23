package presite;
import java.io.*;
public class Parser {
    static int lookahead;
    public Parser() throws IOException{
        lookahead=System.in.read(); //读取输入的串
    }
    void expr() throws IOException{
        term();  //先识别数字
        while(true){   //重复直至没有+、-号
            if(lookahead=='+'){
                match('+');term();System.out.write('+');  //匹配+号、数字、输出+号
            }
            else if(lookahead=='-'){
                match('-');term();System.out.write('-');
            }
            else return;
        }
    }
    void term() throws IOException{
        if(Character.isDigit((char)lookahead)){  //是否为数字
            System.out.write((char)lookahead);match(lookahead);  //输出数字、匹配数字
        }
        else throw new Error("syntax error");   //出错
    }
    void match(int t) throws IOException{
        if(lookahead==t) lookahead=System.in.read();   //匹配正确，读取下个字符
        else throw  new Error("syntax error");      //出错
    }
}

