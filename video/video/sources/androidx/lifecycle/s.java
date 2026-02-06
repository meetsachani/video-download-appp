package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.f;
import o.C6562gT0;
import o.KZ0;

/* loaded from: classes.dex */
public class s {
    public final j a;
    public final Handler b;
    public a c;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final j X;
        public final f.a Y;
        public boolean Z;

        public a(j jVar, f.a aVar) {
            C6562gT0.p(jVar, "registry");
            C6562gT0.p(aVar, "event");
            this.X = jVar;
            this.Y = aVar;
        }

        public final f.a a() {
            return this.Y;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.Z) {
                this.X.l(this.Y);
                this.Z = true;
            }
        }
    }

    public s(KZ0 kz0) {
        C6562gT0.p(kz0, "provider");
        this.a = new j(kz0);
        this.b = new Handler();
    }

    public f a() {
        return this.a;
    }

    public void b() {
        f(f.a.ON_START);
    }

    public void c() {
        f(f.a.ON_CREATE);
    }

    public void d() {
        f(f.a.ON_STOP);
        f(f.a.ON_DESTROY);
    }

    public void e() {
        f(f.a.ON_START);
    }

    public final void f(f.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        C6562gT0.m(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
