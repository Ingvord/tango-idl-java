package fr.esrf.Tango;


/**
 * Generated from IDL interface "Device".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at May 14, 2014 1:27:02 PM
 */

public interface DeviceOperations
{
	/* constants */
	/* operations  */
	java.lang.String name();
	java.lang.String description();
	fr.esrf.Tango.DevState state();
	java.lang.String status();
	java.lang.String adm_name();
	org.omg.CORBA.Any command_inout(java.lang.String command, org.omg.CORBA.Any argin) throws fr.esrf.Tango.DevFailed;
	fr.esrf.Tango.AttributeConfig[] get_attribute_config(java.lang.String[] names) throws fr.esrf.Tango.DevFailed;
	void set_attribute_config(fr.esrf.Tango.AttributeConfig[] new_conf) throws fr.esrf.Tango.DevFailed;
	fr.esrf.Tango.AttributeValue[] read_attributes(java.lang.String[] names) throws fr.esrf.Tango.DevFailed;
	void write_attributes(fr.esrf.Tango.AttributeValue[] values) throws fr.esrf.Tango.DevFailed;
	void ping() throws fr.esrf.Tango.DevFailed;
	java.lang.String[] black_box(int n) throws fr.esrf.Tango.DevFailed;
	fr.esrf.Tango.DevInfo info() throws fr.esrf.Tango.DevFailed;
	fr.esrf.Tango.DevCmdInfo[] command_list_query() throws fr.esrf.Tango.DevFailed;
	fr.esrf.Tango.DevCmdInfo command_query(java.lang.String command) throws fr.esrf.Tango.DevFailed;
}
