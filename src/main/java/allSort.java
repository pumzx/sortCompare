
class allSort {
    public static void main(String[] args){
        int[] array = new int[10000];
        init(array);
        //print(array);
        //排序区
        long start_time=System.currentTimeMillis();

        //bubble_sort(array);//冒泡排序---219ms
        //selection_sort(array);//选择排序---129ms
        insert_sort(array);//插入排序
        long end_time=System.currentTimeMillis();
        System.out.println("排序前："+start_time);
        System.out.println("排序后："+end_time);
        System.out.println("用时："+(end_time-start_time));

        //print(array);
    }


    //插入排序
    public static void insert_sort(int[] array){
        if(array[1]<array[0]){
            int temp=array[0];
            array[0]=array[1];
            array[1]=temp;
        }
        for (int i=2;i<array.length;i++){
            for (int j=0;j<i;j++){
                if(array[i]<array[j]) {
                    insert(array, i, j, array[i]);
                    break;
                }
            }
        }
    }

    public static void insert(int[] array , int index , int insertPoint, int value){
        for(int i=index;i>insertPoint;i--){
            array[i]=array[i-1];
        }
        array[insertPoint]=value;
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
        System.out.println();
    }
}