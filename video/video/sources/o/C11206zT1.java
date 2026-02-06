package o;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import java.util.Map;
import o.C7025iN1;

@ES1(api = 30)
/* renamed from: o.zT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11206zT1 implements InterfaceC8226nG {

    /* renamed from: o.zT1$b */
    /* loaded from: classes3.dex */
    public static class b {
        public static final C11206zT1 a = new C11206zT1();
    }

    public static InterfaceC8226nG a() {
        return b.a;
    }

    @Override // o.InterfaceC8226nG
    @InterfaceC5670cr1
    public Context b(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C7025iN1.n.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (BT1.a(contextThemeWrapper, map)) {
            return contextThemeWrapper;
        }
        return context;
    }

    @Override // o.InterfaceC8226nG
    public boolean c(Context context, Map<Integer, Integer> map) {
        if (BT1.a(context, map)) {
            C7851ln2.a(context, C7025iN1.n.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    public C11206zT1() {
    }
}
