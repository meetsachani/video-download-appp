package o;

import java.io.Serializable;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC6365fj0
@InterfaceC6480g82(version = "2.0")
/* renamed from: o.iE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6990iE2 implements Comparable<C6990iE2>, Serializable {
    public static final int Z0 = 16;
    public static final int a1 = 128;
    public final long X;
    public final long Y;
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public static final C6990iE2 Y0 = new C6990iE2(0, 0);

    /* renamed from: o.iE2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C6990iE2 a(@NotNull byte[] bArr) {
            String v;
            C6562gT0.p(bArr, "byteArray");
            if (bArr.length == 16) {
                return b(C7474kE2.b(bArr, 0), C7474kE2.b(bArr, 8));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected exactly 16 bytes, but was ");
            v = C7717lE2.v(bArr, 32);
            sb.append(v);
            sb.append(" of size ");
            sb.append(bArr.length);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        @NotNull
        public final C6990iE2 b(long j, long j2) {
            if (j == 0 && j2 == 0) {
                return g();
            }
            return new C6990iE2(j, j2, null);
        }

        @InterfaceC5880dj0
        @InterfaceC6480g82(version = "2.1")
        @NotNull
        public final C6990iE2 c(@NotNull byte[] bArr) {
            C6562gT0.p(bArr, "ubyteArray");
            return a(bArr);
        }

        @NotNull
        public final C6990iE2 d(long j, long j2) {
            return b(j, j2);
        }

        @NotNull
        public final Comparator<C6990iE2> e() {
            return C11156zH.q();
        }

        @NotNull
        public final C6990iE2 g() {
            return C6990iE2.Y0;
        }

        @NotNull
        public final C6990iE2 h(@NotNull String str) {
            String u;
            C6562gT0.p(str, "uuidString");
            int length = str.length();
            if (length != 32) {
                if (length == 36) {
                    return C7474kE2.n(str);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                u = C7717lE2.u(str, 64);
                sb.append(u);
                sb.append("\" of length ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString());
            }
            return C7474kE2.m(str);
        }

        @NotNull
        public final C6990iE2 i(@NotNull String str) {
            String u;
            C6562gT0.p(str, "hexString");
            if (str.length() == 32) {
                return C7474kE2.m(str);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a 32-char hexadecimal string, but was \"");
            u = C7717lE2.u(str, 64);
            sb.append(u);
            sb.append("\" of length ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString().toString());
        }

        @InterfaceC6480g82(version = "2.1")
        @NotNull
        public final C6990iE2 j(@NotNull String str) {
            String u;
            C6562gT0.p(str, "hexDashString");
            if (str.length() == 36) {
                return C7474kE2.n(str);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"");
            u = C7717lE2.u(str, 64);
            sb.append(u);
            sb.append("\" of length ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString().toString());
        }

        @NotNull
        public final C6990iE2 k() {
            return C7474kE2.h();
        }

        public a() {
        }

        @InterfaceC9150r20(message = "Use naturalOrder<Uuid>() instead", replaceWith = @IR1(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @InterfaceC9636t20(warningSince = "2.1")
        public static /* synthetic */ void f() {
        }
    }

    public /* synthetic */ C6990iE2(long j, long j2, C9516sY c9516sY) {
        this(j, j2);
    }

    private final Object writeReplace() {
        return C7474kE2.i(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6990iE2)) {
            return false;
        }
        C6990iE2 c6990iE2 = (C6990iE2) obj;
        if (this.X == c6990iE2.X && this.Y == c6990iE2.Y) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    @InterfaceC6480g82(version = "2.1")
    /* renamed from: g */
    public int compareTo(@NotNull C6990iE2 c6990iE2) {
        int compare;
        int compare2;
        C6562gT0.p(c6990iE2, "other");
        long j = this.X;
        if (j != c6990iE2.X) {
            compare2 = Long.compare(C9860tx2.n(j) ^ Long.MIN_VALUE, C9860tx2.n(c6990iE2.X) ^ Long.MIN_VALUE);
            return compare2;
        }
        compare = Long.compare(C9860tx2.n(this.Y) ^ Long.MIN_VALUE, C9860tx2.n(c6990iE2.Y) ^ Long.MIN_VALUE);
        return compare;
    }

    public final long h() {
        return this.Y;
    }

    public int hashCode() {
        return Long.hashCode(this.X ^ this.Y);
    }

    public final long j() {
        return this.X;
    }

    @NotNull
    public final byte[] m() {
        byte[] bArr = new byte[16];
        C7474kE2.j(bArr, 0, this.X);
        C7474kE2.j(bArr, 8, this.Y);
        return bArr;
    }

    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public final String n() {
        byte[] bArr = new byte[36];
        C7474kE2.a(this.X, bArr, 0, 0, 4);
        bArr[8] = C3307Iz.e0;
        C7474kE2.a(this.X, bArr, 9, 4, 6);
        bArr[13] = C3307Iz.e0;
        C7474kE2.a(this.X, bArr, 14, 6, 8);
        bArr[18] = C3307Iz.e0;
        C7474kE2.a(this.Y, bArr, 19, 0, 2);
        bArr[23] = C3307Iz.e0;
        C7474kE2.a(this.Y, bArr, 24, 2, 8);
        return C9545sf2.U1(bArr);
    }

    @NotNull
    public final String o() {
        byte[] bArr = new byte[32];
        C7474kE2.a(this.X, bArr, 0, 0, 8);
        C7474kE2.a(this.Y, bArr, 16, 0, 8);
        return C9545sf2.U1(bArr);
    }

    @XP0
    public final <T> T p(VA0<? super Long, ? super Long, ? extends T> va0) {
        C6562gT0.p(va0, "action");
        return va0.i(Long.valueOf(j()), Long.valueOf(h()));
    }

    @InterfaceC5880dj0
    @InterfaceC6480g82(version = "2.1")
    @NotNull
    public final byte[] q() {
        return Ww2.h(m());
    }

    @XP0
    public final <T> T r(VA0<? super C9860tx2, ? super C9860tx2, ? extends T> va0) {
        C6562gT0.p(va0, "action");
        return va0.i(C9860tx2.g(C9860tx2.n(j())), C9860tx2.g(C9860tx2.n(h())));
    }

    @NotNull
    public String toString() {
        return n();
    }

    public C6990iE2(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }

    @HK1
    public static /* synthetic */ void i() {
    }

    @HK1
    public static /* synthetic */ void l() {
    }
}
