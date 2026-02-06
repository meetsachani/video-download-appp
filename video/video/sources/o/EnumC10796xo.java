package o;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;
import o.C10553wo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC7311ja0
/* renamed from: o.xo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC10796xo implements C10553wo.c {
    public static final EnumC10796xo X = new a("MURMUR128_MITZ_32", 0);
    public static final EnumC10796xo Y = new EnumC10796xo("MURMUR128_MITZ_64", 1) { // from class: o.xo.b
        @Override // o.C10553wo.c
        public <T> boolean C5(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, c cVar) {
            long b2 = cVar.b();
            byte[] l = DG0.x().a(t, tb0).l();
            long g = g(l);
            long h = h(l);
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= cVar.h((Long.MAX_VALUE & g) % b2);
                g += h;
            }
            return z;
        }

        @Override // o.C10553wo.c
        public <T> boolean S0(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, c cVar) {
            long b2 = cVar.b();
            byte[] l = DG0.x().a(t, tb0).l();
            long g = g(l);
            long h = h(l);
            for (int i2 = 0; i2 < i; i2++) {
                if (!cVar.e((Long.MAX_VALUE & g) % b2)) {
                    return false;
                }
                g += h;
            }
            return true;
        }

        public final long g(byte[] bArr) {
            return C7194j51.j(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        public final long h(byte[] bArr) {
            return C7194j51.j(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }
    };
    public static final /* synthetic */ EnumC10796xo[] Z = e();

    /* renamed from: o.xo$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC10796xo {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.C10553wo.c
        public <T> boolean C5(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, c cVar) {
            long b = cVar.b();
            long c = DG0.x().a(t, tb0).c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                z |= cVar.h(i5 % b);
            }
            return z;
        }

        @Override // o.C10553wo.c
        public <T> boolean S0(@InterfaceC8885py1 T t, TB0<? super T> tb0, int i, c cVar) {
            long b = cVar.b();
            long c = DG0.x().a(t, tb0).c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!cVar.e(i5 % b)) {
                    return false;
                }
            }
            return true;
        }
    }

    public EnumC10796xo(String str, int i) {
    }

    public static /* synthetic */ EnumC10796xo[] e() {
        return new EnumC10796xo[]{X, Y};
    }

    public static EnumC10796xo valueOf(String str) {
        return (EnumC10796xo) Enum.valueOf(EnumC10796xo.class, str);
    }

    public static EnumC10796xo[] values() {
        return (EnumC10796xo[]) Z.clone();
    }

    public /* synthetic */ EnumC10796xo(String str, int i, a aVar) {
        this(str, i);
    }

    /* renamed from: o.xo$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final int c = 6;
        public final AtomicLongArray a;
        public final InterfaceC9645t41 b;

        public c(long j) {
            C10664xF1.e(j > 0, "data length is zero!");
            this.a = new AtomicLongArray(C7775lT0.d(R41.g(j, 64L, RoundingMode.CEILING)));
            this.b = C10377w41.a();
        }

        public static long[] i(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        public long a() {
            return this.b.sum();
        }

        public long b() {
            return this.a.length() * 64;
        }

        public c c() {
            return new c(i(this.a));
        }

        public int d() {
            return this.a.length();
        }

        public boolean e(long j) {
            if (((1 << ((int) j)) & this.a.get((int) (j >>> 6))) != 0) {
                return true;
            }
            return false;
        }

        public boolean equals(@MB Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(i(this.a), i(((c) obj).a));
            }
            return false;
        }

        public void f(c cVar) {
            boolean z;
            if (this.a.length() == cVar.a.length()) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.m(z, "BitArrays must be of equal length (%s != %s)", this.a.length(), cVar.a.length());
            for (int i = 0; i < this.a.length(); i++) {
                g(i, cVar.a.get(i));
            }
        }

        public void g(int i, long j) {
            while (true) {
                long j2 = this.a.get(i);
                long j3 = j2 | j;
                if (j2 == j3) {
                    return;
                }
                int i2 = i;
                if (this.a.compareAndSet(i2, j2, j3)) {
                    this.b.add(Long.bitCount(j3) - Long.bitCount(j2));
                    return;
                }
                i = i2;
            }
        }

        public boolean h(long j) {
            long j2;
            long j3;
            if (e(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.a.compareAndSet(i, j2, j3));
            this.b.a();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(i(this.a));
        }

        public c(long[] jArr) {
            C10664xF1.e(jArr.length > 0, "data length is zero!");
            this.a = new AtomicLongArray(jArr);
            this.b = C10377w41.a();
            long j = 0;
            for (long j2 : jArr) {
                j += Long.bitCount(j2);
            }
            this.b.add(j);
        }
    }
}
