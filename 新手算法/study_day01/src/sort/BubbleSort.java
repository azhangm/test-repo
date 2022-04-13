package sort;

public class BubbleSort {
    public static void test(int[] a){
        // 冒泡 排序的思想 每次将 最大/最小 的数字放在最后一位  完成升序/降序排列
        // 算法实现时间复杂度的分析 ： 每次需要比较： 从 0 开始 比较 每次 减少一次 比较 n - i 次


        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i - 1;j++){
                if (a[j+1] < a[j]){
                    int tmp = a[j];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        test(new int[]{1,5,3,2,4});
    }
}
