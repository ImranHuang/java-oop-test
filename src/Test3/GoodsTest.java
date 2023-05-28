package Test3;

/*定义数组存储3个商品对象。
        商品的属性:商品的id，名字，价格，库存。创建三个商品对象，并把商品对象存入到数组当中*/

public class GoodsTest {
    public static void main(String[] args) {
        //1、创建一个数组
        Goods[] arr = new Goods[3];
//创建三个商品对象
        Goods g1 = new Goods("1", "雪碧", 3.5, 10);
        Goods g2 = new Goods("2", "可口可乐", 5, 20);
        Goods g3 = new Goods("3", "营养快线", 4.5, 5);
//将商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4、遍历
        for (int i = 0; i < arr.length; i++) {

            Goods goods = arr[i];

            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount() + ", ");
        }


    }


}
