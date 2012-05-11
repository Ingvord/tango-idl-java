package fr.esrf.Tango;
/**
 *	Generated from IDL definition of enum "DispLevel"
 *	@author JacORB IDL compiler 
 */

public final class DispLevelHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(fr.esrf.Tango.DispLevelHelper.id(),"DispLevel",new String[]{"OPERATOR","EXPERT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esrf.Tango.DispLevel s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esrf.Tango.DispLevel extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:Tango/DispLevel:1.0";
	}
	public static DispLevel read (final org.omg.CORBA.portable.InputStream in)
	{
		return DispLevel.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final DispLevel s)
	{
		out.write_long(s.value());
	}
}
