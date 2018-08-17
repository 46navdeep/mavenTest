package com.nissan.in.test;

public class Calculator {
	
		public int calc(int a, int b, char c)
		{
			if(c == '+')
				return (a+b);
			if(c == '-')
				return (a-b);
			if(c == '*')
				return (a*b);
			if(c == '/')
				return (a/b);
			else
				return -1;
		}

}
