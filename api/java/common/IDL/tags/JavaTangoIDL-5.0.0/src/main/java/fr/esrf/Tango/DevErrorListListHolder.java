package fr.esrf.Tango;

/**
 * Generated from IDL alias "DevErrorListList".
 *
 * @author JacORB IDL compiler V 3.5
 * @version generated at Sep 5, 2014 10:37:19 AM
 */

public final class DevErrorListListHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevError[][] value;

	public DevErrorListListHolder ()
	{
	}
	public DevErrorListListHolder (final fr.esrf.Tango.DevError[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DevErrorListListHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DevErrorListListHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DevErrorListListHelper.write (out,value);
	}
}
