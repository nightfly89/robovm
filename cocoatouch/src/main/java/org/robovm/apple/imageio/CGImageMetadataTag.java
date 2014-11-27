/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.imageio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ImageIO")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGImageMetadataTag/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGImageMetadataTagPtr extends Ptr<CGImageMetadataTag, CGImageMetadataTagPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGImageMetadataTag.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGImageMetadataTag() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCreate", optional=true)
    public static native CGImageMetadataTag create(String xmlns, String prefix, String name, CGImageMetadataType type, CFType value);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCopyNamespace", optional=true)
    public native String getNamespace();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCopyPrefix", optional=true)
    public native String getPrefix();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCopyName", optional=true)
    public native String getName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCopyValue", optional=true)
    public native CFType getValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagGetType", optional=true)
    public native CGImageMetadataType getType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Bridge(symbol="CGImageMetadataTagCopyQualifiers", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(CFArray.AsStringListMarshaler.class) List<String> getQualifiers();
    /*</methods>*/
}
