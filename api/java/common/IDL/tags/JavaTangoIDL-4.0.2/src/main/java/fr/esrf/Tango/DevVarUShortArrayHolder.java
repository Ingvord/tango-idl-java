package fr.esrf.Tango;

/**
 * Generated from IDL alias "DevVarUShortArray".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DevVarUShortArrayHolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public DevVarUShortArrayHolder ()
	{
	}
	public DevVarUShortArrayHolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DevVarUShortArrayHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DevVarUShortArrayHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DevVarUShortArrayHelper.write (out,value);
	}
}
