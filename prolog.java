class prolog 
{ 
	 int arr[]={2,2,2,3,3,4,5,6,};
	 int ar[]={0,0,0,0,0,0,0,0,};
	 int n=8;
	 void mode()
	{
		  int t,i,p=0,x;
		  for(i=0;i<n;i++)
		{ 
			   t=arr[i];
			  ar[t]++;
		}
		x=ar[0];
		for(i=1;i<n;i++)
		{
			if(ar[i]>x)
			{
                 x=ar[i];
				 p=i;
			}
		}
				System.out.println("Mode of array="+p);
	}
		void mean()
		{
			int i;
			float sum=0,mean=0;
			for(i=0;i<n;i++)
			{
				sum+=arr[i];
				mean=sum/n;
			}
        System.out.println("Mean of array="+mean);
		}
		void median()
		{
			float sum=0,median;
			int x,y;
			if(n%2==0)
			{
                   x=n/2;
				   y=x+1;
				      sum=arr[x-1]+arr[y-1];
				   median=sum/2;
			}
			else
			{
				x=(n+1)/2;

			}
			System.out.println("Median of array="+arr[x-1]);
		}
                  
		public static void  main(String[] args) 
	   {
		   prolog p=new prolog();
		  p.mean();
		  p.median();
		  p.mode();
	   }
}
