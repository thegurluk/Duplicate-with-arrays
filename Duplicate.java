import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        int[] list={1,2,3,1,3,5,5,6,8,6};
        int[] duplicate=new int[list.length];
        int index=0;


        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if(j>=i){
                    if((i!=j)&&(list[i]==list[j])){
                        duplicate[index]=list[j];
                        index++;
                    }
                }
            }
        }
        for (int i=0;i<duplicate.length;i++){
            if(duplicate[i]!=0){
                System.out.println(duplicate[i]);
            }
        }
    }
}
