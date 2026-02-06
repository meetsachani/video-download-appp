package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

/* renamed from: o.Cj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2650Cj0 extends Hashtable {
    public static String b1 = "include";
    public static final String c1 = "${";
    public static final String d1 = "}";
    public C2650Cj0 X;
    public String Y;
    public String Y0;
    public String Z;
    public boolean Z0;
    public ArrayList a1;

    /* renamed from: o.Cj0$a */
    /* loaded from: classes4.dex */
    public static class a extends LineNumberReader {
        public a(Reader reader) {
            super(reader);
        }

        public String a() throws IOException {
            StringBuffer stringBuffer = new StringBuffer();
            String readLine = readLine();
            while (readLine != null) {
                String trim = readLine.trim();
                if (trim.length() != 0 && trim.charAt(0) != '#') {
                    if (C2650Cj0.l(trim)) {
                        stringBuffer.append(trim.substring(0, trim.length() - 1));
                    } else {
                        stringBuffer.append(trim);
                        return stringBuffer.toString();
                    }
                }
                readLine = readLine();
            }
            return null;
        }
    }

    /* renamed from: o.Cj0$b */
    /* loaded from: classes4.dex */
    public static class b extends StringTokenizer {
        public static final String a = ",";

        public b(String str) {
            super(str, ",");
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                if (!hasMoreTokens()) {
                    break;
                }
                String nextToken = super.nextToken();
                if (C2650Cj0.l(nextToken)) {
                    stringBuffer.append(nextToken.substring(0, nextToken.length() - 1));
                    stringBuffer.append(",");
                } else {
                    stringBuffer.append(nextToken);
                    break;
                }
            }
            return stringBuffer.toString().trim();
        }
    }

    public C2650Cj0() {
        try {
            this.Y0 = (String) AccessController.doPrivileged(new C2552Bj0(this));
        } catch (SecurityException unused) {
            this.Y0 = File.separator;
        }
        this.Z0 = false;
        this.a1 = new ArrayList();
    }

    public static C2650Cj0 i(Properties properties) {
        C2650Cj0 c2650Cj0 = new C2650Cj0();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            c2650Cj0.s0(str, properties.getProperty(str));
        }
        return c2650Cj0;
    }

    public static int j(String str, int i, char c) {
        int i2 = i - 1;
        int i3 = i2;
        while (i3 >= 0 && str.charAt(i3) == c) {
            i3--;
        }
        return i2 - i3;
    }

    public static boolean l(String str) {
        if (!str.endsWith(C11298zs.h) || j(str, str.length() - 1, '\\') % 2 != 0) {
            return false;
        }
        return true;
    }

    public static String m(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i = 0;
        while (i < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i);
            if (charAt == ',' || charAt == '\\') {
                stringBuffer.insert(i, '\\');
                i++;
            }
            i++;
        }
        return stringBuffer.toString();
    }

    public static String v0(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        int i = 0;
        while (i < stringBuffer.length() - 1) {
            char charAt = stringBuffer.charAt(i);
            int i2 = i + 1;
            char charAt2 = stringBuffer.charAt(i2);
            if (charAt == '\\' && charAt2 == '\\') {
                stringBuffer.deleteCharAt(i);
            }
            i = i2;
        }
        return stringBuffer.toString();
    }

    public float A(String str, float f) {
        return B(str, new Float(f)).floatValue();
    }

    public Float B(String str, Float f) {
        V v = get(str);
        if (v instanceof Float) {
            return (Float) v;
        }
        if (v instanceof String) {
            Float f2 = new Float((String) v);
            put(str, f2);
            return f2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.B(str, f);
            }
            return f;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Float object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public String C() {
        return b1;
    }

    public int D(String str) {
        return F(str);
    }

    public int E(String str, int i) {
        return G(str, i);
    }

    public int F(String str) {
        Integer H = H(str, null);
        if (H != null) {
            return H.intValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public int G(String str, int i) {
        Integer H = H(str, null);
        if (H == null) {
            return i;
        }
        return H.intValue();
    }

    public Integer H(String str, Integer num) {
        V v = get(str);
        if (v instanceof Integer) {
            return (Integer) v;
        }
        if (v instanceof String) {
            Integer num2 = new Integer((String) v);
            put(str, num2);
            return num2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.H(str, num);
            }
            return num;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Integer object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public Iterator I() {
        return this.a1.iterator();
    }

    public Iterator J(String str) {
        Iterator I = I();
        ArrayList arrayList = new ArrayList();
        while (I.hasNext()) {
            Object next = I.next();
            if ((next instanceof String) && ((String) next).startsWith(str)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public List K(String str) {
        return L(str, null);
    }

    public List L(String str, List list) {
        V v = get(str);
        if (v instanceof List) {
            return new ArrayList((List) v);
        }
        if (v instanceof String) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(v);
            put(str, arrayList);
            return arrayList;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.L(str, list);
            }
            if (list == null) {
                return new ArrayList();
            }
            return list;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a List object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public long N(String str) {
        Long P = P(str, null);
        if (P != null) {
            return P.longValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public long O(String str, long j) {
        return P(str, new Long(j)).longValue();
    }

    public Long P(String str, Long l) {
        V v = get(str);
        if (v instanceof Long) {
            return (Long) v;
        }
        if (v instanceof String) {
            Long l2 = new Long((String) v);
            put(str, l2);
            return l2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.P(str, l);
            }
            return l;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Long object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public Properties Q(String str) {
        return R(str, new Properties());
    }

    public Properties R(String str, Properties properties) {
        String[] c0 = c0(str);
        Properties properties2 = new Properties(properties);
        for (String str2 : c0) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0) {
                properties2.put(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1).trim());
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append('\'');
                stringBuffer.append(str2);
                stringBuffer.append("' does not contain ");
                stringBuffer.append("an equals sign");
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        return properties2;
    }

    public Object S(String str) {
        C2650Cj0 c2650Cj0;
        V v = get(str);
        if (v == 0 && (c2650Cj0 = this.X) != null) {
            return c2650Cj0.get(str);
        }
        return v;
    }

    public Short T(String str, Short sh) {
        V v = get(str);
        if (v instanceof Short) {
            return (Short) v;
        }
        if (v instanceof String) {
            Short sh2 = new Short((String) v);
            put(str, sh2);
            return sh2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.T(str, sh);
            }
            return sh;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Short object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public short W(String str) {
        Short T = T(str, null);
        if (T != null) {
            return T.shortValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public short X(String str, short s) {
        return T(str, new Short(s)).shortValue();
    }

    public String Y(String str) {
        return Z(str, null);
    }

    public String Z(String str, String str2) {
        V v = get(str);
        if (v instanceof String) {
            return g0((String) v);
        }
        if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return g0(c2650Cj0.Z(str, str2));
            }
            return g0(str2);
        } else if (v instanceof List) {
            return g0((String) ((List) v).get(0));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a String object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public void c(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.indexOf(",") > 0) {
                b bVar = new b(str2);
                while (bVar.hasMoreTokens()) {
                    e(str, v0(bVar.nextToken()));
                }
            } else {
                e(str, v0(str2));
            }
        } else {
            e(str, obj);
        }
        this.Z0 = true;
    }

    public String[] c0(String str) {
        List list;
        V v = get(str);
        if (v instanceof String) {
            list = new Vector(1);
            list.add(v);
        } else if (v instanceof List) {
            list = (List) v;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.c0(str);
            }
            return new String[0];
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a String/List object");
            throw new ClassCastException(stringBuffer.toString());
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) list.get(i);
        }
        return strArr;
    }

    public final void d(String str, Object obj) {
        if (!containsKey(str)) {
            this.a1.add(str);
        }
        put(str, obj);
    }

    public Vector d0(String str) {
        return f0(str, null);
    }

    public final void e(String str, Object obj) {
        V v = get(str);
        if (v instanceof String) {
            Vector vector = new Vector(2);
            vector.add(v);
            vector.add(obj);
            put(str, vector);
        } else if (v instanceof List) {
            ((List) v).add(obj);
        } else {
            if (!containsKey(str)) {
                this.a1.add(str);
            }
            put(str, obj);
        }
    }

    public void f(String str) {
        if (containsKey(str)) {
            int i = 0;
            while (true) {
                if (i >= this.a1.size()) {
                    break;
                } else if (this.a1.get(i).equals(str)) {
                    this.a1.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            remove(str);
        }
    }

    public Vector f0(String str, Vector vector) {
        V v = get(str);
        if (v instanceof List) {
            return new Vector((List) v);
        }
        if (v instanceof String) {
            Vector vector2 = new Vector(1);
            vector2.add(v);
            put(str, vector2);
            return vector2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.f0(str, vector);
            }
            if (vector == null) {
                return new Vector();
            }
            return vector;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Vector object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public void g(C2650Cj0 c2650Cj0) {
        Iterator I = c2650Cj0.I();
        while (I.hasNext()) {
            String str = (String) I.next();
            s0(str, c2650Cj0.get(str));
        }
    }

    public String g0(String str) {
        return h0(str, null);
    }

    public String h0(String str, List list) {
        int i;
        int indexOf;
        if (str == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList();
            list.add(str);
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = -1;
        while (true) {
            i = i2 + 1;
            int indexOf2 = str.indexOf("${", i);
            if (indexOf2 <= -1 || (indexOf = str.indexOf("}", indexOf2)) <= -1) {
                break;
            }
            stringBuffer.append(str.substring(i, indexOf2));
            String substring = str.substring(indexOf2 + 2, indexOf);
            if (list.contains(substring)) {
                String obj = list.remove(0).toString();
                list.add(substring);
                StringBuffer stringBuffer2 = new StringBuffer();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    stringBuffer2.append(it.next());
                    if (it.hasNext()) {
                        stringBuffer2.append("->");
                    }
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("infinite loop in property interpolation of ");
                stringBuffer3.append(obj);
                stringBuffer3.append(": ");
                stringBuffer3.append(stringBuffer2.toString());
                throw new IllegalStateException(stringBuffer3.toString());
            }
            list.add(substring);
            Object S = S(substring);
            if (S != null) {
                stringBuffer.append(h0(S.toString(), list));
                list.remove(list.size() - 1);
            } else {
                C2650Cj0 c2650Cj0 = this.X;
                if (c2650Cj0 != null && c2650Cj0.Z(substring, null) != null) {
                    stringBuffer.append(this.X.Y(substring));
                } else {
                    stringBuffer.append("${");
                    stringBuffer.append(substring);
                    stringBuffer.append("}");
                }
            }
            i2 = indexOf;
        }
        stringBuffer.append(str.substring(i, str.length()));
        return stringBuffer.toString();
    }

    public boolean i0() {
        return this.Z0;
    }

    public void k() {
        Iterator I = I();
        while (I.hasNext()) {
            String str = (String) I.next();
            Object obj = get(str);
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(" => ");
            stringBuffer.append(obj);
            printStream.println(stringBuffer.toString());
        }
    }

    public void m0(InputStream inputStream) throws IOException {
        o0(inputStream, null);
    }

    public Boolean n(String str, Boolean bool) {
        V v = get(str);
        if (v instanceof Boolean) {
            return (Boolean) v;
        }
        if (v instanceof String) {
            Boolean bool2 = new Boolean(u0((String) v));
            put(str, bool2);
            return bool2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.n(str, bool);
            }
            return bool;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Boolean object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public boolean o(String str) {
        Boolean n = n(str, null);
        if (n != null) {
            return n.booleanValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void o0(InputStream inputStream, String str) throws IOException {
        a aVar;
        String a2;
        File file;
        if (str != null) {
            try {
                aVar = new a(new InputStreamReader(inputStream, str));
            } catch (UnsupportedEncodingException unused) {
            }
            if (aVar == null) {
                try {
                    aVar = new a(new InputStreamReader(inputStream, "8859_1"));
                } catch (UnsupportedEncodingException unused2) {
                    aVar = new a(new InputStreamReader(inputStream));
                }
            }
            while (true) {
                a2 = aVar.a();
                if (a2 != null) {
                    this.Z0 = true;
                } else {
                    int indexOf = a2.indexOf(61);
                    if (indexOf > 0) {
                        String trim = a2.substring(0, indexOf).trim();
                        String trim2 = a2.substring(indexOf + 1).trim();
                        if (!"".equals(trim2)) {
                            if (C() != null && trim.equalsIgnoreCase(C())) {
                                if (trim2.startsWith(this.Y0)) {
                                    file = new File(trim2);
                                } else {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append(UE.h);
                                    stringBuffer.append(this.Y0);
                                    if (trim2.startsWith(stringBuffer.toString())) {
                                        trim2 = trim2.substring(2);
                                    }
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append(this.Z);
                                    stringBuffer2.append(trim2);
                                    file = new File(stringBuffer2.toString());
                                }
                                if (file.exists() && file.canRead()) {
                                    m0(new FileInputStream(file));
                                }
                            } else {
                                c(trim, trim2);
                            }
                        }
                    }
                }
            }
        }
        aVar = null;
        if (aVar == null) {
        }
        while (true) {
            a2 = aVar.a();
            if (a2 != null) {
            }
        }
    }

    public synchronized void q0(OutputStream outputStream, String str) throws IOException {
        if (outputStream == null) {
            return;
        }
        try {
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (str != null) {
                printWriter.println(str);
            }
            Enumeration keys = keys();
            while (keys.hasMoreElements()) {
                String str2 = (String) keys.nextElement();
                Object obj = get(str2);
                if (obj != null) {
                    if (obj instanceof String) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append(str2);
                        stringBuffer.append("=");
                        stringBuffer.append(m((String) obj));
                        printWriter.println(stringBuffer.toString());
                    } else if (obj instanceof List) {
                        for (String str3 : (List) obj) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append(str2);
                            stringBuffer2.append("=");
                            stringBuffer2.append(m(str3));
                            printWriter.println(stringBuffer2.toString());
                        }
                    }
                }
                printWriter.println();
                printWriter.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean r(String str, boolean z) {
        return n(str, new Boolean(z)).booleanValue();
    }

    public void r0(String str) {
        b1 = str;
    }

    public void s0(String str, Object obj) {
        f(str);
        c(str, obj);
    }

    public byte t(String str) {
        Byte v = v(str, null);
        if (v != null) {
            return v.byteValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append(" doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public C2650Cj0 t0(String str) {
        String substring;
        C2650Cj0 c2650Cj0 = new C2650Cj0();
        Iterator I = I();
        boolean z = false;
        while (I.hasNext()) {
            Object next = I.next();
            if (next instanceof String) {
                String str2 = (String) next;
                if (str2.startsWith(str)) {
                    if (!z) {
                        z = true;
                    }
                    if (str2.length() == str.length()) {
                        substring = str;
                    } else {
                        substring = str2.substring(str.length() + 1);
                    }
                    c2650Cj0.d(substring, get(next));
                }
            }
        }
        if (z) {
            return c2650Cj0;
        }
        return null;
    }

    public byte u(String str, byte b2) {
        return v(str, new Byte(b2)).byteValue();
    }

    public String u0(String str) {
        String lowerCase = str.toLowerCase();
        String str2 = "true";
        if (!lowerCase.equals("true") && !lowerCase.equals("on") && !lowerCase.equals(C3855Oo.f)) {
            str2 = C3855Oo.a;
            if (!lowerCase.equals(C3855Oo.a) && !lowerCase.equals("off") && !lowerCase.equals(C3855Oo.b)) {
                return null;
            }
        }
        return str2;
    }

    public Byte v(String str, Byte b2) {
        V v = get(str);
        if (v instanceof Byte) {
            return (Byte) v;
        }
        if (v instanceof String) {
            Byte b3 = new Byte((String) v);
            put(str, b3);
            return b3;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.v(str, b2);
            }
            return b2;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Byte object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public double w(String str) {
        Double y = y(str, null);
        if (y != null) {
            return y.doubleValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public double x(String str, double d) {
        return y(str, new Double(d)).doubleValue();
    }

    public Double y(String str, Double d) {
        V v = get(str);
        if (v instanceof Double) {
            return (Double) v;
        }
        if (v instanceof String) {
            Double d2 = new Double((String) v);
            put(str, d2);
            return d2;
        } else if (v == 0) {
            C2650Cj0 c2650Cj0 = this.X;
            if (c2650Cj0 != null) {
                return c2650Cj0.y(str, d);
            }
            return d;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('\'');
            stringBuffer.append(str);
            stringBuffer.append("' doesn't map to a Double object");
            throw new ClassCastException(stringBuffer.toString());
        }
    }

    public float z(String str) {
        Float B = B(str, null);
        if (B != null) {
            return B.floatValue();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('\'');
        stringBuffer.append(str);
        stringBuffer.append("' doesn't map to an existing object");
        throw new NoSuchElementException(stringBuffer.toString());
    }

    public C2650Cj0(String str) throws IOException {
        this(str, null);
    }

    public C2650Cj0(String str, String str2) throws IOException {
        FileInputStream fileInputStream;
        try {
            this.Y0 = (String) AccessController.doPrivileged(new C2552Bj0(this));
        } catch (SecurityException unused) {
            this.Y0 = File.separator;
        }
        this.Z0 = false;
        this.a1 = new ArrayList();
        this.Y = str;
        String absolutePath = new File(str).getAbsolutePath();
        this.Z = absolutePath;
        this.Z = absolutePath.substring(0, absolutePath.lastIndexOf(this.Y0) + 1);
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            m0(fileInputStream);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            if (str2 != null) {
                this.X = new C2650Cj0(str2);
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }
}
