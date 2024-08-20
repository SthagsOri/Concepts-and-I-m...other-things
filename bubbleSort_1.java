class bubbleSort_1{
    public static void main(String[]args){
        //Arranges the array elements in even numbers first then odd numbers
        int []array={45,30,10,50,31};
        int n=array.length;
        
        for(int i =0;i<n-1;i++){
        
            for(int j=0;j<n-i-1;j++){
            
                if(array[j]%2==0){
                
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                
                if(array[j]%2==1){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
        for(int a= 0; a <= n-1; a++){
            System.out.println(array[a]);
        }
    }
}
