package fr.esrf.Tango;
/**
 * Generated from IDL enum "DispLevel".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DispLevel
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _OPERATOR = 0;
	public static final DispLevel OPERATOR = new DispLevel(_OPERATOR);
	public static final int _EXPERT = 1;
	public static final DispLevel EXPERT = new DispLevel(_EXPERT);
	public int value()
	{
		return value;
	}
	public static DispLevel from_int(int value)
	{
		switch (value) {
			case _OPERATOR: return OPERATOR;
			case _EXPERT: return EXPERT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _OPERATOR: return "OPERATOR";
			case _EXPERT: return "EXPERT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected DispLevel(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
