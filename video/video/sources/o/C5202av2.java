package o;

import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

@Deprecated
/* renamed from: o.av2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5202av2 extends AbstractC5012a82 {
    public static final int E = 30;
    public static final String p = "TtmlDecoder";
    public static final String q = "http://www.w3.org/ns/ttml#parameter";
    public static final String r = "begin";
    public static final String s = "dur";
    public static final String t = "end";
    public static final String u = "style";
    public static final String v = "region";
    public static final String w = "backgroundImage";

    /* renamed from: o  reason: collision with root package name */
    public final XmlPullParserFactory f696o;
    public static final Pattern x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern B = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern C = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern D = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b F = new b(30.0f, 1, 1);
    public static final a G = new a(32, 15);

    /* renamed from: o.av2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: o.av2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final float a;
        public final int b;
        public final int c;

        public b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: o.av2$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public C5202av2() {
        super(p);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f696o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static C6172ev2 C(@InterfaceC11300zs1 C6172ev2 c6172ev2) {
        if (c6172ev2 == null) {
            return new C6172ev2();
        }
        return c6172ev2;
    }

    public static boolean D(String str) {
        if (!str.equals(C5445bv2.n) && !str.equals(C5445bv2.f701o) && !str.equals("body") && !str.equals(C5445bv2.q) && !str.equals("p") && !str.equals(C5445bv2.s) && !str.equals("br") && !str.equals("style") && !str.equals(C5445bv2.v) && !str.equals(C5445bv2.w) && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals(C5445bv2.B)) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    public static Layout.Alignment E(String str) {
        String g = C8077mf.g(str);
        g.getClass();
        char c2 = 65535;
        switch (g.hashCode()) {
            case -1364013995:
                if (g.equals(C5445bv2.m0)) {
                    c2 = 0;
                    break;
                }
                break;
            case 100571:
                if (g.equals("end")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3317767:
                if (g.equals("left")) {
                    c2 = 2;
                    break;
                }
                break;
            case 108511772:
                if (g.equals(C5445bv2.n0)) {
                    c2 = 3;
                    break;
                }
                break;
            case 109757538:
                if (g.equals("start")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a F(XmlPullParser xmlPullParser, a aVar) throws C4217Sg2 {
        String attributeValue = xmlPullParser.getAttributeValue(q, "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = D.matcher(attributeValue);
        if (!matcher.matches()) {
            I31.n(p, "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) C9542sf.g(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C9542sf.g(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            throw new C4217Sg2("Invalid cell resolution " + parseInt + C4500Ve2.b + parseInt2);
        } catch (NumberFormatException unused) {
            I31.n(p, "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    public static void G(String str, C6172ev2 c6172ev2) throws C4217Sg2 {
        Matcher matcher;
        String[] J1 = TD2.J1(str, "\\s+");
        if (J1.length == 1) {
            matcher = z.matcher(str);
        } else if (J1.length == 2) {
            matcher = z.matcher(J1[1]);
            I31.n(p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C4217Sg2("Invalid number of entries for fontSize: " + J1.length + UE.h);
        }
        if (matcher.matches()) {
            String str2 = (String) C9542sf.g(matcher.group(3));
            str2.getClass();
            char c2 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals(com.facebook.appevents.Q.k)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    c6172ev2.A(3);
                    break;
                case 1:
                    c6172ev2.A(2);
                    break;
                case 2:
                    c6172ev2.A(1);
                    break;
                default:
                    throw new C4217Sg2("Invalid unit for fontSize: '" + str2 + "'.");
            }
            c6172ev2.z(Float.parseFloat((String) C9542sf.g(matcher.group(1))));
            return;
        }
        throw new C4217Sg2("Invalid expression for fontSize: '" + str + "'.");
    }

    public static b H(XmlPullParser xmlPullParser) throws C4217Sg2 {
        int i;
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(q, "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(q, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] J1 = TD2.J1(attributeValue2, C4500Ve2.b);
            if (J1.length == 2) {
                f = Integer.parseInt(J1[0]) / Integer.parseInt(J1[1]);
            } else {
                throw new C4217Sg2("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        b bVar = F;
        int i2 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue(q, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue(q, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(i * f, i2, i3);
    }

    public static Map<String, C6172ev2> I(XmlPullParser xmlPullParser, Map<String, C6172ev2> map, a aVar, @InterfaceC11300zs1 c cVar, Map<String, C5687cv2> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "style")) {
                String a2 = WN2.a(xmlPullParser, "style");
                C6172ev2 N = N(xmlPullParser, new C6172ev2());
                if (a2 != null) {
                    for (String str : O(a2)) {
                        N.a(map.get(str));
                    }
                }
                String g = N.g();
                if (g != null) {
                    map.put(g, N);
                }
            } else if (WN2.f(xmlPullParser, "region")) {
                C5687cv2 L = L(xmlPullParser, aVar, cVar);
                if (L != null) {
                    map2.put(L.a, L);
                }
            } else if (WN2.f(xmlPullParser, "metadata")) {
                J(xmlPullParser, map3);
            }
        } while (!WN2.d(xmlPullParser, C5445bv2.f701o));
        return map;
    }

    public static void J(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a2;
        do {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "image") && (a2 = WN2.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!WN2.d(xmlPullParser, "metadata"));
    }

    public static C5445bv2 K(XmlPullParser xmlPullParser, @InterfaceC11300zs1 C5445bv2 c5445bv2, Map<String, C5687cv2> map, b bVar) throws C4217Sg2 {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String str = null;
        C6172ev2 N = N(xmlPullParser2, null);
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        String[] strArr = null;
        String str2 = "";
        int i = 0;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            int i2 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.getClass();
            char c2 = 65535;
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals(s)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals(r)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals(w)) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                    i++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i2;
                case 1:
                    j3 = P(attributeValue, bVar);
                    break;
                case 2:
                    j2 = P(attributeValue, bVar);
                    break;
                case 3:
                    j = P(attributeValue, bVar);
                    break;
                case 4:
                    String[] O = O(attributeValue);
                    if (O.length > 0) {
                        strArr = O;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i2;
        }
        if (c5445bv2 != null) {
            long j4 = c5445bv2.d;
            if (j4 != C10323vs.b) {
                if (j != C10323vs.b) {
                    j += j4;
                }
                if (j2 != C10323vs.b) {
                    j2 += j4;
                }
            }
        }
        long j5 = j;
        if (j2 == C10323vs.b) {
            if (j3 != C10323vs.b) {
                j2 = j5 + j3;
            } else if (c5445bv2 != null) {
                long j6 = c5445bv2.e;
                if (j6 != C10323vs.b) {
                    j2 = j6;
                }
            }
        }
        return C5445bv2.c(xmlPullParser.getName(), j5, j2, N, strArr, str2, str, c5445bv2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01aa, code lost:
        if (r0.equals("tb") == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5687cv2 L(XmlPullParser xmlPullParser, a aVar, @InterfaceC11300zs1 c cVar) {
        float parseFloat;
        float parseFloat2;
        float parseFloat3;
        float parseFloat4;
        a aVar2;
        int i;
        float f;
        String a2;
        int i2;
        String a3 = WN2.a(xmlPullParser, "id");
        if (a3 == null) {
            return null;
        }
        String a4 = WN2.a(xmlPullParser, "origin");
        if (a4 != null) {
            Pattern pattern = B;
            Matcher matcher = pattern.matcher(a4);
            Pattern pattern2 = C;
            Matcher matcher2 = pattern2.matcher(a4);
            int i3 = 2;
            if (matcher.matches()) {
                try {
                    parseFloat = Float.parseFloat((String) C9542sf.g(matcher.group(1))) / 100.0f;
                    parseFloat2 = Float.parseFloat((String) C9542sf.g(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    I31.n(p, "Ignoring region with malformed origin: " + a4);
                    return null;
                }
            } else if (matcher2.matches()) {
                if (cVar == null) {
                    I31.n(p, "Ignoring region with missing tts:extent: " + a4);
                    return null;
                }
                try {
                    int parseInt = Integer.parseInt((String) C9542sf.g(matcher2.group(1)));
                    float f2 = parseInt / cVar.a;
                    float parseInt2 = Integer.parseInt((String) C9542sf.g(matcher2.group(2))) / cVar.b;
                    parseFloat = f2;
                    parseFloat2 = parseInt2;
                } catch (NumberFormatException unused2) {
                    I31.n(p, "Ignoring region with malformed origin: " + a4);
                    return null;
                }
            } else {
                I31.n(p, "Ignoring region with unsupported origin: " + a4);
                return null;
            }
            String a5 = WN2.a(xmlPullParser, C5445bv2.F);
            if (a5 != null) {
                Matcher matcher3 = pattern.matcher(a5);
                Matcher matcher4 = pattern2.matcher(a5);
                if (matcher3.matches()) {
                    try {
                        parseFloat3 = Float.parseFloat((String) C9542sf.g(matcher3.group(1))) / 100.0f;
                        parseFloat4 = Float.parseFloat((String) C9542sf.g(matcher3.group(2))) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        I31.n(p, "Ignoring region with malformed extent: " + a4);
                        return null;
                    }
                } else if (matcher4.matches()) {
                    if (cVar == null) {
                        I31.n(p, "Ignoring region with missing tts:extent: " + a4);
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt((String) C9542sf.g(matcher4.group(1)));
                        float f3 = parseInt3 / cVar.a;
                        parseFloat4 = Integer.parseInt((String) C9542sf.g(matcher4.group(2))) / cVar.b;
                        parseFloat3 = f3;
                    } catch (NumberFormatException unused4) {
                        I31.n(p, "Ignoring region with malformed extent: " + a4);
                        return null;
                    }
                } else {
                    I31.n(p, "Ignoring region with unsupported extent: " + a4);
                    return null;
                }
                float f4 = parseFloat4;
                String a6 = WN2.a(xmlPullParser, C5445bv2.G);
                boolean z2 = false;
                if (a6 != null) {
                    String g = C8077mf.g(a6);
                    g.getClass();
                    if (!g.equals(C5445bv2.m0)) {
                        if (g.equals(C5445bv2.d0)) {
                            aVar2 = aVar;
                            f = parseFloat2 + f4;
                            i = 2;
                        }
                    } else {
                        aVar2 = aVar;
                        f = parseFloat2 + (f4 / 2.0f);
                        i = 1;
                    }
                    float f5 = 1.0f / aVar2.b;
                    a2 = WN2.a(xmlPullParser, C5445bv2.T);
                    if (a2 != null) {
                        String g2 = C8077mf.g(a2);
                        g2.getClass();
                        switch (g2.hashCode()) {
                            case 3694:
                                break;
                            case 3553396:
                                if (g2.equals(C5445bv2.t0)) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 3553576:
                                if (g2.equals(C5445bv2.u0)) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            default:
                                z2 = true;
                                break;
                        }
                        switch (z2) {
                            case false:
                            case true:
                                i2 = i3;
                                break;
                            case true:
                                i2 = 1;
                                break;
                        }
                        return new C5687cv2(a3, parseFloat, f, 0, i, parseFloat3, f4, 1, f5, i2);
                    }
                    i3 = Integer.MIN_VALUE;
                    i2 = i3;
                    return new C5687cv2(a3, parseFloat, f, 0, i, parseFloat3, f4, 1, f5, i2);
                }
                aVar2 = aVar;
                i = 0;
                f = parseFloat2;
                float f52 = 1.0f / aVar2.b;
                a2 = WN2.a(xmlPullParser, C5445bv2.T);
                if (a2 != null) {
                }
                i3 = Integer.MIN_VALUE;
                i2 = i3;
                return new C5687cv2(a3, parseFloat, f, 0, i, parseFloat3, f4, 1, f52, i2);
            }
            I31.n(p, "Ignoring region without an extent");
            return null;
        }
        I31.n(p, "Ignoring region without an origin");
        return null;
    }

    public static float M(String str) {
        Matcher matcher = A.matcher(str);
        if (!matcher.matches()) {
            I31.n(p, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C9542sf.g(matcher.group(1)))));
        } catch (NumberFormatException e) {
            I31.o(p, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
        if (r3.equals("text") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6172ev2 N(XmlPullParser xmlPullParser, C6172ev2 c6172ev2) {
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            char c3 = 5;
            char c4 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(C5445bv2.I)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(C5445bv2.K)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(C5445bv2.Q)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(C5445bv2.P)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(C5445bv2.L)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals(C5445bv2.U)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals(C5445bv2.R)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(C5445bv2.J)) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals(C5445bv2.S)) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals(C5445bv2.O)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(C5445bv2.H)) {
                        c2 = C8206nB.d;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals(C5445bv2.V)) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    c6172ev2 = C(c6172ev2).C("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    c6172ev2 = C(c6172ev2).y(attributeValue);
                    break;
                case 2:
                    c6172ev2 = C(c6172ev2).I(E(attributeValue));
                    break;
                case 3:
                    String g = C8077mf.g(attributeValue);
                    g.getClass();
                    switch (g.hashCode()) {
                        case -1461280213:
                            if (g.equals(C5445bv2.i0)) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (g.equals("underline")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (g.equals(C5445bv2.g0)) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (g.equals(C5445bv2.f0)) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c4) {
                        case 0:
                            c6172ev2 = C(c6172ev2).L(false);
                            continue;
                        case 1:
                            c6172ev2 = C(c6172ev2).L(true);
                            continue;
                        case 2:
                            c6172ev2 = C(c6172ev2).D(false);
                            continue;
                        case 3:
                            c6172ev2 = C(c6172ev2).D(true);
                            continue;
                    }
                case 4:
                    c6172ev2 = C(c6172ev2).w("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        c6172ev2 = C(c6172ev2).B(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String g2 = C8077mf.g(attributeValue);
                    g2.getClass();
                    switch (g2.hashCode()) {
                        case -618561360:
                            if (g2.equals(C5445bv2.Y)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (g2.equals(C5445bv2.W)) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (g2.equals(C5445bv2.b0)) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (g2.equals(C5445bv2.a0)) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (g2.equals(C5445bv2.X)) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 4:
                            c6172ev2 = C(c6172ev2).G(2);
                            continue;
                        case 1:
                            c6172ev2 = C(c6172ev2).G(1);
                            continue;
                        case 2:
                            c6172ev2 = C(c6172ev2).G(4);
                            continue;
                        case 3:
                        case 5:
                            c6172ev2 = C(c6172ev2).G(3);
                            continue;
                    }
                case 7:
                    c6172ev2 = C(c6172ev2);
                    try {
                        c6172ev2.x(C5769dG.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        I31.n(p, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    c6172ev2 = C(c6172ev2).H(M(attributeValue));
                    break;
                case '\t':
                    String g3 = C8077mf.g(attributeValue);
                    g3.getClass();
                    if (!g3.equals("all")) {
                        if (g3.equals("none")) {
                            c6172ev2 = C(c6172ev2).J(false);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        c6172ev2 = C(c6172ev2).J(true);
                        break;
                    }
                case '\n':
                    try {
                        c6172ev2 = C(c6172ev2);
                        G(attributeValue, c6172ev2);
                        break;
                    } catch (C4217Sg2 unused2) {
                        I31.n(p, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    c6172ev2 = C(c6172ev2).K(C10791xm2.a(attributeValue));
                    break;
                case '\f':
                    String g4 = C8077mf.g(attributeValue);
                    g4.getClass();
                    if (!g4.equals(C5445bv2.c0)) {
                        if (g4.equals(C5445bv2.d0)) {
                            c6172ev2 = C(c6172ev2).F(2);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        c6172ev2 = C(c6172ev2).F(1);
                        break;
                    }
                case '\r':
                    c6172ev2 = C(c6172ev2);
                    try {
                        c6172ev2.v(C5769dG.c(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        I31.n(p, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    c6172ev2 = C(c6172ev2).E(E(attributeValue));
                    break;
            }
        }
        return c6172ev2;
    }

    public static String[] O(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return TD2.J1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long P(String str, b bVar) throws C4217Sg2 {
        double d;
        double d2;
        double d3;
        double d4;
        String group;
        Matcher matcher = x.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            double parseLong = (Long.parseLong((String) C9542sf.g(matcher.group(1))) * 3600) + (Long.parseLong((String) C9542sf.g(matcher.group(2))) * 60) + Long.parseLong((String) C9542sf.g(matcher.group(3)));
            String group2 = matcher.group(4);
            double d5 = 0.0d;
            if (group2 != null) {
                d3 = Double.parseDouble(group2);
            } else {
                d3 = 0.0d;
            }
            double d6 = parseLong + d3;
            String group3 = matcher.group(5);
            if (group3 != null) {
                d4 = ((float) Long.parseLong(group3)) / bVar.a;
            } else {
                d4 = 0.0d;
            }
            double d7 = d6 + d4;
            if (matcher.group(6) != null) {
                d5 = (Long.parseLong(group) / bVar.b) / bVar.a;
            }
            return (long) ((d7 + d5) * 1000000.0d);
        }
        Matcher matcher2 = y.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble((String) C9542sf.g(matcher2.group(1)));
            String str2 = (String) C9542sf.g(matcher2.group(2));
            str2.getClass();
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals("f")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104:
                    if (str2.equals(C10901yE.i)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109:
                    if (str2.equals("m")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 116:
                    if (str2.equals("t")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    d = bVar.a;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d2 = 3600.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d2 = 60.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d = bVar.c;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        throw new C4217Sg2("Malformed time expression: " + str);
    }

    @InterfaceC11300zs1
    public static c Q(XmlPullParser xmlPullParser) {
        String a2 = WN2.a(xmlPullParser, C5445bv2.F);
        if (a2 == null) {
            return null;
        }
        Matcher matcher = C.matcher(a2);
        if (!matcher.matches()) {
            I31.n(p, "Ignoring non-pixel tts extent: " + a2);
            return null;
        }
        try {
            return new c(Integer.parseInt((String) C9542sf.g(matcher.group(1))), Integer.parseInt((String) C9542sf.g(matcher.group(2))));
        } catch (NumberFormatException unused) {
            I31.n(p, "Ignoring malformed tts extent: " + a2);
            return null;
        }
    }

    @Override // o.AbstractC5012a82
    public InterfaceC4020Qg2 A(byte[] bArr, int i, boolean z2) throws C4217Sg2 {
        try {
            XmlPullParser newPullParser = this.f696o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C5687cv2(""));
            int i2 = 0;
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar = F;
            a aVar = G;
            C6415fv2 c6415fv2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C5445bv2 c5445bv2 = (C5445bv2) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (C5445bv2.n.equals(name)) {
                            bVar = H(newPullParser);
                            aVar = F(newPullParser, G);
                            cVar = Q(newPullParser);
                        }
                        b bVar2 = bVar;
                        c cVar2 = cVar;
                        a aVar2 = aVar;
                        if (!D(name)) {
                            I31.h(p, "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if (C5445bv2.f701o.equals(name)) {
                                I(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    C5445bv2 K = K(newPullParser, c5445bv2, hashMap2, bVar2);
                                    arrayDeque.push(K);
                                    if (c5445bv2 != null) {
                                        c5445bv2.a(K);
                                    }
                                } catch (C4217Sg2 e) {
                                    I31.o(p, "Suppressing parser error", e);
                                }
                            }
                            aVar = aVar2;
                            cVar = cVar2;
                            bVar = bVar2;
                        }
                        i2++;
                        aVar = aVar2;
                        cVar = cVar2;
                        bVar = bVar2;
                    } else if (eventType == 4) {
                        ((C5445bv2) C9542sf.g(c5445bv2)).a(C5445bv2.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(C5445bv2.n)) {
                            c6415fv2 = new C6415fv2((C5445bv2) C9542sf.g((C5445bv2) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (c6415fv2 != null) {
                return c6415fv2;
            }
            throw new C4217Sg2("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new C4217Sg2("Unable to decode source", e3);
        }
    }
}
