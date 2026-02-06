package o;

import android.os.Bundle;

/* renamed from: o.gH0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6514gH0 extends AbstractC5298bJ1<C6514gH0> {
    public final Bundle c = new Bundle();

    @Override // o.AbstractC5298bJ1
    public Bundle b() {
        return this.c;
    }

    @Override // o.AbstractC5298bJ1
    public int c() {
        return 2;
    }

    public final C6514gH0 h(int i) {
        this.c.putInt(ZI1.e, i);
        return this;
    }

    public final C6514gH0 i(int i) {
        this.c.putInt(ZI1.a, i);
        return this;
    }

    public final C6514gH0 j(long j) {
        this.c.putLong(ZI1.b, j);
        return this;
    }

    public final C6514gH0 k(boolean z) {
        this.c.putBoolean(ZI1.c, z);
        return this;
    }

    @Override // o.AbstractC5298bJ1
    /* renamed from: g */
    public C6514gH0 d() {
        return this;
    }
}
