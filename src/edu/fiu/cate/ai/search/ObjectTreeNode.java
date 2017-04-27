package edu.fiu.cate.ai.search;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ObjectTreeNode<T>{
	
	protected T value;
	protected ObjectTreeNode<T> parent;
	protected ArrayList<ObjectTreeNode<T>> children;
	
	protected ObjectTreeNode(){}
	
	public ObjectTreeNode(T val){
		this(null, val);
	}
	
	public ObjectTreeNode(ObjectTreeNode<T> parent, T val){
		this.value = val;
		this.parent = parent;
		this.children = new ArrayList<>();
	}

	public ObjectTreeNode<T> getParent(){
		return parent;
	}
	
	public T getValue(){
		return value;
	}
	
	public ArrayList<ObjectTreeNode<T>> getChildren(){
		return children;
	}
	
	public ObjectTreeNode<T>[] getChildrenArray(){
		@SuppressWarnings("unchecked")
		ObjectTreeNode<T>[] ts = (ObjectTreeNode<T>[]) Array.newInstance(this.getClass(), children.size());
		return children.toArray(ts);
	}
	
	public void addChildren(T val){
		ObjectTreeNode<T> cT = new ObjectTreeNode<>(this, val);
		children.add(cT);
	}
	
	public void addChildren(ObjectTreeNode<T> child){
		child.parent = this;
		children.add(child);
	}

	
}
