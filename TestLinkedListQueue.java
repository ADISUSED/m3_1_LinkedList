package m3_1_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedListQueue {

	public static void main(String[] args) {
		
		// LinkedList 实现Queue接口
		// 队列
		// FIFO 先进先出
		Queue<Hero> heros = new LinkedList<Hero>();
		// 队尾插入offer
		heros.offer(new Hero("myhero1"));
		heros.offer(new Hero("myhero2"));
		System.out.println(heros);
		// 队头获取peek，不会删除
		Hero hero = heros.peek();
		System.out.println(hero.name);
		System.out.println(heros);
		// 队头拉出poll，删除
		Hero hero2 = heros.poll();
		System.out.println(hero2.name);
		System.out.println(heros);

	}

}
