package androidx.recyclerview.widget;

import o.C5484c51;

/* loaded from: classes.dex */
public interface B {

    /* loaded from: classes.dex */
    public static class a implements B {
        public long a = 0;

        /* renamed from: androidx.recyclerview.widget.B$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0037a implements d {
            public final C5484c51<Long> a = new C5484c51<>();

            public C0037a() {
            }

            @Override // androidx.recyclerview.widget.B.d
            public long a(long j) {
                Long h = this.a.h(j);
                if (h == null) {
                    h = Long.valueOf(a.this.b());
                    this.a.n(j, h);
                }
                return h.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.B
        public d a() {
            return new C0037a();
        }

        public long b() {
            long j = this.a;
            this.a = 1 + j;
            return j;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements B {
        public final d a = new a();

        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.B.d
            public long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.B
        public d a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements B {
        public final d a = new a();

        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // androidx.recyclerview.widget.B.d
            public long a(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.B
        public d a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j);
    }

    d a();
}
