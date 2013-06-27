package fr.esrf.Tango;


/**
 * Generated from IDL interface "Device".
 *
 * @author JacORB IDL compiler V 3.1, 19-Aug-2012
 * @version generated at Dec 11, 2012 4:18:48 PM
 */

public abstract class DevicePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, fr.esrf.Tango.DeviceOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "write_attributes", Integer.valueOf(0));
		m_opsHash.put ( "_get_name", Integer.valueOf(1));
		m_opsHash.put ( "ping", Integer.valueOf(2));
		m_opsHash.put ( "_get_description", Integer.valueOf(3));
		m_opsHash.put ( "read_attributes", Integer.valueOf(4));
		m_opsHash.put ( "_get_adm_name", Integer.valueOf(5));
		m_opsHash.put ( "command_list_query", Integer.valueOf(6));
		m_opsHash.put ( "info", Integer.valueOf(7));
		m_opsHash.put ( "command_inout", Integer.valueOf(8));
		m_opsHash.put ( "_get_state", Integer.valueOf(9));
		m_opsHash.put ( "_get_status", Integer.valueOf(10));
		m_opsHash.put ( "set_attribute_config", Integer.valueOf(11));
		m_opsHash.put ( "black_box", Integer.valueOf(12));
		m_opsHash.put ( "get_attribute_config", Integer.valueOf(13));
		m_opsHash.put ( "command_query", Integer.valueOf(14));
	}
	private String[] ids = {"IDL:Tango/Device:1.0"};
	public fr.esrf.Tango.Device _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		fr.esrf.Tango.Device __r = fr.esrf.Tango.DeviceHelper.narrow(__o);
		if (__o != null && __o != __r)
		{
			((org.omg.CORBA.portable.ObjectImpl)__o)._set_delegate(null);

		}
		return __r;
	}
	public fr.esrf.Tango.Device _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		fr.esrf.Tango.Device __r = fr.esrf.Tango.DeviceHelper.narrow(__o);
		if (__o != null && __o != __r)
		{
			((org.omg.CORBA.portable.ObjectImpl)__o)._set_delegate(null);

		}
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // write_attributes
			{
			try
			{
				fr.esrf.Tango.AttributeValue[] _arg0=fr.esrf.Tango.AttributeValueListHelper.read(_input);
				_out = handler.createReply();
				write_attributes(_arg0);
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // _get_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult87 = name();
_out.write_string( tmpResult87 );
				break;
			}
			case 2: // ping
			{
			try
			{
				_out = handler.createReply();
				ping();
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // _get_description
			{
			_out = handler.createReply();
			java.lang.String tmpResult88 = description();
_out.write_string( tmpResult88 );
				break;
			}
			case 4: // read_attributes
			{
			try
			{
				java.lang.String[] _arg0=fr.esrf.Tango.DevVarStringArrayHelper.read(_input);
				_out = handler.createReply();
				fr.esrf.Tango.AttributeValueListHelper.write(_out,read_attributes(_arg0));
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // _get_adm_name
			{
			_out = handler.createReply();
			java.lang.String tmpResult89 = adm_name();
_out.write_string( tmpResult89 );
				break;
			}
			case 6: // command_list_query
			{
			try
			{
				_out = handler.createReply();
				fr.esrf.Tango.DevCmdInfoListHelper.write(_out,command_list_query());
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // info
			{
			try
			{
				_out = handler.createReply();
				fr.esrf.Tango.DevInfoHelper.write(_out,info());
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // command_inout
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				_out.write_any(command_inout(_arg0,_arg1));
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // _get_state
			{
			_out = handler.createReply();
			fr.esrf.Tango.DevStateHelper.write(_out,state());
				break;
			}
			case 10: // _get_status
			{
			_out = handler.createReply();
			java.lang.String tmpResult90 = status();
_out.write_string( tmpResult90 );
				break;
			}
			case 11: // set_attribute_config
			{
			try
			{
				fr.esrf.Tango.AttributeConfig[] _arg0=fr.esrf.Tango.AttributeConfigListHelper.read(_input);
				_out = handler.createReply();
				set_attribute_config(_arg0);
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // black_box
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				fr.esrf.Tango.DevVarStringArrayHelper.write(_out,black_box(_arg0));
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // get_attribute_config
			{
			try
			{
				java.lang.String[] _arg0=fr.esrf.Tango.DevVarStringArrayHelper.read(_input);
				_out = handler.createReply();
				fr.esrf.Tango.AttributeConfigListHelper.write(_out,get_attribute_config(_arg0));
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // command_query
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				fr.esrf.Tango.DevCmdInfoHelper.write(_out,command_query(_arg0));
			}
			catch(fr.esrf.Tango.DevFailed _ex0)
			{
				_out = handler.createExceptionReply();
				fr.esrf.Tango.DevFailedHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
