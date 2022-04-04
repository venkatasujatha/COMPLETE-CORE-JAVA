package com.tectoro.app;
interface Bank
{
	float RateOfInterest();
}
class SBI implements Bank
{
   public float RateOfInterest()
{
	return 1.674f;
}
}
class RBI implements Bank
{
    public float RateOfInterest()
{
	return 1.23f;
}
}
class AndhraBank implements Bank
{
    public float RateOfInterest()
{
	return 1.64f;
}
}