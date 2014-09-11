package fr.esrf.Tango;

/**
 * Generated from IDL alias "DevVarFloatArray".
 *
 * @author JacORB IDL compiler V 3.5
 * @version generated at Sep 5, 2014 10:37:19 AM
 */

public abstract class DevVarFloatArrayHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, float[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static float[] extract (final org.omg.CORBA.Any any)
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
			synchronized(DevVarFloatArrayHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarFloatArrayHelper.id(), "DevVarFloatArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(6))));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:Tango/DevVarFloatArray:1.0";
	}
	public static float[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		float[] _result;
		int _l_result2 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result2 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result2);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new float[_l_result2];
		_in.read_float_array(_result,0,_l_result2);
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, float[] _s)
	{
		
		_out.write_long(_s.length);
		_out.write_float_array(_s,0,_s.length);
	}
}
