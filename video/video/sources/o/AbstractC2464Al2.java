package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: o.Al2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2464Al2 {
    public int a = new C3695My().a();

    /* renamed from: o.Al2$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(AbstractC2464Al2 abstractC2464Al2);
    }

    public static /* synthetic */ void a(AbstractC2464Al2 abstractC2464Al2, DM0 dm0) {
        boolean z;
        boolean z2 = false;
        if (abstractC2464Al2.h() != null) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC2464Al2.j() != null) {
            z2 = true;
        }
        if (z && !z2) {
            f.j h = abstractC2464Al2.h();
            Objects.requireNonNull(h);
            h.b(dm0);
        } else if (z2 && !z) {
            f.k j = abstractC2464Al2.j();
            Objects.requireNonNull(j);
            j.b(dm0);
        } else {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
    }

    public static /* synthetic */ void b(AbstractC2464Al2 abstractC2464Al2, f.m mVar) {
        f.k j = abstractC2464Al2.j();
        Objects.requireNonNull(j);
        Objects.requireNonNull(mVar);
        j.a(mVar);
    }

    public static /* synthetic */ void c(AbstractC2464Al2 abstractC2464Al2, androidx.camera.core.g gVar) {
        f.j h = abstractC2464Al2.h();
        Objects.requireNonNull(h);
        Objects.requireNonNull(gVar);
        h.a(gVar);
    }

    public static AbstractC2464Al2 q(Executor executor, f.j jVar, f.k kVar, f.l lVar, Rect rect, Matrix matrix, int i, int i2, int i3, List<AbstractC3393Jv> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (kVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (lVar == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10907yF1.b(z3, "onDiskCallback and outputFileOptions should be both null or both non-null.");
        if (kVar == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (jVar == null) {
            z5 = true;
        }
        C10907yF1.b(z5 ^ z4, "One and only one on-disk or in-memory callback should be present.");
        return new C2649Cj(executor, jVar, kVar, lVar, rect, matrix, i, i2, i3, list);
    }

    public boolean d() {
        C5901do2.c();
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
            return true;
        }
        return false;
    }

    public abstract Executor e();

    public abstract int f();

    public abstract Rect g();

    public abstract f.j h();

    public abstract int i();

    public abstract f.k j();

    public abstract f.l k();

    public int l() {
        C5901do2.c();
        return this.a;
    }

    public abstract int m();

    public abstract Matrix n();

    public abstract List<AbstractC3393Jv> o();

    public void p() {
        C5901do2.c();
        this.a++;
    }

    public void r(final DM0 dm0) {
        e().execute(new Runnable() { // from class: o.zl2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2464Al2.a(AbstractC2464Al2.this, dm0);
            }
        });
    }

    public void s(final f.m mVar) {
        e().execute(new Runnable() { // from class: o.yl2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2464Al2.b(AbstractC2464Al2.this, mVar);
            }
        });
    }

    public void t(final androidx.camera.core.g gVar) {
        e().execute(new Runnable() { // from class: o.xl2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2464Al2.c(AbstractC2464Al2.this, gVar);
            }
        });
    }
}
