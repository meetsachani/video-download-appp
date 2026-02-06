package o;

import android.graphics.PointF;
import java.io.IOException;
import o.NV0;
import o.O40;

/* loaded from: classes.dex */
public class P40 implements GE2<O40> {
    public static final P40 a = new P40();
    public static final NV0.a b = NV0.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // o.GE2
    /* renamed from: b */
    public O40 a(NV0 nv0, float f) throws IOException {
        O40.a aVar = O40.a.CENTER;
        nv0.f();
        O40.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (nv0.j()) {
            switch (nv0.s(b)) {
                case 0:
                    str = nv0.o();
                    break;
                case 1:
                    str2 = nv0.o();
                    break;
                case 2:
                    f2 = (float) nv0.l();
                    break;
                case 3:
                    int m = nv0.m();
                    aVar2 = O40.a.CENTER;
                    if (m <= aVar2.ordinal() && m >= 0) {
                        aVar2 = O40.a.values()[m];
                        break;
                    }
                    break;
                case 4:
                    i = nv0.m();
                    break;
                case 5:
                    f3 = (float) nv0.l();
                    break;
                case 6:
                    f4 = (float) nv0.l();
                    break;
                case 7:
                    i2 = C5347bW0.d(nv0);
                    break;
                case 8:
                    i3 = C5347bW0.d(nv0);
                    break;
                case 9:
                    f5 = (float) nv0.l();
                    break;
                case 10:
                    z = nv0.k();
                    break;
                case 11:
                    nv0.d();
                    PointF pointF3 = new PointF(((float) nv0.l()) * f, ((float) nv0.l()) * f);
                    nv0.h();
                    pointF = pointF3;
                    break;
                case 12:
                    nv0.d();
                    PointF pointF4 = new PointF(((float) nv0.l()) * f, ((float) nv0.l()) * f);
                    nv0.h();
                    pointF2 = pointF4;
                    break;
                default:
                    nv0.t();
                    nv0.u();
                    break;
            }
        }
        nv0.i();
        return new O40(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
