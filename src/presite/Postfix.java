package presite;

import java.io.IOException;

public class Postfix{
    public static void main(String[] args) throws IOException {
        Parser parser=new Parser();    //创建对象
        parser.expr();System.out.write('\n');     //执行起点
    }
}
