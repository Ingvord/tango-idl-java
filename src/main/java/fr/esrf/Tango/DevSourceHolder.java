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
 *	Generated from IDL definition of enum "DevSource"
 *	@author JacORB IDL compiler 
 */

public final class DevSourceHolder
	implements org.omg.CORBA.portable.Streamable
{
	public DevSource value;

	public DevSourceHolder ()
	{
	}
	public DevSourceHolder (final DevSource initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return DevSourceHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DevSourceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		DevSourceHelper.write (out,value);
	}
}
