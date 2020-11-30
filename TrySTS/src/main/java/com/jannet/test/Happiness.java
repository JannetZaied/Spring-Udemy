package com.jannet.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Happiness {
	@Autowired
	Feelings feel;
public void code() {
	
feel.feels();}
}
