package o;

import android.view.View;

/* loaded from: classes3.dex */
public class LH2 {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f = true;
    public boolean g = true;

    public LH2(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        C6516gH2.k1(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        C6516gH2.j1(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.f;
    }

    public void h() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public void i(boolean z) {
        this.g = z;
    }

    public boolean j(int i) {
        if (this.g && this.e != i) {
            this.e = i;
            a();
            return true;
        }
        return false;
    }

    public boolean k(int i) {
        if (this.f && this.d != i) {
            this.d = i;
            a();
            return true;
        }
        return false;
    }

    public void l(boolean z) {
        this.f = z;
    }
}
