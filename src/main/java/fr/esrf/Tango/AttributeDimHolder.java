package fr.esrf.Tango;

/**
 * Generated from IDL struct "AttributeDim".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class AttributeDimHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.AttributeDim value;

	public AttributeDimHolder ()
	{
	}
	public AttributeDimHolder(final fr.esrf.Tango.AttributeDim initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.AttributeDimHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.AttributeDimHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.AttributeDimHelper.write(_out, value);
	}
}
