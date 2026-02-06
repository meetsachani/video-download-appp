package o;

/* renamed from: o.nY1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8296nY1 implements InterfaceC5884dk0<AbstractC6822hY1> {
    public final InterfaceC6272fK1<ND> a;

    public C8296nY1(InterfaceC6272fK1<ND> interfaceC6272fK1) {
        this.a = interfaceC6272fK1;
    }

    public static AbstractC6822hY1 a(ND nd) {
        return (AbstractC6822hY1) C10421wF1.c(AbstractC8053mY1.a(nd), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static C8296nY1 b(InterfaceC6272fK1<ND> interfaceC6272fK1) {
        return new C8296nY1(interfaceC6272fK1);
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: c */
    public AbstractC6822hY1 get() {
        return a(this.a.get());
    }
}
