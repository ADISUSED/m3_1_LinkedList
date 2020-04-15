package m3_1_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class TestLinkedListDeque {

	public static void main(String[] args) {
		// 实现Deque接口，双向链表 佛珠
		// 前、后都可操作
		// 链表结构：只关心前一个，后一个
		// 数组结构：某种程度看（插入、删除）每一个位置都关心
		// LinkedList是一个双向链表的List
		Deque<Hero> heros = new LinkedList<Hero>();
		
		// 在最后面插入新的英雄
		System.out.println("在最后面插入：");
		heros.addLast(new Hero("hero1"));
		heros.addLast(new Hero("hero2"));
		System.out.println(heros);
		
		// 在最前面插入新的英雄
		System.out.println("在最前面插入：");
		heros.addFirst(new Hero("superHero"));
		System.out.println(heros);
		
		// 查看第一个英雄
		Hero h1 = heros.getFirst();
		System.out.println("获取第一个：");
		System.out.println(h1.name);
		// 查看最后一个英雄
		// 查看不会删除英雄
		Hero h2 = heros.getLast();
		System.out.println("获取最后一个：");
		System.out.println(h2.name);
		
		// 取出英雄会删除英雄
		System.out.println("移除第一个：");
		heros.removeFirst();
		System.out.println(heros);
		System.out.println("移除最后一个：");
		heros.removeLast();
		System.out.println(heros);

	}
	
	// 功能与List add get remove异曲同工
	// Deque插入、删除效率提高

}
