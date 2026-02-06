package o;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: o.cW0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5589cW0 implements Closeable, Flushable {
    public static final Pattern g1 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] h1 = new String[128];
    public static final String[] i1;
    public final Writer X;
    public C3693Mx0 Y0;
    public String Z0;
    public String a1;
    public boolean b1;
    public EnumC7572ke2 c1;
    public boolean d1;
    public String e1;
    public boolean f1;
    public int[] Y = new int[32];
    public int Z = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            h1[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h1;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        i1 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C5589cW0(Writer writer) {
        y(6);
        this.c1 = EnumC7572ke2.LEGACY_STRICT;
        this.f1 = true;
        Objects.requireNonNull(writer, "out == null");
        this.X = writer;
        A(C3693Mx0.d);
    }

    public static boolean a(Class<? extends Number> cls) {
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            return false;
        }
        return true;
    }

    public final void A(C3693Mx0 c3693Mx0) {
        boolean z;
        Objects.requireNonNull(c3693Mx0);
        this.Y0 = c3693Mx0;
        this.a1 = ",";
        if (c3693Mx0.c()) {
            this.Z0 = ": ";
            if (this.Y0.b().isEmpty()) {
                this.a1 = C6566gU0.h;
            }
        } else {
            this.Z0 = ":";
        }
        if (this.Y0.b().isEmpty() && this.Y0.a().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.b1 = z;
    }

    public final void C(boolean z) {
        this.d1 = z;
    }

    public final void E(String str) {
        if (str.isEmpty()) {
            A(C3693Mx0.d);
        } else {
            A(C3693Mx0.e.d(str));
        }
    }

    @Deprecated
    public final void F(boolean z) {
        EnumC7572ke2 enumC7572ke2;
        if (z) {
            enumC7572ke2 = EnumC7572ke2.LENIENT;
        } else {
            enumC7572ke2 = EnumC7572ke2.LEGACY_STRICT;
        }
        H(enumC7572ke2);
    }

    public final void G(boolean z) {
        this.f1 = z;
    }

    public final void H(EnumC7572ke2 enumC7572ke2) {
        Objects.requireNonNull(enumC7572ke2);
        this.c1 = enumC7572ke2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(String str) throws IOException {
        String[] strArr;
        String str2;
        if (this.d1) {
            strArr = i1;
        } else {
            strArr = h1;
        }
        this.X.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.X.write(str, i, i2 - i);
                }
                this.X.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                this.X.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.X.write(str, i, length - i);
        }
        this.X.write(34);
    }

    @InterfaceC6181ey
    public C5589cW0 M(double d) throws IOException {
        T();
        if (this.c1 != EnumC7572ke2.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        f();
        this.X.append((CharSequence) Double.toString(d));
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 N(float f) throws IOException {
        T();
        if (this.c1 != EnumC7572ke2.LENIENT && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        f();
        this.X.append((CharSequence) Float.toString(f));
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 O(long j) throws IOException {
        T();
        f();
        this.X.write(Long.toString(j));
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 P(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            return u();
        }
        T();
        f();
        Writer writer = this.X;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = C3855Oo.a;
        }
        writer.write(str);
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 Q(Number number) throws IOException {
        if (number == null) {
            return u();
        }
        T();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !g1.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (this.c1 != EnumC7572ke2.LENIENT) {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
            }
        }
        f();
        this.X.append((CharSequence) obj);
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 R(String str) throws IOException {
        if (str == null) {
            return u();
        }
        T();
        f();
        I(str);
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 S(boolean z) throws IOException {
        String str;
        T();
        f();
        Writer writer = this.X;
        if (z) {
            str = "true";
        } else {
            str = C3855Oo.a;
        }
        writer.write(str);
        return this;
    }

    public final void T() throws IOException {
        if (this.e1 != null) {
            d();
            I(this.e1);
            this.e1 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
        int i = this.Z;
        if (i <= 1 && (i != 1 || this.Y[i - 1] == 7)) {
            this.Z = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d() throws IOException {
        int x = x();
        if (x == 5) {
            this.X.write(this.a1);
        } else if (x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        t();
        z(4);
    }

    public final void f() throws IOException {
        int x = x();
        if (x != 1) {
            if (x != 2) {
                if (x != 4) {
                    if (x != 6) {
                        if (x == 7) {
                            if (this.c1 != EnumC7572ke2.LENIENT) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    z(7);
                    return;
                }
                this.X.append((CharSequence) this.Z0);
                z(5);
                return;
            }
            this.X.append((CharSequence) this.a1);
            t();
            return;
        }
        z(2);
        t();
    }

    public void flush() throws IOException {
        if (this.Z != 0) {
            this.X.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @InterfaceC6181ey
    public C5589cW0 h() throws IOException {
        T();
        return v(1, '[');
    }

    @InterfaceC6181ey
    public C5589cW0 i() throws IOException {
        T();
        return v(3, '{');
    }

    @InterfaceC6181ey
    public final C5589cW0 j(int i, int i2, char c) throws IOException {
        int x = x();
        if (x != i2 && x != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.e1 == null) {
            this.Z--;
            if (x == i2) {
                t();
            }
            this.X.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.e1);
    }

    @InterfaceC6181ey
    public C5589cW0 k() throws IOException {
        return j(1, 2, ']');
    }

    @InterfaceC6181ey
    public C5589cW0 l() throws IOException {
        return j(3, 5, '}');
    }

    public final C3693Mx0 m() {
        return this.Y0;
    }

    public final boolean n() {
        return this.f1;
    }

    public final EnumC7572ke2 o() {
        return this.c1;
    }

    public final boolean p() {
        return this.d1;
    }

    public boolean q() {
        if (this.c1 == EnumC7572ke2.LENIENT) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public C5589cW0 r(String str) throws IOException {
        if (str == null) {
            return u();
        }
        T();
        f();
        this.X.append((CharSequence) str);
        return this;
    }

    @InterfaceC6181ey
    public C5589cW0 s(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.e1 == null) {
            int x = x();
            if (x != 3 && x != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.e1 = str;
            return this;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void t() throws IOException {
        if (!this.b1) {
            this.X.write(this.Y0.b());
            int i = this.Z;
            for (int i2 = 1; i2 < i; i2++) {
                this.X.write(this.Y0.a());
            }
        }
    }

    @InterfaceC6181ey
    public C5589cW0 u() throws IOException {
        if (this.e1 != null) {
            if (this.f1) {
                T();
            } else {
                this.e1 = null;
                return this;
            }
        }
        f();
        this.X.write("null");
        return this;
    }

    @InterfaceC6181ey
    public final C5589cW0 v(int i, char c) throws IOException {
        f();
        y(i);
        this.X.write(c);
        return this;
    }

    public final int x() {
        int i = this.Z;
        if (i != 0) {
            return this.Y[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void y(int i) {
        int i2 = this.Z;
        int[] iArr = this.Y;
        if (i2 == iArr.length) {
            this.Y = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        iArr2[i3] = i;
    }

    public final void z(int i) {
        this.Y[this.Z - 1] = i;
    }
}
