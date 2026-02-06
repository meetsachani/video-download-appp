package o;

/* renamed from: o.gJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6524gJ2 extends Exception {
    public final C3470Kp1 X;
    public long Y;

    public C6524gJ2() {
        this.X = null;
    }

    public long a() {
        return this.Y;
    }

    public void b(long j) {
        this.Y = j;
    }

    public C6524gJ2(C3470Kp1 c3470Kp1) {
        this.X = c3470Kp1;
    }

    public C6524gJ2(String str) {
        super(str);
        this.X = null;
    }

    public C6524gJ2(String str, Throwable th) {
        super(str, th);
        this.X = null;
    }

    public C6524gJ2(Throwable th) {
        super(th);
        this.X = null;
    }
}
