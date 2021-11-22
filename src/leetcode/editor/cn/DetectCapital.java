package leetcode.editor.cn;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;
import java.util.Comparator;

//520.检测大写字母
public class DetectCapital {
    public static void main(String[] args) {

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Robot {
        int i = 0;
        int j = 0;
        char dir = 'E';
        int width;
        int height;
        int sum=width*height;
        public Robot(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void move(int num) {
            num%=sum;
            while (num-- != 0) {
                switch (dir) {
                    case 'E':
                        if (i == width - 1) {
                            dir = 'N';
                            j++;
                        } else {
                            i++;
                        }
                        break;
                    case 'N':
                        if (j == height - 1) {
                            dir = 'W';
                            i--;
                        } else {
                            j++;
                        }
                        break;
                    case 'W':
                        if (i == 0) {
                            dir = 'S';
                            j--;
                        } else {
                            i--;
                        }
                        break;
                    case 'S':
                        if (j == 0) {
                            dir = 'E';
                            i++;
                        } else {
                            j--;
                        }
                        break;
                }
            }
        }

        public int[] getPos() {
            return new int[]{i,j};
        }

        public String getDir() {
            switch (dir) {
                case 'E':
                    return "East";
                case 'N':
                    return "North";
                case 'W':
                    return "West";
                default:
                    return "South";
            }
        }
    }

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.move(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
//leetcode submit region end(Prohibit modification and deletion)

}