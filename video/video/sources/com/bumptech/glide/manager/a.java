package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.f;
import com.bumptech.glide.manager.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.ComponentCallbacks2C7772lS1;
import o.IZ0;
import o.InterfaceC8276nS1;
import o.SD2;

/* loaded from: classes.dex */
public final class a {
    public final Map<f, ComponentCallbacks2C7772lS1> a = new HashMap();
    public final b.InterfaceC0066b b;

    /* renamed from: com.bumptech.glide.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0065a implements IZ0 {
        public final /* synthetic */ f X;

        public C0065a(f fVar) {
            this.X = fVar;
        }

        @Override // o.IZ0
        public void onDestroy() {
            a.this.a.remove(this.X);
        }

        @Override // o.IZ0
        public void onStart() {
        }

        @Override // o.IZ0
        public void onStop() {
        }
    }

    /* loaded from: classes.dex */
    public final class b implements InterfaceC8276nS1 {
        public final FragmentManager a;

        public b(FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }

        @Override // o.InterfaceC8276nS1
        public Set<ComponentCallbacks2C7772lS1> a() {
            HashSet hashSet = new HashSet();
            b(this.a, hashSet);
            return hashSet;
        }

        public final void b(FragmentManager fragmentManager, Set<ComponentCallbacks2C7772lS1> set) {
            List<Fragment> J0 = fragmentManager.J0();
            int size = J0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = J0.get(i);
                b(fragment.u(), set);
                ComponentCallbacks2C7772lS1 a = a.this.a(fragment.b());
                if (a != null) {
                    set.add(a);
                }
            }
        }
    }

    public a(b.InterfaceC0066b interfaceC0066b) {
        this.b = interfaceC0066b;
    }

    public ComponentCallbacks2C7772lS1 a(f fVar) {
        SD2.b();
        return this.a.get(fVar);
    }

    public ComponentCallbacks2C7772lS1 b(Context context, com.bumptech.glide.a aVar, f fVar, FragmentManager fragmentManager, boolean z) {
        SD2.b();
        ComponentCallbacks2C7772lS1 a = a(fVar);
        if (a == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(fVar);
            ComponentCallbacks2C7772lS1 a2 = this.b.a(aVar, lifecycleLifecycle, new b(fragmentManager), context);
            this.a.put(fVar, a2);
            lifecycleLifecycle.a(new C0065a(fVar));
            if (z) {
                a2.onStart();
            }
            return a2;
        }
        return a;
    }
}
