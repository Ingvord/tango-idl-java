package fr.esrf.Tango;

/**
 * Generated from IDL struct "DevInfo_3".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DevInfo_3Holder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevInfo_3 value;

	public DevInfo_3Holder ()
	{
	}
	public DevInfo_3Holder(final fr.esrf.Tango.DevInfo_3 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.DevInfo_3Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.DevInfo_3Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.DevInfo_3Helper.write(_out, value);
	}
}
