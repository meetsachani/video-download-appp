package o;

/* renamed from: o.Xh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4703Xh {
    public final boolean a;
    public final boolean b;

    public C4703Xh(C10931yL1 c10931yL1) {
        boolean z;
        this.a = c10931yL1.a(EM0.class);
        if (X20.a(TQ.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }

    public int a(int i) {
        if ((this.a || this.b) && i == 2) {
            return 1;
        }
        return i;
    }
}
