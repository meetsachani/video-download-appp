package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.j;
import java.util.ArrayList;
import java.util.Iterator;
import o.C8590ol1;

/* renamed from: o.lz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7896lz extends C4814Yk1 {
    public static final boolean G1 = false;
    public static final String H1 = "Carousel";
    public static final int I1 = 1;
    public static final int J1 = 2;
    public int A1;
    public float B1;
    public int C1;
    public int D1;
    public int E1;
    public Runnable F1;
    public b m1;
    public final ArrayList<View> n1;
    public int o1;
    public int p1;
    public C7114il1 q1;
    public int r1;
    public boolean s1;
    public int t1;
    public int u1;
    public int v1;
    public int w1;
    public float x1;
    public int y1;
    public int z1;

    /* renamed from: o.lz$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: o.lz$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0305a implements Runnable {
            public final /* synthetic */ float X;

            public RunnableC0305a(float f) {
                this.X = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7896lz.this.q1.f1(5, 1.0f, this.X);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7896lz.this.q1.setProgress(0.0f);
            C7896lz.this.c0();
            C7896lz.this.m1.a(C7896lz.this.p1);
            float velocity = C7896lz.this.q1.getVelocity();
            if (C7896lz.this.A1 == 2 && velocity > C7896lz.this.B1 && C7896lz.this.p1 < C7896lz.this.m1.count() - 1) {
                float f = velocity * C7896lz.this.x1;
                if (C7896lz.this.p1 != 0 || C7896lz.this.o1 <= C7896lz.this.p1) {
                    if (C7896lz.this.p1 != C7896lz.this.m1.count() - 1 || C7896lz.this.o1 >= C7896lz.this.p1) {
                        C7896lz.this.q1.post(new RunnableC0305a(f));
                    }
                }
            }
        }
    }

    /* renamed from: o.lz$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i);

        void b(View view, int i);

        int count();
    }

    public C7896lz(Context context) {
        super(context);
        this.m1 = null;
        this.n1 = new ArrayList<>();
        this.o1 = 0;
        this.p1 = 0;
        this.r1 = -1;
        this.s1 = false;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = 0.9f;
        this.y1 = 0;
        this.z1 = 4;
        this.A1 = 1;
        this.B1 = 2.0f;
        this.C1 = -1;
        this.D1 = 200;
        this.E1 = -1;
        this.F1 = new a();
    }

    public static /* synthetic */ void M(C7896lz c7896lz) {
        c7896lz.q1.setTransitionDuration(c7896lz.D1);
        if (c7896lz.C1 < c7896lz.p1) {
            c7896lz.q1.m1(c7896lz.v1, c7896lz.D1);
        } else {
            c7896lz.q1.m1(c7896lz.w1, c7896lz.D1);
        }
    }

    public final void V(boolean z) {
        Iterator<C8590ol1.b> it = this.q1.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().P(z);
        }
    }

    public final boolean W(int i, boolean z) {
        C7114il1 c7114il1;
        C8590ol1.b J0;
        if (i == -1 || (c7114il1 = this.q1) == null || (J0 = c7114il1.J0(i)) == null || z == J0.K()) {
            return false;
        }
        J0.P(z);
        return true;
    }

    public final void X(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.e) {
                    this.r1 = obtainStyledAttributes.getResourceId(index, this.r1);
                } else if (index == j.c.c) {
                    this.t1 = obtainStyledAttributes.getResourceId(index, this.t1);
                } else if (index == j.c.f) {
                    this.u1 = obtainStyledAttributes.getResourceId(index, this.u1);
                } else if (index == j.c.d) {
                    this.z1 = obtainStyledAttributes.getInt(index, this.z1);
                } else if (index == j.c.i) {
                    this.v1 = obtainStyledAttributes.getResourceId(index, this.v1);
                } else if (index == j.c.h) {
                    this.w1 = obtainStyledAttributes.getResourceId(index, this.w1);
                } else if (index == j.c.k) {
                    this.x1 = obtainStyledAttributes.getFloat(index, this.x1);
                } else if (index == j.c.j) {
                    this.A1 = obtainStyledAttributes.getInt(index, this.A1);
                } else if (index == j.c.l) {
                    this.B1 = obtainStyledAttributes.getFloat(index, this.B1);
                } else if (index == j.c.g) {
                    this.s1 = obtainStyledAttributes.getBoolean(index, this.s1);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean Y() {
        return this.s1;
    }

    public void Z(int i) {
        this.p1 = Math.max(0, Math.min(getCount() - 1, i));
        a0();
    }

    public void a0() {
        int size = this.n1.size();
        for (int i = 0; i < size; i++) {
            View view = this.n1.get(i);
            if (this.m1.count() == 0) {
                e0(view, this.z1);
            } else {
                e0(view, 0);
            }
        }
        this.q1.X0();
        c0();
    }

    public void b0(int i, int i2) {
        this.C1 = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.D1 = max;
        this.q1.setTransitionDuration(max);
        if (i < this.p1) {
            this.q1.m1(this.v1, this.D1);
        } else {
            this.q1.m1(this.w1, this.D1);
        }
    }

    public final void c0() {
        b bVar = this.m1;
        if (bVar != null && this.q1 != null && bVar.count() != 0) {
            int size = this.n1.size();
            for (int i = 0; i < size; i++) {
                View view = this.n1.get(i);
                int i2 = (this.p1 + i) - this.y1;
                if (this.s1) {
                    if (i2 < 0) {
                        int i3 = this.z1;
                        if (i3 != 4) {
                            e0(view, i3);
                        } else {
                            e0(view, 0);
                        }
                        if (i2 % this.m1.count() == 0) {
                            this.m1.b(view, 0);
                        } else {
                            b bVar2 = this.m1;
                            bVar2.b(view, bVar2.count() + (i2 % this.m1.count()));
                        }
                    } else if (i2 >= this.m1.count()) {
                        if (i2 == this.m1.count()) {
                            i2 = 0;
                        } else if (i2 > this.m1.count()) {
                            i2 %= this.m1.count();
                        }
                        int i4 = this.z1;
                        if (i4 != 4) {
                            e0(view, i4);
                        } else {
                            e0(view, 0);
                        }
                        this.m1.b(view, i2);
                    } else {
                        e0(view, 0);
                        this.m1.b(view, i2);
                    }
                } else if (i2 < 0) {
                    e0(view, this.z1);
                } else if (i2 >= this.m1.count()) {
                    e0(view, this.z1);
                } else {
                    e0(view, 0);
                    this.m1.b(view, i2);
                }
            }
            int i5 = this.C1;
            if (i5 != -1 && i5 != this.p1) {
                this.q1.post(new Runnable() { // from class: o.kz
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7896lz.M(C7896lz.this);
                    }
                });
            } else if (i5 == this.p1) {
                this.C1 = -1;
            }
            if (this.t1 != -1 && this.u1 != -1) {
                if (this.s1) {
                    return;
                }
                int count = this.m1.count();
                if (this.p1 == 0) {
                    W(this.t1, false);
                } else {
                    W(this.t1, true);
                    this.q1.setTransition(this.t1);
                }
                if (this.p1 == count - 1) {
                    W(this.u1, false);
                    return;
                }
                W(this.u1, true);
                this.q1.setTransition(this.u1);
                return;
            }
            Log.w(H1, "No backward or forward transitions defined for Carousel!");
        }
    }

    @Override // o.C4814Yk1, o.C7114il1.k
    public void d(C7114il1 c7114il1, int i) {
        int i2 = this.p1;
        this.o1 = i2;
        if (i == this.w1) {
            this.p1 = i2 + 1;
        } else if (i == this.v1) {
            this.p1 = i2 - 1;
        }
        if (this.s1) {
            if (this.p1 >= this.m1.count()) {
                this.p1 = 0;
            }
            if (this.p1 < 0) {
                this.p1 = this.m1.count() - 1;
            }
        } else {
            if (this.p1 >= this.m1.count()) {
                this.p1 = this.m1.count() - 1;
            }
            if (this.p1 < 0) {
                this.p1 = 0;
            }
        }
        if (this.o1 != this.p1) {
            this.q1.post(this.F1);
        }
    }

    public final boolean d0(int i, View view, int i2) {
        e.a k0;
        androidx.constraintlayout.widget.e F0 = this.q1.F0(i);
        if (F0 == null || (k0 = F0.k0(view.getId())) == null) {
            return false;
        }
        k0.c.c = 1;
        view.setVisibility(i2);
        return true;
    }

    public final boolean e0(View view, int i) {
        C7114il1 c7114il1 = this.q1;
        if (c7114il1 == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : c7114il1.getConstraintSetIds()) {
            z |= d0(i2, view, i);
        }
        return z;
    }

    public int getCount() {
        b bVar = this.m1;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.p1;
    }

    @Override // o.C4814Yk1, o.C7114il1.k
    public void i(C7114il1 c7114il1, int i, int i2, float f) {
        this.E1 = i;
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof C7114il1) {
            C7114il1 c7114il1 = (C7114il1) getParent();
            this.n1.clear();
            for (int i = 0; i < this.Z0; i++) {
                int i2 = this.Y0[i];
                View w = c7114il1.w(i2);
                if (this.r1 == i2) {
                    this.y1 = i;
                }
                this.n1.add(w);
            }
            this.q1 = c7114il1;
            if (this.A1 == 2) {
                C8590ol1.b J0 = c7114il1.J0(this.u1);
                if (J0 != null) {
                    J0.T(5);
                }
                C8590ol1.b J02 = this.q1.J0(this.t1);
                if (J02 != null) {
                    J02.T(5);
                }
            }
            c0();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n1.clear();
    }

    public void setAdapter(b bVar) {
        this.m1 = bVar;
    }

    public void setInfinite(boolean z) {
        this.s1 = z;
    }

    public C7896lz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m1 = null;
        this.n1 = new ArrayList<>();
        this.o1 = 0;
        this.p1 = 0;
        this.r1 = -1;
        this.s1 = false;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = 0.9f;
        this.y1 = 0;
        this.z1 = 4;
        this.A1 = 1;
        this.B1 = 2.0f;
        this.C1 = -1;
        this.D1 = 200;
        this.E1 = -1;
        this.F1 = new a();
        X(context, attributeSet);
    }

    public C7896lz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m1 = null;
        this.n1 = new ArrayList<>();
        this.o1 = 0;
        this.p1 = 0;
        this.r1 = -1;
        this.s1 = false;
        this.t1 = -1;
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = -1;
        this.x1 = 0.9f;
        this.y1 = 0;
        this.z1 = 4;
        this.A1 = 1;
        this.B1 = 2.0f;
        this.C1 = -1;
        this.D1 = 200;
        this.E1 = -1;
        this.F1 = new a();
        X(context, attributeSet);
    }
}
