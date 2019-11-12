import java.util.Arrays;

/**
 * @author zth
 * @date 2019/10/20 20:31
 */
//实现对象数组的排序
public class Test3 {
    public static void main(String[] args) {
        Student[] sArray = new Student[10];
        for(int i =10;i<20;i++){
            if(i%2==0){
                Student s =new Student(i+10);
                sArray[i-10] = s;
            }
            else{
                Student s = new Student(i-10);
                sArray[i-10] = s;
            }
        }
        System.out.println("原数组：");
        for(int i =0;i<sArray.length;i++){
            System.out.println(sArray[i].age);
        }
        Arrays.sort(sArray);
        System.out.println("排序后数组：");
        for(int i =0;i<sArray.length;i++){
            System.out.println(sArray[i].age);
        }

    }
}
class Student implements Comparable<Student>{
    int age;
    public Student(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age-s.age;
    }
}
