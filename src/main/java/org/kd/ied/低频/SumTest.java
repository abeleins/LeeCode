package org.kd.ied.低频;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: abel
 * @Date: 2022/10/21 15:50
 * @Description: 备选线路中选出负荷之和与需求值相匹配的(加减百分之N)负荷，限制线路数量为L，即备选项目是1维到N维数组
 */
public class SumTest {
    double[] load;
    double ratio;
    int limit;
    double value;

    public SumTest(){
        load = new double[]{19.5,10,9,3,2,1,5,4,6,7};
        ratio = 0.05;
        limit = 5;
        value = 20;
    }
    public List<double[]> findLoadId(double[] load,double ratio,int limit,double value){
        load = Arrays.stream(load).sorted().toArray();
        int len = load.length;
        double valueUp = value * (1 + ratio);
        double valueDown = value * (1 - ratio);
        ArrayList<double[]> list = new ArrayList<>(len);
        for (int i = 1; i < len + 1 ; i++) { //这一层是list的层数，或者说数组个数
            for (int j = 0; j < len ; j++) { //这是第几层要和几个数求和 0+1,1+1,1+2,1+3
                if (i + j <= limit) {
                    if (load[i-1] >= valueDown && load [i-1] <= valueUp) {
                        double[] newLoad = new double[i];
                        newLoad[i-1]= load[1-1];
                    }
                }
            }
        }
        return list;
    }

    public List<double[]> sum(double[] load,double ratio,int n,double value){

        return null;
    }
}
