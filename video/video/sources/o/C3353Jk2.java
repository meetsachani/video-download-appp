package o;

import android.os.Bundle;

/* renamed from: o.Jk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3353Jk2 extends AbstractC5298bJ1<C3353Jk2> {
    public final Bundle c = new Bundle();

    @Override // o.AbstractC5298bJ1
    public Bundle b() {
        return this.c;
    }

    @Override // o.AbstractC5298bJ1
    public int c() {
        return 4;
    }

    public final C3353Jk2 h(AbstractC6890hq abstractC6890hq) {
        C6562gT0.p(abstractC6890hq, "bufferFillPolicy");
        this.c.putInt(ZI1.f, abstractC6890hq.a());
        return this;
    }

    public final C3353Jk2 i(int i) {
        this.c.putInt(ZI1.e, i);
        return this;
    }

    public final C3353Jk2 j(int i) {
        this.c.putInt(ZI1.a, i);
        return this;
    }

    @Override // o.AbstractC5298bJ1
    /* renamed from: g */
    public C3353Jk2 d() {
        return this;
    }
}
