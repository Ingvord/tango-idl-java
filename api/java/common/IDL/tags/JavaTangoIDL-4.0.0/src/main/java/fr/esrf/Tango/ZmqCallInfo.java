/**
 * Copyright (C) :     2004
 *
 *     European Synchrotron Radiation Facility
 *     BP 220, Grenoble 38043
 *     FRANCE
 *
 * This file is part of Tango.
 *
 * Tango is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Tango is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Tango.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.esrf.Tango;

/**
 *	Generated from IDL definition of struct "ZmqCallInfo"
 *	@author JacORB IDL compiler 
 */

public final class ZmqCallInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public ZmqCallInfo(){}
	public int version;
	public java.lang.String method_name = "";
	public byte[] oid;
	public boolean call_is_except;
	public ZmqCallInfo(int version, java.lang.String method_name, byte[] oid, boolean call_is_except)
	{
		this.version = version;
		this.method_name = method_name;
		this.oid = oid;
		this.call_is_except = call_is_except;
	}
}
