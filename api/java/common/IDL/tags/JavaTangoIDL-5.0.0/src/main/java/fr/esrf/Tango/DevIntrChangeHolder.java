package fr.esrf.Tango;

/**
 * Generated from IDL struct "DevIntrChange".
 *
 * @author JacORB IDL compiler V 3.5
 * @version generated at Sep 5, 2014 10:37:19 AM
 */

public final class DevIntrChangeHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevIntrChange value;

	public DevIntrChangeHolder ()
	{
	}
	public DevIntrChangeHolder(final fr.esrf.Tango.DevIntrChange initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.DevIntrChangeHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.DevIntrChangeHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.DevIntrChangeHelper.write(_out, value);
	}
}
