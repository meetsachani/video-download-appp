package o;

import android.util.Size;
import o.InterfaceC6040eN0;
import o.InterfaceC6743hD2;

/* renamed from: o.jD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7227jD2 {
    public static void a(InterfaceC6743hD2.a<?, ?, ?> aVar, int i) {
        Size d0;
        InterfaceC6040eN0 interfaceC6040eN0 = (InterfaceC6040eN0) aVar.t();
        int N = interfaceC6040eN0.N(-1);
        if (N == -1 || N != i) {
            ((InterfaceC6040eN0.a) aVar).g(i);
        }
        if (N != -1 && i != -1 && N != i) {
            if (Math.abs(C10589wx.c(i) - C10589wx.c(N)) % 180 == 90 && (d0 = interfaceC6040eN0.d0(null)) != null) {
                ((InterfaceC6040eN0.a) aVar).r(new Size(d0.getHeight(), d0.getWidth()));
            }
        }
    }
}
