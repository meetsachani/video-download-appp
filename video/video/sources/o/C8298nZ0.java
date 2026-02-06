package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.nZ0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8298nZ0 {
    @NotNull
    public static final C8298nZ0 a = new C8298nZ0();

    @InterfaceC9511sW0
    @Nullable
    public static final Bundle a(@NotNull UUID uuid, @NotNull AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
        C6562gT0.p(uuid, "callId");
        C6562gT0.p(abstractC9885u32, "shareContent");
        if (abstractC9885u32 instanceof E32) {
            return a.b((E32) abstractC9885u32, z);
        }
        if (abstractC9885u32 instanceof M32) {
            D32 d32 = D32.a;
            M32 m32 = (M32) abstractC9885u32;
            List<String> j = D32.j(m32, uuid);
            if (j == null) {
                j = C8222nF.H();
            }
            return a.c(m32, j, z);
        }
        return null;
    }

    public final Bundle b(E32 e32, boolean z) {
        return d(e32, z);
    }

    public final Bundle c(M32 m32, List<String> list, boolean z) {
        Bundle d = d(m32, z);
        d.putStringArrayList(C9642t32.F, new ArrayList<>(list));
        return d;
    }

    public final Bundle d(AbstractC9885u32<?, ?> abstractC9885u32, boolean z) {
        Bundle bundle = new Bundle();
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.v0(bundle, C9642t32.z, abstractC9885u32.a());
        com.facebook.internal.l0.u0(bundle, C9642t32.x, abstractC9885u32.d());
        com.facebook.internal.l0.u0(bundle, C9642t32.D, abstractC9885u32.e());
        bundle.putBoolean(C9642t32.E, z);
        List<String> c = abstractC9885u32.c();
        if (c != null && !c.isEmpty()) {
            bundle.putStringArrayList(C9642t32.y, new ArrayList<>(c));
        }
        return bundle;
    }
}
