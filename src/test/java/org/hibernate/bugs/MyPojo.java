package org.hibernate.bugs;

public class MyPojo {
	private final Integer foo;

	public MyPojo(EntityA a) {
		foo = a.entityB.foo;
	}

	public Integer getFoo() {
		return foo;
	}
}
