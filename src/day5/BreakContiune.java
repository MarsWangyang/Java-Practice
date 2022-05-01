/*
break:
- 使用範圍：switch/case, loop strucutre
- 使用中的作用：會直接結束當前這個的loop

continue:
- 使用範圍：loop structure
- 使用中的作用：回結束"當次"的loop

相同點：在break, continue後面不可以有執行語句
*/

package day5;

public class BreakContiune {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 4 == 0) {
                break; // 123
            }
            System.out.print(i);

        }
        System.out.println("");

        for (int i = 1; i < 10; i++) {
            if (i % 4 == 0) {
                continue; // 12356789
            }
            System.out.print(i);
        }
    }
}