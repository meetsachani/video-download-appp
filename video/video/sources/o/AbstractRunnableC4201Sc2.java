package o;

import java.util.List;
import java.util.UUID;
import o.C8501oN2;

/* renamed from: o.Sc2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4201Sc2<T> implements Runnable {
    public final E22<T> X = E22.u();

    /* renamed from: o.Sc2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC4201Sc2<List<TM2>> {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ List Z;

        public a(final ZM2 val$workManager, final List val$ids) {
            this.Y = val$workManager;
            this.Z = val$ids;
        }

        @Override // o.AbstractRunnableC4201Sc2
        /* renamed from: h */
        public List<TM2> g() {
            return C8501oN2.u.apply(this.Y.M().L().G(this.Z));
        }
    }

    /* renamed from: o.Sc2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC4201Sc2<TM2> {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ UUID Z;

        public b(final ZM2 val$workManager, final UUID val$id) {
            this.Y = val$workManager;
            this.Z = val$id;
        }

        @Override // o.AbstractRunnableC4201Sc2
        /* renamed from: h */
        public TM2 g() {
            C8501oN2.c h = this.Y.M().L().h(this.Z.toString());
            if (h != null) {
                return h.a();
            }
            return null;
        }
    }

    /* renamed from: o.Sc2$c */
    /* loaded from: classes.dex */
    public class c extends AbstractRunnableC4201Sc2<List<TM2>> {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ String Z;

        public c(final ZM2 val$workManager, final String val$tag) {
            this.Y = val$workManager;
            this.Z = val$tag;
        }

        @Override // o.AbstractRunnableC4201Sc2
        /* renamed from: h */
        public List<TM2> g() {
            return C8501oN2.u.apply(this.Y.M().L().C(this.Z));
        }
    }

    /* renamed from: o.Sc2$d */
    /* loaded from: classes.dex */
    public class d extends AbstractRunnableC4201Sc2<List<TM2>> {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ String Z;

        public d(final ZM2 val$workManager, final String val$name) {
            this.Y = val$workManager;
            this.Z = val$name;
        }

        @Override // o.AbstractRunnableC4201Sc2
        /* renamed from: h */
        public List<TM2> g() {
            return C8501oN2.u.apply(this.Y.M().L().n(this.Z));
        }
    }

    /* renamed from: o.Sc2$e */
    /* loaded from: classes.dex */
    public class e extends AbstractRunnableC4201Sc2<List<TM2>> {
        public final /* synthetic */ ZM2 Y;
        public final /* synthetic */ C7026iN2 Z;

        public e(final ZM2 val$workManager, final C7026iN2 val$querySpec) {
            this.Y = val$workManager;
            this.Z = val$querySpec;
        }

        @Override // o.AbstractRunnableC4201Sc2
        /* renamed from: h */
        public List<TM2> g() {
            return C8501oN2.u.apply(this.Y.M().H().b(C7756lO1.b(this.Z)));
        }
    }

    public static AbstractRunnableC4201Sc2<List<TM2>> a(final ZM2 workManager, final List<String> ids) {
        return new a(workManager, ids);
    }

    public static AbstractRunnableC4201Sc2<List<TM2>> b(final ZM2 workManager, final String tag) {
        return new c(workManager, tag);
    }

    public static AbstractRunnableC4201Sc2<TM2> c(final ZM2 workManager, final UUID id) {
        return new b(workManager, id);
    }

    public static AbstractRunnableC4201Sc2<List<TM2>> d(final ZM2 workManager, final String name) {
        return new d(workManager, name);
    }

    public static AbstractRunnableC4201Sc2<List<TM2>> e(final ZM2 workManager, final C7026iN2 querySpec) {
        return new e(workManager, querySpec);
    }

    public InterfaceFutureC8411o11<T> f() {
        return this.X;
    }

    public abstract T g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.X.p(g());
        } catch (Throwable th) {
            this.X.q(th);
        }
    }
}
