import java.util.*;

//(1)
class animal{
    String name;
    double height;
    double weight;
    double speed;

    animal(String name,double height,double weight,double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }

void show(){
    System.out.println("姓名:"+this.name);
    System.out.println("身高(m):"+this.height);
    System.out.println("體重(kg):"+this.weight);
    System.out.println("速度(m/min):"+this.speed);
}

double distance(int x,double y){
    return x*y*this.speed;
}

double distance(int x){
    return x*this.speed;
}

static void showinfo(){
    System.out.println("歡迎進入冰雪奇緣系統");
}
}

//(2)
class human extends animal{
    String gender;
    human(String name,double height,double weight,double speed,String gender){
        super(name, height, weight, speed);
        this.gender=gender;
    }

    void show(){
        super.show();
        System.out.println("性別:"+gender);
    }    
}

//(3)
class snow extends human{
    String frozenSkill;
    snow(String name,double height,double weight,double speed,String gender,String frozenSkill){
        super(name, height, weight, speed, gender);
        this.frozenSkill=frozenSkill;
    }

    void show(){
        super.show();
        System.out.println("冰凍技能屬性值:"+frozenSkill);
    }

    double distance(int x,double y){
        return x*y*this.speed*2;
    }

    double distance(int x){
        return x*this.speed*2;
    }
}

//(4)
public class A1113364_0331{
    public static void main(String[] args) {
    animal.showinfo();

    animal a1=new animal("雪寶",1.1,52,100);
    animal a2=new animal("驢子",1.5,99,200);
    human h1=new human("阿克", 1.9, 80, 150, "男");
    human h2=new human("漢斯", 1.8, 78, 130, "男");
    human h3=new human("安那", 1.7, 48, 120, "女");
    snow s1=new snow("愛沙",1.7,50,120,"女","yes");

    a1.show();
    a2.show();
    h1.show();
    h2.show();
    h3.show();
    s1.show();

    System.out.println("請輸入雪寶奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc1=new Scanner(System.in);
    int x1=sc1.nextInt();
    double y1=sc1.nextDouble();

    System.out.println("請輸入驢子奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc2=new Scanner(System.in);
    int x2=sc2.nextInt();
    double y2=sc2.nextDouble();
    
    System.out.println("請輸入阿克奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc3=new Scanner(System.in);
    int x3=sc3.nextInt();
    double y3=sc3.nextDouble();

    System.out.println("請輸入漢斯奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc4=new Scanner(System.in);
    int x4=sc4.nextInt();
    double y4=sc4.nextDouble();

    System.out.println("請輸入安那奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc5=new Scanner(System.in);
    int x5=sc5.nextInt();
    double y5=sc5.nextDouble();

    System.out.println("請輸入愛沙奔跑的時間min(x)和加速度m/min(y)");
    Scanner sc6=new Scanner(System.in);
    int x6=sc6.nextInt();
    double y6=sc6.nextDouble();
    
    if(y1==0){
       System.out.println("雪寶奔跑的距離為"+a1.distance(x1)+"m");               
    }  else {
            System.out.println("雪寶奔跑的距離為"+a1.distance(x1,y1)+"m");       
            }
    
    if(y2==0){
        System.out.println("驢子奔跑的距離為"+a2.distance(x2)+"m");
    }
    else {                
            System.out.println("驢子奔跑的距離為"+a2.distance(x2,y2)+"m");
    }
    if(y3==0){
        System.out.println("阿克奔跑的距離為"+h1.distance(x3)+"m");
    }
    else {     
        System.out.println("阿克奔跑的距離為"+h1.distance(x3,y3)+"m");
    }
    if(y4==0){
        System.out.println("漢斯奔跑的距離為"+h2.distance(x4)+"m");
    }       
    else { 
            System.out.println("漢斯奔跑的距離為"+h2.distance(x4,y4)+"m");
    }
    if(y5==0){
        System.out.println("安那奔跑的距離為"+h3.distance(x5)+"m");
    }
    else { 
            System.out.println("安那奔跑的距離為"+h3.distance(x5,y5)+"m");
    }
    if(y6==0){
        System.out.println("愛沙奔跑的距離為"+s1.distance(x6)+"m");
    } else {
            System.out.println("愛沙奔跑的距離為"+s1.distance(x6,y6)+"m");
     }
    
    }
}




