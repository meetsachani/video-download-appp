package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: o.qv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9117qv2 {
    public static final AbstractC8387nv2<BigInteger> A;
    public static final AbstractC8387nv2<DY0> B;
    public static final InterfaceC8631ov2 C;
    public static final AbstractC8387nv2<StringBuilder> D;
    public static final InterfaceC8631ov2 E;
    public static final AbstractC8387nv2<StringBuffer> F;
    public static final InterfaceC8631ov2 G;
    public static final AbstractC8387nv2<URL> H;
    public static final InterfaceC8631ov2 I;
    public static final AbstractC8387nv2<URI> J;
    public static final InterfaceC8631ov2 K;
    public static final AbstractC8387nv2<InetAddress> L;
    public static final InterfaceC8631ov2 M;
    public static final AbstractC8387nv2<UUID> N;
    public static final InterfaceC8631ov2 O;
    public static final AbstractC8387nv2<Currency> P;
    public static final InterfaceC8631ov2 Q;
    public static final AbstractC8387nv2<Calendar> R;
    public static final InterfaceC8631ov2 S;
    public static final AbstractC8387nv2<Locale> T;
    public static final InterfaceC8631ov2 U;
    public static final AbstractC8387nv2<DV0> V;
    public static final InterfaceC8631ov2 W;
    public static final InterfaceC8631ov2 X;
    public static final AbstractC8387nv2<Class> a;
    public static final InterfaceC8631ov2 b;
    public static final AbstractC8387nv2<BitSet> c;
    public static final InterfaceC8631ov2 d;
    public static final AbstractC8387nv2<Boolean> e;
    public static final AbstractC8387nv2<Boolean> f;
    public static final InterfaceC8631ov2 g;
    public static final AbstractC8387nv2<Number> h;
    public static final InterfaceC8631ov2 i;
    public static final AbstractC8387nv2<Number> j;
    public static final InterfaceC8631ov2 k;
    public static final AbstractC8387nv2<Number> l;
    public static final InterfaceC8631ov2 m;
    public static final AbstractC8387nv2<AtomicInteger> n;

    /* renamed from: o  reason: collision with root package name */
    public static final InterfaceC8631ov2 f844o;
    public static final AbstractC8387nv2<AtomicBoolean> p;
    public static final InterfaceC8631ov2 q;
    public static final AbstractC8387nv2<AtomicIntegerArray> r;
    public static final InterfaceC8631ov2 s;
    public static final AbstractC8387nv2<Number> t;
    public static final AbstractC8387nv2<Number> u;
    public static final AbstractC8387nv2<Number> v;
    public static final AbstractC8387nv2<Character> w;
    public static final InterfaceC8631ov2 x;
    public static final AbstractC8387nv2<String> y;
    public static final AbstractC8387nv2<BigDecimal> z;

    /* renamed from: o.qv2$A */
    /* loaded from: classes3.dex */
    public class A extends AbstractC8387nv2<Boolean> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Boolean e(OV0 ov0) throws IOException {
            XV0 I = ov0.I();
            if (I == XV0.NULL) {
                ov0.E();
                return null;
            } else if (I == XV0.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(ov0.G()));
            } else {
                return Boolean.valueOf(ov0.v());
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Boolean bool) throws IOException {
            c5589cW0.P(bool);
        }
    }

    /* renamed from: o.qv2$B */
    /* loaded from: classes3.dex */
    public class B extends AbstractC8387nv2<Boolean> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Boolean e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Boolean.valueOf(ov0.G());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Boolean bool) throws IOException {
            String bool2;
            if (bool == null) {
                bool2 = "null";
            } else {
                bool2 = bool.toString();
            }
            c5589cW0.R(bool2);
        }
    }

    /* renamed from: o.qv2$C */
    /* loaded from: classes3.dex */
    public class C extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            try {
                int y = ov0.y();
                if (y <= 255 && y >= -128) {
                    return Byte.valueOf((byte) y);
                }
                throw new WV0("Lossy conversion from " + y + " to byte; at path " + ov0.p());
            } catch (NumberFormatException e) {
                throw new WV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.O(number.byteValue());
            }
        }
    }

    /* renamed from: o.qv2$D */
    /* loaded from: classes3.dex */
    public class D extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            try {
                int y = ov0.y();
                if (y <= 65535 && y >= -32768) {
                    return Short.valueOf((short) y);
                }
                throw new WV0("Lossy conversion from " + y + " to short; at path " + ov0.p());
            } catch (NumberFormatException e) {
                throw new WV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.O(number.shortValue());
            }
        }
    }

    /* renamed from: o.qv2$E */
    /* loaded from: classes3.dex */
    public class E extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            try {
                return Integer.valueOf(ov0.y());
            } catch (NumberFormatException e) {
                throw new WV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.O(number.intValue());
            }
        }
    }

    /* renamed from: o.qv2$F */
    /* loaded from: classes3.dex */
    public class F extends AbstractC8387nv2<AtomicInteger> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public AtomicInteger e(OV0 ov0) throws IOException {
            try {
                return new AtomicInteger(ov0.y());
            } catch (NumberFormatException e) {
                throw new WV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, AtomicInteger atomicInteger) throws IOException {
            c5589cW0.O(atomicInteger.get());
        }
    }

    /* renamed from: o.qv2$G */
    /* loaded from: classes3.dex */
    public class G extends AbstractC8387nv2<AtomicBoolean> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public AtomicBoolean e(OV0 ov0) throws IOException {
            return new AtomicBoolean(ov0.v());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, AtomicBoolean atomicBoolean) throws IOException {
            c5589cW0.S(atomicBoolean.get());
        }
    }

    /* renamed from: o.qv2$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9118a extends AbstractC8387nv2<AtomicIntegerArray> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public AtomicIntegerArray e(OV0 ov0) throws IOException {
            ArrayList arrayList = new ArrayList();
            ov0.d();
            while (ov0.r()) {
                try {
                    arrayList.add(Integer.valueOf(ov0.y()));
                } catch (NumberFormatException e) {
                    throw new WV0(e);
                }
            }
            ov0.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, AtomicIntegerArray atomicIntegerArray) throws IOException {
            c5589cW0.h();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c5589cW0.O(atomicIntegerArray.get(i));
            }
            c5589cW0.k();
        }
    }

    /* renamed from: o.qv2$b  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9119b extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            try {
                return Long.valueOf(ov0.z());
            } catch (NumberFormatException e) {
                throw new WV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.O(number.longValue());
            }
        }
    }

    /* renamed from: o.qv2$c  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9120c extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Float.valueOf((float) ov0.x());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            c5589cW0.Q(number);
        }
    }

    /* renamed from: o.qv2$d  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9121d extends AbstractC8387nv2<Number> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Number e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return Double.valueOf(ov0.x());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Number number) throws IOException {
            if (number == null) {
                c5589cW0.u();
            } else {
                c5589cW0.M(number.doubleValue());
            }
        }
    }

    /* renamed from: o.qv2$e  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9122e extends AbstractC8387nv2<Character> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Character e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            String G = ov0.G();
            if (G.length() == 1) {
                return Character.valueOf(G.charAt(0));
            }
            throw new WV0("Expecting character, got: " + G + "; at " + ov0.p());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Character ch) throws IOException {
            String valueOf;
            if (ch == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch);
            }
            c5589cW0.R(valueOf);
        }
    }

    /* renamed from: o.qv2$f  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9123f extends AbstractC8387nv2<String> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public String e(OV0 ov0) throws IOException {
            XV0 I = ov0.I();
            if (I == XV0.NULL) {
                ov0.E();
                return null;
            } else if (I == XV0.BOOLEAN) {
                return Boolean.toString(ov0.v());
            } else {
                return ov0.G();
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, String str) throws IOException {
            c5589cW0.R(str);
        }
    }

    /* renamed from: o.qv2$g  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class C9124g extends AbstractC8387nv2<BigDecimal> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public BigDecimal e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            String G = ov0.G();
            try {
                return C3286Is1.b(G);
            } catch (NumberFormatException e) {
                throw new WV0("Failed parsing '" + G + "' as BigDecimal; at path " + ov0.p(), e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, BigDecimal bigDecimal) throws IOException {
            c5589cW0.Q(bigDecimal);
        }
    }

    /* renamed from: o.qv2$h */
    /* loaded from: classes3.dex */
    public class h extends AbstractC8387nv2<BigInteger> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public BigInteger e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            String G = ov0.G();
            try {
                return C3286Is1.c(G);
            } catch (NumberFormatException e) {
                throw new WV0("Failed parsing '" + G + "' as BigInteger; at path " + ov0.p(), e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, BigInteger bigInteger) throws IOException {
            c5589cW0.Q(bigInteger);
        }
    }

    /* renamed from: o.qv2$i */
    /* loaded from: classes3.dex */
    public class i extends AbstractC8387nv2<DY0> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public DY0 e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return new DY0(ov0.G());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, DY0 dy0) throws IOException {
            c5589cW0.Q(dy0);
        }
    }

    /* renamed from: o.qv2$j */
    /* loaded from: classes3.dex */
    public class j extends AbstractC8387nv2<StringBuilder> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public StringBuilder e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return new StringBuilder(ov0.G());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, StringBuilder sb) throws IOException {
            String sb2;
            if (sb == null) {
                sb2 = null;
            } else {
                sb2 = sb.toString();
            }
            c5589cW0.R(sb2);
        }
    }

    /* renamed from: o.qv2$k */
    /* loaded from: classes3.dex */
    public class k extends AbstractC8387nv2<Class> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Class e(OV0 ov0) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + Bu2.a("java-lang-class-unsupported"));
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + Bu2.a("java-lang-class-unsupported"));
        }
    }

    /* renamed from: o.qv2$l */
    /* loaded from: classes3.dex */
    public class l extends AbstractC8387nv2<StringBuffer> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public StringBuffer e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return new StringBuffer(ov0.G());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, StringBuffer stringBuffer) throws IOException {
            String stringBuffer2;
            if (stringBuffer == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer.toString();
            }
            c5589cW0.R(stringBuffer2);
        }
    }

    /* renamed from: o.qv2$m */
    /* loaded from: classes3.dex */
    public class m extends AbstractC8387nv2<URL> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public URL e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            String G = ov0.G();
            if (G.equals("null")) {
                return null;
            }
            return new URL(G);
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, URL url) throws IOException {
            String externalForm;
            if (url == null) {
                externalForm = null;
            } else {
                externalForm = url.toExternalForm();
            }
            c5589cW0.R(externalForm);
        }
    }

    /* renamed from: o.qv2$n */
    /* loaded from: classes3.dex */
    public class n extends AbstractC8387nv2<URI> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public URI e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            try {
                String G = ov0.G();
                if (G.equals("null")) {
                    return null;
                }
                return new URI(G);
            } catch (URISyntaxException e) {
                throw new GV0(e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, URI uri) throws IOException {
            String aSCIIString;
            if (uri == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri.toASCIIString();
            }
            c5589cW0.R(aSCIIString);
        }
    }

    /* renamed from: o.qv2$o */
    /* loaded from: classes3.dex */
    public class o extends AbstractC8387nv2<InetAddress> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public InetAddress e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return InetAddress.getByName(ov0.G());
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, InetAddress inetAddress) throws IOException {
            String hostAddress;
            if (inetAddress == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress.getHostAddress();
            }
            c5589cW0.R(hostAddress);
        }
    }

    /* renamed from: o.qv2$p */
    /* loaded from: classes3.dex */
    public class p extends AbstractC8387nv2<UUID> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public UUID e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            String G = ov0.G();
            try {
                return UUID.fromString(G);
            } catch (IllegalArgumentException e) {
                throw new WV0("Failed parsing '" + G + "' as UUID; at path " + ov0.p(), e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, UUID uuid) throws IOException {
            String uuid2;
            if (uuid == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid.toString();
            }
            c5589cW0.R(uuid2);
        }
    }

    /* renamed from: o.qv2$q */
    /* loaded from: classes3.dex */
    public class q extends AbstractC8387nv2<Currency> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Currency e(OV0 ov0) throws IOException {
            String G = ov0.G();
            try {
                return Currency.getInstance(G);
            } catch (IllegalArgumentException e) {
                throw new WV0("Failed parsing '" + G + "' as Currency; at path " + ov0.p(), e);
            }
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Currency currency) throws IOException {
            c5589cW0.R(currency.getCurrencyCode());
        }
    }

    /* renamed from: o.qv2$r */
    /* loaded from: classes3.dex */
    public class r extends AbstractC8387nv2<Calendar> {
        public static final String a = "year";
        public static final String b = "month";
        public static final String c = "dayOfMonth";
        public static final String d = "hourOfDay";
        public static final String e = "minute";
        public static final String f = "second";

        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Calendar e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            ov0.f();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (ov0.I() != XV0.END_OBJECT) {
                String A = ov0.A();
                int y = ov0.y();
                A.getClass();
                char c2 = 65535;
                switch (A.hashCode()) {
                    case -1181204563:
                        if (A.equals(c)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1074026988:
                        if (A.equals(e)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -906279820:
                        if (A.equals(f)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 3704893:
                        if (A.equals(a)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 104080000:
                        if (A.equals(b)) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 985252545:
                        if (A.equals(d)) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        i3 = y;
                        break;
                    case 1:
                        i5 = y;
                        break;
                    case 2:
                        i6 = y;
                        break;
                    case 3:
                        i = y;
                        break;
                    case 4:
                        i2 = y;
                        break;
                    case 5:
                        i4 = y;
                        break;
                }
            }
            ov0.l();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Calendar calendar) throws IOException {
            if (calendar == null) {
                c5589cW0.u();
                return;
            }
            c5589cW0.i();
            c5589cW0.s(a);
            c5589cW0.O(calendar.get(1));
            c5589cW0.s(b);
            c5589cW0.O(calendar.get(2));
            c5589cW0.s(c);
            c5589cW0.O(calendar.get(5));
            c5589cW0.s(d);
            c5589cW0.O(calendar.get(11));
            c5589cW0.s(e);
            c5589cW0.O(calendar.get(12));
            c5589cW0.s(f);
            c5589cW0.O(calendar.get(13));
            c5589cW0.l();
        }
    }

    /* renamed from: o.qv2$s */
    /* loaded from: classes3.dex */
    public class s extends AbstractC8387nv2<Locale> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public Locale e(OV0 ov0) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(ov0.G(), CrashlyticsReportPersistence.m);
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, Locale locale) throws IOException {
            String locale2;
            if (locale == null) {
                locale2 = null;
            } else {
                locale2 = locale.toString();
            }
            c5589cW0.R(locale2);
        }
    }

    /* renamed from: o.qv2$t */
    /* loaded from: classes3.dex */
    public class t implements InterfaceC8631ov2 {
        public final /* synthetic */ Rv2 X;
        public final /* synthetic */ AbstractC8387nv2 Y;

        public t(Rv2 rv2, AbstractC8387nv2 abstractC8387nv2) {
            this.X = rv2;
            this.Y = abstractC8387nv2;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.equals(this.X)) {
                return this.Y;
            }
            return null;
        }
    }

    /* renamed from: o.qv2$u */
    /* loaded from: classes3.dex */
    public class u implements InterfaceC8631ov2 {
        public final /* synthetic */ Class X;
        public final /* synthetic */ AbstractC8387nv2 Y;

        public u(Class cls, AbstractC8387nv2 abstractC8387nv2) {
            this.X = cls;
            this.Y = abstractC8387nv2;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            if (rv2.f() == this.X) {
                return this.Y;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.X.getName() + ",adapter=" + this.Y + C6566gU0.g;
        }
    }

    /* renamed from: o.qv2$v */
    /* loaded from: classes3.dex */
    public class v extends AbstractC8387nv2<BitSet> {
        @Override // o.AbstractC8387nv2
        /* renamed from: j */
        public BitSet e(OV0 ov0) throws IOException {
            BitSet bitSet = new BitSet();
            ov0.d();
            XV0 I = ov0.I();
            int i = 0;
            while (I != XV0.END_ARRAY) {
                int i2 = z.a[I.ordinal()];
                boolean z = true;
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        z = ov0.v();
                    } else {
                        throw new WV0("Invalid bitset value type: " + I + "; at path " + ov0.Y());
                    }
                } else {
                    int y = ov0.y();
                    if (y == 0) {
                        z = false;
                    } else if (y != 1) {
                        throw new WV0("Invalid bitset value " + y + ", expected 0 or 1; at path " + ov0.p());
                    }
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                I = ov0.I();
            }
            ov0.k();
            return bitSet;
        }

        @Override // o.AbstractC8387nv2
        /* renamed from: k */
        public void i(C5589cW0 c5589cW0, BitSet bitSet) throws IOException {
            c5589cW0.h();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c5589cW0.O(bitSet.get(i) ? 1L : 0L);
            }
            c5589cW0.k();
        }
    }

    /* renamed from: o.qv2$w */
    /* loaded from: classes3.dex */
    public class w implements InterfaceC8631ov2 {
        public final /* synthetic */ Class X;
        public final /* synthetic */ Class Y;
        public final /* synthetic */ AbstractC8387nv2 Z;

        public w(Class cls, Class cls2, AbstractC8387nv2 abstractC8387nv2) {
            this.X = cls;
            this.Y = cls2;
            this.Z = abstractC8387nv2;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            Class<? super T> f = rv2.f();
            if (f != this.X && f != this.Y) {
                return null;
            }
            return this.Z;
        }

        public String toString() {
            return "Factory[type=" + this.Y.getName() + C2555Bk.p1 + this.X.getName() + ",adapter=" + this.Z + C6566gU0.g;
        }
    }

    /* renamed from: o.qv2$x */
    /* loaded from: classes3.dex */
    public class x implements InterfaceC8631ov2 {
        public final /* synthetic */ Class X;
        public final /* synthetic */ Class Y;
        public final /* synthetic */ AbstractC8387nv2 Z;

        public x(Class cls, Class cls2, AbstractC8387nv2 abstractC8387nv2) {
            this.X = cls;
            this.Y = cls2;
            this.Z = abstractC8387nv2;
        }

        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            Class<? super T> f = rv2.f();
            if (f != this.X && f != this.Y) {
                return null;
            }
            return this.Z;
        }

        public String toString() {
            return "Factory[type=" + this.X.getName() + C2555Bk.p1 + this.Y.getName() + ",adapter=" + this.Z + C6566gU0.g;
        }
    }

    /* renamed from: o.qv2$y */
    /* loaded from: classes3.dex */
    public class y implements InterfaceC8631ov2 {
        public final /* synthetic */ Class X;
        public final /* synthetic */ AbstractC8387nv2 Y;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        /* renamed from: o.qv2$y$a */
        /* loaded from: classes3.dex */
        public class a<T1> extends AbstractC8387nv2<T1> {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // o.AbstractC8387nv2
            public T1 e(OV0 ov0) throws IOException {
                T1 t1 = (T1) y.this.Y.e(ov0);
                if (t1 != null && !this.a.isInstance(t1)) {
                    throw new WV0("Expected a " + this.a.getName() + " but was " + t1.getClass().getName() + "; at path " + ov0.p());
                }
                return t1;
            }

            @Override // o.AbstractC8387nv2
            public void i(C5589cW0 c5589cW0, T1 t1) throws IOException {
                y.this.Y.i(c5589cW0, t1);
            }
        }

        public y(Class cls, AbstractC8387nv2 abstractC8387nv2) {
            this.X = cls;
            this.Y = abstractC8387nv2;
        }

        @Override // o.InterfaceC8631ov2
        public <T2> AbstractC8387nv2<T2> b(C5523cF0 c5523cF0, Rv2<T2> rv2) {
            Class<? super T2> f = rv2.f();
            if (!this.X.isAssignableFrom(f)) {
                return null;
            }
            return new a(f);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.X.getName() + ",adapter=" + this.Y + C6566gU0.g;
        }
    }

    /* renamed from: o.qv2$z */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class z {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[XV0.values().length];
            a = iArr;
            try {
                iArr[XV0.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[XV0.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[XV0.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        AbstractC8387nv2<Class> d2 = new k().d();
        a = d2;
        b = b(Class.class, d2);
        AbstractC8387nv2<BitSet> d3 = new v().d();
        c = d3;
        d = b(BitSet.class, d3);
        A a2 = new A();
        e = a2;
        f = new B();
        g = a(Boolean.TYPE, Boolean.class, a2);
        C c2 = new C();
        h = c2;
        i = a(Byte.TYPE, Byte.class, c2);
        D d4 = new D();
        j = d4;
        k = a(Short.TYPE, Short.class, d4);
        E e2 = new E();
        l = e2;
        m = a(Integer.TYPE, Integer.class, e2);
        AbstractC8387nv2<AtomicInteger> d5 = new F().d();
        n = d5;
        f844o = b(AtomicInteger.class, d5);
        AbstractC8387nv2<AtomicBoolean> d6 = new G().d();
        p = d6;
        q = b(AtomicBoolean.class, d6);
        AbstractC8387nv2<AtomicIntegerArray> d7 = new C9118a().d();
        r = d7;
        s = b(AtomicIntegerArray.class, d7);
        t = new C9119b();
        u = new C9120c();
        v = new C9121d();
        C9122e c9122e = new C9122e();
        w = c9122e;
        x = a(Character.TYPE, Character.class, c9122e);
        C9123f c9123f = new C9123f();
        y = c9123f;
        z = new C9124g();
        A = new h();
        B = new i();
        C = b(String.class, c9123f);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        AbstractC8387nv2<Currency> d8 = new q().d();
        P = d8;
        Q = b(Currency.class, d8);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        EV0 ev0 = EV0.a;
        V = ev0;
        W = e(DV0.class, ev0);
        X = C3909Pd0.d;
    }

    public C9117qv2() {
        throw new UnsupportedOperationException();
    }

    public static <TT> InterfaceC8631ov2 a(Class<TT> cls, Class<TT> cls2, AbstractC8387nv2<? super TT> abstractC8387nv2) {
        return new w(cls, cls2, abstractC8387nv2);
    }

    public static <TT> InterfaceC8631ov2 b(Class<TT> cls, AbstractC8387nv2<TT> abstractC8387nv2) {
        return new u(cls, abstractC8387nv2);
    }

    public static <TT> InterfaceC8631ov2 c(Rv2<TT> rv2, AbstractC8387nv2<TT> abstractC8387nv2) {
        return new t(rv2, abstractC8387nv2);
    }

    public static <TT> InterfaceC8631ov2 d(Class<TT> cls, Class<? extends TT> cls2, AbstractC8387nv2<? super TT> abstractC8387nv2) {
        return new x(cls, cls2, abstractC8387nv2);
    }

    public static <T1> InterfaceC8631ov2 e(Class<T1> cls, AbstractC8387nv2<T1> abstractC8387nv2) {
        return new y(cls, abstractC8387nv2);
    }
}
