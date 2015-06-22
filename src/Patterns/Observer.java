package Patterns;
import Domain.Notice;

public interface Observer
{
	public abstract void beUpdated(Notice n);
}
