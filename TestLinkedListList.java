package m3_1_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListList {

	public static void main(String[] args) {
		// 实现List接口
		// 实现了List接口的方法
		// add,contains,get,indexof,set,remove,size,toArray,addAll,clear
		List<Hero> heros = new LinkedList<Hero>();
		
		heros.add(new Hero("hero1"));
		heros.add(new Hero("hero2"));
		System.out.println(heros);
		
		Hero hero = heros.get(0);
		System.out.println(hero.name);
		
		Hero superHero = new Hero("superHero");
		heros.add(superHero);
		int i = heros.indexOf(superHero);
		System.out.println("i = " + i);
		
		heros.remove(0);
		System.out.println(heros);
		
		List<Hero> dreamers = new LinkedList<Hero>();
		dreamers.add(new Hero("dreamer1"));
		dreamers.add(new Hero("dreamer2"));
		heros.addAll(dreamers);
		System.out.println(heros);
		
		heros.set(0, new Hero("fakeHero"));
		System.out.println(heros);
		
		Hero heroArray[] = (Hero[])heros.toArray(new Hero[]{});
		for(Hero h : heroArray) {
			System.out.print(h.name + " ");
		}
		System.out.println();
		Iterator<Hero> iterator = heros.iterator();
		while(iterator.hasNext()) {
			Hero h = iterator.next();
			System.out.print(h.name + " ");
		}
		System.out.println();
		System.out.println(heros.size());
		System.out.println(heros.contains(superHero));
		heros.clear();
		System.out.println(heros.size());
	}
}
