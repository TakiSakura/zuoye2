class Fish {
    int weight;
}

class Lake {
    Fish fish;

    void setFish(Fish s) {
        fish = s;
    }

    void eat(int n) {
        fish.weight = fish.weight + n;
    }
}

class FishandLake {
    public static void main(String[] args) {
        Fish niqiu = new Fish();
        System.out.println("鱼的初始重量："+niqiu.weight);
        Lake taihu = new Lake();
        Lake xihu = new Lake();
        taihu.setFish(niqiu);
        xihu.setFish(niqiu);
        taihu.eat(15);
        System.out.println("鱼在太湖喂了15");
        System.out.println("泥鳅重量："+niqiu.weight);//输出2
        System.out.println("太湖里鱼的重量："+taihu.fish.weight);//输出3
        System.out.println("西湖里鱼的重量："+xihu.fish.weight);//输出4
        xihu.eat(20);
        System.out.println("鱼在西湖喂了20");
        System.out.println("泥鳅重量："+niqiu.weight);//输出2
        System.out.println("太湖里鱼的重量："+taihu.fish.weight);//输出3
        System.out.println("西湖里鱼的重量："+xihu.fish.weight);//输出4
    }
}


