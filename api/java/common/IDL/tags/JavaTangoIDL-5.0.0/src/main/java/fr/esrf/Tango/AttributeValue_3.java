package fr.esrf.Tango;

/**
 * Generated from IDL struct "AttributeValue_3".
 *
 * @author JacORB IDL compiler V 3.5
 * @version generated at Sep 5, 2014 10:37:19 AM
 */

public final class AttributeValue_3
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public AttributeValue_3(){}
	public org.omg.CORBA.Any value;
	public fr.esrf.Tango.AttrQuality quality;
	public fr.esrf.Tango.TimeVal time;
	public java.lang.String name = "";
	public fr.esrf.Tango.AttributeDim r_dim;
	public fr.esrf.Tango.AttributeDim w_dim;
	public fr.esrf.Tango.DevError[] err_list;
	public AttributeValue_3(org.omg.CORBA.Any value, fr.esrf.Tango.AttrQuality quality, fr.esrf.Tango.TimeVal time, java.lang.String name, fr.esrf.Tango.AttributeDim r_dim, fr.esrf.Tango.AttributeDim w_dim, fr.esrf.Tango.DevError[] err_list)
	{
		this.value = value;
		this.quality = quality;
		this.time = time;
		this.name = name;
		this.r_dim = r_dim;
		this.w_dim = w_dim;
		this.err_list = err_list;
	}
}
