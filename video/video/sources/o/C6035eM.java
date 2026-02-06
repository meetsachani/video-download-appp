package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: o.eM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6035eM extends ProgressBar {
    public static final int e1 = 500;
    public static final int f1 = 500;
    public long Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public final Runnable c1;
    public final Runnable d1;

    public C6035eM(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(C6035eM c6035eM) {
        c6035eM.a1 = false;
        if (!c6035eM.b1) {
            c6035eM.Y0 = System.currentTimeMillis();
            c6035eM.setVisibility(0);
        }
    }

    public static /* synthetic */ void d(C6035eM c6035eM) {
        c6035eM.Z0 = false;
        c6035eM.Y0 = -1L;
        c6035eM.setVisibility(8);
    }

    public void e() {
        post(new Runnable() { // from class: o.dM
            @Override // java.lang.Runnable
            public final void run() {
                C6035eM.this.f();
            }
        });
    }

    public final void f() {
        this.b1 = true;
        removeCallbacks(this.d1);
        this.a1 = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.Y0;
        long j2 = currentTimeMillis - j;
        if (j2 < 500 && j != -1) {
            if (!this.Z0) {
                postDelayed(this.c1, 500 - j2);
                this.Z0 = true;
                return;
            }
            return;
        }
        setVisibility(8);
    }

    public final void g() {
        removeCallbacks(this.c1);
        removeCallbacks(this.d1);
    }

    public void h() {
        post(new Runnable() { // from class: o.cM
            @Override // java.lang.Runnable
            public final void run() {
                C6035eM.this.i();
            }
        });
    }

    public final void i() {
        this.Y0 = -1L;
        this.b1 = false;
        removeCallbacks(this.c1);
        this.Z0 = false;
        if (!this.a1) {
            postDelayed(this.d1, 500L);
            this.a1 = true;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public C6035eM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Y0 = -1L;
        this.Z0 = false;
        this.a1 = false;
        this.b1 = false;
        this.c1 = new Runnable() { // from class: o.aM
            @Override // java.lang.Runnable
            public final void run() {
                C6035eM.d(C6035eM.this);
            }
        };
        this.d1 = new Runnable() { // from class: o.bM
            @Override // java.lang.Runnable
            public final void run() {
                C6035eM.c(C6035eM.this);
            }
        };
    }
}
