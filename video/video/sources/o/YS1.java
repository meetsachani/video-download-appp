package o;

/* loaded from: classes.dex */
public class YS1 implements InterfaceC11235zc0 {
    public final InterfaceC11235zc0 b;
    public final C2927Fc0 c;

    public YS1(InterfaceC11235zc0 interfaceC11235zc0, C10931yL1 c10931yL1) {
        this.b = interfaceC11235zc0;
        this.c = new C2927Fc0(c10931yL1.c(NI1.class));
    }

    @Override // o.InterfaceC11235zc0
    public boolean a(int i) {
        if (!this.b.a(i)) {
            return false;
        }
        if (this.c.c()) {
            return this.c.d(this.b.b(i));
        }
        return true;
    }

    @Override // o.InterfaceC11235zc0
    public InterfaceC2426Ac0 b(int i) {
        if (!this.b.a(i)) {
            return null;
        }
        InterfaceC2426Ac0 b = this.b.b(i);
        if (this.c.c()) {
            return this.c.a(b);
        }
        return b;
    }
}
