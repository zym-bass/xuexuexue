package javaaaa;
//
import java.util.Scanner;
import java.util.ArrayList;
public class Items {
    public static void main(String[] args) throws InterruptedException {
        //扫描仪创建 键盘输入
        Scanner s = new Scanner(System.in);
        //存放银行账户用户信息集合 sca
        ArrayList<Person> sca = new ArrayList<Person>();
        //创建一个person的对象用于存储实时使用对象
        Person currentACC = new Person();
        while(true) { //在用户没有退出时一直循环
            menu();   //菜单栏
            System.out.print("请选择：");
            int user = s.nextInt();//用户输入选择功能值  user
            switch (user) {
                case 1://注册

                    System.out.print("请输入用户名：");
                    String login =s.next();//将键盘输入的用户名存储在当前变量中
                    //判断用户名是否重名
//                    for(int i = 0 ; i<sca.size() ;i++) {
//                        Person a = sca.get(i);
//                        if(a.login == login){
//                            System.out.println("用户名重复，请重新注册或登录");
//
//                        }
//                    }
                    if (getperson(login, sca)!=null) {
                        System.out.println("用户名重复，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.print("请输入密码：");
                    String password = s.next();
                    System.out.print("请再次输入：");
                    String repassword = s.next();
                    if(!password.equals(repassword)) {
                         System.out.println("两次密码输入错误，3s秒返回菜单");
                         Thread.sleep(3000);
                         continue;
                    }
                    System.out.print("请输入电话号码：");
                    String tel = s.next();
                    System.out.print("请输入初始金额：");
                    double balance = s.nextDouble();
                    System.out.print("注册成功，请稍等....");
                    //int state =1;// 运行时注册即登陆
//                    //可以写成方法
//                    for(int i = 0 ;i< sca.size()  ; i++){
//                        Person p  = sca.get(i);
//                        if(p.state==1) {
//                            p.state = 0;
//                        }
//                    }
                    //方法一
                    removePerson(sca);//将在线用户清除
                    Person p = new Person();
                    p.login   = login;
                    p.password= password;
                    p.tel     = tel;
                    p.balance = balance;
                    p.state   = 0;
                    sca.add(p);
                    System.out.println(sca);
                    currentACC = p;
                    Thread.sleep(3000);
                    //电话
                    //用户名可能重名
                    //.equals//判断是否相同
                    //当用户名被注册过
                    //可让客户选择登录或者重新注册（即返回上层menu）
                    //注册成功 将数据放入sca集合中
                    continue;
                case 2:
                    //注册成功后 注册账号状态处于登陆状态
                    //1). 及时已有账号登陆 也可以登陆其他账户
                    //2). 一个账户登陆其他账号退出登陆
                    //3). 记录此时账户登陆情况currentACC
                    if(currentACC.state ==1){
                        System.out.println("已有账号登录,3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.print("请输入用户名：");
                    String login2 = s.next();
//                    int index01=judgelogin(login2 , sca);
//
//                    if( index01==-1){
//                        System.out.println("没有改用户，返回菜单");
//                        continue;
//                    }
                    if (getperson(login2, sca) == null) {
                        System.out.println("没有该用户名，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }


                    Person acc = getperson(login2 , sca);


                    if (acc.state==-1){
                        System.out.println("您的账户已经锁定，请去锁定功能，解锁");
                        Thread.sleep(3000);
                        continue;
                    }
                    do {
                        System.out.print("请输入密码：");
                        String password02 = s.next();
                        if(acc.password.equals(password02)) {
                            acc.num=0;
                            acc.state = 1;
                            currentACC = acc;
                            System.out.println("密码正确正在登陆");
                            break;
                        }else{
                            System.out.println("密码输入错误");
                            acc.num+=1;
                        }
                    }while(acc.num <3);
                    if(acc.num == 3){
                        System.out.println("您的账户已经锁定");
                        acc.state=-1;
                        Thread.sleep(3000);
                        continue;
                    }
                    Thread.sleep(3000);
                    continue;
                case 3:
                    if(currentACC.state!=1){
                        System.out.println("当前没有账号登陆，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    Person pe  = getperson(currentACC.login , sca);
                    System.out.print("您选择的是修改密码功能，您的当前账号是："+currentACC.login);
                    System.out.print("请输入原密码：");
                    String password03 = s.next();
                    if(!password03.equals(pe.password)){
                        System.out.println("密码输入错误，3s返回主菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.print("请输入新密码：");
                    password03 = s.next();
                    System.out.print("请再次输入：");
                    String repassword03 = s.next();
                    if(!password03.equals(repassword03)) {
                        System.out.println("两次密码输入不一致，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    pe.password = password03;
                    System.out.println("密码修改成功");
                    Thread.sleep(3000);
                    continue;
                case 4://取钱
                    if(currentACC.state!=1){
                        System.out.println("当前没有账号登陆，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    Person pe04  = getperson(currentACC.login , sca);
                    System.out.println("当前账号余额为："+pe04.balance);
                    System.out.print("请输入你要取得钱数：");
                    double money06= s.nextDouble();
                    if(pe04.balance<money06){
                        System.out.println("余额不足，3s内返回主菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    pe04.balance-=money06;
                    System.out.println("取钱成功，当前余额为："+pe04.balance);
                    Thread.sleep(3000);
                    continue;

                case 5:
                    if(currentACC.state!=1){
                        System.out.println("当前没有账号登陆，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    Person p05= getperson(currentACC.login,sca);
                    System.out.print("请输入要存的金额：");
                    double balance05 = s.nextDouble();
                    p05.balance+=balance05;
                    System.out.println("当前金额为："+p05.balance);
                    Thread.sleep(3000);
                    continue;
                case 6:
                    if(currentACC.state==1){
                        System.out.println("您现在是登陆状态,状态不需要解锁");
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.print("请输入被锁定的用户名：");
                    String login06 = s.next();
                    Person p06 = getperson(login06 , sca);
                    if( p06==null  ){
                        System.out.println("没有改用户，3s内返回菜单");
                        Thread.sleep(3000);
                        continue;
                    }
                    if( p06.num<3  ){
                        System.out.println("账号没有被锁定");
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.print("请输入您的密码:");
                    String password06 = s.next();
                    System.out.print("请输入您的手机号：");
                    String tel06 = s.next();
                    if(p06.password.equals(password06)&& p06.tel.equals(password06) ) {
                        System.out.println("解锁成功");
                        p06.num = 0;
                        p06.state = 0;
                        Thread.sleep(3000);
                        continue;
                    }
                    System.out.println("密码手机号输入错误");
                    Thread.sleep(3000);
                    continue;
                case 7:
                    if(currentACC.state!=1){
                        System.out.println("当前没有账号登陆，3返回菜单");
                        continue;
                    }
                    System.out.println("当前金额为："+currentACC.balance);

                case 8://退出登录

                    currentACC.state=0;
                    System.out.println("退出登陆再见");
                    Thread.sleep(3000);
                    continue;
                case 9: //退出
                    System.out.print("请输入删除的用户名：");
                    String login01 = s.next();
                    if(getperson(login01, sca)!=null){
                        System.out.print("正在删除用户");
                        deletelogin(login01,sca);
                        System.out.println(sca);
                    }else{
                        System.out.print("没有该用户");
                    }
                    break;
                case 10:

                default:
                    System.out.print("输入错误请重新选择输入");
            }
            break;
        }

    }
    //菜单页面
    public static void menu(){
        System.out.println("欢迎来到ATM系统，请阅读下列菜单：");
        System.out.println("1.----注册      2.----登录");
        System.out.println("3.----修改密码   4.----取钱");
        System.out.println("5.----存钱      6.----解锁");
        System.out.println("7.----显示余额   8.----退出");
        System.out.println("9.----注销");

    }
    //
    //判断是否有该对象                用户名           存储用户的集合
//    public static int judgelogin(String login ,ArrayList<Person> sca){
//            //遍历集合查看是否有相同的用户名
//        for(int i = 0 ; i<sca.size();i++){
////            Person p = sca.get(i);  //从集合的提取的person的类放在局部变量 p类中
////            if(p.login.equals(login)){  //p中的用户名对象和输入的用户名对象进行比较
////                return i;//有用户 返回下标index
////            }
//            if(sca.get(i).login.equals(login)){
//                return i;
//            }
//        }
//        return -1;//没有用户 返回-1
//
//    }
    //获取对象
    public static Person getperson(String login,ArrayList<Person> sca ){
        for(int i = 0 ; i<sca.size();i++){
            //方法一
            Person p = sca.get(i);
            if(p.login.equals(login)){
                return p;//返回用户类
            }

        }
        return null;
    }

    //删除对象
    public static void deletelogin(String login ,ArrayList<Person> sca){
        for(int i = 0 ; i<sca.size();i++){
            Person p = sca.get(i);
            if(p.login.equals(login)){
                sca.remove(i);
            }
        }
    }
    //将所有的用户登陆清零
    public static void  removePerson(ArrayList<Person> list){
        for(int i = 0 ; i<list.size() ; i++){
            Person a = list.get(i);
            a.state = 0;
        }
    }
    //定义一个方法，可以将已经登录的所有用户的登录状态清除掉
//    public static void clearLogIn(ArrayList<Person> list) {
//        for (int i = 0 ;i < list.size(); i++) {
//            Person a = list.get(i);
//            if (a.state == 1) {//如果是登录的状态
//                a.state = 0;//修改为未登录的状态
//            }
//        }
//    }
}
class Person{
    //登录名
    String login ;

    //密码
    String password;

    //金额
    double balance ;

    //电话
    String tel ;

    //账户状态
    int state = 0;//1表示登录 0 表示未登录 -1锁定状态
    int num; //登录次数
    public String toString(){
        return "\n登录名："+login+"\n金额："+balance+"\n电话："+tel;
    }
}
