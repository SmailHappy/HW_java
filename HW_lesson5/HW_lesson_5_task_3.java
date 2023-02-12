/* 
На шахматной доске расставить 8 ферзей так, 
чтобы они не били друг друга. 
И вывести Доску. 
0x00000 0000x00 00x0000
*/

package HW_lesson5;

public class HW_lesson_5_task_3 {
    public static void main(String[] args) {
        String [][] chessfield = new String[8][8];

        chessfield = fill_chessfield_0(chessfield);
        print_chessfild(chessfield);
    }

    public static String [][] fill_chessfield_0(String [][] chessfield) {
        for (int i = 0; i < chessfield[0].length ; i ++) {
            for (int j = 0; j < chessfield[1].length; j++) {
                chessfield[i][j] = "0";
            }
        }
        return chessfield;
    }

    public static String [][] fill_chessfield_queen_and_1(String [][] chessfield, Integer index) {
        for (int i = 0; i < chessfield.length; i++) {
            for (int j = index; j < chessfield[1].length ; j ++) {
                if (chessfield[i][j] == "0") {

                }
            }
        }
        return chessfield;
    }

    public static void print_chessfild(String [][] chessfield) {
        for (int i = 0; i < chessfield[0].length ; i ++) {
            for (int j = 0; j < chessfield[1].length; j++) {
                System.out.print(chessfield[i][j] + " ");
            }
            System.out.println();
        }
    }
}
