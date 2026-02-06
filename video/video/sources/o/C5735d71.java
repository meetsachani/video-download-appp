package o;

import o.InterfaceC5877di1;

/* renamed from: o.d71  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5735d71 extends X61<InterfaceC6575gX0, InterfaceC5580cT1<?>> implements InterfaceC5877di1 {
    public InterfaceC5877di1.a e;

    public C5735d71(long j) {
        super(j);
    }

    @Override // o.InterfaceC5877di1
    public void a(int i) {
        if (i >= 40) {
            b();
        } else if (i < 20 && i != 15) {
        } else {
            q(e() / 2);
        }
    }

    @Override // o.InterfaceC5877di1
    public /* bridge */ /* synthetic */ InterfaceC5580cT1 f(InterfaceC6575gX0 interfaceC6575gX0, InterfaceC5580cT1 interfaceC5580cT1) {
        return (InterfaceC5580cT1) super.o(interfaceC6575gX0, interfaceC5580cT1);
    }

    @Override // o.InterfaceC5877di1
    public void g(InterfaceC5877di1.a aVar) {
        this.e = aVar;
    }

    @Override // o.InterfaceC5877di1
    public /* bridge */ /* synthetic */ InterfaceC5580cT1 h(InterfaceC6575gX0 interfaceC6575gX0) {
        return (InterfaceC5580cT1) super.p(interfaceC6575gX0);
    }

    @Override // o.X61
    /* renamed from: r */
    public int m(InterfaceC5580cT1<?> interfaceC5580cT1) {
        if (interfaceC5580cT1 == null) {
            return super.m(null);
        }
        return interfaceC5580cT1.h0();
    }

    @Override // o.X61
    /* renamed from: s */
    public void n(InterfaceC6575gX0 interfaceC6575gX0, InterfaceC5580cT1<?> interfaceC5580cT1) {
        InterfaceC5877di1.a aVar = this.e;
        if (aVar != null && interfaceC5580cT1 != null) {
            aVar.a(interfaceC5580cT1);
        }
    }
}
