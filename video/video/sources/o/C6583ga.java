package o;

import android.animation.Animator;

/* renamed from: o.ga  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6583ga {

    /* renamed from: o.ga$e */
    /* loaded from: classes.dex */
    public static final class e implements Animator.AnimatorListener {
        public final /* synthetic */ HA0<Animator, C7458kA2> a;
        public final /* synthetic */ HA0<Animator, C7458kA2> b;
        public final /* synthetic */ HA0<Animator, C7458kA2> c;
        public final /* synthetic */ HA0<Animator, C7458kA2> d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(HA0<? super Animator, C7458kA2> ha0, HA0<? super Animator, C7458kA2> ha02, HA0<? super Animator, C7458kA2> ha03, HA0<? super Animator, C7458kA2> ha04) {
            this.a = ha0;
            this.b = ha02;
            this.c = ha03;
            this.d = ha04;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.d.invoke(animator);
        }
    }

    /* renamed from: o.ga$h */
    /* loaded from: classes.dex */
    public static final class h implements Animator.AnimatorPauseListener {
        public final /* synthetic */ HA0<Animator, C7458kA2> a;
        public final /* synthetic */ HA0<Animator, C7458kA2> b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(HA0<? super Animator, C7458kA2> ha0, HA0<? super Animator, C7458kA2> ha02) {
            this.a = ha0;
            this.b = ha02;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.b.invoke(animator);
        }
    }

    public static final Animator.AnimatorListener a(Animator animator, HA0<? super Animator, C7458kA2> ha0, HA0<? super Animator, C7458kA2> ha02, HA0<? super Animator, C7458kA2> ha03, HA0<? super Animator, C7458kA2> ha04) {
        e eVar = new e(ha04, ha0, ha03, ha02);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, HA0 ha0, HA0 ha02, HA0 ha03, HA0 ha04, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ha0 = a.X;
        }
        if ((i2 & 2) != 0) {
            ha02 = b.X;
        }
        if ((i2 & 4) != 0) {
            ha03 = c.X;
        }
        if ((i2 & 8) != 0) {
            ha04 = d.X;
        }
        e eVar = new e(ha04, ha0, ha03, ha02);
        animator.addListener(eVar);
        return eVar;
    }

    public static final Animator.AnimatorPauseListener c(Animator animator, HA0<? super Animator, C7458kA2> ha0, HA0<? super Animator, C7458kA2> ha02) {
        h hVar = new h(ha02, ha0);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, HA0 ha0, HA0 ha02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ha0 = f.X;
        }
        if ((i2 & 2) != 0) {
            ha02 = g.X;
        }
        return c(animator, ha0, ha02);
    }

    public static final Animator.AnimatorListener e(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        i iVar = new i(ha0);
        animator.addListener(iVar);
        return iVar;
    }

    public static final Animator.AnimatorListener f(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        j jVar = new j(ha0);
        animator.addListener(jVar);
        return jVar;
    }

    public static final Animator.AnimatorPauseListener g(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        return d(animator, null, ha0, 1, null);
    }

    public static final Animator.AnimatorListener h(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        k kVar = new k(ha0);
        animator.addListener(kVar);
        return kVar;
    }

    public static final Animator.AnimatorPauseListener i(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        return d(animator, ha0, null, 2, null);
    }

    public static final Animator.AnimatorListener j(Animator animator, HA0<? super Animator, C7458kA2> ha0) {
        l lVar = new l(ha0);
        animator.addListener(lVar);
        return lVar;
    }

    /* renamed from: o.ga$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final a X = new a();

        public a() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final c X = new c();

        public c() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final d X = new d();

        public d() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final f X = new f();

        public f() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC8052mY0 implements HA0<Animator, C7458kA2> {
        public static final g X = new g();

        public g() {
            super(1);
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Animator animator) {
            c(animator);
            return C7458kA2.a;
        }

        public final void c(Animator animator) {
        }
    }

    /* renamed from: o.ga$i */
    /* loaded from: classes.dex */
    public static final class i implements Animator.AnimatorListener {
        public final /* synthetic */ HA0 a;

        public i(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: o.ga$j */
    /* loaded from: classes.dex */
    public static final class j implements Animator.AnimatorListener {
        public final /* synthetic */ HA0 a;

        public j(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: o.ga$k */
    /* loaded from: classes.dex */
    public static final class k implements Animator.AnimatorListener {
        public final /* synthetic */ HA0 a;

        public k(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: o.ga$l */
    /* loaded from: classes.dex */
    public static final class l implements Animator.AnimatorListener {
        public final /* synthetic */ HA0 a;

        public l(HA0 ha0) {
            this.a = ha0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
