package o;

import java.io.File;

/* loaded from: classes.dex */
public class V51 {
    public final B61 a;
    public final A61 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final EnumC3623Mf f;
    public final JP1 g;

    /* loaded from: classes.dex */
    public static final class b {
        public B61 a;
        public A61 b;
        public boolean c = false;
        public boolean d = true;
        public boolean e = false;
        public EnumC3623Mf f = EnumC3623Mf.AUTOMATIC;
        public JP1 g = new C3157Hk2();

        /* loaded from: classes.dex */
        public class a implements A61 {
            public final /* synthetic */ File a;

            public a(File file) {
                this.a = file;
            }

            @Override // o.A61
            public File a() {
                if (this.a.isDirectory()) {
                    return this.a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: o.V51$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0232b implements A61 {
            public final /* synthetic */ A61 a;

            public C0232b(A61 a61) {
                this.a = a61;
            }

            @Override // o.A61
            public File a() {
                File a = this.a.a();
                if (a.isDirectory()) {
                    return a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        public V51 a() {
            return new V51(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public b b(EnumC3623Mf enumC3623Mf) {
            this.f = enumC3623Mf;
            return this;
        }

        public b c(boolean z) {
            this.e = z;
            return this;
        }

        public b d(boolean z) {
            this.d = z;
            return this;
        }

        public b e(boolean z) {
            this.c = z;
            return this;
        }

        public b f(File file) {
            if (this.b == null) {
                this.b = new a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        public b g(A61 a61) {
            if (this.b == null) {
                this.b = new C0232b(a61);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        public b h(B61 b61) {
            this.a = b61;
            return this;
        }

        public b i(JP1 jp1) {
            this.g = jp1;
            return this;
        }
    }

    public V51(B61 b61, A61 a61, boolean z, boolean z2, boolean z3, EnumC3623Mf enumC3623Mf, JP1 jp1) {
        this.a = b61;
        this.b = a61;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = enumC3623Mf;
        this.g = jp1;
    }
}
