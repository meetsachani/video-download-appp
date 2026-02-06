package o;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.xx0 */
/* loaded from: classes2.dex */
public final class C10833xx0 implements InterfaceC8368nr {
    public static final int D1 = -1;
    public static final long E1 = Long.MAX_VALUE;
    public static final C10833xx0 F1 = new b().G();
    public static final String G1 = TD2.R0(0);
    public static final String H1 = TD2.R0(1);
    public static final String I1 = TD2.R0(2);
    public static final String J1 = TD2.R0(3);
    public static final String K1 = TD2.R0(4);
    public static final String L1 = TD2.R0(5);
    public static final String M1 = TD2.R0(6);
    public static final String N1 = TD2.R0(7);
    public static final String O1 = TD2.R0(8);
    public static final String P1 = TD2.R0(9);
    public static final String Q1 = TD2.R0(10);
    public static final String R1 = TD2.R0(11);
    public static final String S1 = TD2.R0(12);
    public static final String T1 = TD2.R0(13);
    public static final String U1 = TD2.R0(14);
    public static final String V1 = TD2.R0(15);
    public static final String W1 = TD2.R0(16);
    public static final String X1 = TD2.R0(17);
    public static final String Y1 = TD2.R0(18);
    public static final String Z1 = TD2.R0(19);
    public static final String a2 = TD2.R0(20);
    public static final String b2 = TD2.R0(21);
    public static final String c2 = TD2.R0(22);
    public static final String d2 = TD2.R0(23);
    public static final String e2 = TD2.R0(24);
    public static final String f2 = TD2.R0(25);
    public static final String g2 = TD2.R0(26);
    public static final String h2 = TD2.R0(27);
    public static final String i2 = TD2.R0(28);
    public static final String j2 = TD2.R0(29);
    public static final String k2 = TD2.R0(30);
    public static final String l2 = TD2.R0(31);
    public static final InterfaceC8368nr.a<C10833xx0> m2 = new InterfaceC8368nr.a() { // from class: o.wx0
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return C10833xx0.a(bundle);
        }
    };
    public final int A1;
    public final int B1;
    public int C1;
    @InterfaceC11300zs1
    public final String X;
    @InterfaceC11300zs1
    public final String Y;
    public final int Y0;
    @InterfaceC11300zs1
    public final String Z;
    public final int Z0;
    public final int a1;
    public final int b1;
    public final int c1;
    @InterfaceC11300zs1
    public final String d1;
    @InterfaceC11300zs1
    public final C4224Si1 e1;
    @InterfaceC11300zs1
    public final String f1;
    @InterfaceC11300zs1
    public final String g1;
    public final int h1;
    public final List<byte[]> i1;
    @InterfaceC11300zs1
    public final C6960i70 j1;
    public final long k1;
    public final int l1;
    public final int m1;
    public final float n1;
    public final int o1;
    public final float p1;
    @InterfaceC11300zs1
    public final byte[] q1;
    public final int r1;
    @InterfaceC11300zs1
    public final IF s1;
    public final int t1;
    public final int u1;
    public final int v1;
    public final int w1;
    public final int x1;
    public final int y1;
    public final int z1;

    /* renamed from: o.xx0$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        @InterfaceC11300zs1
        public String a;
        @InterfaceC11300zs1
        public String b;
        @InterfaceC11300zs1
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        @InterfaceC11300zs1
        public String h;
        @InterfaceC11300zs1
        public C4224Si1 i;
        @InterfaceC11300zs1
        public String j;
        @InterfaceC11300zs1
        public String k;
        public int l;
        @InterfaceC11300zs1
        public List<byte[]> m;
        @InterfaceC11300zs1
        public C6960i70 n;

        /* renamed from: o */
        public long f911o;
        public int p;
        public int q;
        public float r;
        public int s;
        public float t;
        @InterfaceC11300zs1
        public byte[] u;
        public int v;
        @InterfaceC11300zs1
        public IF w;
        public int x;
        public int y;
        public int z;

        public C10833xx0 G() {
            return new C10833xx0(this);
        }

        @InterfaceC6181ey
        public b H(int i) {
            this.C = i;
            return this;
        }

        @InterfaceC6181ey
        public b I(int i) {
            this.f = i;
            return this;
        }

        @InterfaceC6181ey
        public b J(int i) {
            this.x = i;
            return this;
        }

        @InterfaceC6181ey
        public b K(@InterfaceC11300zs1 String str) {
            this.h = str;
            return this;
        }

        @InterfaceC6181ey
        public b L(@InterfaceC11300zs1 IF r1) {
            this.w = r1;
            return this;
        }

        @InterfaceC6181ey
        public b M(@InterfaceC11300zs1 String str) {
            this.j = str;
            return this;
        }

        @InterfaceC6181ey
        public b N(int i) {
            this.F = i;
            return this;
        }

        @InterfaceC6181ey
        public b O(@InterfaceC11300zs1 C6960i70 c6960i70) {
            this.n = c6960i70;
            return this;
        }

        @InterfaceC6181ey
        public b P(int i) {
            this.A = i;
            return this;
        }

        @InterfaceC6181ey
        public b Q(int i) {
            this.B = i;
            return this;
        }

        @InterfaceC6181ey
        public b R(float f) {
            this.r = f;
            return this;
        }

        @InterfaceC6181ey
        public b S(int i) {
            this.q = i;
            return this;
        }

        @InterfaceC6181ey
        public b T(int i) {
            this.a = Integer.toString(i);
            return this;
        }

        @InterfaceC6181ey
        public b U(@InterfaceC11300zs1 String str) {
            this.a = str;
            return this;
        }

        @InterfaceC6181ey
        public b V(@InterfaceC11300zs1 List<byte[]> list) {
            this.m = list;
            return this;
        }

        @InterfaceC6181ey
        public b W(@InterfaceC11300zs1 String str) {
            this.b = str;
            return this;
        }

        @InterfaceC6181ey
        public b X(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @InterfaceC6181ey
        public b Y(int i) {
            this.l = i;
            return this;
        }

        @InterfaceC6181ey
        public b Z(@InterfaceC11300zs1 C4224Si1 c4224Si1) {
            this.i = c4224Si1;
            return this;
        }

        @InterfaceC6181ey
        public b a0(int i) {
            this.z = i;
            return this;
        }

        @InterfaceC6181ey
        public b b0(int i) {
            this.g = i;
            return this;
        }

        @InterfaceC6181ey
        public b c0(float f) {
            this.t = f;
            return this;
        }

        @InterfaceC6181ey
        public b d0(@InterfaceC11300zs1 byte[] bArr) {
            this.u = bArr;
            return this;
        }

        @InterfaceC6181ey
        public b e0(int i) {
            this.e = i;
            return this;
        }

        @InterfaceC6181ey
        public b f0(int i) {
            this.s = i;
            return this;
        }

        @InterfaceC6181ey
        public b g0(@InterfaceC11300zs1 String str) {
            this.k = str;
            return this;
        }

        @InterfaceC6181ey
        public b h0(int i) {
            this.y = i;
            return this;
        }

        @InterfaceC6181ey
        public b i0(int i) {
            this.d = i;
            return this;
        }

        @InterfaceC6181ey
        public b j0(int i) {
            this.v = i;
            return this;
        }

        @InterfaceC6181ey
        public b k0(long j) {
            this.f911o = j;
            return this;
        }

        @InterfaceC6181ey
        public b l0(int i) {
            this.D = i;
            return this;
        }

        @InterfaceC6181ey
        public b m0(int i) {
            this.E = i;
            return this;
        }

        @InterfaceC6181ey
        public b n0(int i) {
            this.p = i;
            return this;
        }

        public b() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.f911o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        public b(C10833xx0 c10833xx0) {
            this.a = c10833xx0.X;
            this.b = c10833xx0.Y;
            this.c = c10833xx0.Z;
            this.d = c10833xx0.Y0;
            this.e = c10833xx0.Z0;
            this.f = c10833xx0.a1;
            this.g = c10833xx0.b1;
            this.h = c10833xx0.d1;
            this.i = c10833xx0.e1;
            this.j = c10833xx0.f1;
            this.k = c10833xx0.g1;
            this.l = c10833xx0.h1;
            this.m = c10833xx0.i1;
            this.n = c10833xx0.j1;
            this.f911o = c10833xx0.k1;
            this.p = c10833xx0.l1;
            this.q = c10833xx0.m1;
            this.r = c10833xx0.n1;
            this.s = c10833xx0.o1;
            this.t = c10833xx0.p1;
            this.u = c10833xx0.q1;
            this.v = c10833xx0.r1;
            this.w = c10833xx0.s1;
            this.x = c10833xx0.t1;
            this.y = c10833xx0.u1;
            this.z = c10833xx0.v1;
            this.A = c10833xx0.w1;
            this.B = c10833xx0.x1;
            this.C = c10833xx0.y1;
            this.D = c10833xx0.z1;
            this.E = c10833xx0.A1;
            this.F = c10833xx0.B1;
        }
    }

    public static /* synthetic */ C10833xx0 a(Bundle bundle) {
        return f(bundle);
    }

    @InterfaceC11300zs1
    public static <T> T d(@InterfaceC11300zs1 T t, @InterfaceC11300zs1 T t2) {
        if (t != null) {
            return t;
        }
        return t2;
    }

    public static C10833xx0 f(Bundle bundle) {
        b bVar = new b();
        C8855pr.c(bundle);
        String string = bundle.getString(G1);
        C10833xx0 c10833xx0 = F1;
        bVar.U((String) d(string, c10833xx0.X)).W((String) d(bundle.getString(H1), c10833xx0.Y)).X((String) d(bundle.getString(I1), c10833xx0.Z)).i0(bundle.getInt(J1, c10833xx0.Y0)).e0(bundle.getInt(K1, c10833xx0.Z0)).I(bundle.getInt(L1, c10833xx0.a1)).b0(bundle.getInt(M1, c10833xx0.b1)).K((String) d(bundle.getString(N1), c10833xx0.d1)).Z((C4224Si1) d((C4224Si1) bundle.getParcelable(O1), c10833xx0.e1)).M((String) d(bundle.getString(P1), c10833xx0.f1)).g0((String) d(bundle.getString(Q1), c10833xx0.g1)).Y(bundle.getInt(R1, c10833xx0.h1));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        b O = bVar.V(arrayList).O((C6960i70) bundle.getParcelable(T1));
        String str = U1;
        C10833xx0 c10833xx02 = F1;
        O.k0(bundle.getLong(str, c10833xx02.k1)).n0(bundle.getInt(V1, c10833xx02.l1)).S(bundle.getInt(W1, c10833xx02.m1)).R(bundle.getFloat(X1, c10833xx02.n1)).f0(bundle.getInt(Y1, c10833xx02.o1)).c0(bundle.getFloat(Z1, c10833xx02.p1)).d0(bundle.getByteArray(a2)).j0(bundle.getInt(b2, c10833xx02.r1));
        Bundle bundle2 = bundle.getBundle(c2);
        if (bundle2 != null) {
            bVar.L(IF.g1.a(bundle2));
        }
        bVar.J(bundle.getInt(d2, c10833xx02.t1)).h0(bundle.getInt(e2, c10833xx02.u1)).a0(bundle.getInt(f2, c10833xx02.v1)).P(bundle.getInt(g2, c10833xx02.w1)).Q(bundle.getInt(h2, c10833xx02.x1)).H(bundle.getInt(i2, c10833xx02.y1)).l0(bundle.getInt(k2, c10833xx02.z1)).m0(bundle.getInt(l2, c10833xx02.A1)).N(bundle.getInt(j2, c10833xx02.B1));
        return bVar.G();
    }

    public static String i(int i) {
        return S1 + CrashlyticsReportPersistence.m + Integer.toString(i, 36);
    }

    public static String k(@InterfaceC11300zs1 C10833xx0 c10833xx0) {
        if (c10833xx0 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c10833xx0.X);
        sb.append(", mimeType=");
        sb.append(c10833xx0.g1);
        if (c10833xx0.c1 != -1) {
            sb.append(", bitrate=");
            sb.append(c10833xx0.c1);
        }
        if (c10833xx0.d1 != null) {
            sb.append(", codecs=");
            sb.append(c10833xx0.d1);
        }
        if (c10833xx0.j1 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                C6960i70 c6960i70 = c10833xx0.j1;
                if (i >= c6960i70.Y0) {
                    break;
                }
                UUID uuid = c6960i70.e(i).Y;
                if (uuid.equals(C10323vs.e2)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C10323vs.f2)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C10323vs.h2)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C10323vs.g2)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C10323vs.d2)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + C9811tl1.d);
                }
                i++;
            }
            sb.append(", drm=[");
            C7782lV0.o(',').f(sb, linkedHashSet);
            sb.append(']');
        }
        if (c10833xx0.l1 != -1 && c10833xx0.m1 != -1) {
            sb.append(", res=");
            sb.append(c10833xx0.l1);
            sb.append("x");
            sb.append(c10833xx0.m1);
        }
        IF r1 = c10833xx0.s1;
        if (r1 != null && r1.h()) {
            sb.append(", color=");
            sb.append(c10833xx0.s1.k());
        }
        if (c10833xx0.n1 != -1.0f) {
            sb.append(", fps=");
            sb.append(c10833xx0.n1);
        }
        if (c10833xx0.t1 != -1) {
            sb.append(", channels=");
            sb.append(c10833xx0.t1);
        }
        if (c10833xx0.u1 != -1) {
            sb.append(", sample_rate=");
            sb.append(c10833xx0.u1);
        }
        if (c10833xx0.Z != null) {
            sb.append(", language=");
            sb.append(c10833xx0.Z);
        }
        if (c10833xx0.Y != null) {
            sb.append(", label=");
            sb.append(c10833xx0.Y);
        }
        if (c10833xx0.Y0 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((c10833xx0.Y0 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((c10833xx0.Y0 & 1) != 0) {
                arrayList.add(JT.d);
            }
            if ((c10833xx0.Y0 & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            C7782lV0.o(',').f(sb, arrayList);
            sb.append(C6566gU0.g);
        }
        if (c10833xx0.Z0 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((c10833xx0.Z0 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((c10833xx0.Z0 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((c10833xx0.Z0 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((c10833xx0.Z0 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((c10833xx0.Z0 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((c10833xx0.Z0 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((c10833xx0.Z0 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((c10833xx0.Z0 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((c10833xx0.Z0 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((c10833xx0.Z0 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((c10833xx0.Z0 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((c10833xx0.Z0 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((c10833xx0.Z0 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((c10833xx0.Z0 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((c10833xx0.Z0 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            C7782lV0.o(',').f(sb, arrayList2);
            sb.append(C6566gU0.g);
        }
        return sb.toString();
    }

    public b b() {
        return new b();
    }

    public C10833xx0 c(int i) {
        return b().N(i).G();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        return j(false);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C10833xx0.class == obj.getClass()) {
            C10833xx0 c10833xx0 = (C10833xx0) obj;
            int i3 = this.C1;
            if ((i3 == 0 || (i = c10833xx0.C1) == 0 || i3 == i) && this.Y0 == c10833xx0.Y0 && this.Z0 == c10833xx0.Z0 && this.a1 == c10833xx0.a1 && this.b1 == c10833xx0.b1 && this.h1 == c10833xx0.h1 && this.k1 == c10833xx0.k1 && this.l1 == c10833xx0.l1 && this.m1 == c10833xx0.m1 && this.o1 == c10833xx0.o1 && this.r1 == c10833xx0.r1 && this.t1 == c10833xx0.t1 && this.u1 == c10833xx0.u1 && this.v1 == c10833xx0.v1 && this.w1 == c10833xx0.w1 && this.x1 == c10833xx0.x1 && this.y1 == c10833xx0.y1 && this.z1 == c10833xx0.z1 && this.A1 == c10833xx0.A1 && this.B1 == c10833xx0.B1 && Float.compare(this.n1, c10833xx0.n1) == 0 && Float.compare(this.p1, c10833xx0.p1) == 0 && TD2.g(this.X, c10833xx0.X) && TD2.g(this.Y, c10833xx0.Y) && TD2.g(this.d1, c10833xx0.d1) && TD2.g(this.f1, c10833xx0.f1) && TD2.g(this.g1, c10833xx0.g1) && TD2.g(this.Z, c10833xx0.Z) && Arrays.equals(this.q1, c10833xx0.q1) && TD2.g(this.e1, c10833xx0.e1) && TD2.g(this.s1, c10833xx0.s1) && TD2.g(this.j1, c10833xx0.j1) && h(c10833xx0)) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        int i;
        int i3 = this.l1;
        if (i3 == -1 || (i = this.m1) == -1) {
            return -1;
        }
        return i3 * i;
    }

    public boolean h(C10833xx0 c10833xx0) {
        if (this.i1.size() != c10833xx0.i1.size()) {
            return false;
        }
        for (int i = 0; i < this.i1.size(); i++) {
            if (!Arrays.equals(this.i1.get(i), c10833xx0.i1.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.C1 == 0) {
            String str = this.X;
            int i3 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i4 = (527 + hashCode) * 31;
            String str2 = this.Y;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i5 = (i4 + i) * 31;
            String str3 = this.Z;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i6 = (((((((((i5 + hashCode2) * 31) + this.Y0) * 31) + this.Z0) * 31) + this.a1) * 31) + this.b1) * 31;
            String str4 = this.d1;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i7 = (i6 + hashCode3) * 31;
            C4224Si1 c4224Si1 = this.e1;
            if (c4224Si1 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = c4224Si1.hashCode();
            }
            int i8 = (i7 + hashCode4) * 31;
            String str5 = this.f1;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i9 = (i8 + hashCode5) * 31;
            String str6 = this.g1;
            if (str6 != null) {
                i3 = str6.hashCode();
            }
            this.C1 = ((((((((((((((((((((((((((((((((((i9 + i3) * 31) + this.h1) * 31) + ((int) this.k1)) * 31) + this.l1) * 31) + this.m1) * 31) + Float.floatToIntBits(this.n1)) * 31) + this.o1) * 31) + Float.floatToIntBits(this.p1)) * 31) + this.r1) * 31) + this.t1) * 31) + this.u1) * 31) + this.v1) * 31) + this.w1) * 31) + this.x1) * 31) + this.y1) * 31) + this.z1) * 31) + this.A1) * 31) + this.B1;
        }
        return this.C1;
    }

    public Bundle j(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(G1, this.X);
        bundle.putString(H1, this.Y);
        bundle.putString(I1, this.Z);
        bundle.putInt(J1, this.Y0);
        bundle.putInt(K1, this.Z0);
        bundle.putInt(L1, this.a1);
        bundle.putInt(M1, this.b1);
        bundle.putString(N1, this.d1);
        if (!z) {
            bundle.putParcelable(O1, this.e1);
        }
        bundle.putString(P1, this.f1);
        bundle.putString(Q1, this.g1);
        bundle.putInt(R1, this.h1);
        for (int i = 0; i < this.i1.size(); i++) {
            bundle.putByteArray(i(i), this.i1.get(i));
        }
        bundle.putParcelable(T1, this.j1);
        bundle.putLong(U1, this.k1);
        bundle.putInt(V1, this.l1);
        bundle.putInt(W1, this.m1);
        bundle.putFloat(X1, this.n1);
        bundle.putInt(Y1, this.o1);
        bundle.putFloat(Z1, this.p1);
        bundle.putByteArray(a2, this.q1);
        bundle.putInt(b2, this.r1);
        IF r4 = this.s1;
        if (r4 != null) {
            bundle.putBundle(c2, r4.e());
        }
        bundle.putInt(d2, this.t1);
        bundle.putInt(e2, this.u1);
        bundle.putInt(f2, this.v1);
        bundle.putInt(g2, this.w1);
        bundle.putInt(h2, this.x1);
        bundle.putInt(i2, this.y1);
        bundle.putInt(k2, this.z1);
        bundle.putInt(l2, this.A1);
        bundle.putInt(j2, this.B1);
        return bundle;
    }

    public C10833xx0 l(C10833xx0 c10833xx0) {
        String str;
        C4224Si1 b3;
        if (this == c10833xx0) {
            return this;
        }
        int l = C4128Rj1.l(this.g1);
        String str2 = c10833xx0.X;
        String str3 = c10833xx0.Y;
        if (str3 == null) {
            str3 = this.Y;
        }
        String str4 = this.Z;
        if ((l == 3 || l == 1) && (str = c10833xx0.Z) != null) {
            str4 = str;
        }
        int i = this.a1;
        if (i == -1) {
            i = c10833xx0.a1;
        }
        int i3 = this.b1;
        if (i3 == -1) {
            i3 = c10833xx0.b1;
        }
        String str5 = this.d1;
        if (str5 == null) {
            String Y = TD2.Y(c10833xx0.d1, l);
            if (TD2.L1(Y).length == 1) {
                str5 = Y;
            }
        }
        C4224Si1 c4224Si1 = this.e1;
        if (c4224Si1 == null) {
            b3 = c10833xx0.e1;
        } else {
            b3 = c4224Si1.b(c10833xx0.e1);
        }
        float f = this.n1;
        if (f == -1.0f && l == 2) {
            f = c10833xx0.n1;
        }
        int i4 = this.Y0 | c10833xx0.Y0;
        return b().U(str2).W(str3).X(str4).i0(i4).e0(this.Z0 | c10833xx0.Z0).I(i).b0(i3).K(str5).Z(b3).O(C6960i70.d(c10833xx0.j1, this.j1)).R(f).G();
    }

    public String toString() {
        return "Format(" + this.X + C6566gU0.h + this.Y + C6566gU0.h + this.f1 + C6566gU0.h + this.g1 + C6566gU0.h + this.d1 + C6566gU0.h + this.c1 + C6566gU0.h + this.Z + ", [" + this.l1 + C6566gU0.h + this.m1 + C6566gU0.h + this.n1 + C6566gU0.h + this.s1 + "], [" + this.t1 + C6566gU0.h + this.u1 + "])";
    }

    public C10833xx0(b bVar) {
        this.X = bVar.a;
        this.Y = bVar.b;
        this.Z = TD2.m1(bVar.c);
        this.Y0 = bVar.d;
        this.Z0 = bVar.e;
        int i = bVar.f;
        this.a1 = i;
        int i3 = bVar.g;
        this.b1 = i3;
        this.c1 = i3 != -1 ? i3 : i;
        this.d1 = bVar.h;
        this.e1 = bVar.i;
        this.f1 = bVar.j;
        this.g1 = bVar.k;
        this.h1 = bVar.l;
        this.i1 = bVar.m == null ? Collections.EMPTY_LIST : bVar.m;
        C6960i70 c6960i70 = bVar.n;
        this.j1 = c6960i70;
        this.k1 = bVar.f911o;
        this.l1 = bVar.p;
        this.m1 = bVar.q;
        this.n1 = bVar.r;
        this.o1 = bVar.s == -1 ? 0 : bVar.s;
        this.p1 = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.q1 = bVar.u;
        this.r1 = bVar.v;
        this.s1 = bVar.w;
        this.t1 = bVar.x;
        this.u1 = bVar.y;
        this.v1 = bVar.z;
        this.w1 = bVar.A == -1 ? 0 : bVar.A;
        this.x1 = bVar.B != -1 ? bVar.B : 0;
        this.y1 = bVar.C;
        this.z1 = bVar.D;
        this.A1 = bVar.E;
        if (bVar.F != 0 || c6960i70 == null) {
            this.B1 = bVar.F;
        } else {
            this.B1 = 1;
        }
    }
}
