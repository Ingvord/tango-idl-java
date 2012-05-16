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
 *	Generated from IDL definition of alias "DevAttrHistoryList_3"
 *	@author JacORB IDL compiler 
 */

public final class DevAttrHistoryList_3Holder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.DevAttrHistory_3[] value;

	public DevAttrHistoryList_3Holder ()
	{
	}
	public DevAttrHistoryList_3Holder (final fr.esrf.Tango.DevAttrHistory_3[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DevAttrHistoryList_3Helper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DevAttrHistoryList_3Helper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DevAttrHistoryList_3Helper.write (out,value);
	}
}
