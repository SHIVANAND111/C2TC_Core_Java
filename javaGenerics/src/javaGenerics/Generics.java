package javaGenerics;

public class Generics<T> {
	private	T obj;

	public void Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data_Generic [obj=" + obj + ", getObj()=" + getObj() + "]";
	}

	}


	 class Data_Generics {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Generic <String> g = new Generic<String>("good morning");
			
			String in = g.getObj();
			System.out.println(in);
		

		}

}
