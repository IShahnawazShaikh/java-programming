class miss
{
	int ar[]={22,23,25,26,0};
	void calculate()
	{
		int a=0,s=0,i=0,sum=0;
          s=ar[0];
		do{
				a+=s;
				 s=s+1;
				 ++i;
		       }while(i<5);
		for(i=0;i<4;i++)
		{
			sum+=ar[i];
		}
		a=a-sum;
       System.out.println("missing="+a);
	}
	public static void main(String[] x)
	{
		miss m=new miss();
		m.calculate();
   	}			   

}