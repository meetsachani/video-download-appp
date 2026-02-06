package o;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Deprecated
/* loaded from: classes2.dex */
public final class WN2 {
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

    @InterfaceC11300zs1
    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (c(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (e(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (e(xmlPullParser) && h(xmlPullParser.getName()).equals(str)) {
            return true;
        }
        return false;
    }

    public static String h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }
}
