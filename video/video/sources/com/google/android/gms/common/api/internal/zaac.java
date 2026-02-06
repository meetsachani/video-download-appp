package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaac implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ zaad b;

    public zaac(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.b = zaadVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void a(@InterfaceC5670cr1 Task task) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
