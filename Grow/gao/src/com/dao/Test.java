package com.dao;

import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		PersonDao ps = new PersonImpl();
		//��ѯ����ѧ��
        List<Person> students=ps.getAllPerson();
        Iterator<Person> it=students.iterator();
        while(it.hasNext()){
            Person p=it.next();
            System.out.println(p.getId()+","+p.getName()+","+p.getAge());
        }

	}
}
