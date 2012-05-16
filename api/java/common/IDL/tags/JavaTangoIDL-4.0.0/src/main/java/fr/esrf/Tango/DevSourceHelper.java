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

public final class DevSourceHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(fr.esrf.Tango.DevSourceHelper.id(),"DevSource",new String[]{"DEV","CACHE","CACHE_DEV"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final fr.esrf.Tango.DevSource s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static fr.esrf.Tango.DevSource extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:Tango/DevSource:1.0";
	}
	public static DevSource read (final org.omg.CORBA.portable.InputStream in)
	{
		return DevSource.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final DevSource s)
	{
		out.write_long(s.value());
	}
}
