package o;

/* renamed from: o.wz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC10597wz<E> implements InterfaceC8705pE<E> {
    @Override // o.InterfaceC8705pE
    public void a(E e) {
        try {
            b(e);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new OB0(th);
        }
    }

    public abstract void b(E e) throws Throwable;
}
