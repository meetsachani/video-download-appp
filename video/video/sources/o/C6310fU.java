package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10833xx0;
import o.C4086Qy1;
import o.C6960i70;
import o.RZ1;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

@Deprecated
/* renamed from: o.fU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6310fU extends DefaultHandler implements C4086Qy1.a<C6067eU> {
    public static final String b = "MpdParser";
    public static final Pattern c = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern d = Pattern.compile("CC([1-4])=.*");
    public static final Pattern e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    /* renamed from: o.fU$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final C10833xx0 a;
        public final AbstractC5317bO0<C4134Rl> b;
        public final RZ1 c;
        @InterfaceC11300zs1
        public final String d;
        public final ArrayList<C6960i70.b> e;
        public final ArrayList<C11097z20> f;
        public final long g;
        public final List<C11097z20> h;
        public final List<C11097z20> i;

        public a(C10833xx0 c10833xx0, List<C4134Rl> list, RZ1 rz1, @InterfaceC11300zs1 String str, ArrayList<C6960i70.b> arrayList, ArrayList<C11097z20> arrayList2, List<C11097z20> list2, List<C11097z20> list3, long j) {
            this.a = c10833xx0;
            this.b = AbstractC5317bO0.F(list);
            this.c = rz1;
            this.d = str;
            this.e = arrayList;
            this.f = arrayList2;
            this.h = list2;
            this.i = list3;
            this.g = j;
        }
    }

    public C6310fU() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int D(List<C11097z20> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c11097z20.a) && (str = c11097z20.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                I31.n(b, "Unable to parse CEA-608 channel number from: " + c11097z20.b);
            }
        }
        return -1;
    }

    public static int E(List<C11097z20> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c11097z20.a) && (str = c11097z20.b) != null) {
                Matcher matcher = e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                I31.n(b, "Unable to parse CEA-708 service block number from: " + c11097z20.b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j) throws C3989Py1 {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return TD2.s1(attributeValue);
    }

    public static C11097z20 I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", null);
        String r03 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!WN2.d(xmlPullParser, str));
        return new C11097z20(r0, r02, r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int J(XmlPullParser xmlPullParser) {
        char c2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String g = C8077mf.g(attributeValue);
        g.getClass();
        switch (g.hashCode()) {
            case 1596796:
                if (g.equals("4000")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2937391:
                if (g.equals("a000")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3094035:
                if (g.equals("f801")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3133436:
                if (g.equals("fa01")) {
                    c2 = 3;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    public static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    public static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return TD2.t1(attributeValue);
    }

    public static String N(List<C11097z20> list) {
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            String str = c11097z20.a;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(c11097z20.b)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && C4128Rj1.U0.equals(c11097z20.b)) {
                    return C4128Rj1.S;
                }
            } else {
                return C4128Rj1.S;
            }
        }
        return C4128Rj1.R;
    }

    public static float R(XmlPullParser xmlPullParser, String str, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return f2;
        }
        return Float.parseFloat(attributeValue);
    }

    public static float S(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = c.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                if (!TextUtils.isEmpty(group)) {
                    return parseInt / Integer.parseInt(group);
                }
                return parseInt;
            }
        }
        return f2;
    }

    public static int U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    public static long W(List<C11097z20> list) {
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            if (C8077mf.a("http://dashif.org/guidelines/last-segment-number", c11097z20.a)) {
                return Long.parseLong(c11097z20.b);
            }
        }
        return -1L;
    }

    public static long X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    public static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U >= 0) {
            int[] iArr = f;
            if (U < iArr.length) {
                return iArr[U];
            }
        }
        return -1;
    }

    public static int p(int i, int i2) {
        boolean z;
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        return i;
    }

    @InterfaceC11300zs1
    public static String q(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C9542sf.i(str.equals(str2));
        return str;
    }

    public static void r(ArrayList<C6960i70.b> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                C6960i70.b bVar = arrayList.get(i);
                if (C10323vs.f2.equals(bVar.Y) && (str = bVar.Z) != null) {
                    arrayList.remove(i);
                    break;
                }
                i++;
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C6960i70.b bVar2 = arrayList.get(i2);
                if (C10323vs.e2.equals(bVar2.Y) && bVar2.Z == null) {
                    arrayList.set(i2, new C6960i70.b(C10323vs.f2, str, bVar2.Y0, bVar2.Z0));
                }
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return str2;
        }
        return attributeValue;
    }

    public static void s(ArrayList<C6960i70.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C6960i70.b bVar = arrayList.get(size);
            if (!bVar.c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!WN2.d(xmlPullParser, str));
        return str2;
    }

    public static long t(long j, long j2) {
        if (j2 != C10323vs.b) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return C10323vs.b;
        }
        return j;
    }

    @InterfaceC11300zs1
    public static String u(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (C4128Rj1.p(str)) {
            return C4128Rj1.c(str2);
        }
        if (C4128Rj1.t(str)) {
            return C4128Rj1.o(str2);
        }
        if (C4128Rj1.s(str) || C4128Rj1.q(str)) {
            return str;
        }
        if (C4128Rj1.q0.equals(str)) {
            String g = C4128Rj1.g(str2);
            if (C4128Rj1.m0.equals(g)) {
                return C4128Rj1.C0;
            }
            return g;
        }
        return null;
    }

    public static void w(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (WN2.e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (WN2.e(xmlPullParser)) {
                    i++;
                } else if (WN2.c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int A(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c2;
        String r0 = r0(xmlPullParser, "schemeIdUri", null);
        r0.getClass();
        int i = -1;
        switch (r0.hashCode()) {
            case -2128649360:
                if (r0.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (r0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (r0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (r0.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (r0.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (r0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 6;
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
            case 4:
                i = K(xmlPullParser);
                break;
            case 1:
                i = U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i = J(xmlPullParser);
                break;
            case 3:
                i = Z(xmlPullParser);
                break;
            case 5:
                i = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!WN2.d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    public long B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public List<C4134Rl> C(XmlPullParser xmlPullParser, List<C4134Rl> list, boolean z) throws XmlPullParserException, IOException {
        int i;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i2 = 1;
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else if (z) {
            i = 1;
        } else {
            i = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s0 = s0(xmlPullParser, "BaseURL");
        if (RC2.b(s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = s0;
            }
            return C10608x11.t(new C4134Rl(s0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C4134Rl c4134Rl = list.get(i3);
            String e2 = RC2.e(c4134Rl.a, s0);
            if (attributeValue3 == null) {
                str = e2;
            } else {
                str = attributeValue3;
            }
            if (z) {
                i = c4134Rl.c;
                i2 = c4134Rl.d;
                str = c4134Rl.b;
            }
            arrayList.add(new C4134Rl(e2, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair<String, C6960i70.b> F(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        UUID uuid;
        UUID uuid2;
        byte[] bArr;
        byte[] bArr2;
        C6960i70.b bVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String g = C8077mf.g(attributeValue);
            g.getClass();
            char c2 = 65535;
            switch (g.hashCode()) {
                case -1980789791:
                    if (g.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 489446379:
                    if (g.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 755418770:
                    if (g.equals(XH0.T)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1812765994:
                    if (g.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    uuid = C10323vs.f2;
                    str = null;
                    uuid2 = null;
                    bArr = uuid2;
                    bArr2 = uuid2;
                    break;
                case 1:
                    uuid = C10323vs.h2;
                    str = null;
                    uuid2 = null;
                    bArr = uuid2;
                    bArr2 = uuid2;
                    break;
                case 2:
                    uuid = C10323vs.g2;
                    str = null;
                    uuid2 = null;
                    bArr = uuid2;
                    bArr2 = uuid2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String b2 = WN2.b(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(b2) && !"00000000-0000-0000-0000-000000000000".equals(b2)) {
                        String[] split = b2.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i = 0; i < split.length; i++) {
                            uuidArr[i] = UUID.fromString(split[i]);
                        }
                        uuid = C10323vs.e2;
                        bArr = null;
                        bArr2 = DK1.b(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        bArr = uuid2;
                        bArr2 = uuid2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!WN2.f(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    bArr = xmlPullParser.getText();
                    bArr2 = bArr2;
                } else if (!WN2.f(xmlPullParser, "ms:laurl")) {
                    bArr = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    bArr2 = bArr2;
                } else if (bArr2 == null && WN2.g(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID f2 = DK1.f(decode);
                    if (f2 == null) {
                        I31.n(b, "Skipping malformed cenc:pssh data");
                        uuid = f2;
                        bArr2 = null;
                    } else {
                        bArr2 = decode;
                        uuid = f2;
                    }
                } else {
                    if (bArr2 == null) {
                        UUID uuid3 = C10323vs.h2;
                        if (uuid3.equals(uuid) && WN2.f(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            bArr2 = DK1.a(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    w(xmlPullParser);
                    bArr2 = bArr2;
                }
            } while (!WN2.d(xmlPullParser, "ContentProtection"));
            if (uuid != null) {
                bVar = new C6960i70.b(uuid, bArr, C4128Rj1.f, bArr2);
            }
            return Pair.create(str, bVar);
        }
        str = null;
        uuid = null;
        uuid2 = uuid;
        bArr = uuid2;
        bArr2 = uuid2;
        do {
            xmlPullParser.next();
            if (!WN2.f(xmlPullParser, "clearkey:Laurl")) {
            }
            if (!WN2.f(xmlPullParser, "ms:laurl")) {
            }
        } while (!WN2.d(xmlPullParser, "ContentProtection"));
        if (uuid != null) {
        }
        return Pair.create(str, bVar);
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        if (!"image".equals(attributeValue)) {
            return -1;
        }
        return 4;
    }

    public Pair<Long, C3816Oe0> O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long X = X(xmlPullParser, "id", 0L);
        long X2 = X(xmlPullParser, "duration", C10323vs.b);
        long X3 = X(xmlPullParser, "presentationTime", 0L);
        long C1 = TD2.C1(X2, 1000L, j);
        long C12 = TD2.C1(X3 - j2, 1000000L, j);
        String r0 = r0(xmlPullParser, "messageData", null);
        byte[] P = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(C12);
        if (r0 != null) {
            P = TD2.G0(r0);
        }
        return Pair.create(valueOf, d(str, str2, X, C1, P));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, KB.c.name());
        xmlPullParser.nextToken();
        while (!WN2.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public C4896Ze0 Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", "");
        long X = X(xmlPullParser, "timescale", 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Event")) {
                j = X;
                str = r02;
                str2 = r0;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(O(xmlPullParser2, str2, str, j, X2, byteArrayOutputStream));
            } else {
                j = X;
                str = r02;
                str2 = r0;
                xmlPullParser2 = xmlPullParser;
                w(xmlPullParser2);
            }
            if (WN2.d(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            r0 = str2;
            r02 = str;
            X = j;
        }
        long[] jArr = new long[arrayList.size()];
        C3816Oe0[] c3816Oe0Arr = new C3816Oe0[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            c3816Oe0Arr[i] = (C3816Oe0) pair.second;
        }
        return e(str2, str, j, jArr, c3816Oe0Arr);
    }

    public XN1 T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", V12.q);
    }

    public String V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return s0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0 A[LOOP:0: B:24:0x00a5->B:81:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6067eU Y(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        ArrayList arrayList4;
        long j6;
        ArrayList arrayList5;
        long j7;
        long j8;
        long j9;
        Throwable th;
        long j10;
        C6310fU c6310fU = this;
        boolean v = c6310fU.v(c6310fU.b0(xmlPullParser, "profiles", new String[0]));
        long H = H(xmlPullParser, "availabilityStartTime", C10323vs.b);
        long M = M(xmlPullParser, "mediaPresentationDuration", C10323vs.b);
        long M2 = M(xmlPullParser, "minBufferTime", C10323vs.b);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        if (equals) {
            j = M(xmlPullParser, "minimumUpdatePeriod", C10323vs.b);
        } else {
            j = -9223372036854775807L;
        }
        if (equals) {
            j2 = M(xmlPullParser, "timeShiftBufferDepth", C10323vs.b);
        } else {
            j2 = -9223372036854775807L;
        }
        if (equals) {
            j3 = M(xmlPullParser, "suggestedPresentationDelay", C10323vs.b);
        } else {
            j3 = -9223372036854775807L;
        }
        long H2 = H(xmlPullParser, "publishTime", C10323vs.b);
        long j11 = 0;
        if (equals) {
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        String uri2 = uri.toString();
        String uri3 = uri.toString();
        if (v) {
            i = 1;
        } else {
            i = Integer.MIN_VALUE;
        }
        ArrayList t = C10608x11.t(new C4134Rl(uri2, uri3, i, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (equals) {
            j11 = -9223372036854775807L;
        }
        ArrayList arrayList8 = t;
        long j12 = j4;
        boolean z = false;
        boolean z2 = false;
        C5540cJ1 c5540cJ1 = null;
        AD2 ad2 = null;
        Uri uri4 = null;
        I12 i12 = null;
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    j12 = c6310fU.B(xmlPullParser, j12);
                    z2 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(c6310fU.C(xmlPullParser, arrayList, v));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (WN2.f(xmlPullParser, "ProgramInformation")) {
                    c5540cJ1 = c0(xmlPullParser);
                } else if (WN2.f(xmlPullParser, "UTCTiming")) {
                    ad2 = w0(xmlPullParser);
                } else if (WN2.f(xmlPullParser, "Location")) {
                    uri4 = RC2.f(uri.toString(), xmlPullParser.nextText());
                } else if (WN2.f(xmlPullParser, "ServiceDescription")) {
                    i12 = q0(xmlPullParser);
                } else {
                    if (WN2.f(xmlPullParser, "Period") && !z) {
                        if (!arrayList7.isEmpty()) {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            j7 = j11;
                            j8 = j12;
                            arrayList4 = arrayList2;
                        } else {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            j7 = j11;
                            j8 = j12;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        }
                        Pair<CC1, Long> a0 = a0(xmlPullParser, arrayList5, j7, j8, H, j2, v);
                        CC1 cc1 = (CC1) a0.first;
                        j5 = M;
                        if (cc1.b == C10323vs.b) {
                            if (equals) {
                                j9 = j7;
                                z = true;
                            } else {
                                throw C3989Py1.c("Unable to determine start of period " + arrayList4.size(), null);
                            }
                        } else {
                            long longValue = ((Long) a0.second).longValue();
                            if (longValue == C10323vs.b) {
                                j9 = -9223372036854775807L;
                            } else {
                                j9 = cc1.b + longValue;
                            }
                            arrayList4.add(cc1);
                        }
                        j6 = j8;
                        j11 = j9;
                    } else {
                        arrayList3 = arrayList7;
                        j5 = M;
                        arrayList8 = arrayList;
                        long j13 = j11;
                        long j14 = j12;
                        arrayList4 = arrayList2;
                        w(xmlPullParser);
                        j11 = j13;
                        j6 = j14;
                    }
                    if (!WN2.d(xmlPullParser, "MPD")) {
                        if (j5 == C10323vs.b) {
                            if (j11 != C10323vs.b) {
                                j10 = j11;
                                th = null;
                                if (arrayList4.isEmpty()) {
                                    return g(H, j10, M2, equals, j, j2, j3, H2, c5540cJ1, ad2, i12, uri4, arrayList4);
                                }
                                throw C3989Py1.c("No periods found.", th);
                            } else if (!equals) {
                                throw C3989Py1.c("Unable to determine duration of static manifest.", null);
                            }
                        }
                        th = null;
                        j10 = j5;
                        if (arrayList4.isEmpty()) {
                        }
                    } else {
                        long j15 = j2;
                        long j16 = M2;
                        ArrayList arrayList9 = arrayList4;
                        c6310fU = this;
                        equals = equals;
                        j = j;
                        j12 = j6;
                        arrayList6 = arrayList9;
                        arrayList7 = arrayList3;
                        M2 = j16;
                        j2 = j15;
                        M = j5;
                    }
                }
            }
            arrayList3 = arrayList7;
            j6 = j12;
            j5 = M;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (!WN2.d(xmlPullParser, "MPD")) {
            }
        }
    }

    public Pair<CC1, Long> a0(XmlPullParser xmlPullParser, List<C4134Rl> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        ArrayList arrayList;
        long j6;
        RZ1 rz1;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j7;
        Object obj;
        long j8;
        XmlPullParser xmlPullParser2;
        long j9;
        long j10;
        RZ1 l0;
        long j11;
        C11097z20 c11097z20;
        long j12;
        RZ1 rz12;
        boolean z2;
        long j13;
        ArrayList arrayList4;
        C6310fU c6310fU = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long M = M(xmlPullParser3, "start", j);
        if (j3 != C10323vs.b) {
            j5 = j3 + M;
        } else {
            j5 = -9223372036854775807L;
        }
        long M2 = M(xmlPullParser3, "duration", C10323vs.b);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j14 = -9223372036854775807L;
        ArrayList arrayList8 = arrayList6;
        boolean z3 = false;
        C11097z20 c11097z202 = null;
        long j15 = j2;
        ArrayList arrayList9 = arrayList5;
        RZ1 rz13 = null;
        long j16 = -9223372036854775807L;
        while (true) {
            xmlPullParser3.next();
            if (WN2.f(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j15 = c6310fU.B(xmlPullParser3, j15);
                    z3 = true;
                }
                arrayList7.addAll(c6310fU.C(xmlPullParser3, list, z));
                arrayList3 = arrayList9;
                j11 = j15;
                arrayList2 = arrayList8;
                z2 = z3;
                j7 = j14;
                obj = null;
                j8 = M2;
                arrayList = arrayList7;
                c11097z20 = c11097z202;
                xmlPullParser2 = xmlPullParser3;
                rz12 = rz13;
                j13 = j16;
                j10 = j5;
            } else {
                ArrayList arrayList10 = arrayList9;
                if (WN2.f(xmlPullParser3, "AdaptationSet")) {
                    if (!arrayList7.isEmpty()) {
                        arrayList4 = arrayList7;
                        arrayList = arrayList4;
                    } else {
                        arrayList = arrayList7;
                        arrayList4 = list;
                    }
                    ArrayList arrayList11 = arrayList8;
                    long j17 = j15;
                    long j18 = j5;
                    long j19 = M2;
                    C8190n7 y = c6310fU.y(xmlPullParser3, arrayList4, rz13, j19, j17, j16, j18, j4, z);
                    j5 = j18;
                    j6 = j16;
                    arrayList10.add(y);
                    rz1 = rz13;
                    j8 = j19;
                    arrayList2 = arrayList11;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j9 = j17;
                    arrayList3 = arrayList10;
                    j7 = C10323vs.b;
                } else {
                    arrayList = arrayList7;
                    ArrayList arrayList12 = arrayList8;
                    long j20 = j15;
                    j6 = j16;
                    if (WN2.f(xmlPullParser3, "EventStream")) {
                        arrayList12.add(Q(xmlPullParser));
                        rz1 = rz13;
                        j8 = M2;
                        arrayList2 = arrayList12;
                        arrayList3 = arrayList10;
                        j7 = C10323vs.b;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j9 = j20;
                    } else {
                        if (WN2.f(xmlPullParser3, "SegmentBase")) {
                            l0 = c6310fU.j0(xmlPullParser3, null);
                            j11 = j20;
                            obj = null;
                            arrayList2 = arrayList12;
                            arrayList3 = arrayList10;
                            j7 = C10323vs.b;
                            j10 = j5;
                            j8 = M2;
                            c11097z20 = c11097z202;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (WN2.f(xmlPullParser3, "SegmentList")) {
                            long j21 = j5;
                            long j22 = M2;
                            long B = c6310fU.B(xmlPullParser3, C10323vs.b);
                            arrayList2 = arrayList12;
                            arrayList3 = arrayList10;
                            j7 = -9223372036854775807L;
                            RZ1 k0 = c6310fU.k0(xmlPullParser3, null, j21, j22, j20, B, j4);
                            j11 = j20;
                            obj = null;
                            j10 = j21;
                            j8 = j22;
                            c11097z20 = c11097z202;
                            xmlPullParser2 = xmlPullParser3;
                            j12 = B;
                            rz12 = k0;
                            z2 = z3;
                            j13 = j12;
                        } else {
                            rz1 = rz13;
                            arrayList2 = arrayList12;
                            arrayList3 = arrayList10;
                            j7 = C10323vs.b;
                            if (WN2.f(xmlPullParser3, "SegmentTemplate")) {
                                j6 = c6310fU.B(xmlPullParser3, C10323vs.b);
                                obj = null;
                                l0 = c6310fU.l0(xmlPullParser3, null, AbstractC5317bO0.L(), j5, M2, j20, j6, j4);
                                j8 = M2;
                                xmlPullParser2 = xmlPullParser3;
                                j10 = j5;
                                j11 = j20;
                                c11097z20 = c11097z202;
                            } else {
                                obj = null;
                                j8 = M2;
                                xmlPullParser2 = xmlPullParser3;
                                j9 = j20;
                                j10 = j5;
                                if (WN2.f(xmlPullParser2, "AssetIdentifier")) {
                                    c11097z202 = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser2);
                                }
                                j11 = j9;
                                c11097z20 = c11097z202;
                                j12 = j6;
                                rz12 = rz1;
                                z2 = z3;
                                j13 = j12;
                            }
                        }
                        j12 = j6;
                        rz12 = l0;
                        z2 = z3;
                        j13 = j12;
                    }
                }
                j10 = j5;
                j11 = j9;
                c11097z20 = c11097z202;
                j12 = j6;
                rz12 = rz1;
                z2 = z3;
                j13 = j12;
            }
            if (WN2.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, arrayList3, arrayList2, c11097z20), Long.valueOf(j8));
            }
            c6310fU = this;
            xmlPullParser3 = xmlPullParser2;
            j5 = j10;
            rz13 = rz12;
            j16 = j13;
            arrayList7 = arrayList;
            arrayList9 = arrayList3;
            c11097z202 = c11097z20;
            z3 = z2;
            M2 = j8;
            j14 = j7;
            j15 = j11;
            arrayList8 = arrayList2;
        }
    }

    public final long b(List<RZ1.d> list, long j, long j2, int i, long j3) {
        int r;
        if (i >= 0) {
            r = i + 1;
        } else {
            r = (int) TD2.r(j3 - j, j2);
        }
        for (int i2 = 0; i2 < r; i2++) {
            list.add(m(j, j2));
            j += j2;
        }
        return j;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return strArr;
        }
        return attributeValue.split(",");
    }

    public C8190n7 c(long j, int i, List<ZR1> list, List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4) {
        return new C8190n7(j, i, list, list2, list3, list4);
    }

    public C5540cJ1 c0(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String r0 = r0(xmlPullParser, "moreInformationURL", null);
        String r02 = r0(xmlPullParser, C10928yK2.u, null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (WN2.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (WN2.f(xmlPullParser, C2638Cg0.a0)) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (WN2.d(xmlPullParser, "ProgramInformation")) {
                return new C5540cJ1(str5, str4, str6, r0, r02);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    public C3816Oe0 d(String str, String str2, long j, long j2, byte[] bArr) {
        return new C3816Oe0(str, str2, j2, j, bArr);
    }

    public XN1 d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return i(attributeValue, j, j2);
    }

    public C4896Ze0 e(String str, String str2, long j, long[] jArr, C3816Oe0[] c3816Oe0Arr) {
        return new C4896Ze0(str, str2, j, jArr, c3816Oe0Arr);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0214 A[LOOP:0: B:3:0x006c->B:56:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7 A[EDGE_INSN: B:57:0x01c7->B:46:0x01c7 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a e0(XmlPullParser xmlPullParser, List<C4134Rl> list, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, int i, int i2, float f2, int i3, int i4, @InterfaceC11300zs1 String str3, List<C11097z20> list2, List<C11097z20> list3, List<C11097z20> list4, List<C11097z20> list5, @InterfaceC11300zs1 RZ1 rz1, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5;
        ArrayList arrayList3;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j6;
        int i6;
        String str4;
        boolean z2;
        RZ1.e eVar;
        long j7;
        RZ1 l0;
        C6310fU c6310fU = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int U = U(xmlPullParser3, "bandwidth", -1);
        String r0 = r0(xmlPullParser3, "mimeType", str);
        String r02 = r0(xmlPullParser3, "codecs", str2);
        int U2 = U(xmlPullParser3, "width", i);
        int U3 = U(xmlPullParser3, "height", i2);
        float S = S(xmlPullParser3, f2);
        int U4 = U(xmlPullParser3, "audioSamplingRate", i4);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(list4);
        ArrayList arrayList10 = new ArrayList(list5);
        ArrayList arrayList11 = new ArrayList();
        int i7 = i3;
        long j8 = j4;
        String str5 = null;
        boolean z3 = false;
        RZ1 rz12 = rz1;
        long j9 = j3;
        while (true) {
            xmlPullParser3.next();
            if (WN2.f(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j9 = c6310fU.B(xmlPullParser3, j9);
                    z3 = true;
                }
                ArrayList arrayList12 = arrayList8;
                arrayList11.addAll(c6310fU.C(xmlPullParser3, list, z));
                xmlPullParser2 = xmlPullParser3;
                arrayList = arrayList11;
                j6 = j8;
                arrayList6 = arrayList10;
                i5 = U;
                i6 = i7;
                str4 = str5;
                z2 = z3;
                arrayList3 = arrayList12;
                eVar = rz12;
                j7 = j9;
            } else {
                ArrayList arrayList13 = arrayList8;
                if (WN2.f(xmlPullParser3, "AudioChannelConfiguration")) {
                    xmlPullParser2 = xmlPullParser3;
                    eVar = rz12;
                    arrayList = arrayList11;
                    j6 = j8;
                    i5 = U;
                    str4 = str5;
                    z2 = z3;
                    arrayList3 = arrayList13;
                    i6 = A(xmlPullParser);
                } else if (WN2.f(xmlPullParser3, "SegmentBase")) {
                    RZ1.e j0 = c6310fU.j0(xmlPullParser3, (RZ1.e) rz12);
                    xmlPullParser2 = xmlPullParser3;
                    arrayList = arrayList11;
                    j6 = j8;
                    i5 = U;
                    i6 = i7;
                    str4 = str5;
                    z2 = z3;
                    arrayList3 = arrayList13;
                    eVar = j0;
                } else {
                    if (WN2.f(xmlPullParser3, "SegmentList")) {
                        long B = c6310fU.B(xmlPullParser3, j8);
                        arrayList = arrayList11;
                        arrayList2 = arrayList10;
                        i5 = U;
                        arrayList3 = arrayList13;
                        l0 = c6310fU.k0(xmlPullParser3, (RZ1.b) rz12, j, j2, j9, B, j5);
                        arrayList4 = arrayList7;
                        arrayList5 = arrayList9;
                        xmlPullParser2 = xmlPullParser3;
                        j6 = B;
                    } else {
                        arrayList = arrayList11;
                        arrayList2 = arrayList10;
                        i5 = U;
                        arrayList3 = arrayList13;
                        ArrayList arrayList14 = arrayList9;
                        if (WN2.f(xmlPullParser3, "SegmentTemplate")) {
                            long B2 = c6310fU.B(xmlPullParser3, j8);
                            long j10 = j9;
                            arrayList4 = arrayList7;
                            l0 = c6310fU.l0(xmlPullParser3, (RZ1.c) rz12, list5, j, j2, j10, B2, j5);
                            xmlPullParser2 = xmlPullParser3;
                            j9 = j10;
                            arrayList5 = arrayList14;
                            j6 = B2;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            arrayList4 = arrayList7;
                            if (WN2.f(xmlPullParser2, "ContentProtection")) {
                                Pair<String, C6960i70.b> F = F(xmlPullParser);
                                Object obj = F.first;
                                if (obj != null) {
                                    str5 = (String) obj;
                                }
                                Object obj2 = F.second;
                                if (obj2 != null) {
                                    arrayList4.add((C6960i70.b) obj2);
                                }
                                arrayList5 = arrayList14;
                            } else if (WN2.f(xmlPullParser2, "InbandEventStream")) {
                                arrayList3.add(I(xmlPullParser2, "InbandEventStream"));
                                arrayList5 = arrayList14;
                            } else if (WN2.f(xmlPullParser2, "EssentialProperty")) {
                                arrayList5 = arrayList14;
                                arrayList5.add(I(xmlPullParser2, "EssentialProperty"));
                            } else {
                                arrayList5 = arrayList14;
                                if (WN2.f(xmlPullParser2, "SupplementalProperty")) {
                                    arrayList6 = arrayList2;
                                    arrayList6.add(I(xmlPullParser2, "SupplementalProperty"));
                                } else {
                                    arrayList6 = arrayList2;
                                    w(xmlPullParser2);
                                }
                                j6 = j8;
                                i6 = i7;
                                str4 = str5;
                                z2 = z3;
                                eVar = rz12;
                                j7 = j9;
                                if (!WN2.d(xmlPullParser2, "Representation")) {
                                    break;
                                }
                                ArrayList arrayList15 = arrayList6;
                                arrayList9 = arrayList5;
                                arrayList7 = arrayList4;
                                arrayList8 = arrayList3;
                                rz12 = eVar;
                                j9 = j7;
                                U = i5;
                                j8 = j6;
                                z3 = z2;
                                str5 = str4;
                                arrayList10 = arrayList15;
                                i7 = i6;
                                arrayList11 = arrayList;
                                c6310fU = this;
                                xmlPullParser3 = xmlPullParser;
                            }
                            arrayList6 = arrayList2;
                            j6 = j8;
                            i6 = i7;
                            str4 = str5;
                            z2 = z3;
                            eVar = rz12;
                            j7 = j9;
                            if (!WN2.d(xmlPullParser2, "Representation")) {
                            }
                        }
                    }
                    i6 = i7;
                    str4 = str5;
                    z2 = z3;
                    eVar = l0;
                    j7 = j9;
                    arrayList6 = arrayList2;
                    if (!WN2.d(xmlPullParser2, "Representation")) {
                    }
                }
                j7 = j9;
                arrayList6 = arrayList10;
            }
            arrayList4 = arrayList7;
            arrayList5 = arrayList9;
            if (!WN2.d(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList16 = arrayList4;
        ArrayList arrayList17 = arrayList6;
        C10833xx0 f3 = f(attributeValue, r0, U2, U3, S, i6, U4, i5, str3, list2, list3, r02, arrayList5, arrayList17);
        if (eVar == null) {
            eVar = new RZ1.e();
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList18 = arrayList;
        if (isEmpty) {
            arrayList18 = list;
        }
        return new a(f3, arrayList18, eVar, str4, arrayList16, arrayList3, arrayList5, arrayList17, -1L);
    }

    public C10833xx0 f(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, int i, int i2, float f2, int i3, int i4, int i5, @InterfaceC11300zs1 String str3, List<C11097z20> list, List<C11097z20> list2, @InterfaceC11300zs1 String str4, List<C11097z20> list3, List<C11097z20> list4) {
        int i6;
        int i7;
        String str5 = str4;
        String u = u(str2, str5);
        if (C4128Rj1.R.equals(u)) {
            u = N(list4);
            if (C4128Rj1.S.equals(u)) {
                str5 = C4128Rj1.U0;
            }
        }
        int p0 = p0(list);
        int i0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair<Integer, Integer> t0 = t0(list3);
        C10833xx0.b X = new C10833xx0.b().U(str).M(str2).g0(u).K(str5).b0(i5).i0(p0).e0(i0).X(str3);
        int i8 = -1;
        if (t0 != null) {
            i6 = ((Integer) t0.first).intValue();
        } else {
            i6 = -1;
        }
        C10833xx0.b l0 = X.l0(i6);
        if (t0 != null) {
            i7 = ((Integer) t0.second).intValue();
        } else {
            i7 = -1;
        }
        C10833xx0.b m0 = l0.m0(i7);
        if (C4128Rj1.t(u)) {
            m0.n0(i).S(i2).R(f2);
        } else if (C4128Rj1.p(u)) {
            m0.J(i3).h0(i4);
        } else if (C4128Rj1.s(u)) {
            if (C4128Rj1.x0.equals(u)) {
                i8 = D(list2);
            } else if (C4128Rj1.y0.equals(u)) {
                i8 = E(list2);
            }
            m0.H(i8);
        } else if (C4128Rj1.q(u)) {
            m0.n0(i).S(i2);
        }
        return m0.G();
    }

    public int f0(List<C11097z20> list) {
        int u0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11097z20 c11097z20 = list.get(i2);
            if (C8077mf.a("urn:mpeg:dash:role:2011", c11097z20.a)) {
                u0 = g0(c11097z20.b);
            } else if (C8077mf.a("urn:tva:metadata:cs:AudioPurposeCS:2007", c11097z20.a)) {
                u0 = u0(c11097z20.b);
            }
            i |= u0;
        }
        return i;
    }

    public C6067eU g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @InterfaceC11300zs1 C5540cJ1 c5540cJ1, @InterfaceC11300zs1 AD2 ad2, @InterfaceC11300zs1 I12 i12, @InterfaceC11300zs1 Uri uri, List<CC1> list) {
        return new C6067eU(j, j2, j3, z, j4, j5, j6, j7, c5540cJ1, ad2, i12, uri, list);
    }

    public int g0(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c2 = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c2 = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return 512;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case '\b':
                return 256;
            case '\t':
                return 64;
            case '\n':
                return 8;
            case 11:
                return 32;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public CC1 h(@InterfaceC11300zs1 String str, long j, List<C8190n7> list, List<C4896Ze0> list2, @InterfaceC11300zs1 C11097z20 c11097z20) {
        return new CC1(str, j, list, list2, c11097z20);
    }

    public int h0(List<C11097z20> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C8077mf.a("http://dashif.org/guidelines/trickmode", list.get(i2).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public XN1 i(String str, long j, long j2) {
        return new XN1(str, j, j2);
    }

    public int i0(List<C11097z20> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11097z20 c11097z20 = list.get(i2);
            if (C8077mf.a("urn:mpeg:dash:role:2011", c11097z20.a)) {
                i |= g0(c11097z20.b);
            }
        }
        return i;
    }

    public ZR1 j(a aVar, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, ArrayList<C6960i70.b> arrayList, ArrayList<C11097z20> arrayList2) {
        C10833xx0.b b2 = aVar.a.b();
        if (str != null) {
            b2.W(str);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C6960i70.b> arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            b2.O(new C6960i70(str2, arrayList3));
        }
        ArrayList<C11097z20> arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return ZR1.p(aVar.g, b2.G(), aVar.b, aVar.c, arrayList4, aVar.h, aVar.i, null);
    }

    public RZ1.e j0(XmlPullParser xmlPullParser, @InterfaceC11300zs1 RZ1.e eVar) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3;
        if (eVar != null) {
            j = eVar.b;
        } else {
            j = 1;
        }
        long X = X(xmlPullParser, "timescale", j);
        long j4 = 0;
        if (eVar != null) {
            j2 = eVar.c;
        } else {
            j2 = 0;
        }
        long X2 = X(xmlPullParser, "presentationTimeOffset", j2);
        if (eVar != null) {
            j3 = eVar.d;
        } else {
            j3 = 0;
        }
        if (eVar != null) {
            j4 = eVar.e;
        }
        XN1 xn1 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        long j5 = j4;
        if (eVar != null) {
            xn1 = eVar.a;
        }
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Initialization")) {
                xn1 = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
            XN1 xn12 = xn1;
            if (WN2.d(xmlPullParser, "SegmentBase")) {
                return n(xn12, X, X2, j3, j5);
            }
            xn1 = xn12;
        }
    }

    public RZ1.b k(XN1 xn1, long j, long j2, long j3, long j4, @InterfaceC11300zs1 List<RZ1.d> list, long j5, @InterfaceC11300zs1 List<XN1> list2, long j6, long j7) {
        return new RZ1.b(xn1, j, j2, j3, j4, list, j5, list2, TD2.j1(j6), TD2.j1(j7));
    }

    public RZ1.b k0(XmlPullParser xmlPullParser, @InterfaceC11300zs1 RZ1.b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10 = 1;
        if (bVar != null) {
            j6 = bVar.b;
        } else {
            j6 = 1;
        }
        long X = X(xmlPullParser, "timescale", j6);
        if (bVar != null) {
            j7 = bVar.c;
        } else {
            j7 = 0;
        }
        long X2 = X(xmlPullParser, "presentationTimeOffset", j7);
        if (bVar != null) {
            j8 = bVar.e;
        } else {
            j8 = C10323vs.b;
        }
        long X3 = X(xmlPullParser, "duration", j8);
        if (bVar != null) {
            j10 = bVar.d;
        }
        long X4 = X(xmlPullParser, "startNumber", j10);
        long t = t(j3, j4);
        List<XN1> list = null;
        XN1 xn1 = null;
        List<RZ1.d> list2 = null;
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Initialization")) {
                xn1 = T(xmlPullParser);
                j9 = X;
            } else if (WN2.f(xmlPullParser, "SegmentTimeline")) {
                j9 = X;
                list2 = m0(xmlPullParser, j9, j2);
            } else {
                j9 = X;
                if (WN2.f(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(n0(xmlPullParser));
                } else {
                    w(xmlPullParser);
                }
            }
            if (WN2.d(xmlPullParser, "SegmentList")) {
                break;
            }
            X = j9;
        }
        if (bVar != null) {
            if (xn1 == null) {
                xn1 = bVar.a;
            }
            if (list2 == null) {
                list2 = bVar.f;
            }
            if (list == null) {
                list = bVar.j;
            }
        }
        return k(xn1, j9, X2, X4, X3, list2, t, list, j5, j);
    }

    public RZ1.c l(XN1 xn1, long j, long j2, long j3, long j4, long j5, List<RZ1.d> list, long j6, @InterfaceC11300zs1 C5275bD2 c5275bD2, @InterfaceC11300zs1 C5275bD2 c5275bD22, long j7, long j8) {
        return new RZ1.c(xn1, j, j2, j3, j4, j5, list, j6, c5275bD2, c5275bD22, TD2.j1(j7), TD2.j1(j8));
    }

    public RZ1.c l0(XmlPullParser xmlPullParser, @InterfaceC11300zs1 RZ1.c cVar, List<C11097z20> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7;
        long j8;
        C5275bD2 c5275bD2;
        C5275bD2 c5275bD22;
        long j9;
        C6310fU c6310fU = this;
        long j10 = 1;
        if (cVar != null) {
            j6 = cVar.b;
        } else {
            j6 = 1;
        }
        long X = X(xmlPullParser, "timescale", j6);
        if (cVar != null) {
            j7 = cVar.c;
        } else {
            j7 = 0;
        }
        long X2 = X(xmlPullParser, "presentationTimeOffset", j7);
        if (cVar != null) {
            j8 = cVar.e;
        } else {
            j8 = C10323vs.b;
        }
        long X3 = X(xmlPullParser, "duration", j8);
        if (cVar != null) {
            j10 = cVar.d;
        }
        long X4 = X(xmlPullParser, "startNumber", j10);
        long W = W(list);
        long t = t(j3, j4);
        if (cVar != null) {
            c5275bD2 = cVar.k;
        } else {
            c5275bD2 = null;
        }
        C5275bD2 v0 = c6310fU.v0(xmlPullParser, "media", c5275bD2);
        if (cVar != null) {
            c5275bD22 = cVar.j;
        } else {
            c5275bD22 = null;
        }
        C5275bD2 v02 = c6310fU.v0(xmlPullParser, "initialization", c5275bD22);
        XN1 xn1 = null;
        List<RZ1.d> list2 = null;
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Initialization")) {
                xn1 = T(xmlPullParser);
                j9 = X;
            } else if (WN2.f(xmlPullParser, "SegmentTimeline")) {
                j9 = X;
                list2 = c6310fU.m0(xmlPullParser, j9, j2);
            } else {
                j9 = X;
                w(xmlPullParser);
            }
            if (WN2.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            c6310fU = this;
            t = t;
            W = W;
            X4 = X4;
            X2 = X2;
            X = j9;
        }
        if (cVar != null) {
            if (xn1 == null) {
                xn1 = cVar.a;
            }
            if (list2 == null) {
                list2 = cVar.f;
            }
        }
        return l(xn1, j9, X2, X4, W, X3, list2, t, v02, v0, j5, j);
    }

    public RZ1.d m(long j, long j2) {
        return new RZ1.d(j, j2);
    }

    public List<RZ1.d> m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "S")) {
                long X = X(xmlPullParser, "t", C10323vs.b);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    j3 = b(arrayList2, j3, j4, i, X);
                    arrayList = arrayList2;
                }
                if (X != C10323vs.b) {
                    j3 = X;
                }
                j4 = X(xmlPullParser, "d", C10323vs.b);
                i = U(xmlPullParser, "r", 0);
                z = true;
            } else {
                w(xmlPullParser);
            }
        } while (!WN2.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            b(arrayList, j3, j4, i, TD2.C1(j2, j, 1000L));
        }
        return arrayList;
    }

    public RZ1.e n(XN1 xn1, long j, long j2, long j3, long j4) {
        return new RZ1.e(xn1, j, j2, j3, j4);
    }

    public XN1 n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    public AD2 o(String str, String str2) {
        return new AD2(str, str2);
    }

    public int o0(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 0;
        }
        if (!str.equals("forced_subtitle") && !str.equals("forced-subtitle")) {
            return 0;
        }
        return 2;
    }

    public int p0(List<C11097z20> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C11097z20 c11097z20 = list.get(i2);
            if (C8077mf.a("urn:mpeg:dash:role:2011", c11097z20.a)) {
                i |= o0(c11097z20.b);
            }
        }
        return i;
    }

    public I12 q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        float f3 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (WN2.f(xmlPullParser, "Latency")) {
                j = X(xmlPullParser, "target", C10323vs.b);
                j2 = X(xmlPullParser, "min", C10323vs.b);
                j3 = X(xmlPullParser, "max", C10323vs.b);
            } else if (WN2.f(xmlPullParser, "PlaybackRate")) {
                f2 = R(xmlPullParser, "min", -3.4028235E38f);
                f3 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f4 = f2;
            float f5 = f3;
            if (WN2.d(xmlPullParser, "ServiceDescription")) {
                return new I12(j4, j5, j6, f4, f5);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f2 = f4;
            f3 = f5;
        }
    }

    @InterfaceC11300zs1
    public Pair<Integer, Integer> t0(List<C11097z20> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            if ((C8077mf.a("http://dashif.org/thumbnail_tile", c11097z20.a) || C8077mf.a("http://dashif.org/guidelines/thumbnail_tile", c11097z20.a)) && (str = c11097z20.b) != null) {
                String[] J1 = TD2.J1(str, "x");
                if (J1.length == 2) {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(J1[0])), Integer.valueOf(Integer.parseInt(J1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals(C2638Cg0.Y4)) {
                    c2 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals(C2638Cg0.Z4)) {
                    c2 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c2 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC11300zs1
    public C5275bD2 v0(XmlPullParser xmlPullParser, String str, @InterfaceC11300zs1 C5275bD2 c5275bD2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return C5275bD2.b(attributeValue);
        }
        return c5275bD2;
    }

    public AD2 w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // o.C4086Qy1.a
    /* renamed from: x */
    public C6067eU a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw C3989Py1.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw C3989Py1.c(null, e2);
        }
    }

    public C8190n7 y(XmlPullParser xmlPullParser, List<C4134Rl> list, @InterfaceC11300zs1 RZ1 rz1, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        int i;
        String str;
        String str2;
        ArrayList<C6960i70.b> arrayList2;
        RZ1.e eVar;
        ArrayList<C11097z20> arrayList3;
        long j6;
        float f2;
        ArrayList arrayList4;
        int i2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        long j7;
        int i3;
        ArrayList arrayList8;
        int i4;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList<C11097z20> arrayList11;
        long j8;
        ArrayList arrayList12;
        String str3;
        ArrayList arrayList13;
        long j9;
        long j10;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList14;
        int i5;
        C6310fU c6310fU;
        long j11;
        float f3;
        C6310fU c6310fU2 = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        long X = X(xmlPullParser3, "id", -1L);
        int G = G(xmlPullParser);
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int U = U(xmlPullParser3, "width", -1);
        int U2 = U(xmlPullParser3, "height", -1);
        float S = S(xmlPullParser3, -1.0f);
        int U3 = U(xmlPullParser3, "audioSamplingRate", -1);
        String str4 = C10928yK2.u;
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, C10928yK2.u);
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "label");
        ArrayList<C6960i70.b> arrayList15 = new ArrayList<>();
        ArrayList<C11097z20> arrayList16 = new ArrayList<>();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList<C11097z20> arrayList20 = arrayList16;
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        String str5 = attributeValue2;
        int i6 = G;
        long j12 = j3;
        ArrayList arrayList24 = arrayList22;
        int i7 = U;
        int i8 = U2;
        float f4 = S;
        String str6 = attributeValue4;
        String str7 = attributeValue3;
        boolean z2 = false;
        int i9 = -1;
        String str8 = null;
        RZ1 rz12 = rz1;
        String str9 = attributeValue;
        long j13 = j2;
        while (true) {
            xmlPullParser3.next();
            float f5 = f4;
            if (WN2.f(xmlPullParser3, "BaseURL")) {
                if (!z2) {
                    j13 = c6310fU2.B(xmlPullParser3, j13);
                    z2 = true;
                }
                long j14 = j13;
                arrayList23.addAll(c6310fU2.C(xmlPullParser3, list, z));
                arrayList = arrayList23;
                str2 = str4;
                arrayList2 = arrayList15;
                arrayList10 = arrayList21;
                eVar = rz12;
                arrayList9 = arrayList24;
                arrayList11 = arrayList20;
                f2 = f5;
                arrayList4 = arrayList19;
                i3 = U3;
                arrayList8 = arrayList18;
                arrayList5 = arrayList17;
                j7 = j14;
            } else {
                long j15 = j13;
                if (WN2.f(xmlPullParser3, "ContentProtection")) {
                    Pair<String, C6960i70.b> F = F(xmlPullParser);
                    Object obj = F.first;
                    if (obj != null) {
                        str8 = (String) obj;
                    }
                    Object obj2 = F.second;
                    if (obj2 != null) {
                        arrayList15.add((C6960i70.b) obj2);
                    }
                    arrayList = arrayList23;
                    str2 = str4;
                    arrayList2 = arrayList15;
                    arrayList10 = arrayList21;
                    eVar = rz12;
                    arrayList9 = arrayList24;
                    arrayList11 = arrayList20;
                } else {
                    if (WN2.f(xmlPullParser3, "ContentComponent")) {
                        String q = q(str7, xmlPullParser3.getAttributeValue(null, str4));
                        i6 = p(i6, G(xmlPullParser));
                        arrayList = arrayList23;
                        str7 = q;
                    } else {
                        if (WN2.f(xmlPullParser3, "Role")) {
                            arrayList18.add(I(xmlPullParser3, "Role"));
                        } else if (WN2.f(xmlPullParser3, "AudioChannelConfiguration")) {
                            arrayList = arrayList23;
                            i9 = A(xmlPullParser);
                        } else if (WN2.f(xmlPullParser3, "Accessibility")) {
                            arrayList17.add(I(xmlPullParser3, "Accessibility"));
                        } else if (WN2.f(xmlPullParser3, "EssentialProperty")) {
                            arrayList19.add(I(xmlPullParser3, "EssentialProperty"));
                        } else if (WN2.f(xmlPullParser3, "SupplementalProperty")) {
                            arrayList21.add(I(xmlPullParser3, "SupplementalProperty"));
                        } else {
                            if (WN2.f(xmlPullParser3, "Representation")) {
                                arrayList = arrayList23;
                                int i10 = i6;
                                str2 = str4;
                                String str10 = str5;
                                String str11 = str7;
                                int i11 = i7;
                                if (!arrayList23.isEmpty()) {
                                    arrayList12 = arrayList;
                                    f3 = f5;
                                    arrayList2 = arrayList15;
                                    str3 = str9;
                                    arrayList13 = arrayList24;
                                    arrayList3 = arrayList20;
                                    j9 = j;
                                    j10 = j4;
                                    xmlPullParser2 = xmlPullParser3;
                                    arrayList14 = arrayList19;
                                    i5 = i8;
                                    c6310fU = this;
                                    j11 = j5;
                                } else {
                                    arrayList12 = list;
                                    arrayList2 = arrayList15;
                                    str3 = str9;
                                    arrayList13 = arrayList24;
                                    arrayList3 = arrayList20;
                                    j9 = j;
                                    j10 = j4;
                                    xmlPullParser2 = xmlPullParser3;
                                    arrayList14 = arrayList19;
                                    i5 = i8;
                                    c6310fU = this;
                                    j11 = j5;
                                    f3 = f5;
                                }
                                a e0 = c6310fU.e0(xmlPullParser2, arrayList12, str3, str10, i11, i5, f3, i9, U3, str11, arrayList18, arrayList17, arrayList14, arrayList21, rz12, j10, j9, j15, j12, j11, z);
                                str9 = str3;
                                i8 = i5;
                                str = str11;
                                arrayList8 = arrayList18;
                                arrayList4 = arrayList14;
                                eVar = rz12;
                                f2 = f3;
                                arrayList5 = arrayList17;
                                arrayList6 = arrayList21;
                                j7 = j15;
                                str5 = str10;
                                i7 = i11;
                                i3 = U3;
                                j6 = j12;
                                i2 = i9;
                                i = p(i10, C4128Rj1.l(e0.a.g1));
                                arrayList7 = arrayList13;
                                arrayList7.add(e0);
                                xmlPullParser3 = xmlPullParser2;
                            } else {
                                arrayList = arrayList23;
                                i = i6;
                                str = str7;
                                str2 = str4;
                                arrayList2 = arrayList15;
                                eVar = rz12;
                                arrayList3 = arrayList20;
                                j6 = j12;
                                f2 = f5;
                                XmlPullParser xmlPullParser4 = xmlPullParser3;
                                arrayList4 = arrayList19;
                                i2 = i9;
                                arrayList5 = arrayList17;
                                arrayList6 = arrayList21;
                                arrayList7 = arrayList24;
                                j7 = j15;
                                i3 = U3;
                                arrayList8 = arrayList18;
                                if (WN2.f(xmlPullParser4, "SegmentBase")) {
                                    xmlPullParser3 = xmlPullParser4;
                                    eVar = j0(xmlPullParser4, (RZ1.e) eVar);
                                } else if (WN2.f(xmlPullParser4, "SegmentList")) {
                                    long B = B(xmlPullParser4, j6);
                                    arrayList9 = arrayList7;
                                    xmlPullParser3 = xmlPullParser;
                                    eVar = k0(xmlPullParser3, (RZ1.b) eVar, j4, j, j7, B, j5);
                                    arrayList10 = arrayList6;
                                    str7 = str;
                                    i6 = i;
                                    arrayList11 = arrayList3;
                                    j8 = B;
                                    i9 = i2;
                                    j12 = j8;
                                } else {
                                    i4 = i;
                                    xmlPullParser3 = xmlPullParser4;
                                    arrayList9 = arrayList7;
                                    if (WN2.f(xmlPullParser3, "SegmentTemplate")) {
                                        long B2 = B(xmlPullParser3, j6);
                                        arrayList10 = arrayList6;
                                        RZ1.c l0 = l0(xmlPullParser3, (RZ1.c) eVar, arrayList10, j4, j, j7, B2, j5);
                                        j7 = j7;
                                        eVar = l0;
                                        str7 = str;
                                        i9 = i2;
                                        i6 = i4;
                                        arrayList11 = arrayList3;
                                        j12 = B2;
                                    } else {
                                        arrayList10 = arrayList6;
                                        if (WN2.f(xmlPullParser3, "InbandEventStream")) {
                                            arrayList11 = arrayList3;
                                            arrayList11.add(I(xmlPullParser3, "InbandEventStream"));
                                        } else {
                                            arrayList11 = arrayList3;
                                            if (WN2.f(xmlPullParser3, "Label")) {
                                                str6 = V(xmlPullParser);
                                            } else if (WN2.e(xmlPullParser3)) {
                                                z(xmlPullParser);
                                            }
                                        }
                                        i9 = i2;
                                        j8 = j6;
                                        str7 = str;
                                        i6 = i4;
                                        j12 = j8;
                                    }
                                }
                            }
                            arrayList9 = arrayList7;
                            arrayList10 = arrayList6;
                            i9 = i2;
                            arrayList11 = arrayList3;
                            j12 = j6;
                            str7 = str;
                            i6 = i;
                        }
                        arrayList = arrayList23;
                        str = str7;
                        str2 = str4;
                        arrayList2 = arrayList15;
                        arrayList10 = arrayList21;
                        eVar = rz12;
                        arrayList9 = arrayList24;
                        arrayList11 = arrayList20;
                        f2 = f5;
                        arrayList4 = arrayList19;
                        i3 = U3;
                        arrayList8 = arrayList18;
                        arrayList5 = arrayList17;
                        j7 = j15;
                        long j16 = j12;
                        i4 = i6;
                        i2 = i9;
                        j6 = j16;
                        i9 = i2;
                        j8 = j6;
                        str7 = str;
                        i6 = i4;
                        j12 = j8;
                    }
                    str2 = str4;
                    arrayList2 = arrayList15;
                    arrayList10 = arrayList21;
                    eVar = rz12;
                    arrayList9 = arrayList24;
                    arrayList11 = arrayList20;
                }
                f2 = f5;
                arrayList4 = arrayList19;
                i3 = U3;
                arrayList8 = arrayList18;
                arrayList5 = arrayList17;
                j7 = j15;
            }
            if (WN2.d(xmlPullParser3, "AdaptationSet")) {
                break;
            }
            c6310fU2 = this;
            U3 = i3;
            arrayList17 = arrayList5;
            arrayList18 = arrayList8;
            str4 = str2;
            arrayList24 = arrayList9;
            arrayList21 = arrayList10;
            rz12 = eVar;
            j13 = j7;
            f4 = f2;
            arrayList19 = arrayList4;
            arrayList15 = arrayList2;
            arrayList20 = arrayList11;
            arrayList23 = arrayList;
        }
        ArrayList arrayList25 = new ArrayList(arrayList9.size());
        int i12 = 0;
        while (i12 < arrayList9.size()) {
            ArrayList<C11097z20> arrayList26 = arrayList11;
            arrayList25.add(j((a) arrayList9.get(i12), str6, str8, arrayList2, arrayList26));
            i12++;
            arrayList11 = arrayList26;
        }
        return c(X, i6, arrayList25, arrayList5, arrayList4, arrayList10);
    }

    public void z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        w(xmlPullParser);
    }
}
