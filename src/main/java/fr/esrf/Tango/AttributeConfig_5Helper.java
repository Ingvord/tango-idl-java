package fr.esrf.Tango;


/**
 * Generated from IDL struct "AttributeConfig_5".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at May 14, 2014 1:27:02 PM
 */

public final class AttributeConfig_5Helper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AttributeConfig_5Helper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.AttributeConfig_5Helper.id(),"AttributeConfig_5",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("writable", org.omg.CORBA.ORB.init().create_enum_tc(fr.esrf.Tango.AttrWriteTypeHelper.id(),"AttrWriteType",new String[]{"READ","READ_WITH_WRITE","WRITE","READ_WRITE","WT_UNKNOWN"}), null),new org.omg.CORBA.StructMember("data_format", org.omg.CORBA.ORB.init().create_enum_tc(fr.esrf.Tango.AttrDataFormatHelper.id(),"AttrDataFormat",new String[]{"SCALAR","SPECTRUM","IMAGE","FMT_UNKNOWN"}), null),new org.omg.CORBA.StructMember("data_type", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("memorized", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("mem_init", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("max_dim_x", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("max_dim_y", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("description", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("label", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("standard_unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("display_unit", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("format", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("min_value", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("max_value", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("writable_attr_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("level", org.omg.CORBA.ORB.init().create_enum_tc(fr.esrf.Tango.DispLevelHelper.id(),"DispLevel",new String[]{"OPERATOR","EXPERT","DL_UNKNOWN"}), null),new org.omg.CORBA.StructMember("root_attr_name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("enum_labels", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("att_alarm", org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.AttributeAlarmHelper.id(),"AttributeAlarm",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("min_alarm", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("max_alarm", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("min_warning", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("max_warning", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("delta_t", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("delta_val", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)}), null),new org.omg.CORBA.StructMember("event_prop", org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.EventPropertiesHelper.id(),"EventProperties",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ch_event", org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.ChangeEventPropHelper.id(),"ChangeEventProp",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rel_change", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("abs_change", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)}), null),new org.omg.CORBA.StructMember("per_event", org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.PeriodicEventPropHelper.id(),"PeriodicEventProp",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)}), null),new org.omg.CORBA.StructMember("arch_event", org.omg.CORBA.ORB.init().create_struct_tc(fr.esrf.Tango.ArchiveEventPropHelper.id(),"ArchiveEventProp",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rel_change", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("abs_change", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("period", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)}), null)}), null),new org.omg.CORBA.StructMember("extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null),new org.omg.CORBA.StructMember("sys_extensions", org.omg.CORBA.ORB.init().create_alias_tc(fr.esrf.Tango.DevVarStringArrayHelper.id(), "DevVarStringArray",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_string_tc(0))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esrf.Tango.AttributeConfig_5 s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esrf.Tango.AttributeConfig_5 extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:Tango/AttributeConfig_5:1.0";
	}
	public static fr.esrf.Tango.AttributeConfig_5 read (final org.omg.CORBA.portable.InputStream in)
	{
		fr.esrf.Tango.AttributeConfig_5 result = new fr.esrf.Tango.AttributeConfig_5();
		result.name=in.read_string();
		result.writable=fr.esrf.Tango.AttrWriteTypeHelper.read(in);
		result.data_format=fr.esrf.Tango.AttrDataFormatHelper.read(in);
		result.data_type=in.read_long();
		result.memorized=in.read_boolean();
		result.mem_init=in.read_boolean();
		result.max_dim_x=in.read_long();
		result.max_dim_y=in.read_long();
		result.description=in.read_string();
		result.label=in.read_string();
		result.unit=in.read_string();
		result.standard_unit=in.read_string();
		result.display_unit=in.read_string();
		result.format=in.read_string();
		result.min_value=in.read_string();
		result.max_value=in.read_string();
		result.writable_attr_name=in.read_string();
		result.level=fr.esrf.Tango.DispLevelHelper.read(in);
		result.root_attr_name=in.read_string();
		result.enum_labels = fr.esrf.Tango.DevVarStringArrayHelper.read(in);
		result.att_alarm=fr.esrf.Tango.AttributeAlarmHelper.read(in);
		result.event_prop=fr.esrf.Tango.EventPropertiesHelper.read(in);
		result.extensions = fr.esrf.Tango.DevVarStringArrayHelper.read(in);
		result.sys_extensions = fr.esrf.Tango.DevVarStringArrayHelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final fr.esrf.Tango.AttributeConfig_5 s)
	{
		java.lang.String tmpResult64 = s.name;
out.write_string( tmpResult64 );
		fr.esrf.Tango.AttrWriteTypeHelper.write(out,s.writable);
		fr.esrf.Tango.AttrDataFormatHelper.write(out,s.data_format);
		out.write_long(s.data_type);
		out.write_boolean(s.memorized);
		out.write_boolean(s.mem_init);
		out.write_long(s.max_dim_x);
		out.write_long(s.max_dim_y);
		java.lang.String tmpResult65 = s.description;
out.write_string( tmpResult65 );
		java.lang.String tmpResult66 = s.label;
out.write_string( tmpResult66 );
		java.lang.String tmpResult67 = s.unit;
out.write_string( tmpResult67 );
		java.lang.String tmpResult68 = s.standard_unit;
out.write_string( tmpResult68 );
		java.lang.String tmpResult69 = s.display_unit;
out.write_string( tmpResult69 );
		java.lang.String tmpResult70 = s.format;
out.write_string( tmpResult70 );
		java.lang.String tmpResult71 = s.min_value;
out.write_string( tmpResult71 );
		java.lang.String tmpResult72 = s.max_value;
out.write_string( tmpResult72 );
		java.lang.String tmpResult73 = s.writable_attr_name;
out.write_string( tmpResult73 );
		fr.esrf.Tango.DispLevelHelper.write(out,s.level);
		java.lang.String tmpResult74 = s.root_attr_name;
out.write_string( tmpResult74 );
		fr.esrf.Tango.DevVarStringArrayHelper.write(out,s.enum_labels);
		fr.esrf.Tango.AttributeAlarmHelper.write(out,s.att_alarm);
		fr.esrf.Tango.EventPropertiesHelper.write(out,s.event_prop);
		fr.esrf.Tango.DevVarStringArrayHelper.write(out,s.extensions);
		fr.esrf.Tango.DevVarStringArrayHelper.write(out,s.sys_extensions);
	}
}
