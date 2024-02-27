class coding{
	static void msort(int x[],int n){
		if(n<=1) return;
		int m1,m2;
		m1=n/2;
		m2=n-m1;
		int a[]=new int[m1];
		int b[]=new int[m2];
		for(int i=0;i<m1;i++){
			a[i]=x[i];
		}
		for(int i=0;i<m2;i++){
		    b[i]=x[i+m1];
		}
	    msort(a,m1);
		msort(b,m2);
		sum(a,b,x,m1,m2);
	}
	static void sum(int a[],int b[],int x[],int n1,int n2){
		int i,j,k;
	for(i=0,j=0,k=0;i<n1&&j<n2;){
		if(a[i]<b[j]){
			x[k++]=a[i++];
		}
		else{
			x[k++]=b[j++];
		}
	}
    while(i<n1)
    x[k++]=a[i++];
    while(j<n2)
	x[k++]=b[j++];
	}
	public static void main(String ar[]){
	int x[]={34,45,23,12,45,2,1,3,5};
	int n=x.length;
	msort(x,n);
	for(int i:x){
		System.out.print(i+" ");
	}
}}
