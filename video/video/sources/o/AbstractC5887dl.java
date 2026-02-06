package o;

import java.util.ArrayList;

@Deprecated
/* renamed from: o.dl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5887dl implements FU {
    public final boolean b;
    public final ArrayList<InterfaceC4261Sr2> c = new ArrayList<>(1);
    public int d;
    @InterfaceC11300zs1
    public OU e;

    public AbstractC5887dl(boolean z) {
        this.b = z;
    }

    public final void A(OU ou) {
        for (int i = 0; i < this.d; i++) {
            this.c.get(i).f(this, ou, this.b);
        }
    }

    public final void B(OU ou) {
        this.e = ou;
        for (int i = 0; i < this.d; i++) {
            this.c.get(i).h(this, ou, this.b);
        }
    }

    @Override // o.FU
    public final void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        if (!this.c.contains(interfaceC4261Sr2)) {
            this.c.add(interfaceC4261Sr2);
            this.d++;
        }
    }

    public final void y(int i) {
        OU ou = (OU) TD2.o(this.e);
        for (int i2 = 0; i2 < this.d; i2++) {
            this.c.get(i2).i(this, ou, this.b, i);
        }
    }

    public final void z() {
        OU ou = (OU) TD2.o(this.e);
        for (int i = 0; i < this.d; i++) {
            this.c.get(i).d(this, ou, this.b);
        }
        this.e = null;
    }
}
