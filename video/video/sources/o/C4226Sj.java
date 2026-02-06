package o;

@Deprecated
/* renamed from: o.Sj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4226Sj implements InterfaceC4029Qj {
    public static final int e = 16;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C4226Sj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C4226Sj b(C3012Fy1 c3012Fy1) {
        int w = c3012Fy1.w();
        c3012Fy1.Z(8);
        int w2 = c3012Fy1.w();
        int w3 = c3012Fy1.w();
        c3012Fy1.Z(4);
        int w4 = c3012Fy1.w();
        c3012Fy1.Z(12);
        return new C4226Sj(w, w2, w3, w4);
    }

    public boolean a() {
        if ((this.b & 16) == 16) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4029Qj
    public int getType() {
        return C4126Rj.v;
    }
}
