package fr.esrf.Tango;


/**
 *	Generated from IDL definition of struct "EltInArray"
 *	@author JacORB IDL compiler 
 */

public final class EltInArrayHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.EltInArrayHelper.id(),"EltInArray",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("start", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("nb_elt", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esrf.Tango.EltInArray s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esrf.Tango.EltInArray extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:Tango/EltInArray:1.0";
	}
	public static fr.esrf.Tango.EltInArray read (final org.omg.CORBA.portable.InputStream in)
	{
		fr.esrf.Tango.EltInArray result = new fr.esrf.Tango.EltInArray();
		result.start=in.read_long();
		result.nb_elt=in.read_long();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.esrf.Tango.EltInArray s)
	{
		out.write_long(s.start);
		out.write_long(s.nb_elt);
	}
}
