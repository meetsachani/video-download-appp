package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import o.C10833xx0;
import o.C4086Qy1;
import o.C6960i70;
import o.C9286rb2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@Deprecated
/* renamed from: o.sb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9529sb2 implements C4086Qy1.a<C9286rb2> {
    public final XmlPullParserFactory a;

    /* renamed from: o.sb2$b */
    /* loaded from: classes2.dex */
    public static class b extends C3989Py1 {
        public b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* renamed from: o.sb2$c */
    /* loaded from: classes2.dex */
    public static class c extends a {
        public static final String h = "Protection";
        public static final String i = "ProtectionHeader";
        public static final String j = "SystemID";
        public static final int k = 8;
        public boolean e;
        public UUID f;
        public byte[] g;

        public c(a aVar, String str) {
            super(aVar, str, h);
        }

        public static C8858pr2[] q(byte[] bArr) {
            return new C8858pr2[]{new C8858pr2(true, null, 8, r(bArr), 0, 0, null)};
        }

        public static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < bArr.length; i2 += 2) {
                sb.append((char) bArr[i2]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        public static String s(String str) {
            if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }

        public static void t(byte[] bArr, int i2, int i3) {
            byte b = bArr[i2];
            bArr[i2] = bArr[i3];
            bArr[i3] = b;
        }

        @Override // o.C9529sb2.a
        public Object b() {
            UUID uuid = this.f;
            return new C9286rb2.a(uuid, DK1.a(uuid, this.g), q(this.g));
        }

        @Override // o.C9529sb2.a
        public boolean d(String str) {
            return i.equals(str);
        }

        @Override // o.C9529sb2.a
        public void h(XmlPullParser xmlPullParser) {
            if (i.equals(xmlPullParser.getName())) {
                this.e = false;
            }
        }

        @Override // o.C9529sb2.a
        public void n(XmlPullParser xmlPullParser) {
            if (i.equals(xmlPullParser.getName())) {
                this.e = true;
                this.f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, j)));
            }
        }

        @Override // o.C9529sb2.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.e) {
                this.g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: o.sb2$d */
    /* loaded from: classes2.dex */
    public static class d extends a {
        public static final String f = "QualityLevel";
        public static final String g = "Index";
        public static final String h = "Bitrate";
        public static final String i = "CodecPrivateData";
        public static final String j = "SamplingRate";
        public static final String k = "Channels";
        public static final String l = "FourCC";
        public static final String m = "Type";
        public static final String n = "Subtype";

        /* renamed from: o  reason: collision with root package name */
        public static final String f862o = "Language";
        public static final String p = "Name";
        public static final String q = "MaxWidth";
        public static final String r = "MaxHeight";
        public C10833xx0 e;

        public d(a aVar, String str) {
            super(aVar, str, f);
        }

        public static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] W = TD2.W(str);
                byte[][] j2 = JE.j(W);
                if (j2 == null) {
                    arrayList.add(W);
                    return arrayList;
                }
                Collections.addAll(arrayList, j2);
            }
            return arrayList;
        }

        @InterfaceC11300zs1
        public static String r(String str) {
            if (!str.equalsIgnoreCase(OV1.n) && !str.equalsIgnoreCase("X264") && !str.equalsIgnoreCase("AVC1") && !str.equalsIgnoreCase("DAVC")) {
                if (!str.equalsIgnoreCase("AAC") && !str.equalsIgnoreCase("AACL") && !str.equalsIgnoreCase("AACH") && !str.equalsIgnoreCase("AACP")) {
                    if (!str.equalsIgnoreCase("TTML") && !str.equalsIgnoreCase("DFXP")) {
                        if (!str.equalsIgnoreCase("ac-3") && !str.equalsIgnoreCase("dac3")) {
                            if (!str.equalsIgnoreCase("ec-3") && !str.equalsIgnoreCase("dec3")) {
                                if (str.equalsIgnoreCase("dtsc")) {
                                    return C4128Rj1.V;
                                }
                                if (!str.equalsIgnoreCase("dtsh") && !str.equalsIgnoreCase("dtsl")) {
                                    if (str.equalsIgnoreCase("dtse")) {
                                        return C4128Rj1.X;
                                    }
                                    if (str.equalsIgnoreCase("opus")) {
                                        return C4128Rj1.a0;
                                    }
                                    return null;
                                }
                                return C4128Rj1.W;
                            }
                            return C4128Rj1.R;
                        }
                        return C4128Rj1.Q;
                    }
                    return C4128Rj1.A0;
                }
                return "audio/mp4a-latm";
            }
            return "video/avc";
        }

        @Override // o.C9529sb2.a
        public Object b() {
            return this.e;
        }

        @Override // o.C9529sb2.a
        public void n(XmlPullParser xmlPullParser) throws C3989Py1 {
            int i2;
            C10833xx0.b bVar = new C10833xx0.b();
            String r2 = r(m(xmlPullParser, l));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.M(C4128Rj1.f).n0(k(xmlPullParser, "MaxWidth")).S(k(xmlPullParser, "MaxHeight")).V(q(xmlPullParser.getAttributeValue(null, i)));
            } else if (intValue == 1) {
                if (r2 == null) {
                    r2 = "audio/mp4a-latm";
                }
                int k2 = k(xmlPullParser, k);
                int k3 = k(xmlPullParser, j);
                List<byte[]> q2 = q(xmlPullParser.getAttributeValue(null, i));
                if (q2.isEmpty() && "audio/mp4a-latm".equals(r2)) {
                    q2 = Collections.singletonList(G.a(k3, k2));
                }
                bVar.M(C4128Rj1.E).J(k2).h0(k3).V(q2);
            } else if (intValue == 3) {
                String str = (String) c("Subtype");
                if (str != null) {
                    if (!str.equals("CAPT")) {
                        if (str.equals("DESC")) {
                            i2 = 1024;
                        }
                    } else {
                        i2 = 64;
                    }
                    bVar.M(C4128Rj1.q0).e0(i2);
                }
                i2 = 0;
                bVar.M(C4128Rj1.q0).e0(i2);
            } else {
                bVar.M(C4128Rj1.q0);
            }
            this.e = bVar.U(xmlPullParser.getAttributeValue(null, g)).W((String) c("Name")).g0(r2).I(k(xmlPullParser, h)).X((String) c("Language")).G();
        }
    }

    /* renamed from: o.sb2$e */
    /* loaded from: classes2.dex */
    public static class e extends a {
        public static final String n = "SmoothStreamingMedia";

        /* renamed from: o  reason: collision with root package name */
        public static final String f863o = "MajorVersion";
        public static final String p = "MinorVersion";
        public static final String q = "TimeScale";
        public static final String r = "DVRWindowLength";
        public static final String s = "Duration";
        public static final String t = "LookaheadCount";
        public static final String u = "IsLive";
        public final List<C9286rb2.b> e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
        public int k;
        public boolean l;
        @InterfaceC11300zs1
        public C9286rb2.a m;

        public e(a aVar, String str) {
            super(aVar, str, n);
            this.k = -1;
            this.m = null;
            this.e = new LinkedList();
        }

        @Override // o.C9529sb2.a
        public void a(Object obj) {
            boolean z;
            if (obj instanceof C9286rb2.b) {
                this.e.add((C9286rb2.b) obj);
            } else if (obj instanceof C9286rb2.a) {
                if (this.m == null) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                this.m = (C9286rb2.a) obj;
            }
        }

        @Override // o.C9529sb2.a
        public Object b() {
            int size = this.e.size();
            C9286rb2.b[] bVarArr = new C9286rb2.b[size];
            this.e.toArray(bVarArr);
            if (this.m != null) {
                C9286rb2.a aVar = this.m;
                C6960i70 c6960i70 = new C6960i70(new C6960i70.b(aVar.a, C4128Rj1.f, aVar.b));
                for (int i = 0; i < size; i++) {
                    C9286rb2.b bVar = bVarArr[i];
                    int i2 = bVar.a;
                    if (i2 == 2 || i2 == 1) {
                        C10833xx0[] c10833xx0Arr = bVar.j;
                        for (int i3 = 0; i3 < c10833xx0Arr.length; i3++) {
                            c10833xx0Arr[i3] = c10833xx0Arr[i3].b().O(c6960i70).G();
                        }
                    }
                }
            }
            return new C9286rb2(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, bVarArr);
        }

        @Override // o.C9529sb2.a
        public void n(XmlPullParser xmlPullParser) throws C3989Py1 {
            this.f = k(xmlPullParser, f863o);
            this.g = k(xmlPullParser, p);
            this.h = j(xmlPullParser, "TimeScale", 10000000L);
            this.i = l(xmlPullParser, s);
            this.j = j(xmlPullParser, r, 0L);
            this.k = i(xmlPullParser, t, -1);
            this.l = g(xmlPullParser, u, false);
            p("TimeScale", Long.valueOf(this.h));
        }
    }

    /* renamed from: o.sb2$f */
    /* loaded from: classes2.dex */
    public static class f extends a {
        public static final String A = "Url";
        public static final String B = "MaxWidth";
        public static final String C = "MaxHeight";
        public static final String D = "DisplayWidth";
        public static final String E = "DisplayHeight";
        public static final String F = "Language";
        public static final String G = "TimeScale";
        public static final String H = "d";
        public static final String I = "t";
        public static final String J = "r";
        public static final String s = "StreamIndex";
        public static final String t = "c";
        public static final String u = "Type";
        public static final String v = "audio";
        public static final String w = "video";
        public static final String x = "text";
        public static final String y = "Subtype";
        public static final String z = "Name";
        public final String e;
        public final List<C10833xx0> f;
        public int g;
        public String h;
        public long i;
        public String j;
        public String k;
        public int l;
        public int m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f864o;
        public String p;
        public ArrayList<Long> q;
        public long r;

        public f(a aVar, String str) {
            super(aVar, str, s);
            this.e = str;
            this.f = new LinkedList();
        }

        @Override // o.C9529sb2.a
        public void a(Object obj) {
            if (obj instanceof C10833xx0) {
                this.f.add((C10833xx0) obj);
            }
        }

        @Override // o.C9529sb2.a
        public Object b() {
            C10833xx0[] c10833xx0Arr = new C10833xx0[this.f.size()];
            this.f.toArray(c10833xx0Arr);
            return new C9286rb2.b(this.e, this.k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.f864o, this.p, c10833xx0Arr, this.q, this.r);
        }

        @Override // o.C9529sb2.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // o.C9529sb2.a
        public void n(XmlPullParser xmlPullParser) throws C3989Py1 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws C3989Py1 {
            int s2 = s(xmlPullParser);
            this.g = s2;
            p("Type", Integer.valueOf(s2));
            if (this.g == 3) {
                this.h = m(xmlPullParser, "Subtype");
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            p("Subtype", this.h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.j = attributeValue;
            p("Name", attributeValue);
            this.k = m(xmlPullParser, A);
            this.l = i(xmlPullParser, "MaxWidth", -1);
            this.m = i(xmlPullParser, "MaxHeight", -1);
            this.n = i(xmlPullParser, D, -1);
            this.f864o = i(xmlPullParser, E, -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue2;
            p("Language", attributeValue2);
            long i = i(xmlPullParser, "TimeScale", -1);
            this.i = i;
            if (i == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        public final void r(XmlPullParser xmlPullParser) throws C3989Py1 {
            int size = this.q.size();
            long j = j(xmlPullParser, "t", C10323vs.b);
            int i = 1;
            if (j == C10323vs.b) {
                if (size == 0) {
                    j = 0;
                } else if (this.r != -1) {
                    j = this.r + this.q.get(size - 1).longValue();
                } else {
                    throw C3989Py1.c("Unable to infer start time", null);
                }
            }
            this.q.add(Long.valueOf(j));
            this.r = j(xmlPullParser, "d", C10323vs.b);
            long j2 = j(xmlPullParser, "r", 1L);
            if (j2 > 1 && this.r == C10323vs.b) {
                throw C3989Py1.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j3 = i;
                if (j3 < j2) {
                    this.q.add(Long.valueOf((this.r * j3) + j));
                    i++;
                } else {
                    return;
                }
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws C3989Py1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw C3989Py1.c("Invalid key value[" + attributeValue + C6566gU0.g, null);
            }
            throw new b("Type");
        }
    }

    public C9529sb2() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // o.C4086Qy1.a
    /* renamed from: b */
    public C9286rb2 a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C9286rb2) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e2) {
            throw C3989Py1.c(null, e2);
        }
    }

    /* renamed from: o.sb2$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final String a;
        public final String b;
        @InterfaceC11300zs1
        public final a c;
        public final List<Pair<String, Object>> d = new LinkedList();

        public a(@InterfaceC11300zs1 a aVar, String str, String str2) {
            this.c = aVar;
            this.a = str;
            this.b = str2;
        }

        public abstract Object b();

        @InterfaceC11300zs1
        public final Object c(String str) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair<String, Object> pair = this.d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if (d.f.equals(str)) {
                return new d(aVar, str2);
            }
            if (c.h.equals(str)) {
                return new c(aVar, str2);
            }
            if (f.s.equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType != 1) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            if (eventType == 4 && z && i == 0) {
                                o(xmlPullParser);
                            }
                        } else if (!z) {
                            continue;
                        } else if (i > 0) {
                            i--;
                        } else {
                            String name = xmlPullParser.getName();
                            h(xmlPullParser);
                            if (!d(name)) {
                                return b();
                            }
                        }
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (this.b.equals(name2)) {
                            n(xmlPullParser);
                            z = true;
                        } else if (z) {
                            if (i > 0) {
                                i++;
                            } else if (d(name2)) {
                                n(xmlPullParser);
                            } else {
                                a e = e(this, name2, this.a);
                                if (e == null) {
                                    i = 1;
                                } else {
                                    a(e.f(xmlPullParser));
                                }
                            }
                        }
                    }
                    xmlPullParser.next();
                } else {
                    return null;
                }
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return Boolean.parseBoolean(attributeValue);
            }
            return z;
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i) throws C3989Py1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw C3989Py1.c(null, e);
                }
            }
            return i;
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j) throws C3989Py1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw C3989Py1.c(null, e);
                }
            }
            return j;
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws C3989Py1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw C3989Py1.c(null, e);
                }
            }
            throw new b(str);
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws C3989Py1 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw C3989Py1.c(null, e);
                }
            }
            throw new b(str);
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        public final void p(String str, @InterfaceC11300zs1 Object obj) {
            this.d.add(Pair.create(str, obj));
        }

        public void a(Object obj) {
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public void n(XmlPullParser xmlPullParser) throws C3989Py1 {
        }

        public void o(XmlPullParser xmlPullParser) {
        }
    }
}
