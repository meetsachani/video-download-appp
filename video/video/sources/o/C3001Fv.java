package o;

import android.content.Context;
import o.C3597Ly;
import o.HJ;
import o.InterfaceC6986iD2;
import o.T12;

/* renamed from: o.Fv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3001Fv implements InterfaceC6986iD2 {
    public final C10376w40 b;

    public C3001Fv(Context context) {
        this.b = C10376w40.c(context);
    }

    @Override // o.InterfaceC6986iD2
    public HJ a(InterfaceC6986iD2.b bVar, int i) {
        Object obj;
        C2569Bn1 u0 = C2569Bn1.u0();
        T12.b bVar2 = new T12.b();
        bVar2.z(C7361jm2.b(bVar, i));
        u0.h0(InterfaceC6743hD2.z, bVar2.q());
        u0.h0(InterfaceC6743hD2.B, C2892Ev.a);
        C3597Ly.a aVar = new C3597Ly.a();
        aVar.w(C7361jm2.a(bVar, i));
        u0.h0(InterfaceC6743hD2.A, aVar.h());
        HJ.a<C3597Ly.b> aVar2 = InterfaceC6743hD2.C;
        if (bVar == InterfaceC6986iD2.b.IMAGE_CAPTURE) {
            obj = IM0.c;
        } else {
            obj = C6412fv.a;
        }
        u0.h0(aVar2, obj);
        if (bVar == InterfaceC6986iD2.b.PREVIEW) {
            u0.h0(InterfaceC6040eN0.r, this.b.f());
        }
        u0.h0(InterfaceC6040eN0.m, Integer.valueOf(this.b.d(true).getRotation()));
        if (bVar == InterfaceC6986iD2.b.VIDEO_CAPTURE || bVar == InterfaceC6986iD2.b.STREAM_SHARING) {
            u0.h0(InterfaceC6743hD2.G, Boolean.TRUE);
        }
        return C5932dw1.t0(u0);
    }
}
