package o;

import android.os.Build;
import android.util.CloseGuard;

/* loaded from: classes.dex */
public final class RD {
    public final b a;

    /* loaded from: classes.dex */
    public static final class a implements b {
        public final CloseGuard a = new CloseGuard();

        @Override // o.RD.b
        public void a(String str) {
            this.a.open(str);
        }

        @Override // o.RD.b
        public void b() {
            this.a.warnIfOpen();
        }

        @Override // o.RD.b
        public void close() {
            this.a.close();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);

        void b();

        void close();
    }

    public RD(b bVar) {
        this.a = bVar;
    }

    public static RD b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new RD(new a());
        }
        return new RD(new c());
    }

    public void a() {
        this.a.close();
    }

    public void c(String str) {
        this.a.a(str);
    }

    public void d() {
        this.a.b();
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        @Override // o.RD.b
        public void a(String str) {
            C10907yF1.m(str, "CloseMethodName must not be null.");
        }

        @Override // o.RD.b
        public void b() {
        }

        @Override // o.RD.b
        public void close() {
        }
    }
}
