package com.skyhung.javaSE.collectionsTest;

import java.util.*;

/**
 * @author zth
 * @date 2019/10/25 20:20
 */
public class List_Sort {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(3,2,1,4);

        List<String> stringList = Arrays.asList("aa","ab","ac","bb","ba","abc");

        //Collections排序方法一
        Collections.sort(intList);
        Collections.sort(stringList);
        System.out.println("int排序后：");
        for(Iterator<Integer> iterator = intList.iterator();iterator.hasNext();){
            System.out.print(iterator.next()+"\t");
        }
        System.out.println("\nstring排序后：");
        for(Iterator<String> iterator = stringList.iterator();iterator.hasNext();){
            System.out.print(iterator.next()+"\t");
        }

        Student s1 = new Student(15);
        Student s2 = new Student(13);
        Student s3 = new Student(17);
        List<Student> studentList = Arrays.asList(s1,s2,s3);
        /**
         * /////////////////////////////////////////////////////////////
         */
        //Collections排序方法二
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();//按年龄正序
                //return o2.getAge()-o1.getAge();//按年龄倒序
            }
        });
        System.out.println("\nstudent排序后：");
        for(Iterator<Student> iterator = studentList.iterator();iterator.hasNext();){
            System.out.print(iterator.next().getAge()+"\t");
        }


        //或者student类实现Comparable接口，重写compareTo方法
        Collections.sort(studentList);
        System.out.println("\nstudent实现接口方法排序后：");
        for(Iterator<Student> iterator = studentList.iterator();iterator.hasNext();){
            System.out.print(iterator.next().getAge()+"\t");
        }


        //翻转
        Collections.sort(studentList,Comparator.reverseOrder());
        System.out.println("\nstudent实现接口方法翻转后：");
        for(Iterator<Student> iterator = studentList.iterator();iterator.hasNext();){
            System.out.print(iterator.next().getAge()+"\t");
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private Integer age;
    public Student(Integer age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age-o.getAge();//正序
        return o.getAge()-this.age;//倒序
    }
}
