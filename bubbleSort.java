class bubbleSort{
    public static void main(String[]args){
    
        int []array={9,8,7,6,5,4,3,2,1};
        int n=array.length;
        
        for(int i =0;i<n-1;i++){
        
            for(int j=0;j<n-i-1;j++){
            
                if(array[j]>array[j+1]){
                
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