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
        System.out.println("��ĳ�ʼ������"+niqiu.weight);
        Lake taihu = new Lake();
        Lake xihu = new Lake();
        taihu.setFish(niqiu);
        xihu.setFish(niqiu);
        taihu.eat(15);
        System.out.println("����̫��ι��15");
        System.out.println("����������"+niqiu.weight);//���2
        System.out.println("̫�������������"+taihu.fish.weight);//���3
        System.out.println("���������������"+xihu.fish.weight);//���4
        xihu.eat(20);
        System.out.println("��������ι��20");
        System.out.println("����������"+niqiu.weight);//���2
        System.out.println("̫�������������"+taihu.fish.weight);//���3
        System.out.println("���������������"+xihu.fish.weight);//���4
    }
}


