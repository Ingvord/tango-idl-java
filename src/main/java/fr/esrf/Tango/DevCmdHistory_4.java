package fr.esrf.Tango;

/**
 * Generated from IDL struct "DevCmdHistory_4".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at May 14, 2014 1:27:02 PM
 */

public final class DevCmdHistory_4
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public DevCmdHistory_4(){}
	public fr.esrf.Tango.TimeVal[] dates;
	public org.omg.CORBA.Any value;
	public fr.esrf.Tango.AttributeDim[] dims;
	public fr.esrf.Tango.EltInArray[] dims_array;
	public fr.esrf.Tango.DevError[][] errors;
	public fr.esrf.Tango.EltInArray[] errors_array;
	public int cmd_type;
	public DevCmdHistory_4(fr.esrf.Tango.TimeVal[] dates, org.omg.CORBA.Any value, fr.esrf.Tango.AttributeDim[] dims, fr.esrf.Tango.EltInArray[] dims_array, fr.esrf.Tango.DevError[][] errors, fr.esrf.Tango.EltInArray[] errors_array, int cmd_type)
	{
		this.dates = dates;
		this.value = value;
		this.dims = dims;
		this.dims_array = dims_array;
		this.errors = errors;
		this.errors_array = errors_array;
		this.cmd_type = cmd_type;
	}
}
