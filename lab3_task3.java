public class Three {
	static class Time{
    	int h,m,s;
    	Time(){
        	this.h=0;
        	this.m=0;
        	this.s=0;
    	}
    	Time(int a, int b, int c){
        	this.h=a;
        	this.m=b;
        	this.s=c;
    	}
    	Time add_time(Time ob1, Time ob2){
        	ob1.h=ob1.h+ ob2.h;
        	ob1.m=ob1.m+ ob2.m;
        	ob1.s=ob1.s+ ob2.s;
        	while(ob1.s>59){
            	ob1.s-=60;
            	ob1.m++;
        	} while(ob1.m>59){
            	ob1.m-=60;
            	ob1.h++;
        	}
        	return ob1;
    	}
    	void show() {
        	System.out.println("Time: "+h+":"+m+":"+s);
    	}
	}
	public static void main(String[] args){
    	Time a1 = new Time(2,55,40);
    	Time a2 = new Time(5,20,30);
    	Time a3 = new Time();
    	a3=a3.add_time(a1,a2);
    	a3.show();
	}
}
