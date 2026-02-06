package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C6516gH2;

/* loaded from: classes.dex */
public class h extends x {
    public static TimeInterpolator A = null;
    public static final boolean z = false;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.H> f56o = new ArrayList<>();
    public ArrayList<RecyclerView.H> p = new ArrayList<>();
    public ArrayList<j> q = new ArrayList<>();
    public ArrayList<i> r = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.H>> s = new ArrayList<>();
    public ArrayList<ArrayList<j>> t = new ArrayList<>();
    public ArrayList<ArrayList<i>> u = new ArrayList<>();
    public ArrayList<RecyclerView.H> v = new ArrayList<>();
    public ArrayList<RecyclerView.H> w = new ArrayList<>();
    public ArrayList<RecyclerView.H> x = new ArrayList<>();
    public ArrayList<RecyclerView.H> y = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList X;

        public a(ArrayList arrayList) {
            this.X = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.b0(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.X.clear();
            h.this.t.remove(this.X);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList X;

        public b(ArrayList arrayList) {
            this.X = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                h.this.a0((i) it.next());
            }
            this.X.clear();
            h.this.u.remove(this.X);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList X;

        public c(ArrayList arrayList) {
            this.X = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                h.this.Z((RecyclerView.H) it.next());
            }
            this.X.clear();
            h.this.s.remove(this.X);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.H a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public d(RecyclerView.H h, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = h;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            h.this.N(this.a);
            h.this.x.remove(this.a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.O(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.H a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.H h, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = h;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            h.this.H(this.a);
            h.this.v.remove(this.a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.I(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.H a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public f(RecyclerView.H h, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = h;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            h.this.L(this.a);
            h.this.w.remove(this.a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.M(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            h.this.J(this.a.a, true);
            h.this.y.remove(this.a.a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.a.a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043h extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public C0043h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            h.this.J(this.a.b, false);
            h.this.y.remove(this.a.b);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.a.b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public RecyclerView.H a;
        public int b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.H h, int i, int i2, int i3, int i4) {
            this.a = h;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.x
    public boolean D(RecyclerView.H h) {
        i0(h);
        h.a.setAlpha(0.0f);
        this.p.add(h);
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public boolean E(RecyclerView.H h, RecyclerView.H h2, int i2, int i3, int i4, int i5) {
        if (h == h2) {
            return F(h, i2, i3, i4, i5);
        }
        float translationX = h.a.getTranslationX();
        float translationY = h.a.getTranslationY();
        float alpha = h.a.getAlpha();
        i0(h);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        h.a.setTranslationX(translationX);
        h.a.setTranslationY(translationY);
        h.a.setAlpha(alpha);
        if (h2 != null) {
            i0(h2);
            h2.a.setTranslationX(-i6);
            h2.a.setTranslationY(-i7);
            h2.a.setAlpha(0.0f);
        }
        this.r.add(new i(h, h2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public boolean F(RecyclerView.H h, int i2, int i3, int i4, int i5) {
        View view = h.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) h.a.getTranslationY());
        i0(h);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            L(h);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.q.add(new j(h, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public boolean G(RecyclerView.H h) {
        i0(h);
        this.f56o.add(h);
        return true;
    }

    public void Z(RecyclerView.H h) {
        View view = h.a;
        ViewPropertyAnimator animate = view.animate();
        this.v.add(h);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(h, view, animate)).start();
    }

    public void a0(i iVar) {
        View view;
        RecyclerView.H h = iVar.a;
        View view2 = null;
        if (h == null) {
            view = null;
        } else {
            view = h.a;
        }
        RecyclerView.H h2 = iVar.b;
        if (h2 != null) {
            view2 = h2.a;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.y.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.y.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new C0043h(iVar, animate, view2)).start();
        }
    }

    public void b0(RecyclerView.H h, int i2, int i3, int i4, int i5) {
        View view = h.a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.w.add(h);
        animate.setDuration(o()).setListener(new f(h, i6, view, i7, animate)).start();
    }

    public final void c0(RecyclerView.H h) {
        View view = h.a;
        ViewPropertyAnimator animate = view.animate();
        this.x.add(h);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(h, animate, view)).start();
    }

    public void d0(List<RecyclerView.H> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).a.animate().cancel();
        }
    }

    public void e0() {
        if (!q()) {
            j();
        }
    }

    public final void f0(List<i> list, RecyclerView.H h) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, h) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.H h, List<Object> list) {
        if (list.isEmpty() && !super.g(h, list)) {
            return false;
        }
        return true;
    }

    public final void g0(i iVar) {
        RecyclerView.H h = iVar.a;
        if (h != null) {
            h0(iVar, h);
        }
        RecyclerView.H h2 = iVar.b;
        if (h2 != null) {
            h0(iVar, h2);
        }
    }

    public final boolean h0(i iVar, RecyclerView.H h) {
        boolean z2 = false;
        if (iVar.b == h) {
            iVar.b = null;
        } else if (iVar.a != h) {
            return false;
        } else {
            iVar.a = null;
            z2 = true;
        }
        h.a.setAlpha(1.0f);
        h.a.setTranslationX(0.0f);
        h.a.setTranslationY(0.0f);
        J(h, z2);
        return true;
    }

    public final void i0(RecyclerView.H h) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        h.a.animate().setInterpolator(A);
        k(h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k(RecyclerView.H h) {
        View view = h.a;
        view.animate().cancel();
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.q.get(size).a == h) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(h);
                this.q.remove(size);
            }
        }
        f0(this.r, h);
        if (this.f56o.remove(h)) {
            view.setAlpha(1.0f);
            N(h);
        }
        if (this.p.remove(h)) {
            view.setAlpha(1.0f);
            H(h);
        }
        for (int size2 = this.u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.u.get(size2);
            f0(arrayList, h);
            if (arrayList.isEmpty()) {
                this.u.remove(size2);
            }
        }
        for (int size3 = this.t.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == h) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(h);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.H> arrayList3 = this.s.get(size5);
            if (arrayList3.remove(h)) {
                view.setAlpha(1.0f);
                H(h);
                if (arrayList3.isEmpty()) {
                    this.s.remove(size5);
                }
            }
        }
        this.x.remove(h);
        this.v.remove(h);
        this.y.remove(h);
        this.w.remove(h);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l() {
        int size = this.q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.q.get(size);
            View view = jVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.a);
            this.q.remove(size);
        }
        for (int size2 = this.f56o.size() - 1; size2 >= 0; size2--) {
            N(this.f56o.get(size2));
            this.f56o.remove(size2);
        }
        int size3 = this.p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.H h = this.p.get(size3);
            h.a.setAlpha(1.0f);
            H(h);
            this.p.remove(size3);
        }
        for (int size4 = this.r.size() - 1; size4 >= 0; size4--) {
            g0(this.r.get(size4));
        }
        this.r.clear();
        if (!q()) {
            return;
        }
        for (int size5 = this.t.size() - 1; size5 >= 0; size5--) {
            ArrayList<j> arrayList = this.t.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = arrayList.get(size6);
                View view2 = jVar2.a.a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                L(jVar2.a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.t.remove(arrayList);
                }
            }
        }
        for (int size7 = this.s.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.H> arrayList2 = this.s.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.H h2 = arrayList2.get(size8);
                h2.a.setAlpha(1.0f);
                H(h2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.s.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.u.size() - 1; size9 >= 0; size9--) {
            ArrayList<i> arrayList3 = this.u.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                g0(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.u.remove(arrayList3);
                }
            }
        }
        d0(this.x);
        d0(this.w);
        d0(this.v);
        d0(this.y);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean q() {
        if (this.p.isEmpty() && this.r.isEmpty() && this.q.isEmpty() && this.f56o.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x() {
        long j2;
        long j3;
        boolean isEmpty = this.f56o.isEmpty();
        boolean isEmpty2 = this.q.isEmpty();
        boolean isEmpty3 = this.r.isEmpty();
        boolean isEmpty4 = this.p.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<RecyclerView.H> it = this.f56o.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.f56o.clear();
            if (!isEmpty2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.q);
                this.t.add(arrayList);
                this.q.clear();
                a aVar = new a(arrayList);
                if (!isEmpty) {
                    C6516gH2.x1(arrayList.get(0).a.a, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.r);
                this.u.add(arrayList2);
                this.r.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    C6516gH2.x1(arrayList2.get(0).a.a, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList<RecyclerView.H> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.p);
                this.s.add(arrayList3);
                this.p.clear();
                c cVar = new c(arrayList3);
                if (isEmpty && isEmpty2 && isEmpty3) {
                    cVar.run();
                    return;
                }
                long j4 = 0;
                if (!isEmpty) {
                    j2 = p();
                } else {
                    j2 = 0;
                }
                if (!isEmpty2) {
                    j3 = o();
                } else {
                    j3 = 0;
                }
                if (!isEmpty3) {
                    j4 = n();
                }
                C6516gH2.x1(arrayList3.get(0).a, cVar, j2 + Math.max(j3, j4));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public RecyclerView.H a;
        public RecyclerView.H b;
        public int c;
        public int d;
        public int e;
        public int f;

        public i(RecyclerView.H h, RecyclerView.H h2) {
            this.a = h;
            this.b = h2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }

        public i(RecyclerView.H h, RecyclerView.H h2, int i, int i2, int i3, int i4) {
            this(h, h2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
