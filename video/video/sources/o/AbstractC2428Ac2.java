package o;

/* renamed from: o.Ac2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2428Ac2 {
    public static final boolean a = false;

    /* renamed from: o.Ac2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC2428Ac2 {
        public volatile RuntimeException b;

        public b() {
            super();
        }

        @Override // o.AbstractC2428Ac2
        public void b(boolean z) {
            if (z) {
                this.b = new RuntimeException("Released");
            } else {
                this.b = null;
            }
        }

        @Override // o.AbstractC2428Ac2
        public void c() {
            if (this.b == null) {
                return;
            }
            throw new IllegalStateException("Already released", this.b);
        }
    }

    /* renamed from: o.Ac2$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC2428Ac2 {
        public volatile boolean b;

        public c() {
            super();
        }

        @Override // o.AbstractC2428Ac2
        public void b(boolean z) {
            this.b = z;
        }

        @Override // o.AbstractC2428Ac2
        public void c() {
            if (!this.b) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }

    public static AbstractC2428Ac2 a() {
        return new c();
    }

    public abstract void b(boolean z);

    public abstract void c();

    public AbstractC2428Ac2() {
    }
}
