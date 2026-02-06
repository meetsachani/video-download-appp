package o;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

@InterfaceC7311ja0
/* loaded from: classes3.dex */
public final class DG0 {
    public static final int a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @NN0
    /* loaded from: classes3.dex */
    public static abstract class b implements AO0<Checksum> {
        public final InterfaceC9449sG0 X;
        public static final b Y = new a("CRC_32", 0, "Hashing.crc32()");
        public static final b Z = new C0175b("ADLER_32", 1, "Hashing.adler32()");
        public static final /* synthetic */ b[] Y0 = e();

        /* loaded from: classes3.dex */
        public enum a extends b {
            public a(String str, int i, String str2) {
                super(str, i, str2);
            }

            @Override // o.InterfaceC8331nh2
            /* renamed from: g */
            public Checksum get() {
                return new CRC32();
            }
        }

        /* renamed from: o.DG0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum C0175b extends b {
            public C0175b(String str, int i, String str2) {
                super(str, i, str2);
            }

            @Override // o.InterfaceC8331nh2
            /* renamed from: g */
            public Checksum get() {
                return new Adler32();
            }
        }

        public static /* synthetic */ b[] e() {
            return new b[]{Y, Z};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Y0.clone();
        }

        public b(String str, int i, String str2) {
            this.X = new VB(this, 32, str2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC8649p0 {
        @Override // o.InterfaceC9449sG0
        public int d() {
            int i = 0;
            for (InterfaceC9449sG0 interfaceC9449sG0 : this.X) {
                i += interfaceC9449sG0.d();
            }
            return i;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.X, ((c) obj).X);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.X);
        }

        @Override // o.AbstractC8649p0
        public AbstractC8471oG0 m(CG0[] cg0Arr) {
            byte[] bArr = new byte[d() / 8];
            int i = 0;
            for (CG0 cg0 : cg0Arr) {
                AbstractC8471oG0 o2 = cg0.o();
                i += o2.n(bArr, i, o2.d() / 8);
            }
            return AbstractC8471oG0.h(bArr);
        }

        public c(InterfaceC9449sG0... interfaceC9449sG0Arr) {
            super(interfaceC9449sG0Arr);
            for (InterfaceC9449sG0 interfaceC9449sG0 : interfaceC9449sG0Arr) {
                C10664xF1.o(interfaceC9449sG0.d() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", interfaceC9449sG0.d(), interfaceC9449sG0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public long a;

        public d(long j) {
            this.a = j;
        }

        public double a() {
            long j = (this.a * 2862933555777941757L) + 1;
            this.a = j;
            return (((int) (j >>> 33)) + 1) / 2.147483648E9d;
        }
    }

    /* loaded from: classes3.dex */
    public static class e {
        public static final InterfaceC9449sG0 a = new C3148Hi1("MD5", "Hashing.md5()");
    }

    /* loaded from: classes3.dex */
    public static class f {
        public static final InterfaceC9449sG0 a = new C3148Hi1("SHA-1", "Hashing.sha1()");
    }

    /* loaded from: classes3.dex */
    public static class g {
        public static final InterfaceC9449sG0 a = new C3148Hi1(com.facebook.internal.l0.e, "Hashing.sha256()");
    }

    /* loaded from: classes3.dex */
    public static class h {
        public static final InterfaceC9449sG0 a = new C3148Hi1("SHA-384", "Hashing.sha384()");
    }

    /* loaded from: classes3.dex */
    public static class i {
        public static final InterfaceC9449sG0 a = new C3148Hi1("SHA-512", "Hashing.sha512()");
    }

    @Deprecated
    public static InterfaceC9449sG0 A(int i2) {
        return new C2761Dm1(i2, false);
    }

    public static InterfaceC9449sG0 B() {
        return C2761Dm1.Y0;
    }

    public static InterfaceC9449sG0 C(int i2) {
        return new C2761Dm1(i2, true);
    }

    @Deprecated
    public static InterfaceC9449sG0 D() {
        return f.a;
    }

    public static InterfaceC9449sG0 E() {
        return g.a;
    }

    public static InterfaceC9449sG0 F() {
        return h.a;
    }

    public static InterfaceC9449sG0 G() {
        return i.a;
    }

    public static InterfaceC9449sG0 H() {
        return K82.Z0;
    }

    public static InterfaceC9449sG0 I(long j, long j2) {
        return new K82(2, 4, j, j2);
    }

    public static InterfaceC9449sG0 a() {
        return b.Z.X;
    }

    public static int b(int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "Number of bits must be positive");
        return (i2 + 31) & (-32);
    }

    public static AbstractC8471oG0 c(Iterable<AbstractC8471oG0> iterable) {
        boolean z;
        Iterator<AbstractC8471oG0> it = iterable.iterator();
        C10664xF1.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int d2 = it.next().d() / 8;
        byte[] bArr = new byte[d2];
        for (AbstractC8471oG0 abstractC8471oG0 : iterable) {
            byte[] a2 = abstractC8471oG0.a();
            if (a2.length == d2) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < a2.length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] * C3307Iz.X) ^ a2[i2]);
            }
        }
        return AbstractC8471oG0.h(bArr);
    }

    public static AbstractC8471oG0 d(Iterable<AbstractC8471oG0> iterable) {
        boolean z;
        Iterator<AbstractC8471oG0> it = iterable.iterator();
        C10664xF1.e(it.hasNext(), "Must be at least 1 hash code to combine.");
        int d2 = it.next().d() / 8;
        byte[] bArr = new byte[d2];
        for (AbstractC8471oG0 abstractC8471oG0 : iterable) {
            byte[] a2 = abstractC8471oG0.a();
            if (a2.length == d2) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "All hashcodes must have the same bit length.");
            for (int i2 = 0; i2 < a2.length; i2++) {
                bArr[i2] = (byte) (bArr[i2] + a2[i2]);
            }
        }
        return AbstractC8471oG0.h(bArr);
    }

    public static InterfaceC9449sG0 e(Iterable<InterfaceC9449sG0> iterable) {
        C10664xF1.E(iterable);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9449sG0 interfaceC9449sG0 : iterable) {
            arrayList.add(interfaceC9449sG0);
        }
        C10664xF1.k(!arrayList.isEmpty(), "number of hash functions (%s) must be > 0", arrayList.size());
        return new c((InterfaceC9449sG0[]) arrayList.toArray(new InterfaceC9449sG0[0]));
    }

    public static InterfaceC9449sG0 f(InterfaceC9449sG0 interfaceC9449sG0, InterfaceC9449sG0 interfaceC9449sG02, InterfaceC9449sG0... interfaceC9449sG0Arr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC9449sG0);
        arrayList.add(interfaceC9449sG02);
        Collections.addAll(arrayList, interfaceC9449sG0Arr);
        return new c((InterfaceC9449sG0[]) arrayList.toArray(new InterfaceC9449sG0[0]));
    }

    public static int g(long j, int i2) {
        boolean z;
        int i3 = 0;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "buckets must be positive: %s", i2);
        d dVar = new d(j);
        while (true) {
            int a2 = (int) ((i3 + 1) / dVar.a());
            if (a2 < 0 || a2 >= i2) {
                break;
            }
            i3 = a2;
        }
        return i3;
    }

    public static int h(AbstractC8471oG0 abstractC8471oG0, int i2) {
        return g(abstractC8471oG0.m(), i2);
    }

    public static InterfaceC9449sG0 i() {
        return b.Y.X;
    }

    public static InterfaceC9449sG0 j() {
        return C5570cR.X;
    }

    public static InterfaceC9449sG0 k() {
        return C8353nn0.X;
    }

    public static InterfaceC9449sG0 l() {
        return C11060yt0.X;
    }

    public static InterfaceC9449sG0 m(int i2) {
        int b2 = b(i2);
        if (b2 == 32) {
            return C2761Dm1.Z0;
        }
        if (b2 <= 128) {
            return C2663Cm1.Z;
        }
        int i3 = (b2 + 127) / 128;
        InterfaceC9449sG0[] interfaceC9449sG0Arr = new InterfaceC9449sG0[i3];
        interfaceC9449sG0Arr[0] = C2663Cm1.Z;
        int i4 = a;
        for (int i5 = 1; i5 < i3; i5++) {
            i4 += 1500450271;
            interfaceC9449sG0Arr[i5] = y(i4);
        }
        return new c(interfaceC9449sG0Arr);
    }

    public static InterfaceC9449sG0 n(Key key) {
        return new C6961i71("HmacMD5", key, v("hmacMd5", key));
    }

    public static InterfaceC9449sG0 o(byte[] bArr) {
        return n(new SecretKeySpec((byte[]) C10664xF1.E(bArr), "HmacMD5"));
    }

    public static InterfaceC9449sG0 p(Key key) {
        return new C6961i71("HmacSHA1", key, v("hmacSha1", key));
    }

    public static InterfaceC9449sG0 q(byte[] bArr) {
        return p(new SecretKeySpec((byte[]) C10664xF1.E(bArr), "HmacSHA1"));
    }

    public static InterfaceC9449sG0 r(Key key) {
        return new C6961i71("HmacSHA256", key, v("hmacSha256", key));
    }

    public static InterfaceC9449sG0 s(byte[] bArr) {
        return r(new SecretKeySpec((byte[]) C10664xF1.E(bArr), "HmacSHA256"));
    }

    public static InterfaceC9449sG0 t(Key key) {
        return new C6961i71("HmacSHA512", key, v("hmacSha512", key));
    }

    public static InterfaceC9449sG0 u(byte[] bArr) {
        return t(new SecretKeySpec((byte[]) C10664xF1.E(bArr), "HmacSHA512"));
    }

    public static String v(String str, Key key) {
        return String.format("Hashing.%s(Key[algorithm=%s, format=%s])", str, key.getAlgorithm(), key.getFormat());
    }

    @Deprecated
    public static InterfaceC9449sG0 w() {
        return e.a;
    }

    public static InterfaceC9449sG0 x() {
        return C2663Cm1.Y;
    }

    public static InterfaceC9449sG0 y(int i2) {
        return new C2663Cm1(i2);
    }

    @Deprecated
    public static InterfaceC9449sG0 z() {
        return C2761Dm1.Z;
    }
}
