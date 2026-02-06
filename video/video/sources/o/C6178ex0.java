package o;

/* renamed from: o.ex0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6178ex0<E> implements InterfaceC8705pE<E> {
    public final int X;
    public final InterfaceC8705pE<? super E> Y;

    public C6178ex0(int i, InterfaceC8705pE<? super E> interfaceC8705pE) {
        this.X = i;
        this.Y = interfaceC8705pE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> InterfaceC8705pE<E> b(int i, InterfaceC8705pE<? super E> interfaceC8705pE) {
        if (i > 0 && interfaceC8705pE != 0) {
            if (i == 1) {
                return interfaceC8705pE;
            }
            return new C6178ex0(i, interfaceC8705pE);
        }
        return C8115mo1.b();
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        for (int i = 0; i < this.X; i++) {
            this.Y.a(e);
        }
    }

    public InterfaceC8705pE<? super E> c() {
        return this.Y;
    }

    public int d() {
        return this.X;
    }
}
