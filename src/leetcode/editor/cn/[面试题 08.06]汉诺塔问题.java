package leetcode.editor.cn;
//在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只
//能放在更大的盘子上面)。移动圆盘时受到以下限制:
//(1) 每次只能移动一个盘子;
//(2) 盘子只能从柱子顶端滑出移到下一根柱子;
//(3) 盘子只能叠在比它大的盘子上。
//
// 请编写程序，用栈将所有盘子从第一根柱子移到最后一根柱子。
//
// 你需要原地修改栈。
//
// 示例1:
//
//  输入：A = [2, 1, 0], B = [], C = []
// 输出：C = [2, 1, 0]
//
//
// 示例2:
//
//  输入：A = [1, 0], B = [], C = []
// 输出：C = [1, 0]
//
//
// 提示:
//
//
// A中盘子的数目不大于14个。
//
// Related Topics 递归
import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1 {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int size = A.size();
        move(size, A, B, C);
    }

    public void move(int size, List<Integer> A, List<Integer> B, List<Integer> C){
        if (size==1) {
            // 这里之前有个疑问就是，为什么我写法跟方法2相同，只不过是分开写而已，却得到一个另一个错误的结果，苦思冥想
            // 冥思苦想，想不出结果来，还以为跟方法二的操作有顺序问题，直到两个星期后，我又回来看
            // 这个程序，调试一下，看了下结果，发现了猫腻，原来size的问题，第一种size已经为1，移动的是
            // 最底下的1？？？，不是最上面3？感觉好蠢啊！............................(ˉ▽ˉ；)...
//            C.add(A.get(size-1));
//            A.remove(size-1);

            // 方法2
            C.add(A.remove(A.size() - 1));
        }
        else {
            move(size-1,A, C, B);
//            C.add(A.get(size-1));
//            A.remove(size-1);
            C.add(A.remove(A.size() - 1));
            move(size-1, B, A, C);
        }
    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Solution1 solution1 = new Solution1();
//        System.out.println(list);
//        solution1.hanota(list,list1,list2);
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
