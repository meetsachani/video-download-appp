package o;

import java.io.IOException;
import java.io.StringReader;
import o.AbstractC5317bO0;
import o.C7842ll1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@Deprecated
/* renamed from: o.eO2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6046eO2 {
    public static final String a = "MotionPhotoXmpParser";
    public static final String[] b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @InterfaceC11300zs1
    public static C7842ll1 a(String str) throws IOException {
        try {
            return b(str);
        } catch (NumberFormatException | C3989Py1 | XmlPullParserException unused) {
            I31.n(a, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @InterfaceC11300zs1
    public static C7842ll1 b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (WN2.f(newPullParser, "x:xmpmeta")) {
            AbstractC5317bO0<C7842ll1.a> L = AbstractC5317bO0.L();
            long j = C10323vs.b;
            do {
                newPullParser.next();
                if (WN2.f(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j = e(newPullParser);
                    L = c(newPullParser);
                } else if (WN2.f(newPullParser, "Container:Directory")) {
                    L = f(newPullParser, "Container", "Item");
                } else if (WN2.f(newPullParser, "GContainer:Directory")) {
                    L = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!WN2.d(newPullParser, "x:xmpmeta"));
            if (L.isEmpty()) {
                return null;
            }
            return new C7842ll1(j, L);
        }
        throw C3989Py1.a("Couldn't find xmp metadata", null);
    }

    public static AbstractC5317bO0<C7842ll1.a> c(XmlPullParser xmlPullParser) {
        for (String str : d) {
            String a2 = WN2.a(xmlPullParser, str);
            if (a2 != null) {
                return AbstractC5317bO0.Q(new C7842ll1.a(C4128Rj1.R0, "Primary", 0L, 0L), new C7842ll1.a(C4128Rj1.f, "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return AbstractC5317bO0.L();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a2 = WN2.a(xmlPullParser, str);
            if (a2 != null) {
                if (Integer.parseInt(a2) != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String a2 = WN2.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return C10323vs.b;
                }
                return parseLong;
            }
        }
        return C10323vs.b;
    }

    public static AbstractC5317bO0<C7842ll1.a> f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, str3)) {
                String a2 = WN2.a(xmlPullParser, str2 + ":Mime");
                String a3 = WN2.a(xmlPullParser, str2 + ":Semantic");
                String a4 = WN2.a(xmlPullParser, str2 + ":Length");
                String a5 = WN2.a(xmlPullParser, str2 + ":Padding");
                if (a2 != null && a3 != null) {
                    long j2 = 0;
                    if (a4 != null) {
                        j = Long.parseLong(a4);
                    } else {
                        j = 0;
                    }
                    if (a5 != null) {
                        j2 = Long.parseLong(a5);
                    }
                    r.g(new C7842ll1.a(a2, a3, j, j2));
                } else {
                    return AbstractC5317bO0.L();
                }
            }
        } while (!WN2.d(xmlPullParser, str4));
        return r.e();
    }
}
