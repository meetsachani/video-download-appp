package o;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.h41 */
/* loaded from: classes.dex */
public class C6706h41 implements InterfaceC11114z61 {
    public static final Set<String> a = new HashSet();

    @Override // o.InterfaceC11114z61
    public void a(String str) {
        d(str, null);
    }

    @Override // o.InterfaceC11114z61
    public void b(String str, Throwable th) {
        if (ZX0.a) {
            Log.d(ZX0.b, str, th);
        }
    }

    @Override // o.InterfaceC11114z61
    public void c(String str) {
        e(str, null);
    }

    @Override // o.InterfaceC11114z61
    public void d(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w(ZX0.b, str, th);
        set.add(str);
    }

    @Override // o.InterfaceC11114z61
    public void e(String str, Throwable th) {
        if (ZX0.a) {
            Log.d(ZX0.b, str, th);
        }
    }
}
