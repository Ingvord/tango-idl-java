package fr.esrf.Tango;

/**
 * Generated from IDL struct "DevCmdInfo_2".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public final class DevCmdInfo_2
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DevCmdInfo_2(){}
	public java.lang.String cmd_name = "";
	public fr.esrf.Tango.DispLevel level;
	public int cmd_tag;
	public int in_type;
	public int out_type;
	public java.lang.String in_type_desc = "";
	public java.lang.String out_type_desc = "";
	public DevCmdInfo_2(java.lang.String cmd_name, fr.esrf.Tango.DispLevel level, int cmd_tag, int in_type, int out_type, java.lang.String in_type_desc, java.lang.String out_type_desc)
	{
		this.cmd_name = cmd_name;
		this.level = level;
		this.cmd_tag = cmd_tag;
		this.in_type = in_type;
		this.out_type = out_type;
		this.in_type_desc = in_type_desc;
		this.out_type_desc = out_type_desc;
	}
}
