package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Deprecated
/* renamed from: o.rb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9286rb2 implements InterfaceC4651Ws0<C9286rb2> {
    public static final int i = -1;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    @InterfaceC11300zs1
    public final a e;
    public final b[] f;
    public final long g;
    public final long h;

    /* renamed from: o.rb2$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final UUID a;
        public final byte[] b;
        public final C8858pr2[] c;

        public a(UUID uuid, byte[] bArr, C8858pr2[] c8858pr2Arr) {
            this.a = uuid;
            this.b = bArr;
            this.c = c8858pr2Arr;
        }
    }

    public C9286rb2(int i2, int i3, long j, long j2, long j3, int i4, boolean z, @InterfaceC11300zs1 a aVar, b[] bVarArr) {
        this(i2, i3, j2 == 0 ? -9223372036854775807L : TD2.C1(j2, 1000000L, j), j3 != 0 ? TD2.C1(j3, 1000000L, j) : C10323vs.b, i4, z, aVar, bVarArr);
    }

    @Override // o.InterfaceC4651Ws0
    /* renamed from: b */
    public final C9286rb2 a(List<C3031Gd2> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C3031Gd2 c3031Gd2 = (C3031Gd2) arrayList.get(i2);
            b bVar2 = this.f[c3031Gd2.Y];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((C10833xx0[]) arrayList3.toArray(new C10833xx0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[c3031Gd2.Z]);
            i2++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((C10833xx0[]) arrayList3.toArray(new C10833xx0[0])));
        }
        return new C9286rb2(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* renamed from: o.rb2$b */
    /* loaded from: classes2.dex */
    public static class b {
        public static final String q = "{start time}";
        public static final String r = "{start_time}";
        public static final String s = "{bitrate}";
        public static final String t = "{Bitrate}";
        public final int a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        @InterfaceC11300zs1
        public final String i;
        public final C10833xx0[] j;
        public final int k;
        public final String l;
        public final String m;
        public final List<Long> n;

        /* renamed from: o  reason: collision with root package name */
        public final long[] f850o;
        public final long p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @InterfaceC11300zs1 String str5, C10833xx0[] c10833xx0Arr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, c10833xx0Arr, list, TD2.D1(list, 1000000L, j), TD2.C1(j2, 1000000L, j));
        }

        public Uri a(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (this.j != null) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            if (this.n != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.i(z2);
            if (i2 < this.n.size()) {
                z3 = true;
            }
            C9542sf.i(z3);
            String num = Integer.toString(this.j[i].c1);
            String l = this.n.get(i2).toString();
            return RC2.f(this.l, this.m.replace(s, num).replace(t, num).replace(q, l).replace(r, l));
        }

        public b b(C10833xx0[] c10833xx0Arr) {
            return new b(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, c10833xx0Arr, this.n, this.f850o, this.p);
        }

        public long c(int i) {
            if (i == this.k - 1) {
                return this.p;
            }
            long[] jArr = this.f850o;
            return jArr[i + 1] - jArr[i];
        }

        public int d(long j) {
            return TD2.n(this.f850o, j, true, true);
        }

        public long e(int i) {
            return this.f850o[i];
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, @InterfaceC11300zs1 String str5, C10833xx0[] c10833xx0Arr, List<Long> list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.a = i;
            this.b = str3;
            this.c = j;
            this.d = str4;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = str5;
            this.j = c10833xx0Arr;
            this.n = list;
            this.f850o = jArr;
            this.p = j2;
            this.k = list.size();
        }
    }

    public C9286rb2(int i2, int i3, long j, long j2, int i4, boolean z, @InterfaceC11300zs1 a aVar, b[] bVarArr) {
        this.a = i2;
        this.b = i3;
        this.g = j;
        this.h = j2;
        this.c = i4;
        this.d = z;
        this.e = aVar;
        this.f = bVarArr;
    }
}
