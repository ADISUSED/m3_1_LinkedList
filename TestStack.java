package m3_1_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestStack implements Stack{
	List<Hero> heros = new LinkedList<Hero>();
	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		heros.add(heros.size(),h);
	}

	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		Hero hero = heros.remove(heros.size()-1);
		return hero;
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		Hero hero = heros.get(heros.size()-1);
		return hero;
	}
	
	public String toString() {
		return heros.toString();
	}
	
	public static void main(String[] args) {
		TestStack tStack = new TestStack();
		for(int i = 0; i < 5; i++) {
			tStack.push(new Hero("hero" + i));
		}
		System.out.println(tStack);
		
		Hero h1 = tStack.peek();
		System.out.println(h1.name);
		System.out.println(tStack);
		
		Hero h2 = tStack.pull();
		System.out.println(h2.name);
		System.out.println(tStack);
		
	}
	
}
