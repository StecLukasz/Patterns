package edu.grcy.patterns.behavioral.visitor;

public interface Merchandise {

	public int accept(Calculator visitor);
}
