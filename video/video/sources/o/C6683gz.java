package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: o.gz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6683gz implements InterfaceC7410jz {
    @Override // o.InterfaceC7410jz
    public float a(InterfaceC7167iz interfaceC7167iz) {
        return c(interfaceC7167iz) * 2.0f;
    }

    @Override // o.InterfaceC7410jz
    public void b(InterfaceC7167iz interfaceC7167iz) {
        m(interfaceC7167iz, f(interfaceC7167iz));
    }

    @Override // o.InterfaceC7410jz
    public float c(InterfaceC7167iz interfaceC7167iz) {
        return p(interfaceC7167iz).d();
    }

    @Override // o.InterfaceC7410jz
    public void d(InterfaceC7167iz interfaceC7167iz, float f) {
        interfaceC7167iz.h().setElevation(f);
    }

    @Override // o.InterfaceC7410jz
    public ColorStateList e(InterfaceC7167iz interfaceC7167iz) {
        return p(interfaceC7167iz).b();
    }

    @Override // o.InterfaceC7410jz
    public float f(InterfaceC7167iz interfaceC7167iz) {
        return p(interfaceC7167iz).c();
    }

    @Override // o.InterfaceC7410jz
    public float g(InterfaceC7167iz interfaceC7167iz) {
        return c(interfaceC7167iz) * 2.0f;
    }

    @Override // o.InterfaceC7410jz
    public void h(InterfaceC7167iz interfaceC7167iz, float f) {
        p(interfaceC7167iz).h(f);
    }

    @Override // o.InterfaceC7410jz
    public void i(InterfaceC7167iz interfaceC7167iz) {
        m(interfaceC7167iz, f(interfaceC7167iz));
    }

    @Override // o.InterfaceC7410jz
    public void j(InterfaceC7167iz interfaceC7167iz, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        interfaceC7167iz.c(new C6072eV1(colorStateList, f));
        View h = interfaceC7167iz.h();
        h.setClipToOutline(true);
        h.setElevation(f2);
        m(interfaceC7167iz, f3);
    }

    @Override // o.InterfaceC7410jz
    public void k(InterfaceC7167iz interfaceC7167iz) {
        if (!interfaceC7167iz.d()) {
            interfaceC7167iz.b(0, 0, 0, 0);
            return;
        }
        float f = f(interfaceC7167iz);
        float c = c(interfaceC7167iz);
        int ceil = (int) Math.ceil(C6315fV1.c(f, c, interfaceC7167iz.g()));
        int ceil2 = (int) Math.ceil(C6315fV1.d(f, c, interfaceC7167iz.g()));
        interfaceC7167iz.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // o.InterfaceC7410jz
    public float l(InterfaceC7167iz interfaceC7167iz) {
        return interfaceC7167iz.h().getElevation();
    }

    @Override // o.InterfaceC7410jz
    public void m(InterfaceC7167iz interfaceC7167iz, float f) {
        p(interfaceC7167iz).g(f, interfaceC7167iz.d(), interfaceC7167iz.g());
        k(interfaceC7167iz);
    }

    @Override // o.InterfaceC7410jz
    public void o(InterfaceC7167iz interfaceC7167iz, ColorStateList colorStateList) {
        p(interfaceC7167iz).f(colorStateList);
    }

    public final C6072eV1 p(InterfaceC7167iz interfaceC7167iz) {
        return (C6072eV1) interfaceC7167iz.e();
    }

    @Override // o.InterfaceC7410jz
    public void n() {
    }
}
