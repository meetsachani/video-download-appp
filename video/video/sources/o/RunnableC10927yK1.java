package o;

import o.InterfaceC3395Jv1;

/* renamed from: o.yK1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC10927yK1 implements Runnable {
    public final ZM2 X;
    public final C3688Mv1 Y = new C3688Mv1();

    public RunnableC10927yK1(ZM2 workManagerImpl) {
        this.X = workManagerImpl;
    }

    public InterfaceC3395Jv1 a() {
        return this.Y;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.X.M().L().c();
            this.Y.a(InterfaceC3395Jv1.a);
        } catch (Throwable th) {
            this.Y.a(new InterfaceC3395Jv1.b.a(th));
        }
    }
}
