package m3_1_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class TestLinkedListDeque {

	public static void main(String[] args) {
		// ʵ��Deque�ӿڣ�˫������ ����
		// ǰ���󶼿ɲ���
		// ����ṹ��ֻ����ǰһ������һ��
		// ����ṹ��ĳ�̶ֳȿ������롢ɾ����ÿһ��λ�ö�����
		// LinkedList��һ��˫�������List
		Deque<Hero> heros = new LinkedList<Hero>();
		
		// �����������µ�Ӣ��
		System.out.println("���������룺");
		heros.addLast(new Hero("hero1"));
		heros.addLast(new Hero("hero2"));
		System.out.println(heros);
		
		// ����ǰ������µ�Ӣ��
		System.out.println("����ǰ����룺");
		heros.addFirst(new Hero("superHero"));
		System.out.println(heros);
		
		// �鿴��һ��Ӣ��
		Hero h1 = heros.getFirst();
		System.out.println("��ȡ��һ����");
		System.out.println(h1.name);
		// �鿴���һ��Ӣ��
		// �鿴����ɾ��Ӣ��
		Hero h2 = heros.getLast();
		System.out.println("��ȡ���һ����");
		System.out.println(h2.name);
		
		// ȡ��Ӣ�ۻ�ɾ��Ӣ��
		System.out.println("�Ƴ���һ����");
		heros.removeFirst();
		System.out.println(heros);
		System.out.println("�Ƴ����һ����");
		heros.removeLast();
		System.out.println(heros);

	}
	
	// ������List add get remove����ͬ��
	// Deque���롢ɾ��Ч�����

}
