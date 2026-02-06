package o;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class YV0 extends OV0 {
    public static final Reader S1 = new a();
    public static final Object T1 = new Object();
    public Object[] O1;
    public int P1;
    public String[] Q1;
    public int[] R1;

    /* loaded from: classes3.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[XV0.values().length];
            a = iArr;
            try {
                iArr[XV0.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[XV0.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[XV0.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[XV0.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YV0(DV0 dv0) {
        super(S1);
        this.O1 = new Object[32];
        this.P1 = 0;
        this.Q1 = new String[32];
        this.R1 = new int[32];
        l0(dv0);
    }

    private String u() {
        return " at path " + Y();
    }

    @Override // o.OV0
    public String A() throws IOException {
        return g0(false);
    }

    @Override // o.OV0
    public void E() throws IOException {
        c0(XV0.NULL);
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // o.OV0
    public String G() throws IOException {
        XV0 I = I();
        XV0 xv0 = XV0.STRING;
        if (I != xv0 && I != XV0.NUMBER) {
            throw new IllegalStateException("Expected " + xv0 + " but was " + I + u());
        }
        String J = ((MV0) j0()).J();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return J;
    }

    @Override // o.OV0
    public XV0 I() throws IOException {
        if (this.P1 == 0) {
            return XV0.END_DOCUMENT;
        }
        Object i0 = i0();
        if (i0 instanceof Iterator) {
            boolean z = this.O1[this.P1 - 2] instanceof IV0;
            Iterator it = (Iterator) i0;
            if (it.hasNext()) {
                if (z) {
                    return XV0.NAME;
                }
                l0(it.next());
                return I();
            } else if (z) {
                return XV0.END_OBJECT;
            } else {
                return XV0.END_ARRAY;
            }
        } else if (i0 instanceof IV0) {
            return XV0.BEGIN_OBJECT;
        } else {
            if (i0 instanceof C10237vV0) {
                return XV0.BEGIN_ARRAY;
            }
            if (i0 instanceof MV0) {
                MV0 mv0 = (MV0) i0;
                if (mv0.a0()) {
                    return XV0.STRING;
                }
                if (mv0.V()) {
                    return XV0.BOOLEAN;
                }
                if (mv0.Y()) {
                    return XV0.NUMBER;
                }
                throw new AssertionError();
            } else if (i0 instanceof HV0) {
                return XV0.NULL;
            } else {
                if (i0 == T1) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new A71("Custom JsonElement subclass " + i0.getClass().getName() + " is not supported");
            }
        }
    }

    @Override // o.OV0
    public String Y() {
        return o(false);
    }

    @Override // o.OV0
    public void Z() throws IOException {
        int i = b.a[I().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        j0();
                        int i2 = this.P1;
                        if (i2 > 0) {
                            int[] iArr = this.R1;
                            int i3 = i2 - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                l();
                return;
            }
            k();
            return;
        }
        g0(true);
    }

    public final void c0(XV0 xv0) throws IOException {
        if (I() == xv0) {
            return;
        }
        throw new IllegalStateException("Expected " + xv0 + " but was " + I() + u());
    }

    @Override // o.OV0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.O1 = new Object[]{T1};
        this.P1 = 1;
    }

    @Override // o.OV0
    public void d() throws IOException {
        c0(XV0.BEGIN_ARRAY);
        l0(((C10237vV0) i0()).iterator());
        this.R1[this.P1 - 1] = 0;
    }

    public DV0 e0() throws IOException {
        XV0 I = I();
        if (I != XV0.NAME && I != XV0.END_ARRAY && I != XV0.END_OBJECT && I != XV0.END_DOCUMENT) {
            DV0 dv0 = (DV0) i0();
            Z();
            return dv0;
        }
        throw new IllegalStateException("Unexpected " + I + " when reading a JsonElement.");
    }

    @Override // o.OV0
    public void f() throws IOException {
        c0(XV0.BEGIN_OBJECT);
        l0(((IV0) i0()).entrySet().iterator());
    }

    public final String g0(boolean z) throws IOException {
        String str;
        c0(XV0.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) i0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.Q1;
        int i = this.P1 - 1;
        if (z) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i] = str;
        l0(entry.getValue());
        return str2;
    }

    public final Object i0() {
        return this.O1[this.P1 - 1];
    }

    @InterfaceC6181ey
    public final Object j0() {
        Object[] objArr = this.O1;
        int i = this.P1 - 1;
        this.P1 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // o.OV0
    public void k() throws IOException {
        c0(XV0.END_ARRAY);
        j0();
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void k0() throws IOException {
        c0(XV0.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) i0()).next();
        l0(entry.getValue());
        l0(new MV0((String) entry.getKey()));
    }

    @Override // o.OV0
    public void l() throws IOException {
        c0(XV0.END_OBJECT);
        this.Q1[this.P1 - 1] = null;
        j0();
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void l0(Object obj) {
        int i = this.P1;
        Object[] objArr = this.O1;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.O1 = Arrays.copyOf(objArr, i2);
            this.R1 = Arrays.copyOf(this.R1, i2);
            this.Q1 = (String[]) Arrays.copyOf(this.Q1, i2);
        }
        Object[] objArr2 = this.O1;
        int i3 = this.P1;
        this.P1 = i3 + 1;
        objArr2[i3] = obj;
    }

    public final String o(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.P1;
            if (i < i2) {
                Object[] objArr = this.O1;
                Object obj = objArr[i];
                if (obj instanceof C10237vV0) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.R1[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof IV0) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.Q1[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // o.OV0
    public String p() {
        return o(true);
    }

    @Override // o.OV0
    public boolean r() throws IOException {
        XV0 I = I();
        if (I != XV0.END_OBJECT && I != XV0.END_ARRAY && I != XV0.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // o.OV0
    public String toString() {
        return YV0.class.getSimpleName() + u();
    }

    @Override // o.OV0
    public boolean v() throws IOException {
        c0(XV0.BOOLEAN);
        boolean h = ((MV0) j0()).h();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // o.OV0
    public double x() throws IOException {
        XV0 I = I();
        XV0 xv0 = XV0.NUMBER;
        if (I != xv0 && I != XV0.STRING) {
            throw new IllegalStateException("Expected " + xv0 + " but was " + I + u());
        }
        double k = ((MV0) i0()).k();
        if (!s() && (Double.isNaN(k) || Double.isInfinite(k))) {
            throw new A71("JSON forbids NaN and infinities: " + k);
        }
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    @Override // o.OV0
    public int y() throws IOException {
        XV0 I = I();
        XV0 xv0 = XV0.NUMBER;
        if (I != xv0 && I != XV0.STRING) {
            throw new IllegalStateException("Expected " + xv0 + " but was " + I + u());
        }
        int p = ((MV0) i0()).p();
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return p;
    }

    @Override // o.OV0
    public long z() throws IOException {
        XV0 I = I();
        XV0 xv0 = XV0.NUMBER;
        if (I != xv0 && I != XV0.STRING) {
            throw new IllegalStateException("Expected " + xv0 + " but was " + I + u());
        }
        long F = ((MV0) i0()).F();
        j0();
        int i = this.P1;
        if (i > 0) {
            int[] iArr = this.R1;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return F;
    }
}
