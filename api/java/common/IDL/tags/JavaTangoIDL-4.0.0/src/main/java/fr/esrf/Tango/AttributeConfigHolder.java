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
 *	Generated from IDL definition of struct "AttributeConfig"
 *	@author JacORB IDL compiler 
 */

public final class AttributeConfigHolder
	implements org.omg.CORBA.portable.Streamable
{
	public fr.esrf.Tango.AttributeConfig value;

	public AttributeConfigHolder ()
	{
	}
	public AttributeConfigHolder(final fr.esrf.Tango.AttributeConfig initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return fr.esrf.Tango.AttributeConfigHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = fr.esrf.Tango.AttributeConfigHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		fr.esrf.Tango.AttributeConfigHelper.write(_out, value);
	}
}
