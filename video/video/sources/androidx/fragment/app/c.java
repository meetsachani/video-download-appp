package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.k;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC3014Fz0;
import o.AbstractC8052mY0;
import o.C10593wy;
import o.C10662xF;
import o.C2531Be;
import o.C2807Dz0;
import o.C4180Rx1;
import o.C5445bv2;
import o.C6516gH2;
import o.C6562gT0;
import o.C6670gv2;
import o.C8477oH2;
import o.C9444sF;
import o.C9698tH2;
import o.HA0;
import o.U32;
import o.UD0;
import o.ViewTreeObserver$OnPreDrawListenerC10826xv1;

/* loaded from: classes.dex */
public final class c extends k {

    /* loaded from: classes.dex */
    public static final class a extends b {
        public final boolean c;
        public boolean d;
        public d.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k.c cVar, C10593wy c10593wy, boolean z) {
            super(cVar, c10593wy);
            C6562gT0.p(cVar, "operation");
            C6562gT0.p(c10593wy, "signal");
            this.c = z;
        }

        public final d.a e(Context context) {
            boolean z;
            C6562gT0.p(context, "context");
            if (this.d) {
                return this.e;
            }
            Fragment h = b().h();
            if (b().g() == k.c.b.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            d.a b = androidx.fragment.app.d.b(context, h, z, this.c);
            this.e = b;
            this.d = true;
            return b;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final k.c a;
        public final C10593wy b;

        public b(k.c cVar, C10593wy c10593wy) {
            C6562gT0.p(cVar, "operation");
            C6562gT0.p(c10593wy, "signal");
            this.a = cVar;
            this.b = c10593wy;
        }

        public final void a() {
            this.a.f(this.b);
        }

        public final k.c b() {
            return this.a;
        }

        public final C10593wy c() {
            return this.b;
        }

        public final boolean d() {
            k.c.b.a aVar = k.c.b.X;
            View view = this.a.h().D1;
            C6562gT0.o(view, "operation.fragment.mView");
            k.c.b a = aVar.a(view);
            k.c.b g = this.a.g();
            if (a != g) {
                k.c.b bVar = k.c.b.VISIBLE;
                if (a == bVar || g == bVar) {
                    return false;
                }
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0024c extends b {
        public final Object c;
        public final boolean d;
        public final Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0024c(k.c cVar, C10593wy c10593wy, boolean z, boolean z2) {
            super(cVar, c10593wy);
            Object B;
            boolean z3;
            Object obj;
            C6562gT0.p(cVar, "operation");
            C6562gT0.p(c10593wy, "signal");
            k.c.b g = cVar.g();
            k.c.b bVar = k.c.b.VISIBLE;
            if (g == bVar) {
                Fragment h = cVar.h();
                if (z) {
                    B = h.W();
                } else {
                    B = h.x();
                }
            } else {
                Fragment h2 = cVar.h();
                if (z) {
                    B = h2.a0();
                } else {
                    B = h2.B();
                }
            }
            this.c = B;
            if (cVar.g() == bVar) {
                if (z) {
                    z3 = cVar.h().q();
                } else {
                    z3 = cVar.h().p();
                }
            } else {
                z3 = true;
            }
            this.d = z3;
            if (z2) {
                if (z) {
                    obj = cVar.h().c0();
                } else {
                    obj = cVar.h().b0();
                }
            } else {
                obj = null;
            }
            this.e = obj;
        }

        public final AbstractC3014Fz0 e() {
            AbstractC3014Fz0 f = f(this.c);
            AbstractC3014Fz0 f2 = f(this.e);
            if (f != null && f2 != null && f != f2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e).toString());
            } else if (f == null) {
                return f2;
            } else {
                return f;
            }
        }

        public final AbstractC3014Fz0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC3014Fz0 abstractC3014Fz0 = C2807Dz0.b;
            if (abstractC3014Fz0 != null && abstractC3014Fz0.e(obj)) {
                return abstractC3014Fz0;
            }
            AbstractC3014Fz0 abstractC3014Fz02 = C2807Dz0.c;
            if (abstractC3014Fz02 != null && abstractC3014Fz02.e(obj)) {
                return abstractC3014Fz02;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object g() {
            return this.e;
        }

        public final Object h() {
            return this.c;
        }

        public final boolean i() {
            if (this.e != null) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements HA0<Map.Entry<String, View>, Boolean> {
        public final /* synthetic */ Collection<String> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Collection<String> collection) {
            super(1);
            this.X = collection;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            C6562gT0.p(entry, DefaultsXmlParser.a);
            return Boolean.valueOf(C10662xF.Y1(this.X, C6516gH2.C0(entry.getValue())));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ k.c d;
        public final /* synthetic */ a e;

        public e(View view, boolean z, k.c cVar, a aVar) {
            this.b = view;
            this.c = z;
            this.d = cVar;
            this.e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6562gT0.p(animator, "anim");
            c.this.q().endViewTransition(this.b);
            if (this.c) {
                k.c.b g = this.d.g();
                View view = this.b;
                C6562gT0.o(view, "viewToAnimate");
                g.g(view);
            }
            this.e.a();
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Animation.AnimationListener {
        public final /* synthetic */ k.c a;
        public final /* synthetic */ c b;
        public final /* synthetic */ View c;
        public final /* synthetic */ a d;

        public f(k.c cVar, c cVar2, View view, a aVar) {
            this.a = cVar;
            this.b = cVar2;
            this.c = view;
            this.d = aVar;
        }

        public static final void b(c cVar, View view, a aVar) {
            C6562gT0.p(cVar, "this$0");
            C6562gT0.p(aVar, "$animationInfo");
            cVar.q().endViewTransition(view);
            aVar.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C6562gT0.p(animation, UD0.b1);
            ViewGroup q = this.b.q();
            final c cVar = this.b;
            final View view = this.c;
            final a aVar = this.d;
            q.post(new Runnable() { // from class: o.E00
                @Override // java.lang.Runnable
                public final void run() {
                    c.f.b(androidx.fragment.app.c.this, view, aVar);
                }
            });
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            C6562gT0.p(animation, UD0.b1);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C6562gT0.p(animation, UD0.b1);
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
        C6562gT0.p(viewGroup, C5445bv2.W);
    }

    public static final void F(List list, k.c cVar, c cVar2) {
        C6562gT0.p(list, "$awaitingContainerChanges");
        C6562gT0.p(cVar, "$operation");
        C6562gT0.p(cVar2, "this$0");
        if (list.contains(cVar)) {
            list.remove(cVar);
            cVar2.D(cVar);
        }
    }

    public static final void J(Animator animator, k.c cVar) {
        C6562gT0.p(cVar, "$operation");
        animator.end();
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Animator from operation " + cVar + " has been canceled.");
        }
    }

    public static final void K(View view, c cVar, a aVar, k.c cVar2) {
        C6562gT0.p(cVar, "this$0");
        C6562gT0.p(aVar, "$animationInfo");
        C6562gT0.p(cVar2, "$operation");
        view.clearAnimation();
        cVar.q().endViewTransition(view);
        aVar.a();
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Animation from operation " + cVar2 + " has been cancelled.");
        }
    }

    public static final void M(AbstractC3014Fz0 abstractC3014Fz0, View view, Rect rect) {
        C6562gT0.p(abstractC3014Fz0, "$impl");
        C6562gT0.p(rect, "$lastInEpicenterRect");
        abstractC3014Fz0.h(view, rect);
    }

    public static final void N(ArrayList arrayList) {
        C6562gT0.p(arrayList, "$transitioningViews");
        C2807Dz0.e(arrayList, 4);
    }

    public static final void O(C0024c c0024c, k.c cVar) {
        C6562gT0.p(c0024c, "$transitionInfo");
        C6562gT0.p(cVar, "$operation");
        c0024c.a();
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Transition for operation " + cVar + " has completed");
        }
    }

    public static final void P(k.c cVar, k.c cVar2, boolean z, C2531Be c2531Be) {
        C6562gT0.p(c2531Be, "$lastInViews");
        C2807Dz0.a(cVar.h(), cVar2.h(), z, c2531Be, false);
    }

    public final void D(k.c cVar) {
        View view = cVar.h().D1;
        k.c.b g = cVar.g();
        C6562gT0.o(view, C9698tH2.A);
        g.g(view);
    }

    public final void E(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C8477oH2.g(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    C6562gT0.o(childAt, "child");
                    E(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public final void G(Map<String, View> map, View view) {
        String C0 = C6516gH2.C0(view);
        if (C0 != null) {
            map.put(C0, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    C6562gT0.o(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    public final void H(C2531Be<String, View> c2531Be, Collection<String> collection) {
        Set<Map.Entry<String, View>> entrySet = c2531Be.entrySet();
        C6562gT0.o(entrySet, RemoteConfigConstants.ResponseFieldKey.h0);
        C9444sF.Q0(entrySet, new d(collection));
    }

    public final void I(List<a> list, List<k.c> list2, boolean z, Map<k.c, Boolean> map) {
        boolean z2;
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        boolean z3 = false;
        for (a aVar : list) {
            if (aVar.d()) {
                aVar.a();
            } else {
                C6562gT0.o(context, "context");
                d.a e2 = aVar.e(context);
                if (e2 == null) {
                    aVar.a();
                } else {
                    final Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final k.c b2 = aVar.b();
                        Fragment h = b2.h();
                        if (C6562gT0.g(map.get(b2), Boolean.TRUE)) {
                            if (FragmentManager.X0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + h + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            if (b2.g() == k.c.b.GONE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                list2.remove(b2);
                            }
                            View view = h.D1;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z2, b2, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.X0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b2 + " has started.");
                            }
                            aVar.c().d(new C10593wy.a() { // from class: o.x00
                                @Override // o.C10593wy.a
                                public final void onCancel() {
                                    androidx.fragment.app.c.J(animator, b2);
                                }
                            });
                            z3 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final k.c b3 = aVar2.b();
            Fragment h2 = b3.h();
            if (z) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h2 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z3) {
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h2 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = h2.D1;
                C6562gT0.o(context, "context");
                d.a e3 = aVar2.e(context);
                if (e3 != null) {
                    Animation animation = e3.a;
                    if (animation != null) {
                        if (b3.g() != k.c.b.REMOVED) {
                            view2.startAnimation(animation);
                            aVar2.a();
                        } else {
                            q().startViewTransition(view2);
                            d.b bVar = new d.b(animation, q(), view2);
                            bVar.setAnimationListener(new f(b3, this, view2, aVar2));
                            view2.startAnimation(bVar);
                            if (FragmentManager.X0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + b3 + " has started.");
                            }
                        }
                        aVar2.c().d(new C10593wy.a() { // from class: o.y00
                            @Override // o.C10593wy.a
                            public final void onCancel() {
                                androidx.fragment.app.c.K(view2, this, aVar2, b3);
                            }
                        });
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public final Map<k.c, Boolean> L(List<C0024c> list, List<k.c> list2, final boolean z, final k.c cVar, k.c cVar2) {
        Object obj;
        String str;
        View view;
        View view2;
        boolean z2;
        String str2;
        boolean z3;
        Object obj2;
        Object obj3;
        View view3;
        LinkedHashMap linkedHashMap;
        String str3;
        Object obj4;
        View view4;
        Object obj5;
        k.c cVar3;
        ArrayList<View> arrayList;
        C2531Be c2531Be;
        View view5;
        C4180Rx1 a2;
        ArrayList<View> arrayList2;
        int i;
        final Rect rect;
        final View view6;
        int i2;
        int i3;
        c cVar4 = this;
        final k.c cVar5 = cVar2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : list) {
            if (!((C0024c) obj6).d()) {
                arrayList3.add(obj6);
            }
        }
        ArrayList<C0024c> arrayList4 = new ArrayList();
        for (Object obj7 : arrayList3) {
            if (((C0024c) obj7).e() != null) {
                arrayList4.add(obj7);
            }
        }
        final AbstractC3014Fz0 abstractC3014Fz0 = null;
        for (C0024c c0024c : arrayList4) {
            AbstractC3014Fz0 e2 = c0024c.e();
            if (abstractC3014Fz0 != null && e2 != abstractC3014Fz0) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c0024c.b().h() + " returned Transition " + c0024c.h() + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC3014Fz0 = e2;
        }
        if (abstractC3014Fz0 == null) {
            for (C0024c c0024c2 : list) {
                linkedHashMap2.put(c0024c2.b(), Boolean.FALSE);
                c0024c2.a();
            }
            return linkedHashMap2;
        }
        View view7 = new View(cVar4.q().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C2531Be c2531Be2 = new C2531Be();
        Iterator<C0024c> it = list.iterator();
        Object obj8 = null;
        View view8 = null;
        boolean z4 = false;
        while (true) {
            obj = obj8;
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C0024c next = it.next();
            if (next.i() && cVar != null && cVar5 != null) {
                Object w = abstractC3014Fz0.w(abstractC3014Fz0.f(next.g()));
                ArrayList<String> d0 = cVar5.h().d0();
                C6562gT0.o(d0, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> d02 = cVar.h().d0();
                view5 = view8;
                C6562gT0.o(d02, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> e0 = cVar.h().e0();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                C6562gT0.o(e0, "firstOut.fragment.sharedElementTargetNames");
                int size = e0.size();
                View view9 = view7;
                Rect rect3 = rect2;
                int i4 = 0;
                while (i4 < size) {
                    int i5 = size;
                    int indexOf = d0.indexOf(e0.get(i4));
                    if (indexOf != -1) {
                        d0.set(indexOf, d02.get(i4));
                    }
                    i4++;
                    size = i5;
                }
                ArrayList<String> e02 = cVar5.h().e0();
                C6562gT0.o(e02, "lastIn.fragment.sharedElementTargetNames");
                if (!z) {
                    a2 = C6670gv2.a(cVar.h().C(), cVar5.h().y());
                } else {
                    a2 = C6670gv2.a(cVar.h().y(), cVar5.h().C());
                }
                U32 u32 = (U32) a2.a();
                U32 u322 = (U32) a2.b();
                int i6 = 0;
                for (int size2 = d0.size(); i6 < size2; size2 = size2) {
                    c2531Be2.put(d0.get(i6), e02.get(i6));
                    i6++;
                }
                if (FragmentManager.X0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator<String> it2 = e02.iterator();
                    while (true) {
                        Iterator<String> it3 = it2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Log.v("FragmentManager", "Name: " + it3.next());
                        it2 = it3;
                        arrayList6 = arrayList6;
                    }
                    arrayList2 = arrayList6;
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it4 = d0.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + it4.next());
                    }
                } else {
                    arrayList2 = arrayList6;
                }
                C2531Be c2531Be3 = new C2531Be();
                View view10 = cVar.h().D1;
                C6562gT0.o(view10, "firstOut.fragment.mView");
                cVar4.G(c2531Be3, view10);
                c2531Be3.r(d0);
                if (u32 != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + cVar);
                    }
                    u32.d(d0, c2531Be3);
                    int size3 = d0.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i7 = size3 - 1;
                            String str4 = d0.get(size3);
                            View view11 = (View) c2531Be3.get(str4);
                            if (view11 == null) {
                                c2531Be2.remove(str4);
                                i3 = i7;
                            } else {
                                i3 = i7;
                                if (!C6562gT0.g(str4, C6516gH2.C0(view11))) {
                                    c2531Be2.put(C6516gH2.C0(view11), (String) c2531Be2.remove(str4));
                                }
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                } else {
                    c2531Be2.r(c2531Be3.keySet());
                }
                final C2531Be c2531Be4 = new C2531Be();
                View view12 = cVar5.h().D1;
                C6562gT0.o(view12, "lastIn.fragment.mView");
                cVar4.G(c2531Be4, view12);
                c2531Be4.r(e02);
                c2531Be4.r(c2531Be2.values());
                if (u322 != null) {
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + cVar5);
                    }
                    u322.d(e02, c2531Be4);
                    int size4 = e02.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i8 = size4 - 1;
                            String str5 = e02.get(size4);
                            View view13 = (View) c2531Be4.get(str5);
                            if (view13 == null) {
                                C6562gT0.o(str5, "name");
                                String b2 = C2807Dz0.b(c2531Be2, str5);
                                if (b2 != null) {
                                    c2531Be2.remove(b2);
                                }
                                i2 = i8;
                            } else {
                                i2 = i8;
                                if (!C6562gT0.g(str5, C6516gH2.C0(view13))) {
                                    C6562gT0.o(str5, "name");
                                    String b3 = C2807Dz0.b(c2531Be2, str5);
                                    if (b3 != null) {
                                        c2531Be2.put(b3, C6516gH2.C0(view13));
                                    }
                                }
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size4 = i2;
                        }
                    }
                } else {
                    C2807Dz0.d(c2531Be2, c2531Be4);
                }
                Set keySet = c2531Be2.keySet();
                C6562gT0.o(keySet, "sharedElementNameMapping.keys");
                cVar4.H(c2531Be3, keySet);
                Collection values = c2531Be2.values();
                C6562gT0.o(values, "sharedElementNameMapping.values");
                cVar4.H(c2531Be4, values);
                if (c2531Be2.isEmpty()) {
                    arrayList5.clear();
                    arrayList2.clear();
                    view8 = view5;
                    linkedHashMap2 = linkedHashMap3;
                    view7 = view9;
                    rect2 = rect3;
                    arrayList6 = arrayList2;
                    obj8 = null;
                } else {
                    C2807Dz0.a(cVar5.h(), cVar.h(), z, c2531Be3, true);
                    ViewTreeObserver$OnPreDrawListenerC10826xv1.a(cVar4.q(), new Runnable() { // from class: o.A00
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.c.P(k.c.this, cVar, z, c2531Be4);
                        }
                    });
                    arrayList5.addAll(c2531Be3.values());
                    if (!d0.isEmpty()) {
                        i = 0;
                        View view14 = (View) c2531Be3.get(d0.get(0));
                        abstractC3014Fz0.r(w, view14);
                        view5 = view14;
                    } else {
                        i = 0;
                    }
                    ArrayList<View> arrayList7 = arrayList2;
                    arrayList7.addAll(c2531Be4.values());
                    if (!e02.isEmpty() && (view6 = (View) c2531Be4.get(e02.get(i))) != null) {
                        rect = rect3;
                        ViewTreeObserver$OnPreDrawListenerC10826xv1.a(cVar4.q(), new Runnable() { // from class: o.B00
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.fragment.app.c.M(AbstractC3014Fz0.this, view6, rect);
                            }
                        });
                        z4 = true;
                    } else {
                        rect = rect3;
                    }
                    abstractC3014Fz0.u(w, view9, arrayList5);
                    c2531Be = c2531Be2;
                    arrayList = arrayList5;
                    abstractC3014Fz0.p(w, null, null, null, null, w, arrayList7);
                    arrayList6 = arrayList7;
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(cVar, bool);
                    linkedHashMap3.put(cVar5, bool);
                    view7 = view9;
                    rect2 = rect;
                    obj8 = w;
                    linkedHashMap2 = linkedHashMap3;
                }
            } else {
                arrayList = arrayList5;
                c2531Be = c2531Be2;
                view5 = view8;
                view7 = view7;
                rect2 = rect2;
                linkedHashMap2 = linkedHashMap2;
                obj8 = obj;
            }
            arrayList5 = arrayList;
            c2531Be2 = c2531Be;
            view8 = view5;
        }
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view15 = view7;
        ArrayList<View> arrayList8 = arrayList5;
        C2531Be c2531Be5 = c2531Be2;
        View view16 = view8;
        Rect rect4 = rect2;
        boolean z5 = false;
        boolean z6 = true;
        ArrayList arrayList9 = new ArrayList();
        Object obj9 = null;
        Object obj10 = null;
        for (C0024c c0024c3 : list) {
            if (c0024c3.d()) {
                linkedHashMap4.put(c0024c3.b(), Boolean.FALSE);
                c0024c3.a();
            } else {
                Object f2 = abstractC3014Fz0.f(c0024c3.h());
                k.c b4 = c0024c3.b();
                if (obj != null && (b4 == cVar || b4 == cVar5)) {
                    z3 = z6;
                } else {
                    z3 = z5;
                }
                if (f2 == null) {
                    if (!z3) {
                        linkedHashMap4.put(b4, Boolean.FALSE);
                        c0024c3.a();
                    }
                } else {
                    ArrayList<View> arrayList10 = arrayList6;
                    final ArrayList<View> arrayList11 = new ArrayList<>();
                    View view17 = b4.h().D1;
                    C6562gT0.o(view17, "operation.fragment.mView");
                    cVar4.E(arrayList11, view17);
                    if (z3) {
                        if (b4 == cVar) {
                            arrayList11.removeAll(C10662xF.d6(arrayList8));
                        } else {
                            arrayList11.removeAll(C10662xF.d6(arrayList10));
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        abstractC3014Fz0.a(f2, view15);
                        view4 = view15;
                        obj2 = obj9;
                        obj4 = obj10;
                        linkedHashMap = linkedHashMap4;
                        str3 = str;
                        obj3 = f2;
                        cVar3 = b4;
                        obj5 = obj;
                        view3 = view16;
                    } else {
                        abstractC3014Fz0.b(f2, arrayList11);
                        obj2 = obj9;
                        obj3 = f2;
                        view3 = view16;
                        linkedHashMap = linkedHashMap4;
                        str3 = str;
                        obj4 = obj10;
                        view4 = view15;
                        obj5 = obj;
                        abstractC3014Fz0.p(obj3, obj3, arrayList11, null, null, null, null);
                        if (b4.g() == k.c.b.GONE) {
                            cVar3 = b4;
                            list2.remove(cVar3);
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList11);
                            arrayList12.remove(cVar3.h().D1);
                            abstractC3014Fz0.o(obj3, cVar3.h().D1, arrayList12);
                            ViewTreeObserver$OnPreDrawListenerC10826xv1.a(q(), new Runnable() { // from class: o.C00
                                @Override // java.lang.Runnable
                                public final void run() {
                                    androidx.fragment.app.c.N(arrayList11);
                                }
                            });
                        } else {
                            cVar3 = b4;
                        }
                    }
                    if (cVar3.g() == k.c.b.VISIBLE) {
                        arrayList9.addAll(arrayList11);
                        if (z4) {
                            abstractC3014Fz0.q(obj3, rect4);
                        }
                    } else {
                        abstractC3014Fz0.r(obj3, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (c0024c3.j()) {
                        obj9 = abstractC3014Fz0.k(obj2, obj3, null);
                        linkedHashMap4 = linkedHashMap;
                        view16 = view3;
                        obj = obj5;
                        obj10 = obj4;
                        view15 = view4;
                        arrayList6 = arrayList10;
                        str = str3;
                        z5 = false;
                        z6 = true;
                        cVar4 = this;
                        cVar5 = cVar2;
                    } else {
                        linkedHashMap4 = linkedHashMap;
                        view16 = view3;
                        obj = obj5;
                        obj10 = abstractC3014Fz0.k(obj4, obj3, null);
                        view15 = view4;
                        arrayList6 = arrayList10;
                        str = str3;
                        z6 = true;
                        cVar4 = this;
                        cVar5 = cVar2;
                        obj9 = obj2;
                        z5 = false;
                    }
                }
            }
        }
        ArrayList<View> arrayList13 = arrayList6;
        LinkedHashMap linkedHashMap5 = linkedHashMap4;
        String str6 = str;
        Object obj11 = obj;
        Object j = abstractC3014Fz0.j(obj9, obj10, obj11);
        if (j != null) {
            ArrayList<C0024c> arrayList14 = new ArrayList();
            for (Object obj12 : list) {
                if (!((C0024c) obj12).d()) {
                    arrayList14.add(obj12);
                }
            }
            for (final C0024c c0024c4 : arrayList14) {
                Object h = c0024c4.h();
                final k.c b5 = c0024c4.b();
                if (obj11 != null && (b5 == cVar || b5 == cVar2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (h == null && !z2) {
                    str2 = str6;
                } else if (!C6516gH2.a1(q())) {
                    if (FragmentManager.X0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + b5);
                    } else {
                        str2 = str6;
                    }
                    c0024c4.a();
                } else {
                    str2 = str6;
                    abstractC3014Fz0.s(c0024c4.b().h(), j, c0024c4.c(), new Runnable() { // from class: o.D00
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.c.O(c.C0024c.this, b5);
                        }
                    });
                }
                str6 = str2;
            }
            String str7 = str6;
            if (!C6516gH2.a1(q())) {
                return linkedHashMap5;
            }
            C2807Dz0.e(arrayList9, 4);
            ArrayList<String> l = abstractC3014Fz0.l(arrayList13);
            if (FragmentManager.X0(2)) {
                Log.v(str7, ">>>>> Beginning transition <<<<<");
                Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    View next2 = it5.next();
                    C6562gT0.o(next2, "sharedElementFirstOutViews");
                    Log.v(str7, "View: " + next2 + " Name: " + C6516gH2.C0(view2));
                }
                Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it6 = arrayList13.iterator();
                while (it6.hasNext()) {
                    View next3 = it6.next();
                    C6562gT0.o(next3, "sharedElementLastInViews");
                    Log.v(str7, "View: " + next3 + " Name: " + C6516gH2.C0(view));
                }
            }
            abstractC3014Fz0.c(q(), j);
            abstractC3014Fz0.t(q(), arrayList8, arrayList13, l, c2531Be5);
            C2807Dz0.e(arrayList9, 0);
            abstractC3014Fz0.v(obj11, arrayList8, arrayList13);
            return linkedHashMap5;
        }
        return linkedHashMap5;
    }

    public final void Q(List<? extends k.c> list) {
        Fragment h = ((k.c) C10662xF.s3(list)).h();
        for (k.c cVar : list) {
            cVar.h().G1.c = h.G1.c;
            cVar.h().G1.d = h.G1.d;
            cVar.h().G1.e = h.G1.e;
            cVar.h().G1.f = h.G1.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // androidx.fragment.app.k
    public void j(List<? extends k.c> list, boolean z) {
        k.c cVar;
        ?? r1;
        C6562gT0.p(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            cVar = null;
            if (it.hasNext()) {
                r1 = it.next();
                k.c cVar2 = (k.c) r1;
                k.c.b.a aVar = k.c.b.X;
                View view = cVar2.h().D1;
                C6562gT0.o(view, "operation.fragment.mView");
                k.c.b a2 = aVar.a(view);
                k.c.b bVar = k.c.b.VISIBLE;
                if (a2 == bVar && cVar2.g() != bVar) {
                    break;
                }
            } else {
                r1 = 0;
                break;
            }
        }
        k.c cVar3 = r1;
        ListIterator<? extends k.c> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            k.c previous = listIterator.previous();
            k.c cVar4 = previous;
            k.c.b.a aVar2 = k.c.b.X;
            View view2 = cVar4.h().D1;
            C6562gT0.o(view2, "operation.fragment.mView");
            k.c.b a3 = aVar2.a(view2);
            k.c.b bVar2 = k.c.b.VISIBLE;
            if (a3 != bVar2 && cVar4.g() == bVar2) {
                cVar = previous;
                break;
            }
        }
        k.c cVar5 = cVar;
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar3 + " to " + cVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<k.c> b6 = C10662xF.b6(list);
        Q(list);
        for (final k.c cVar6 : list) {
            C10593wy c10593wy = new C10593wy();
            cVar6.l(c10593wy);
            arrayList.add(new a(cVar6, c10593wy, z));
            C10593wy c10593wy2 = new C10593wy();
            cVar6.l(c10593wy2);
            boolean z2 = false;
            if (z) {
                if (cVar6 != cVar3) {
                    arrayList2.add(new C0024c(cVar6, c10593wy2, z, z2));
                    cVar6.c(new Runnable() { // from class: o.z00
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.c.F(b6, cVar6, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new C0024c(cVar6, c10593wy2, z, z2));
                cVar6.c(new Runnable() { // from class: o.z00
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.c.F(b6, cVar6, this);
                    }
                });
            } else {
                if (cVar6 != cVar5) {
                    arrayList2.add(new C0024c(cVar6, c10593wy2, z, z2));
                    cVar6.c(new Runnable() { // from class: o.z00
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.fragment.app.c.F(b6, cVar6, this);
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new C0024c(cVar6, c10593wy2, z, z2));
                cVar6.c(new Runnable() { // from class: o.z00
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.fragment.app.c.F(b6, cVar6, this);
                    }
                });
            }
        }
        Map<k.c, Boolean> L = L(arrayList2, b6, z, cVar3, cVar5);
        I(arrayList, b6, L.containsValue(Boolean.TRUE), L);
        for (k.c cVar7 : b6) {
            D(cVar7);
        }
        b6.clear();
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar3 + " to " + cVar5);
        }
    }
}
