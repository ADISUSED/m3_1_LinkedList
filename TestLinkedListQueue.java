package m3_1_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedListQueue {

	public static void main(String[] args) {
		
		// LinkedList ʵ��Queue�ӿ�
		// ����
		// FIFO �Ƚ��ȳ�
		Queue<Hero> heros = new LinkedList<Hero>();
		// ��β����offer
		heros.offer(new Hero("myhero1"));
		heros.offer(new Hero("myhero2"));
		System.out.println(heros);
		// ��ͷ��ȡpeek������ɾ��
		Hero hero = heros.peek();
		System.out.println(hero.name);
		System.out.println(heros);
		// ��ͷ����poll��ɾ��
		Hero hero2 = heros.poll();
		System.out.println(hero2.name);
		System.out.println(heros);

	}

}
