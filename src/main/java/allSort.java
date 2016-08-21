
class allSort {
    public static void main(String[] args){
        int[] array = new int[10000];
        init(array);
        //排序区
        long start_time=System.currentTimeMillis();

        //bubble_sort(array);//219ms
        //selection_sort(array);//129ms

        long end_time=System.currentTimeMillis();
        System.out.println("排序前："+start_time);
        System.out.println("排序前："+end_time);
        System.out.println("用时："+(end_time-start_time));

        print(array);
    }


    //选择排序
    public static void selection_sort(int[] array){
        for(int i=0;i<array.length;i++){
            int min_index=i;
            for(int j=i;j<array.length;j++){
                if(array[j]<array[min_index]){
                    min_index=j;
                }
                if(j==array.length-1){
                    swap(array,i,min_index);
                }
            }
        }
    }

    //冒泡排序
    public static void bubble_sort(int[] array){
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] array , int i , int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


    //初始化待排序数组
    public static void init(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10000);
        }
    }

    //打印结果
    public static void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }
    }
}