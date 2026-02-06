package o;

/* renamed from: o.k82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7450k82<T> implements InterfaceC6272fK1<T> {
    public static final Object c = new Object();
    public static final /* synthetic */ boolean d = false;
    public volatile InterfaceC6272fK1<T> a;
    public volatile Object b = c;

    public C7450k82(InterfaceC6272fK1<T> interfaceC6272fK1) {
        this.a = interfaceC6272fK1;
    }

    public static <P extends InterfaceC6272fK1<T>, T> InterfaceC6272fK1<T> a(P p) {
        if (!(p instanceof C7450k82)) {
            if (p instanceof Y40) {
                return p;
            }
            return new C7450k82((InterfaceC6272fK1) C10421wF1.b(p));
        }
        return p;
    }

    @Override // o.InterfaceC6272fK1
    public T get() {
        T t = (T) this.b;
        if (t == c) {
            InterfaceC6272fK1<T> interfaceC6272fK1 = this.a;
            if (interfaceC6272fK1 == null) {
                return (T) this.b;
            }
            T t2 = interfaceC6272fK1.get();
            this.b = t2;
            this.a = null;
            return t2;
        }
        return t;
    }
}
