package o;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.Jl2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3357Jl2 implements IZ0 {
    public final Set<InterfaceC2856El2<?>> X = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.X.clear();
    }

    public List<InterfaceC2856El2<?>> b() {
        return SD2.l(this.X);
    }

    public void c(InterfaceC2856El2<?> interfaceC2856El2) {
        this.X.add(interfaceC2856El2);
    }

    public void d(InterfaceC2856El2<?> interfaceC2856El2) {
        this.X.remove(interfaceC2856El2);
    }

    @Override // o.IZ0
    public void onDestroy() {
        for (InterfaceC2856El2 interfaceC2856El2 : SD2.l(this.X)) {
            interfaceC2856El2.onDestroy();
        }
    }

    @Override // o.IZ0
    public void onStart() {
        for (InterfaceC2856El2 interfaceC2856El2 : SD2.l(this.X)) {
            interfaceC2856El2.onStart();
        }
    }

    @Override // o.IZ0
    public void onStop() {
        for (InterfaceC2856El2 interfaceC2856El2 : SD2.l(this.X)) {
            interfaceC2856El2.onStop();
        }
    }
}
