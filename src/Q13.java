//罗马数字转整数
class Q13 {
    //遍历字符串累加即可，若当前数字大于上一个遍历数字，则减去上一个数字的两倍 时间复杂度O(n)
    public int romanToInt(String s) {
        int result = 0;
        int current = 0;
        for(int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if(c == 'M') {
                if(current == 100) {
                    result -= 200;
                }
                current = 1000;
            }
            else if(c == 'D') {
                if(current == 100) {
                    result -= 200;
                }
                current = 500;
            }
            else if(c == 'C') {
                if(current == 10) {
                    result -= 20;
                }
                current = 100;
            }
            else if(c == 'L') {
                if(current == 10) {
                    result -= 20;
                }
                current = 50;
            }
            else if(c == 'X') {
                if(current == 1) {
                    result -= 2;
                }
                current = 10;
            }
            else if(c == 'V') {
                if(current == 1) {
                    result -= 2;
                }
                current = 5;
            }
            else if(c == 'I') {
                current = 1;
            }
            result += current;
        }
        return result;
    }
}
