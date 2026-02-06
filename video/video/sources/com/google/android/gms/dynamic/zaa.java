package com.google.android.gms.dynamic;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
final class zaa implements OnDelegateCreatedListener {
    public final /* synthetic */ DeferredLifecycleHelper a;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.a = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void a(LifecycleDelegate lifecycleDelegate) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LifecycleDelegate lifecycleDelegate2;
        this.a.a = lifecycleDelegate;
        linkedList = this.a.c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            lifecycleDelegate2 = this.a.a;
            ((zah) it.next()).a(lifecycleDelegate2);
        }
        linkedList2 = this.a.c;
        linkedList2.clear();
        this.a.b = null;
    }
}
