package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class NV0 implements Closeable {
    public static final String[] b1 = new String[128];
    public int X;
    public boolean Z0;
    public boolean a1;
    public int[] Y = new int[32];
    public String[] Z = new String[32];
    public int[] Y0 = new int[32];

    /* loaded from: classes.dex */
    public static final class a {
        public final String[] a;
        public final C5205aw1 b;

        public a(String[] strArr, C5205aw1 c5205aw1) {
            this.a = strArr;
            this.b = c5205aw1;
        }

        public static a a(String... strArr) {
            try {
                C8859ps[] c8859psArr = new C8859ps[strArr.length];
                C5422bq c5422bq = new C5422bq();
                for (int i = 0; i < strArr.length; i++) {
                    NV0.v(c5422bq, strArr[i]);
                    c5422bq.readByte();
                    c8859psArr[i] = c5422bq.G4();
                }
                return new a((String[]) strArr.clone(), C5205aw1.r(c8859psArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            b1[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = b1;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static NV0 p(InterfaceC2677Cq interfaceC2677Cq) {
        return new C5104aW0(interfaceC2677Cq);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v(InterfaceC2579Bq interfaceC2579Bq, String str) throws IOException {
        String str2;
        String[] strArr = b1;
        interfaceC2579Bq.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    interfaceC2579Bq.Z1(str, i, i2);
                }
                interfaceC2579Bq.K1(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                interfaceC2579Bq.K1(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            interfaceC2579Bq.Z1(str, i, length);
        }
        interfaceC2579Bq.writeByte(34);
    }

    public final String Y() {
        return SV0.a(this.X, this.Y, this.Z, this.Y0);
    }

    public abstract void d() throws IOException;

    public abstract void f() throws IOException;

    public abstract void h() throws IOException;

    public abstract void i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract double l() throws IOException;

    public abstract int m() throws IOException;

    public abstract String n() throws IOException;

    public abstract String o() throws IOException;

    public abstract b q() throws IOException;

    public final void r(int i) {
        int i2 = this.X;
        int[] iArr = this.Y;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.Y = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.Z;
                this.Z = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.Y0;
                this.Y0 = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new AV0("Nesting too deep at " + Y());
            }
        }
        int[] iArr3 = this.Y;
        int i3 = this.X;
        this.X = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int s(a aVar) throws IOException;

    public abstract void t() throws IOException;

    public abstract void u() throws IOException;

    public final FV0 x(String str) throws FV0 {
        throw new FV0(str + " at path " + Y());
    }
}
