package fr.esrf.Tango;

/**
 * Generated from IDL alias "DevCmdInfoList".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DevCmdInfoListHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, fr.esrf.Tango.DevCmdInfo[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static fr.esrf.Tango.DevCmdInfo[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DevCmdInfoListHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevCmdInfoListHelper.id(), "DevCmdInfoList",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.DevCmdInfoHelper.id(),"DevCmdInfo",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("cmd_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("cmd_tag", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("in_type", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("out_type", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("in_type_desc", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("out_type_desc", org.omg.CORBA.ORB.init().create_string_tc(0), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:Tango/DevCmdInfoList:1.0";
	}
	public static fr.esrf.Tango.DevCmdInfo[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		fr.esrf.Tango.DevCmdInfo[] _result;
		int _l_result13 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result13 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result13);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new fr.esrf.Tango.DevCmdInfo[_l_result13];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=fr.esrf.Tango.DevCmdInfoHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, fr.esrf.Tango.DevCmdInfo[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			fr.esrf.Tango.DevCmdInfoHelper.write(_out,_s[i]);
		}

	}
}
