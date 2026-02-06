package o;

import android.content.Context;
import android.content.Intent;
import o.N5;

/* loaded from: classes.dex */
public final class N5<I, O> extends X5<C7458kA2> {
    public final X5<I> a;
    public final O5<I, O> b;
    public final I c;
    public final EY0 d;
    public final O5<C7458kA2, O> e;

    /* loaded from: classes.dex */
    public static final class a extends O5<C7458kA2, O> {
        public final /* synthetic */ N5<I, O> a;

        public a(N5<I, O> n5) {
            this.a = n5;
        }

        @Override // o.O5
        public O c(int i, Intent intent) {
            return this.a.f().c(i, intent);
        }

        @Override // o.O5
        /* renamed from: d */
        public Intent a(Context context, C7458kA2 c7458kA2) {
            C6562gT0.p(context, "context");
            C6562gT0.p(c7458kA2, "input");
            return this.a.f().a(context, this.a.g());
        }
    }

    public N5(X5<I> x5, O5<I, O> o5, I i) {
        C6562gT0.p(x5, "launcher");
        C6562gT0.p(o5, "callerContract");
        this.a = x5;
        this.b = o5;
        this.c = i;
        this.d = WY0.b(new FA0() { // from class: o.M5
            @Override // o.FA0
            public final Object invoke() {
                N5.a j;
                j = N5.j(N5.this);
                return j;
            }
        });
        this.e = h();
    }

    public static final a j(N5 n5) {
        return new a(n5);
    }

    @Override // o.X5
    public O5<C7458kA2, ?> a() {
        return (O5<C7458kA2, O>) this.e;
    }

    @Override // o.X5
    public void d() {
        this.a.d();
    }

    public final O5<I, O> f() {
        return this.b;
    }

    public final I g() {
        return this.c;
    }

    public final O5<C7458kA2, O> h() {
        return (O5) this.d.getValue();
    }

    @Override // o.X5
    /* renamed from: i */
    public void c(C7458kA2 c7458kA2, A5 a5) {
        C6562gT0.p(c7458kA2, "input");
        this.a.c(this.c, a5);
    }
}
