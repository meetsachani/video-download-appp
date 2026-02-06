package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class zzev {
    @InterfaceC11300zs1
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }
}
