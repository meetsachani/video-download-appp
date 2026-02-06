package o;

import android.transition.Transition;

/* renamed from: o.st2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9601st2 {

    /* renamed from: o.st2$f */
    /* loaded from: classes.dex */
    public static final class f implements Transition.TransitionListener {
        public final /* synthetic */ HA0<Transition, C7458kA2> a;
        public final /* synthetic */ HA0<Transition, C7458kA2> b;
        public final /* synthetic */ HA0<Transition, C7458kA2> c;
        public final /* synthetic */ HA0<Transition, C7458kA2> d;
        public final /* synthetic */ HA0<Transition, C7458kA2> e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(HA0<? super Transition, C7458kA2> ha0, HA0<? super Transition, C7458kA2> ha02, HA0<? super Transition, C7458kA2> ha03, HA0<? super Transition, C7458kA2> ha04, HA0<? super Transition, C7458kA2> ha05) {
            this.a = ha0;
            this.b = ha02;
            this.c = ha03;
            this.d = ha04;
            this.e = ha05;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.e.invoke(transition);
        }
    }

    public static final Transition.TransitionListener a(Transition transition, HA0<? super Transition, C7458kA2> ha0, HA0<? super Transition, C7458kA2> ha02, HA0<? super Transition, C7458kA2> ha03, HA0<? super Transition, C7458kA2> ha04, HA0<? super Transition, C7458kA2> ha05) {
        f fVar = new f(ha0, ha04, ha05, ha03, ha02);
        transition.addListener(fVar);
        return fVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, HA0 ha0, HA0 ha02, HA0 ha03, HA0 ha04, HA0 ha05, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ha0 = a.X;
        }
        if ((i2 & 2) != 0) {
            ha02 = b.X;
        }
        HA0 ha06 = ha02;
        if ((i2 & 4) != 0) {
            ha03 = c.X;
        }
        if ((i2 & 8) != 0) {
            ha04 = d.X;
        }
        if ((i2 & 16) != 0) {
            ha05 = e.X;
        }
        f fVar = new f(ha0, ha04, ha05, ha03, ha06);
        transition.addListener(fVar);
        return fVar;
    }

    public static final Transition.TransitionListener c(Transition transition, HA0<? super Transition, C7458kA2> ha0) {
        g gVar = new g(ha0);
        transition.addListener(gVar);
        return gVar;
    }

    public static final Transition.TransitionListener d(Transition transition, HA0<? super Transition, C7458kA2> ha0) {
        h hVar = new h(ha0);
        transition.addListener(hVar);
        return hVar;
    }

    public static final Transition.TransitionListener e(Transition transition, HA0<? super Transition, C7458kA2> ha0) {
        i iVar = new i(ha0);
        transition.addListener(iVar);
        return iVar;
    }

    public static final Transition.TransitionListener f(Transition transition, HA0<? super Transition, C7458kA2> ha0) {
        j jVar = new j(ha0);
        transition.addListener(jVar);
        return jVar;
    }

    public static final Transition.TransitionListener g(Transition transition, HA0<? super Transition, C7458kA2> ha0) {
        k kVar = new k(ha0);
        transition.addListener(kVar);
        return kVar;
    }

    /* renamed from: o.st2$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Transition, C7458kA2> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Transition transition) {
            c(transition);
            return C7458kA2.a;
        }

        public final void c(Transition transition) {
        }
    }

    /* renamed from: o.st2$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<Transition, C7458kA2> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Transition transition) {
            c(transition);
            return C7458kA2.a;
        }

        public final void c(Transition transition) {
        }
    }

    /* renamed from: o.st2$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<Transition, C7458kA2> {
        public static final c X = new c();

        public c() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Transition transition) {
            c(transition);
            return C7458kA2.a;
        }

        public final void c(Transition transition) {
        }
    }

    /* renamed from: o.st2$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements HA0<Transition, C7458kA2> {
        public static final d X = new d();

        public d() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Transition transition) {
            c(transition);
            return C7458kA2.a;
        }

        public final void c(Transition transition) {
        }
    }

    /* renamed from: o.st2$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC8052mY0 implements HA0<Transition, C7458kA2> {
        public static final e X = new e();

        public e() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Transition transition) {
            c(transition);
            return C7458kA2.a;
        }

        public final void c(Transition transition) {
        }
    }

    /* renamed from: o.st2$g */
    /* loaded from: classes.dex */
    public static final class g implements Transition.TransitionListener {
        public final /* synthetic */ HA0 a;

        public g(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: o.st2$h */
    /* loaded from: classes.dex */
    public static final class h implements Transition.TransitionListener {
        public final /* synthetic */ HA0 a;

        public h(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: o.st2$i */
    /* loaded from: classes.dex */
    public static final class i implements Transition.TransitionListener {
        public final /* synthetic */ HA0 a;

        public i(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: o.st2$j */
    /* loaded from: classes.dex */
    public static final class j implements Transition.TransitionListener {
        public final /* synthetic */ HA0 a;

        public j(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: o.st2$k */
    /* loaded from: classes.dex */
    public static final class k implements Transition.TransitionListener {
        public final /* synthetic */ HA0 a;

        public k(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }
}
