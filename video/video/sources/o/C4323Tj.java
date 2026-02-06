package o;

@Deprecated
/* renamed from: o.Tj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4323Tj implements InterfaceC4029Qj {
    public static final String g = "AviStreamHeaderChunk";
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public C4323Tj(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static C4323Tj d(C3012Fy1 c3012Fy1) {
        int w = c3012Fy1.w();
        c3012Fy1.Z(12);
        int w2 = c3012Fy1.w();
        int w3 = c3012Fy1.w();
        int w4 = c3012Fy1.w();
        c3012Fy1.Z(4);
        int w5 = c3012Fy1.w();
        int w6 = c3012Fy1.w();
        c3012Fy1.Z(8);
        return new C4323Tj(w, w2, w3, w4, w5, w6);
    }

    public long a() {
        return TD2.C1(this.e, this.c * 1000000, this.d);
    }

    public float b() {
        return this.d / this.c;
    }

    public int c() {
        int i = this.a;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    I31.n(g, "Found unsupported streamType fourCC: " + Integer.toHexString(this.a));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    @Override // o.InterfaceC4029Qj
    public int getType() {
        return C4126Rj.D;
    }
}
