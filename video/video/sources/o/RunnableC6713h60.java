package o;

/* renamed from: o.h60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC6713h60 implements Runnable {
    public final EnumC10183vH1 X;
    public final int Y;
    public final C5730d60 Z;

    public RunnableC6713h60(C5730d60 c5730d60) {
        this.Z = c5730d60;
        this.X = c5730d60.x();
        this.Y = c5730d60.A();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.Z.T(EnumC4101Rc2.RUNNING);
        ET1 k = C7683l60.d(this.Z).k();
        if (k.d()) {
            this.Z.k();
        } else if (k.c()) {
            this.Z.i();
        } else if (k.a() != null) {
            this.Z.h(k.a());
        } else if (!k.b()) {
            this.Z.h(new C7327je0());
        }
    }
}
