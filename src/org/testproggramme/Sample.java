package org.testproggramme;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
List<Integer> li=new ArrayList<Integer>();
li.add(10);
li.add(20);
li.add(30);
li.add(90);
li.add(10);
li.add(10);
li.add(40);
li.add(50);
List<Integer> si=new ArrayList<Integer>();
si.add(30);
si.add(40);
si.add(50);
si.add(60);
si.add(80);
si.removeAll(li);
System.out.println(si);
	}


	}

