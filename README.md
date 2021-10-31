# 作业2
## 一、实验目的
1.掌握对象传值的影响
2.熟悉掌握实例化和构造方法的用法
## 二、业务要求
### 基本要求
* 实例化多个Lake对象
* 同一Fish对象均setFish其中
* 通过调用输出方法
* 查看weight的变化情况
* 在gitee的readme中给出结论
##三、解题思路
1.首先定义二个类，分别为Fish和Lake，再在Fish类中定义weight属性，在lake类中定义fish属性，setfish和eat方法
2.实例化湖的类两个对象分别为西湖和太湖，实例化鱼的类一个对象泥鳅
3.分别用西湖和太湖调用setfish方法，方法中用泥鳅作为参数。
4.用太湖调用eat方法后，输出太湖、西湖、和泥鳅的重量
5.同理用西湖在运行一遍
##四、核心代码
将鱼放入湖中的方法
```
void setFish(Fish s) {
        fish = s;
    }
```
使鱼增加重量的方法
```
    void eat(int n) {
        fish.weight = fish.weight + n;
    }
```
对象的传值
```
taihu.setFish(niqiu);
        xihu.setFish(niqiu);
```
## 五、运行截图
![截图](https://github.com/TakiSakura/zuoye2/blob/460651cae412437f8c2cacae3e1ff4779a0154ab/%E6%88%AA%E5%B1%8F2021-11-01%20%E4%B8%8A%E5%8D%8812.30.07.png)
##六、感想与体会
这次对传值影响的作业，加深了我对方法的理解，也明白了java中传值的机制
*以对象作为参数后，若方法中对参数的值进行修改后，对象的值也会相继改变
*若使a=b,如果b的值发生改变，a的值也会受到影响
