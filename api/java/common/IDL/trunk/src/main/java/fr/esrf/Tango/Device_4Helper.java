package fr.esrf.Tango;


/**
 *	Generated from IDL interface "Device_4"
 *	@author JacORB IDL compiler V 2.2, 7-May-2004
 */

public final class Device_4Helper
{
	public static void insert (final org.omg.CORBA.Any any, final fr.esrf.Tango.Device_4 s)
	{
			any.insert_Object(s);
	}
	public static fr.esrf.Tango.Device_4 extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:Tango/Device_4:1.0", "Device_4");
	}
	public static String id()
	{
		return "IDL:Tango/Device_4:1.0";
	}
	public static Device_4 read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final fr.esrf.Tango.Device_4 s)
	{
		_out.write_Object(s);
	}
	public static fr.esrf.Tango.Device_4 narrow(final java.lang.Object obj)
	{
		if (obj instanceof fr.esrf.Tango.Device_4)
		{
			return (fr.esrf.Tango.Device_4)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static fr.esrf.Tango.Device_4 narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (fr.esrf.Tango.Device_4)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:Tango/Device_4:1.0"))
			{
				fr.esrf.Tango._Device_4Stub stub;
				stub = new fr.esrf.Tango._Device_4Stub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static fr.esrf.Tango.Device_4 unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (fr.esrf.Tango.Device_4)obj;
		}
		catch (ClassCastException c)
		{
				fr.esrf.Tango._Device_4Stub stub;
				stub = new fr.esrf.Tango._Device_4Stub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
