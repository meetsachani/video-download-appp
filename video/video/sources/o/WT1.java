package o;

import android.os.Bundle;
import com.facebook.C2416z;
import com.facebook.InterfaceC2411u;
import com.facebook.internal.C2357b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class WT1 {
    @Nullable
    public final InterfaceC2411u<?> a;

    public WT1(@Nullable InterfaceC2411u<?> interfaceC2411u) {
        this.a = interfaceC2411u;
    }

    public void a(@NotNull C2357b c2357b) {
        C6562gT0.p(c2357b, "appCall");
        InterfaceC2411u<?> interfaceC2411u = this.a;
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.onCancel();
    }

    public void b(@NotNull C2357b c2357b, @NotNull C2416z c2416z) {
        C6562gT0.p(c2357b, "appCall");
        C6562gT0.p(c2416z, "error");
        InterfaceC2411u<?> interfaceC2411u = this.a;
        if (interfaceC2411u == null) {
            return;
        }
        interfaceC2411u.b(c2416z);
    }

    public abstract void c(@NotNull C2357b c2357b, @Nullable Bundle bundle);
}
