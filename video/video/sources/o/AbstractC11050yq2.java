package o;

import android.content.Context;

/* renamed from: o.yq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11050yq2 {
    public static final a a = new a(null);

    /* renamed from: o.yq2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC11050yq2 a(Context context) {
            C6562gT0.p(context, "context");
            C7443k7 c7443k7 = C7443k7.a;
            if (c7443k7.a() >= 5) {
                return new C3083Gq2(context);
            }
            if (c7443k7.a() == 4) {
                return new C2582Bq2(context);
            }
            return null;
        }

        public a() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC11050yq2 b(Context context) {
        return a.a(context);
    }

    public abstract Object a(C5273bD0 c5273bD0, HM<? super C5515cD0> hm);
}
