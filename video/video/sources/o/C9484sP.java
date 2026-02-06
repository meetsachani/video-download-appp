package o;

/* renamed from: o.sP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9484sP implements InterfaceC7507kN {
    public final InterfaceC7507kN a;

    public C9484sP(InterfaceC7507kN interfaceC7507kN) {
        if (interfaceC7507kN != null) {
            this.a = interfaceC7507kN;
            return;
        }
        throw new IllegalArgumentException("Converter is missing");
    }

    @Override // o.InterfaceC7507kN
    public <T> T b(Class<T> cls, Object obj) {
        return (T) this.a.b(cls, obj);
    }

    public String toString() {
        return "ConverterFacade[" + this.a.toString() + C6566gU0.g;
    }
}
