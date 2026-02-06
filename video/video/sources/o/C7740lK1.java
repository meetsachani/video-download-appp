package o;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import o.AbstractC3408Ka;
import o.C7254jK1;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* renamed from: o.lK1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7740lK1 extends AbstractC7497kK1 {
    public ProxyControllerBoundaryInterface a;

    public static String[][] e(List<C7254jK1.b> list) {
        String[][] strArr = (String[][]) Array.newInstance(String.class, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).a();
            strArr[i][1] = list.get(i).b();
        }
        return strArr;
    }

    @Override // o.AbstractC7497kK1
    public void a(Executor executor, Runnable runnable) {
        if (C6771hK2.Q.d()) {
            d().clearProxyOverride(runnable, executor);
            return;
        }
        throw C6771hK2.a();
    }

    @Override // o.AbstractC7497kK1
    public void c(C7254jK1 c7254jK1, Executor executor, Runnable runnable) {
        AbstractC3408Ka.d dVar = C6771hK2.Q;
        AbstractC3408Ka.d dVar2 = C6771hK2.W;
        String[][] e = e(c7254jK1.b());
        String[] strArr = (String[]) c7254jK1.a().toArray(new String[0]);
        if (dVar.d() && !c7254jK1.c()) {
            d().setProxyOverride(e, strArr, runnable, executor);
        } else if (dVar.d() && dVar2.d()) {
            d().setProxyOverride(e, strArr, runnable, executor, c7254jK1.c());
        } else {
            throw C6771hK2.a();
        }
    }

    public final ProxyControllerBoundaryInterface d() {
        if (this.a == null) {
            this.a = C7014iK2.d().getProxyController();
        }
        return this.a;
    }
}
