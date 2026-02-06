package o;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;

/* loaded from: classes.dex */
public final class QL2 {
    public final b a;

    /* loaded from: classes.dex */
    public static class a extends b {
        public final WindowInsetsAnimationController a;

        public a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.a = windowInsetsAnimationController;
        }

        @Override // o.QL2.b
        public void a(boolean z) {
            this.a.finish(z);
        }

        @Override // o.QL2.b
        public float b() {
            float currentAlpha;
            currentAlpha = this.a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // o.QL2.b
        public float c() {
            float currentFraction;
            currentFraction = this.a.getCurrentFraction();
            return currentFraction;
        }

        @Override // o.QL2.b
        public C9246rQ0 d() {
            Insets currentInsets;
            currentInsets = this.a.getCurrentInsets();
            return C9246rQ0.g(currentInsets);
        }

        @Override // o.QL2.b
        public C9246rQ0 e() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.a.getHiddenStateInsets();
            return C9246rQ0.g(hiddenStateInsets);
        }

        @Override // o.QL2.b
        public C9246rQ0 f() {
            Insets shownStateInsets;
            shownStateInsets = this.a.getShownStateInsets();
            return C9246rQ0.g(shownStateInsets);
        }

        @Override // o.QL2.b
        public int g() {
            int types;
            types = this.a.getTypes();
            return types;
        }

        @Override // o.QL2.b
        public boolean h() {
            boolean isCancelled;
            isCancelled = this.a.isCancelled();
            return isCancelled;
        }

        @Override // o.QL2.b
        public boolean i() {
            boolean isFinished;
            isFinished = this.a.isFinished();
            return isFinished;
        }

        @Override // o.QL2.b
        public void j(C9246rQ0 c9246rQ0, float f, float f2) {
            Insets h;
            WindowInsetsAnimationController windowInsetsAnimationController = this.a;
            if (c9246rQ0 == null) {
                h = null;
            } else {
                h = c9246rQ0.h();
            }
            windowInsetsAnimationController.setInsetsAndAlpha(h, f, f2);
        }
    }

    public QL2(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public float b() {
        return this.a.b();
    }

    public float c() {
        return this.a.c();
    }

    public C9246rQ0 d() {
        return this.a.d();
    }

    public C9246rQ0 e() {
        return this.a.e();
    }

    public C9246rQ0 f() {
        return this.a.f();
    }

    public int g() {
        return this.a.g();
    }

    public boolean h() {
        return this.a.h();
    }

    public boolean i() {
        return this.a.i();
    }

    public boolean j() {
        if (!i() && !h()) {
            return true;
        }
        return false;
    }

    public void k(C9246rQ0 c9246rQ0, float f, float f2) {
        this.a.j(c9246rQ0, f, f2);
    }

    /* loaded from: classes.dex */
    public static class b {
        public float b() {
            return 0.0f;
        }

        public float c() {
            return 0.0f;
        }

        public C9246rQ0 d() {
            return C9246rQ0.e;
        }

        public C9246rQ0 e() {
            return C9246rQ0.e;
        }

        public C9246rQ0 f() {
            return C9246rQ0.e;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public void a(boolean z) {
        }

        public void j(C9246rQ0 c9246rQ0, float f, float f2) {
        }
    }
}
