package com.nissan.in.test;

public class Calculator {
	
		public int calc(int a, int b, char c)
		{
			int x = 10;
			
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
