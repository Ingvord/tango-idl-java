package fr.esrf.Tango;

/**
 *	Generated from IDL definition of struct "PeriodicEventProp"
 *	@author JacORB IDL compiler 
 */

public final class PeriodicEventPropHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.PeriodicEventProp value;

	public PeriodicEventPropHolder ()
	{
	}
	public PeriodicEventPropHolder(final fr.esrf.Tango.PeriodicEventProp initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.PeriodicEventPropHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.PeriodicEventPropHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.PeriodicEventPropHelper.write(_out, value);
	}
}
