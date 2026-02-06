package o;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@IgnoreJRERequirement
/* renamed from: o.sD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9436sD extends AbstractC6059eS {
    @NotNull
    public static final C9436sD a = new C9436sD();
    @NotNull
    public static final a b = new a();

    /* renamed from: o.sD$a */
    /* loaded from: classes4.dex */
    public static final class a extends ClassValue<HA0<? super Throwable, ? extends Throwable>> {
        /* renamed from: a */
        public HA0<Throwable, Throwable> computeValue(Class<?> cls) {
            HA0<Throwable, Throwable> g;
            C6562gT0.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            g = C3527Lf0.g(cls);
            return g;
        }
    }

    @Override // o.AbstractC6059eS
    @NotNull
    public HA0<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        Object obj;
        obj = b.get(cls);
        return (HA0) obj;
    }
}
