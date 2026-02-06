package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class F60 implements InterfaceC9109qt2<Drawable> {
    public final int a;
    public final boolean b;
    public G60 c;

    /* loaded from: classes.dex */
    public static class a {
        public static final int c = 300;
        public final int a;
        public boolean b;

        public a() {
            this(300);
        }

        public F60 a() {
            return new F60(this.a, this.b);
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }

        public a(int i) {
            this.a = i;
        }
    }

    public F60(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // o.InterfaceC9109qt2
    public InterfaceC8136mt2<Drawable> a(GU gu, boolean z) {
        if (gu == GU.MEMORY_CACHE) {
            return C3767Nq1.b();
        }
        return b();
    }

    public final InterfaceC8136mt2<Drawable> b() {
        if (this.c == null) {
            this.c = new G60(this.a, this.b);
        }
        return this.c;
    }
}
