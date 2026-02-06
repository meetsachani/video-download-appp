package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzab implements Continuation {
    public final /* synthetic */ Collection a;

    public zzab(Collection collection) {
        this.a = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object a(@InterfaceC5670cr1 Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return Tasks.g(arrayList);
    }
}
