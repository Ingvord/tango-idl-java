package fr.esrf.Tango;

/**
 * Generated from IDL struct "DevCmdInfo_2".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DevCmdInfo_2Holder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevCmdInfo_2 value;

	public DevCmdInfo_2Holder ()
	{
	}
	public DevCmdInfo_2Holder(final fr.esrf.Tango.DevCmdInfo_2 initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.DevCmdInfo_2Helper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.DevCmdInfo_2Helper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.DevCmdInfo_2Helper.write(_out, value);
	}
}
