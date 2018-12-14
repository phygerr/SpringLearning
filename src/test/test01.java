package test;

import java.util.Scanner;

/**
 * 测试
 *
 * @author phyger
 * @project SpringLearning
 * @package test
 * @create 2018-12-11 16:28
 **/
public class test01 {
    public static void main(String[] args){
        System.out.println("请输入你的性别：");
        Scanner scanner = new Scanner(System.in);

        String sex  = scanner.nextLine();

        if (sex.equals("男")){
            System.out.println("搞基才有希望");
        }
        else{
            if (sex.equals("女")){
                System.out.println("拉拉才是对的");
            }
            else {
                System.out.println("呵呵呵呵");
            }
        }

    }

}
