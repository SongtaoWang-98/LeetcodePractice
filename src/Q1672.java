//最富有客户的资产总量
public class Q1672 {
    //二维数组遍历 无难度
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            int account = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                account += accounts[i][j];
            }
            max = Math.max(max, account);
        }
        return max;
    }
}
