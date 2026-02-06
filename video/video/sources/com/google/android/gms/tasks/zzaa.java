package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class zzaa implements Continuation {
    public final /* synthetic */ Collection a;

    public zzaa(Collection collection) {
        this.a = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object a(@InterfaceC5670cr1 Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.a) {
            arrayList.add(task2.r());
        }
        return arrayList;
    }
}
