package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import o.C4128Rj1;
import o.C6046eO2;
import o.InterfaceC11300zs1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
final class zzagh {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r7 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        r7 = -9223372036854775807L;
     */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzagd a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzev.c(newPullParser, "x:xmpmeta")) {
                zzfyc F = zzfyc.F();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (!zzev.c(newPullParser, "rdf:Description")) {
                        if (zzev.c(newPullParser, "Container:Directory")) {
                            F = b(newPullParser, "Container", "Item");
                        } else if (zzev.c(newPullParser, "GContainer:Directory")) {
                            F = b(newPullParser, "GContainer", "GContainerItem");
                        }
                    } else {
                        String[] strArr = a;
                        int i = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            String a2 = zzev.a(newPullParser, strArr[i2]);
                            if (a2 != null) {
                                if (Integer.parseInt(a2) != 1) {
                                    return null;
                                }
                                String[] strArr2 = b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a3 = zzev.a(newPullParser, strArr2[i3]);
                                    if (a3 != null) {
                                        j = Long.parseLong(a3);
                                    } else {
                                        i3++;
                                    }
                                }
                                String[] strArr3 = c;
                                while (true) {
                                    if (i < 2) {
                                        String a4 = zzev.a(newPullParser, strArr3[i]);
                                        if (a4 != null) {
                                            F = zzfyc.H(new zzagc(C4128Rj1.R0, "Primary", 0L, 0L), new zzagc(C4128Rj1.f, "MotionPhoto", Long.parseLong(a4), 0L));
                                            break;
                                        }
                                        i++;
                                    } else {
                                        F = zzfyc.F();
                                        break;
                                    }
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    }
                } while (!zzev.b(newPullParser, "x:xmpmeta"));
                if (F.isEmpty()) {
                    return null;
                }
                return new zzagd(j2, F);
            }
            throw zzaz.a("Couldn't find xmp metadata", null);
        } catch (zzaz | NumberFormatException | XmlPullParserException unused) {
            zzdx.f(C6046eO2.a, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static zzfyc b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        int i = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzev.c(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String a2 = zzev.a(xmlPullParser, concat2);
                String a3 = zzev.a(xmlPullParser, concat3);
                String a4 = zzev.a(xmlPullParser, concat4);
                String a5 = zzev.a(xmlPullParser, concat5);
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
                    zzfxzVar.g(new zzagc(a2, a3, j, j2));
                } else {
                    return zzfyc.F();
                }
            }
        } while (!zzev.b(xmlPullParser, str.concat(":Directory")));
        return zzfxzVar.j();
    }
}
