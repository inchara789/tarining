package com.cruds.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface myanno {
	String name();
	int version();

}
