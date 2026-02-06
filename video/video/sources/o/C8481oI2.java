package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.C7994mI2;

/* renamed from: o.oI2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8481oI2 {
    public final C7114il1 a;
    public HashSet<View> c;
    public ArrayList<C7994mI2.b> e;
    public ArrayList<C7994mI2> b = new ArrayList<>();
    public String d = "ViewTransitionController";
    public ArrayList<C7994mI2.b> f = new ArrayList<>();

    /* renamed from: o.oI2$a */
    /* loaded from: classes.dex */
    public class a implements l.a {
        public final /* synthetic */ C7994mI2 X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ int Y0;
        public final /* synthetic */ boolean Z;

        public a(C7994mI2 c7994mI2, int i, boolean z, int i2) {
            this.X = c7994mI2;
            this.Y = i;
            this.Z = z;
            this.Y0 = i2;
        }

        @Override // androidx.constraintlayout.widget.l.a
        public void a(int i, int i2, int i3) {
            int h = this.X.h();
            this.X.q(i2);
            if (this.Y == i && h != i2) {
                int i4 = 0;
                if (this.Z) {
                    if (this.Y0 == i2) {
                        int childCount = C8481oI2.this.a.getChildCount();
                        while (i4 < childCount) {
                            View childAt = C8481oI2.this.a.getChildAt(i4);
                            if (this.X.l(childAt)) {
                                int currentState = C8481oI2.this.a.getCurrentState();
                                androidx.constraintlayout.widget.e F0 = C8481oI2.this.a.F0(currentState);
                                C7994mI2 c7994mI2 = this.X;
                                C8481oI2 c8481oI2 = C8481oI2.this;
                                c7994mI2.c(c8481oI2, c8481oI2.a, currentState, F0, childAt);
                            }
                            i4++;
                        }
                    }
                } else if (this.Y0 != i2) {
                    int childCount2 = C8481oI2.this.a.getChildCount();
                    while (i4 < childCount2) {
                        View childAt2 = C8481oI2.this.a.getChildAt(i4);
                        if (this.X.l(childAt2)) {
                            int currentState2 = C8481oI2.this.a.getCurrentState();
                            androidx.constraintlayout.widget.e F02 = C8481oI2.this.a.F0(currentState2);
                            C7994mI2 c7994mI22 = this.X;
                            C8481oI2 c8481oI22 = C8481oI2.this;
                            c7994mI22.c(c8481oI22, c8481oI22.a, currentState2, F02, childAt2);
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public C8481oI2(C7114il1 c7114il1) {
        this.a = c7114il1;
    }

    public void b(C7994mI2 c7994mI2) {
        this.b.add(c7994mI2);
        this.c = null;
        if (c7994mI2.j() == 4) {
            i(c7994mI2, true);
        } else if (c7994mI2.j() == 5) {
            i(c7994mI2, false);
        }
    }

    public void c(C7994mI2.b bVar) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(bVar);
    }

    public void d() {
        ArrayList<C7994mI2.b> arrayList = this.e;
        if (arrayList != null) {
            Iterator<C7994mI2.b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e.removeAll(this.f);
            this.f.clear();
            if (this.e.isEmpty()) {
                this.e = null;
            }
        }
    }

    public boolean e(int i, C4523Vk1 c4523Vk1) {
        Iterator<C7994mI2> it = this.b.iterator();
        while (it.hasNext()) {
            C7994mI2 next = it.next();
            if (next.e() == i) {
                next.g.a(c4523Vk1);
                return true;
            }
        }
        return false;
    }

    public void f(int i, boolean z) {
        Iterator<C7994mI2> it = this.b.iterator();
        while (it.hasNext()) {
            C7994mI2 next = it.next();
            if (next.e() == i) {
                next.n(z);
                return;
            }
        }
    }

    public void g() {
        this.a.invalidate();
    }

    public boolean h(int i) {
        Iterator<C7994mI2> it = this.b.iterator();
        while (it.hasNext()) {
            C7994mI2 next = it.next();
            if (next.e() == i) {
                return next.k();
            }
        }
        return false;
    }

    public final void i(C7994mI2 c7994mI2, boolean z) {
        ConstraintLayout.getSharedValues().a(c7994mI2.i(), new a(c7994mI2, c7994mI2.i(), z, c7994mI2.g()));
    }

    public void j(int i) {
        C7994mI2 c7994mI2;
        Iterator<C7994mI2> it = this.b.iterator();
        while (true) {
            if (it.hasNext()) {
                c7994mI2 = it.next();
                if (c7994mI2.e() == i) {
                    break;
                }
            } else {
                c7994mI2 = null;
                break;
            }
        }
        if (c7994mI2 != null) {
            this.c = null;
            this.b.remove(c7994mI2);
        }
    }

    public void k(C7994mI2.b bVar) {
        this.f.add(bVar);
    }

    public void l(MotionEvent motionEvent) {
        int currentState = this.a.getCurrentState();
        if (currentState != -1) {
            if (this.c == null) {
                this.c = new HashSet<>();
                Iterator<C7994mI2> it = this.b.iterator();
                while (it.hasNext()) {
                    C7994mI2 next = it.next();
                    int childCount = this.a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.a.getChildAt(i);
                        if (next.l(childAt)) {
                            childAt.getId();
                            this.c.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C7994mI2.b> arrayList = this.e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C7994mI2.b> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    it2.next().d(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                androidx.constraintlayout.widget.e F0 = this.a.F0(currentState);
                Iterator<C7994mI2> it3 = this.b.iterator();
                while (it3.hasNext()) {
                    C7994mI2 next2 = it3.next();
                    if (next2.t(action)) {
                        Iterator<View> it4 = this.c.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.l(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    next2.c(this, this.a, currentState, F0, next3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void m(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C7994mI2> it = this.b.iterator();
        C7994mI2 c7994mI2 = null;
        while (it.hasNext()) {
            C7994mI2 next = it.next();
            if (next.e() == i) {
                for (View view : viewArr) {
                    if (next.d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    n(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                c7994mI2 = next;
            }
        }
        if (c7994mI2 == null) {
            Log.e(this.d, " Could not find ViewTransition");
        }
    }

    public final void n(C7994mI2 c7994mI2, View... viewArr) {
        int currentState = this.a.getCurrentState();
        if (c7994mI2.f != 2) {
            if (currentState == -1) {
                String str = this.d;
                Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.a.toString());
                return;
            }
            androidx.constraintlayout.widget.e F0 = this.a.F0(currentState);
            if (F0 == null) {
                return;
            }
            c7994mI2.c(this, this.a, currentState, F0, viewArr);
            return;
        }
        c7994mI2.c(this, this.a, currentState, null, viewArr);
    }
}
