package o;

import androidx.activity.OnBackPressedDispatcher;

/* renamed from: o.Hu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3196Hu1 {

    /* renamed from: o.Hu1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC2891Eu1 {
        public final /* synthetic */ HA0<AbstractC2891Eu1, C7458kA2> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, HA0<? super AbstractC2891Eu1, C7458kA2> ha0) {
            super(z);
            this.d = ha0;
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            this.d.invoke(this);
        }
    }

    public static final AbstractC2891Eu1 a(OnBackPressedDispatcher onBackPressedDispatcher, KZ0 kz0, boolean z, HA0<? super AbstractC2891Eu1, C7458kA2> ha0) {
        C6562gT0.p(onBackPressedDispatcher, "<this>");
        C6562gT0.p(ha0, "onBackPressed");
        a aVar = new a(z, ha0);
        if (kz0 != null) {
            onBackPressedDispatcher.d(kz0, aVar);
            return aVar;
        }
        onBackPressedDispatcher.e(aVar);
        return aVar;
    }

    public static /* synthetic */ AbstractC2891Eu1 b(OnBackPressedDispatcher onBackPressedDispatcher, KZ0 kz0, boolean z, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            kz0 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return a(onBackPressedDispatcher, kz0, z, ha0);
    }
}
