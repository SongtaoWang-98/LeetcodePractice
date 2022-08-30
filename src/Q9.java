import java.util.LinkedList;
import java.util.Objects;

//回文数
class Q9 {
    //使用LinkedList数据结构 将各位按顺序保存 同时判断首尾两位是否相等
    public boolean isPalindrome(int x) {
        //小于0不是回文数
        if(x < 0) {
            return false;
        }
        //0是回文数
        else if(x == 0) {
            return true;
        }
        else {
            LinkedList<Integer> list = new LinkedList<>();
            while(x > 0) {
                list.add(x % 10);
                x /= 10;
            }
            while(list.size() > 1) {
                if(!Objects.equals(list.removeFirst(), list.removeLast())) {
                    return false;
                }
            }
            return true;
        }
    }
}
