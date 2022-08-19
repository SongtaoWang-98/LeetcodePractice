//在既定时间做作业的学生人数
public class Q1450 {
    //遍历判断即可 时间复杂度O(n) 空间复杂度O(1) 无难度
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int num = 0;
        for(int i = 0; i < startTime.length; i++) {
            if(queryTime >= startTime[i] && queryTime <= endTime[i]) {
                num++;
            }
        }
        return num;
    }
}
