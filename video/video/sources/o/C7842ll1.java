package o;

import java.util.List;

@Deprecated
/* renamed from: o.ll1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7842ll1 {
    public final long a;
    public final List<a> b;

    /* renamed from: o.ll1$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public C7842ll1(long j, List<a> list) {
        this.a = j;
        this.b = list;
    }

    @InterfaceC11300zs1
    public C8103ml1 a(long j) {
        long j2;
        if (this.b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = this.b.get(size);
            boolean equals = C4128Rj1.f.equals(aVar.a) | z;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j2;
            long j9 = j3;
            j3 = j8;
            if (equals && j3 != j9) {
                j7 = j9 - j3;
                j6 = j3;
                z = false;
            } else {
                z = equals;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j9;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C8103ml1(j4, j5, this.a, j6, j7);
    }
}
