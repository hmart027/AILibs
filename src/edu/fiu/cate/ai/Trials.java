package edu.fiu.cate.ai;

import edu.fiu.cate.ai.search.ObjectTreeNode;

public class Trials {

	public static void main(String[] args) {
		ObjectTreeNode<Integer> tree = new ObjectTreeNode<>(5);
		tree.addChildren(6);
		tree.addChildren(8);
		tree.addChildren(15);
		
		System.out.println(tree.getValue());
		for(ObjectTreeNode<Integer> c: tree.getChildren()){
			System.out.print(c.getValue()+", ");
		}
	}
	
	public static class ObjectA extends ObjectTreeNode<ObjectA>{

		public ObjectA(Integer a) {
			this.value = this;
		}
		
	}

}
