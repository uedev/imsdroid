/*
* Copyright (C) 2010 Mamadou Diop.
*
* Contact: Mamadou Diop <diopmamadou(at)doubango.org>
*	
* This file is part of imsdroid Project (http://code.google.com/p/imsdroid)
*
* imsdroid is free software: you can redistribute it and/or modify it under the terms of 
* the GNU General Public License as published by the Free Software Foundation, either version 3 
* of the License, or (at your option) any later version.
*	
* imsdroid is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
* See the GNU General Public License for more details.
*	
* You should have received a copy of the GNU General Public License along 
* with this program; if not, write to the Free Software Foundation, Inc., 
* 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*
*/
package ietf.params.xml.ns.resource_lists;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


@Root(name="entry-ref", strict=false)
@Namespace(reference = "urn:ietf:params:xml:ns:resource-lists")
public class EntryRefType {

    @Element(name = "display-name")
    protected DisplayNameType displayName;
    @Attribute(required = true)
    protected String ref;
    
    public DisplayNameType getDisplayName() {
        return displayName;
    }
   
    public void setDisplayName(DisplayNameType value) {
        this.displayName = value;
    }
    
    public String getRef() {
        return ref;
    }
    
    public void setRef(String value) {
        this.ref = value;
    }
}
