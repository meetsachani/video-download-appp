package o;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class KX1 implements a.c {
    public final androidx.savedstate.a a;
    public boolean b;
    public Bundle c;
    public final EY0 d;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<LX1> {
        public final /* synthetic */ HH2 X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HH2 hh2) {
            super(0);
            this.X = hh2;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final LX1 invoke() {
            return androidx.lifecycle.q.e(this.X);
        }
    }

    public KX1(androidx.savedstate.a aVar, HH2 hh2) {
        C6562gT0.p(aVar, "savedStateRegistry");
        C6562gT0.p(hh2, "viewModelStoreOwner");
        this.a = aVar;
        this.d = WY0.b(new a(hh2));
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, androidx.lifecycle.p> entry : c().g().entrySet()) {
            String key = entry.getKey();
            Bundle a2 = entry.getValue().o().a();
            if (!C6562gT0.g(a2, Bundle.EMPTY)) {
                bundle.putBundle(key, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        Bundle bundle;
        C6562gT0.p(str, "key");
        d();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle;
    }

    public final LX1 c() {
        return (LX1) this.d.getValue();
    }

    public final void d() {
        if (!this.b) {
            Bundle b = this.a.b(androidx.lifecycle.q.b);
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b != null) {
                bundle.putAll(b);
            }
            this.c = bundle;
            this.b = true;
            c();
        }
    }
}
