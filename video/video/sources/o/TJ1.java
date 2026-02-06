package o;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C7596kk2;

/* loaded from: classes.dex */
public class TJ1 implements C7596kk2.c {
    public final ArrayList<SJ1> a = new ArrayList<>();
    public final C7596kk2 b;
    public C9246rQ0 c;
    public C9246rQ0 d;
    public int e;
    public boolean f;

    public TJ1(C7596kk2 c7596kk2, List<SJ1> list) {
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        this.c = c9246rQ0;
        this.d = c9246rQ0;
        f(list, false);
        f(list, true);
        c7596kk2.g(this);
        this.b = c7596kk2;
    }

    @Override // o.C7596kk2.c
    public void a() {
        boolean z;
        int i = this.e;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i - 1;
        this.e = i2;
        if (z && i2 == 0) {
            j();
        }
    }

    @Override // o.C7596kk2.c
    public void b(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02) {
        this.c = c9246rQ0;
        this.d = c9246rQ02;
        j();
    }

    @Override // o.C7596kk2.c
    public void c(int i, C9246rQ0 c9246rQ0, RectF rectF) {
        C9246rQ0 c9246rQ02 = this.d;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            SJ1 sj1 = this.a.get(size);
            int m = sj1.m();
            if ((m & i) != 0) {
                sj1.x(true);
                if (m != 1) {
                    if (m != 2) {
                        if (m != 4) {
                            if (m == 8) {
                                int i2 = c9246rQ02.d;
                                if (i2 > 0) {
                                    sj1.w(c9246rQ0.d / i2);
                                }
                                sj1.v(rectF.bottom);
                            }
                        } else {
                            int i3 = c9246rQ02.c;
                            if (i3 > 0) {
                                sj1.w(c9246rQ0.c / i3);
                            }
                            sj1.v(rectF.right);
                        }
                    } else {
                        int i4 = c9246rQ02.b;
                        if (i4 > 0) {
                            sj1.w(c9246rQ0.b / i4);
                        }
                        sj1.v(rectF.top);
                    }
                } else {
                    int i5 = c9246rQ02.a;
                    if (i5 > 0) {
                        sj1.w(c9246rQ0.a / i5);
                    }
                    sj1.v(rectF.left);
                }
            }
        }
    }

    @Override // o.C7596kk2.c
    public void d() {
        this.e++;
    }

    @Override // o.C7596kk2.c
    public void e(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).g(i);
        }
    }

    public final void f(List<SJ1> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SJ1 sj1 = list.get(i);
            if (sj1.o() == z) {
                Object k = sj1.k();
                if (k == null) {
                    sj1.r(this);
                    this.a.add(sj1);
                } else {
                    throw new IllegalStateException(sj1 + " is already controlled by " + k);
                }
            }
        }
    }

    public void g() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.b.l(this);
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).r(null);
        }
        this.a.clear();
    }

    public SJ1 h(int i) {
        return this.a.get(i);
    }

    public int i() {
        return this.a.size();
    }

    public final void j() {
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            c9246rQ0 = C9246rQ0.b(c9246rQ0, this.a.get(size).h(this.c, this.d, c9246rQ0));
        }
    }
}
