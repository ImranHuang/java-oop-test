package Test4;

public class PhoneTest {
    public static void main(String[] args) {

//1、创建一个数组
        Phone[] arr = new Phone[3];
        //2、创建手机对象
        Phone p1 = new Phone("苹果", 7999, "red");
        Phone p2 = new Phone("华为", 6999, "white");
        Phone p3 = new Phone("OPPO", 5999, "black");


        //把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        double sun = 0;
        for (int i = 0; i < arr.length; i++) {
            sun += arr[i].getPrice();
        }
        System.out.println("手机的平均价格为：" + sun / arr.length);

    }


}
