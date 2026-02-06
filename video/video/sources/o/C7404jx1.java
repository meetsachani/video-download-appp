package o;

/* renamed from: o.jx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7404jx1 {
    public final boolean a;
    public boolean b = false;

    public C7404jx1(C10931yL1 c10931yL1) {
        this.a = c10931yL1.b(C4800Yh.class) != null;
    }

    public void a() {
        this.b = false;
    }

    public void b() {
        this.b = true;
    }

    public boolean c(int i) {
        if (this.b && i == 0 && this.a) {
            return true;
        }
        return false;
    }
}
