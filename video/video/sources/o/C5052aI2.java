package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.aI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5052aI2 {
    public Interpolator c;
    public InterfaceC5295bI2 d;
    public boolean e;
    public long b = -1;
    public final C5537cI2 f = new a();
    public final ArrayList<ZH2> a = new ArrayList<>();

    /* renamed from: o.aI2$a */
    /* loaded from: classes.dex */
    public class a extends C5537cI2 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == C5052aI2.this.a.size()) {
                InterfaceC5295bI2 interfaceC5295bI2 = C5052aI2.this.d;
                if (interfaceC5295bI2 != null) {
                    interfaceC5295bI2.b(null);
                }
                d();
            }
        }

        @Override // o.C5537cI2, o.InterfaceC5295bI2
        public void c(View view) {
            if (!this.a) {
                this.a = true;
                InterfaceC5295bI2 interfaceC5295bI2 = C5052aI2.this.d;
                if (interfaceC5295bI2 != null) {
                    interfaceC5295bI2.c(null);
                }
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            C5052aI2.this.b();
        }
    }

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator<ZH2> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        this.e = false;
    }

    public void b() {
        this.e = false;
    }

    public C5052aI2 c(ZH2 zh2) {
        if (!this.e) {
            this.a.add(zh2);
        }
        return this;
    }

    public C5052aI2 d(ZH2 zh2, ZH2 zh22) {
        this.a.add(zh2);
        zh22.v(zh2.e());
        this.a.add(zh22);
        return this;
    }

    public C5052aI2 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public C5052aI2 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public C5052aI2 g(InterfaceC5295bI2 interfaceC5295bI2) {
        if (!this.e) {
            this.d = interfaceC5295bI2;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<ZH2> it = this.a.iterator();
        while (it.hasNext()) {
            ZH2 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.r(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                next.s(interpolator);
            }
            if (this.d != null) {
                next.t(this.f);
            }
            next.x();
        }
        this.e = true;
    }
}
