package fr.esrf.Tango;

/**
 * Generated from IDL alias "DevVarEncodedArray".
 *
 * @author JacORB IDL compiler V 3.5
 * @version generated at Sep 5, 2014 10:37:19 AM
 */

public final class DevVarEncodedArrayHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevEncoded[] value;

	public DevVarEncodedArrayHolder ()
	{
	}
	public DevVarEncodedArrayHolder (final fr.esrf.Tango.DevEncoded[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DevVarEncodedArrayHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DevVarEncodedArrayHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DevVarEncodedArrayHelper.write (out,value);
	}
}
